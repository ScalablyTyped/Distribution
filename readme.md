

# ScalablyTyped - The Javascript ecosystem for Scala.js!

[![Join the chat at https://gitter.im/ScalablyTyped/community](https://badges.gitter.im/ScalablyTyped/community.svg)](https://gitter.im/ScalablyTyped/community)
[![Checkout the demos at https://github.com/oyvindberg/ScalablyTypedDemos/](https://img.shields.io/badge/Checkout-Demo-success.svg)](https://github.com/oyvindberg/ScalablyTypedDemos/)
[![All libraries by name](https://img.shields.io/badge/List%20of%20libraries-by%20name-green.svg)](./libraries_by_name.md)
[![All libraries by dependents](https://img.shields.io/badge/List%20of%20libraries-by%20dependents-green.svg)](./libraries_by_dependents.md)
[![All libraries by score](https://img.shields.io/badge/List%20of%20libraries-by%20score-green.svg)](./libraries_by_score.md)

## Warning :collision: :bomb: :sunglasses:

Beware: While these typings generally work, some details of the encoding are still subject to change.
All currently published artifacts should be considered snapshots and will be deleted without notice.
Expect the first stable release soon.

## About

This is the home of Scala.js typings for **8031** Javascript libraries,
 which should span more or less the entire set of modern and popular libraries.

This should make it one of the biggest Scala repos on the planet with millions of lines of code

The project was introduced in a talk at [flatMap(Oslo) 2019](https://www.youtube.com/watch?v=R1Z_u2rEDj4)

## Typing?

Javascript is infamously unityped. Given a library function like this:
```javascript
  const add = (a, b) => a + b
```

A typing is a library which wraps the unityped library and enriches it with types.
```scala
  def add(a: String, b: String): String = js.native
  def add(a: Double, b: Double): Double = js.native
```

This way both users and compilers should be pretty happy! :)

## How?

We <3
- Typescript
- Scala.js

The Typescript community has done an outstanding job over the years,
investing millions of hours in typing up libraries.

This project is an effort to extend this work to Scala.js.

## Does it work?
In the same sense as with normal libraries, there will be subjective and objective reasons
 to feel that a given typing library is better or worse.

This is an automatic conversion between two very different languages.
Not all idioms transfer well, some dont transfer yet, and some things will just be plain wrong.

Many of the typings will only shine with proper documentation,
a good and educational demo, and some Scala sugar on top.

These are things the community can help out with over time,
there is already a process setup for contributing "sugar"
in the form of `facade` libraries (see below) and demos

With that in mind, let's consider what we have now a beginning, not an end.
The work on this has been a labor of love, so let's continue like that <3

## How can i get started?

We recommend using sbt with [scalajs-bundler](https://scalacenter.github.io/scalajs-bundler/)
and the ScalablyTyped plugin to easily keep versions in sync (more on versions below).

To see full examples head over and check out the
[demos](https://github.com/oyvindberg/ScalablyTypedDemos)!

There are demos both for frontend and backend javascript libraries,
 so feel free to check it out to see how it all fits together!


These should be the main steps you would have to follow:

### `project/plugins.sbt`
ScalablyTyped is hosted at bintray, so make sure to include the resolver
```scala
  resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
  addSbtPlugin("org.scalablytyped" % "sbt-scalablytyped" % "201911110530")
```

### `build.sbt`
```scala
  /* reference the typing library */
  libraryDependencies ++= Seq(ScalablyTyped.D.d3),
  /* If the library is typed up in `DefinitelyTyped` (has `-dt-` in the version string) you'll also need this.
   * The reason why is that versions strings there are just comments, and frequently wrong. Automatically including
   *  that would break your build.
   */
  npmDependencies in Compile ++= Seq("d3" -> "5.5.0"),
```
The version of the typing normally includes the relevant version of the library,
 so you can often "go to definition" and see what you should put in `npmDependencies`.

The sbt plugin itself is nothing except for a bunch of versions guaranteed to be in sync
```scala
object D {
  val d3 = "org.scalablytyped" % "d3_sjs0.6_2.12" % "5.0-dt-20181018Z-171237"
  val `d3-array` = "org.scalablytyped" % "d3-array_sjs0.6_2.12" % "1.2-dt-20181018Z-e09a78"
  // ...
}
```
### Code away
After that you should be good to go and start coding:
```scala
  import typings.std.console
  console.warn("Hello, World!")
```

## Facade libraries
As you can imagine with all this casting and other nonsense,
a more scala-like facade will often be a better way.

For now we have the following facades:
- [antd-slinky](facades/antd-slinky)
- [react-router-native-slinky](facades/react-router-native-slinky)
- [antd-native-slinky](facades/antd-native-slinky)
- [react-router-dom-slinky](facades/react-router-dom-slinky)
- [react](facades/react)
- [react-redux](facades/react-redux)
- [react-slinky](facades/react-slinky)
- [react-japgolly](facades/react-japgolly)

These libraries can depend both on typings and external libraries, and
 will be versioned and published alongside ScalablyTyped typings.

If you try one of the typings and end up writing a small facade feel free to PR it! :)


## Haven't people already tried this?

There are heaps of other projects which does this for different languages,
with different levels of effort put into them, and different degrees of success.

This is a small sample:
- [DefinitelyScala](https://definitelyscala.com/)
- [scala-js-ts-importer](http://github.com/sjrd/scala-js-ts-importer)
- [Retyped for C#](https://retyped.com)
- [ts2k for Kotlin](https://github.com/Kotlin/ts2kt)
- [ReasonablyTyped for Reason ML](https://rrdelaney.github.io/ReasonablyTyped/)
- [typescript2java](https://github.com/ltearno/typescript2java)

You'll see there are two projects which target Scala.
`scala-js-ts-importer` is Sébastien's original attempt from some years ago,
 which forms the basis for both `DefinitelyScala` and `ScalablyTyped`.

`DefinitelyScala` is an awesome project, but it's not finished.
This project tries to pick up where it left off and finish the task.

The converter, `tso`, powers `ScalablyTyped` with a huge set of features not frequently found elsewhere:
- Parser for ~all of Typescript
- Keeps ~all comments
- Full handling of dependencies between libraries, including those outside of `DefinitelyTyped`
- Full implementation of the module system, which all useful javascript libraries rely on
- ~All types and values are fully resolved, across library boundaries
- A naming scheme to avoid name collisions
- Scala.js must abide by JVM rules, so we handle erasure, overloads, overrides, default parameters, `var` conflicts, inheritance conflicts, etc.
- Better user convenience by converting to `@ScalaJSDefined` traits
- Bridges gap between structural and nominal typing somewhat by a strong bias towards type aliases instead of traits
- Answers `typeof` queries and type lookups (`React.Props["children"]`)
- Fills in defaulted type parameters

All these features combined enable us to rewrite a very high percentage of all typings,
somewhere around 98-99% of the newest version of all libraries in the current set.

## Is it production ready?

Typings should leave little to no trace of their existence in the finished
javascript artifact, and hence not be directly responsible for runtime errors.

That said... These typings are all just documentation, and we're working with Javascript here.
Test well.

Users should beware though, that we currently have limited space for published artifacts at Bintray.
This necessarily means that we'll have to cull old versions of typings to make room for new ones.

We'll establish some kind of regime with selected LTS (Long Term Support) releases, but the
exact details are yet to be determined.

If you choose to depend on a typing now, be prepared to do one of the following:
- keep updating to newest version of typings (breaking old builds)
- locally cache/store typing artifacts
- copy/paste the typing source code into your own repository
- build typing artifacts from ScalablyTyped source code
- donate money/server towards artifact hosting

## Anticipated questions about the encoding
There are loads of details as to how the conversion is done.
Not everything is optimal of course.
The following points try to explain the big picture:

### Whatsup with naming?

Modules receive pretty long names, because we flatten the namespace.
The names should be predicable once you get the hang of it.

for instance a typescript import such as this:
```typescript
import AnchorLong from "antd/es/anchor/AnchorLink";
```
will be in ScalablyTyped:
```
import typings.antd.esAnchorAnchorLinkMod.{default => AnchorLong}
```

A somewhat smart way of handling this is to bundle your commonly used imports somewhere, for instance:
```scala

package object myapp {
  type AnchorLong = typings.antd.esAnchorAnchorLinkMod.default
  val AnchorLong = typings.antd.esAnchorAnchorLinkMod.default
}

```

Note: Earlier we used `Lib` and `NS` as a suffixes for all library and namespace names, we now managed to drop them.
Migration should be easy with a search/replace of `typings.xxxLib => typings.xxx`.

### Whatsup with the hats?

We convert typescript namespaces and modules into scala packages.

In idiomatic scala top level members inside would be placed into package objects,
but those are unfortunately [broken](https://github.com/scala-js/scala-js/issues/1892) when used as javascript facades.
For that reason we upgrade `var` and `def` to `object` instead.

You will see that quite a few packages have an object (and/or a class) called `^`. This is a reference to the module itself,
and you might need to refer it.

- To use classes which are exported as a module in commonjs (defined in Typescript as `export = class Foo {}`, used in Scala as `new typings.node.eventsMod.^()`)
- If you want to mutate top-level members (`typings.std.^.onerror = (x, _, _, _, _) => typings.std.console.warn(x)`)

### Whatsup with those version strings?

Oh yes, you've noticed the long version strings - Good! If you didn't, they look like this:

```scala
libraryDependencies ++= Seq(
  "org.scalablytyped" %%% "node" % "10.9.x-dt-20180910Z-53a4c0",
  "org.scalablytyped" %%% "rxjs" % "6.3.2-a446da"
)
```

A `ScalablyTyped` package is generated based on two or three axis:
- a library at a given version
- if the typings are declared outside the library, the version of the typings
- the version of the `tso` converter

A good versioning scheme has the following properties
- sortable/monotonously increasing
- uniquely identifiable/reproducible
- not too long

When defining the `ScalablyTyped` versioning scheme there was also a strong preference towards
 doing less work. We're after all effectively designing a scheme for working with a gigantic
 monorepo with millions of lines of code with limited computing resources.

So to avoid wasting resources we encode the effects of the converter, not it's version:
We digest the generated source code.

The current version scheme is not bullet proof, but should be a pretty good compromise:
- For a library typed in `DefinitelyTyped`:
    `<version declared in typing>-dt-<date of latest commit of typing>-<digest>`
- For a library which ships with typings:
    `<version of library>-<digest>`

This is sortable until the digest part, and survives a library's integration of third party typings.
It also scales all the way down to local development, where we only fire up `scalac` when there are
 actual code changes.

Since we recognize that keeping many of these complex versions in sync is going to be an issue,
 every complete build of `ScalablyTyped` also generates the sbt plugin mentioned above.

### Whatsup with old versions?

ScalablyTyped only considers the newest version of libraries, and that is already considerable scope.

### Whatsup with numbers?
We're used to deal with `Int`, `Double`, and so on. Javascript isn't.
In the general case it's hopeless to guess what a `number` is, so `Double` is all we get here.


### Whatsup with casting?

Since Typescript is structurally typed it's impossible that all subtyping relationships transfer to 
For instance:

```scala
@js.native
trait ArrayLike[T] extends /* n */ ScalablyTyped.runtime.NumberDictionary[T] {
  val length: Double
}
```
is a description of something that conforms to a minimal version of the `Array` interface.

You'll find that `Array` itself doesn't inherit it:
```scala
@js.native
trait Array[T] extends /* n */ ScalablyTyped.runtime.NumberDictionary[T] {
  val length: Double = js.native
  //...
}
```
Although we could extend the converter to recognize some of these cases, it is not currently done.
The fix is straightforward cast, demonstrating that you know something the compiler doesn't:

```scala
typings.std.Array(1).asInstanceOf[ArrayLike[Int]]
```
For good measure, bundle your knowledge somewhere so you don't litter you code with casts:
```scala
object Foo {
  def ArrayIsArrayLike[T](ts: typings.std.Array[T]): typings.std.ArrayLike[T] = ts.asInstanceOf[typings.std.ArrayLike[T]]
}
```

### Whatsup with bounds?
After conversion, all bounds are commented out. The converter has support for translating them,
 but they're commented out for now since they are often impractical to conform to.

Take for instance this:
```scala
@js.native
trait Crypto extends js.Object {
  def getRandomValues[T /* <: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | Null */](array: T): T
}
```

For now you'll have to be aware of this limitation and treat bounds as documentation.

### Whatsup with classes?

In Javascript classes are first class values, while in Scala they just float around in a parallel type-dimension.

To capture this (and the idea of a "newable" function), a family of interfaces is introduced (in the `runtime` helper artifact):

```scala
trait Instantiable1[T1, R] extends js.Object

object Instantiable1 {
  @inline implicit final class Instantiable1Opts[T1, R](private val ctor: Instantiable1[T1, R]) extends AnyVal {
    @inline def newInstance1(t1: T1): R =
      js.Dynamic.newInstance(ctor.asInstanceOf[js.Dynamic])(t1.asInstanceOf[js.Any]).asInstanceOf[R]
  }
}
```

Given this, we can capture that `window` owns a newable `Blob` thing for instance:
```scala
@js.native
trait Window {
  var Blob: Anon_BlobParts = ???
}

@js.native
trait Anon_BlobParts
  extends ScalablyTyped.runtime.Instantiable0[Blob]
  with ScalablyTyped.runtime.Instantiable1[/* blobParts */ js.Array[BlobPart], Blob]
  with ScalablyTyped.runtime.Instantiable2[/* blobParts */ js.Array[BlobPart], /* options */ BlobPropertyBag, Blob]

//usage
val blob: Blob = typings.std.window.Blob.newInstance0()
```

#### inferred classes
Since `Instantiable` has some drawbacks, statically reachable `Instantiable`s are upgraded to proper classes.

For instance for this

```scala
@js.native
trait HTMLDivElement extends HTMLElement

@JSGlobal("HTMLDivElement")
@js.native
object HTMLDivElement
  extends org.scalablytyped.runtime.Instantiable0[HTMLDivElement]
```

We will infer this class

```scala
@JSGlobal("HTMLDivElement")
@js.native
class HTMLDivElementCls () extends HTMLDivElement
```

These classes will frequently have a `Cls` suffix, again to avoid name conflicts.
We keep both interface/type alias and the class because both might be useful (and in the case of angular, needed).

Note: Be a bit wary with these classes. In typescript this pattern is sometimes used to signal
that a it can participate in an instanceof check, but can't be instantiated.
This applies to `HTMLDivElement` for instance.

### Whatsup with `this`?
Javascript and `this` is a long story. Surprisingly, it's not getting shorter with Scala.js

The problem is that Scala.js discards the Javascript `this` when it calls functions, even if the function is
owned (in Javascript terms) by an object. When calling methods it behaves as expected.

For instance given the following trait:
```scala

@js.native
trait UnderlyingSink extends js.Object {
  val start: WritableStreamDefaultControllerCallback = js.native
}

type WritableStreamDefaultControllerCallback =
  js.Function1[/* controller */ WritableStreamDefaultController, Unit]
```

It's generally impossible to know whether `this` is important in this context, and Scala.js is not going to supply it.
We play it safe and rewrite most such cases to methods, like this:

```scala
@js.native
trait UnderlyingSink extends js.Object {
  def start(controller: WritableStreamDefaultController): Unit = js.native
}
```

### Whatsup with strings?
The Javascript world is a stringly-typed world.
Typescript models the insanity with literal types.
Literal types are supposed to land in Scala 2.13/dotty, but we don't have them yet.
Even when we get them, erasure probably means they won't be too useful in this particular context.

Soo, we cheat a bit. Let's have a look at what it looks like in the `csstype` library:
```scala
package typings
package csstype

object csstypeStrings {
  @js.native
  sealed trait `-moz-initial` extends js.Object
  def `-moz-initial`: `-moz-initial` = "-moz-initial".asInstanceOf[`-moz-initial`]
}

```

A more precise encoding might still be
```scala
  def `-moz-initial`: `-moz-initial` with String = "-moz-initial".asInstanceOf[`-moz-initial` with String]
```
but that hasn't been explored yet. Erasure feels fairly arbitrary when it comes to intersection types.

So there is that. A neat lie to fool `scalac` into accepting things it was never built to be prepared for,
just have a glance at the method encoding below.


### Whatsup with all those methods?
The method encoding is somewhat complex, because of the huge disconnect between the flexible encoding
 Typescript provides to very richly describe an interface,
 and Scala's more rigid, JVM-conforming idea of what a method is.

Let's first take a case like `HTMLCanvasElement.getContext`,
where the value of the first parameter determines the return type.
Typescript is built to handle this, where you define very specific overloads, and a more general definition.
```typescript

interface HTMLCanvasElement extends HTMLElement {
    getContext(contextId: "2d", contextAttributes?: CanvasRenderingContext2DSettings): CanvasRenderingContext2D | null;
    getContext(contextId: "webgl" | "experimental-webgl", contextAttributes?: WebGLContextAttributes): WebGLRenderingContext | null;
    getContext(contextId: string, contextAttributes?: {}): CanvasRenderingContext2D | WebGLRenderingContext | null;
}
```

So what do we do in Scala? We could consolidate/discard the methods and go for a union type:
```scala
@js.native
trait HTMLCanvasElement extends HTMLElement {
  // we don't actually do this
  def getContext(contextId: String, contextAttributes: js.UndefOr[js.Object | CanvasRenderingContext2DSettings | WebGLContextAttributes]): CanvasRenderingContext2D | WebGLRenderingContext | Null = js.native
}
```

But where would the fun be? And the type-safety? This is what we actually end up with:

```scala
import typings.std.stdStrings.{`2d`, `experimental-webgl`, webgl}

@js.native
trait HTMLCanvasElement extends HTMLElement {
  def getContext(contextId: String): CanvasRenderingContext2D | WebGLRenderingContext | Null = js.native
  def getContext(contextId: String, contextAttributes: js.Object): CanvasRenderingContext2D | WebGLRenderingContext | Null = js.native
  @JSName("getContext")
  def getContext_2d(contextId: `2d`): CanvasRenderingContext2D | Null = js.native
  @JSName("getContext")
  def getContext_2d(contextId: `2d`, contextAttributes: CanvasRenderingContext2DSettings): CanvasRenderingContext2D | Null = js.native
  @JSName("getContext")
  def `getContext_experimental-webgl`(contextId: `experimental-webgl`): WebGLRenderingContext | Null = js.native
  @JSName("getContext")
  def `getContext_experimental-webgl`(contextId: `experimental-webgl`, contextAttributes: WebGLContextAttributes): WebGLRenderingContext | Null = js.native
  @JSName("getContext")
  def getContext_webgl(contextId: webgl): WebGLRenderingContext | Null = js.native
  @JSName("getContext")
  def getContext_webgl(contextId: webgl, contextAttributes: WebGLContextAttributes): WebGLRenderingContext | Null = js.native
}
```

Several things are in motion here.
- We use the faked literal strings to distinguish the different values `contextId` can have.
  In this particular case the methods are also renamed (`getContext_2d`),
   that's mostly only the case in the presence of type literals.
- All the overloads are duplicated to account for optional parameters,
  because default parameters in Scala don't work in the presence of overloads.
  Because of the renames it isn't strictly necessary in this case,
  but it's done all over the generated code, because further overloads might also appear in sub/super classes
  (including in dependencies)

Talking about overloads/overrides, there are more things to consider for the conversion.
Let's take a new example, `EventTarget`

```typescript
interface EventTarget {
    addEventListener(type: string, listener: EventListenerOrEventListenerObject | null, options?: boolean | AddEventListenerOptions): void;
}

declare type EventListenerOrEventListenerObject = EventListener | EventListenerObject;

interface EventListener {
    (evt: Event): void;
}
interface EventListenerObject {
    handleEvent(evt: Event): void;
}

interface MediaStream extends EventTarget {
    addEventListener<K extends keyof MediaStreamEventMap>(type: K, listener: (this: MediaStream, ev: MediaStreamEventMap[K]) => any, options?: boolean | AddEventListenerOptions): void;
    addEventListener(type: string, listener: EventListenerOrEventListenerObject, options?: boolean | AddEventListenerOptions): void;
}

interface MediaStreamEventMap {
    "active": Event;
    "addtrack": MediaStreamTrackEvent;
}
```

Notice that the second parameter of `addEventListener` in `EventTarget` has type `EventListenerOrEventListenerObject | null`,
 while in `MediaStream` it is not nullable. Boom - compile error!

To solve this situation, we also duplicate methods rather liberally around union types, such that `EventTarget` ends up as
```scala

@js.native
trait EventTarget extends js.Object {
  def addEventListener(`type`: String): Unit = js.native
  def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  def addEventListener(`type`: String, listener: Null, options: AddEventListenerOptions): Unit = js.native
  def addEventListener(`type`: String, listener: Null, options: Boolean): Unit = js.native
}
type EventListenerOrEventListenerObject = EventListener | EventListenerObject

type EventListener = js.Function1[/* evt */ Event, Unit]

trait EventListenerObject extends js.Object {
  def handleEvent(evt: Event): Unit
}

```

The point is not necessarily that this is awesome, but that it compiles - even in
the presence of overrides in subclasses with different optionality of parameters

Let's have a look at `MediaStream` as well:
```scala
import typings.std.stdStrings.{active, addtrack}

@js.native
trait MediaStream extends EventTarget {
  @JSName("addEventListener")
  def addEventListener_active(`type`: active, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_active(`type`: active, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _], options: AddEventListenerOptions): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_active(`type`: active, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_addtrack(`type`: addtrack, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_addtrack(`type`: addtrack, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, _], options: AddEventListenerOptions): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_addtrack(`type`: addtrack, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, _], options: Boolean): Unit = js.native

```

- The general fallback definition of `addEventListener` is omitted since it didn't enrich what was defined in the superclass
- we use `this.type` to allow overrides which take the same callback function but with a more specific `this` context
- we expand the `<K extends keyof MediaStreamEventMap>` construct such that we maintain full type-safety of the callback based on the `type` parameter

Note also that this although this section mainly explores duplication of methods, there is also a consolidation step,
 which combines methods with the same JVM erasure, as Scala cares about that a lot.

### Whatsup with rewriting type unions to inheritance?

We've had some issues where unions of many types, among other issues like compile time, bumps
into the JVMs limit for how many string literals can be referenced in a class/method.

Scala is much better prepared to handle `trait`s with many implementations, so as long as all
types in a long type union is contained in the same library, we rewrite for instance this:

```scala
type BlobPart = BufferSource | Blob | String
```

Into this:

```scala
/* Rewritten from type alias, can be one of:
  - BufferSource
  - Blob
  - String
*/
type BlobPart = _BlobPart | String

trait _BlobPart extends js.Object

trait Blob extends _BlobPart

trait BufferSource extends _BlobPart

```

This mechanism also means that the fake string literals seen above can inherit from traits:
```
@js.native
sealed trait center
  extends AlignSetting
     with CanvasTextAlign
     with LineAlignSetting
     with PositionAlignSetting
     with ScrollLogicalPosition
```


### Whatsup with @js.native and all that?
So Scala.js has two types of interop, which is better described in the Scala.js documentation.

#### @ScalaJSDefined
We don't really use this annotation anymore, it's just the default for types which extend `js.Object`.

This is a nice encoding for objects the user themselves create, since it's newable:
```scala
new Props {
  override val foo = 1
}
```
We try to convert everything into this format, but we give up in case the structure is callable,
or if it has overloads.

#### @js.native
This describes things you can only consume, which is most of the surface of most libraries.

Because of the rather liberal use of method duplication (which causes overloads) described above,
 there will be cases where you'll need to instantiate a `@js.native` annotated trait.

This is done by casting, with no compiler help:
```scala
js.Dynamic.literal(foo = 1).asInstanceof[Props]
```

This will be improved in the future, but for now it is what it is.
Based on using 0.01% of the libraries it hasn't been a problem so far.


### Whatsup with type mappings?

Typescript provides this awesome way of transforming types called type mappings.

They work more or less like this:

```typescript
// from typescript's bundled definitions
/**
 * Make all properties in T optional
 */
type Partial<T> = {
    [P in keyof T]?: T[P];
};

/**
 * From T pick a set of properties K
 */
type Pick<T, K extends keyof T> = {
    [P in K]: T[P];
};

/**
 * Construct a type with a set of properties K of type T
 */
type Record<K extends keyof any, T> = {
    [P in K]: T;
};

interface Person {
    age: number;
    name: string;
}

// these compile
const named: Pick<Person, "name"> = {name: "asdasd"};
const empty: Partial<Person> = {};
const record: Record<"a" | "b", number> = {a: 1, b: 2}
```

As you might imagine, converting these to Scala is not straightforward.
For static cases we can evaluate them and generate interfaces (though it's not implemented yet!),
but for generic cases (say `Partial<T>`) there isn't much we can do for now.

Just to get things working, we mostly ignore the effects of the type mappings in Scala for now,
 and keep the transformation in a comment:

```scala
type Partial[T] = /* import warning: ImportType.apply c Unsupported type mapping:
  {[ P in keyof T ]:? T[P]}
  */ typings.std.stdStrings.Partial with T
```
This is again not necessarily awesome, but it works.

Crucially, the encoding leaves a trace in the form of the string literal in the intersection type.

When you consume a structure like this it acts like a (subtle) red flag to indicate that you might not
get exactly the data the type system indicates.
When you produce such a value, you need to cast yourself:

```scala
val partialPerson: Partial[Person] = js.Dynamic.literal(name = "dsa").asInstanceOf[Partial[Person]]
```

Also notice that for `Record` the transformation is such that we cannot just ignore it,
so we fall back to `js.Any`.

### Whatsup with interface augmentation?
Another awesome feature of typescript is how you can describe that a library or a module augments
an existing structure.

```typescript
// in library foo
interface FooStatic {
    sayHello();
}

// in library foo-augmented
interface FooStatic {
    sayGoodbye();
}

import foo from 'foo';
import 'augments-foo';
foo.sayGoodbye();
```

The converter has some internal support for detecting this,
but we haven't experimented with outputting anything yet.
That means that you have to detect this yourself and cast.
Have a look at the `jquery`/`jquery-ui`
[demo](https://github.com/oyvindberg/ScalablyTypedDemos/blob/master/jquery/src/main/scala/demo/JQueryDemo.scala)
to see how it's done.

