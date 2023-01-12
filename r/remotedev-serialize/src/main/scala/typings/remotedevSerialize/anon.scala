package typings.remotedevSerialize

import org.scalablytyped.runtime.StringDictionary
import typings.immutable.mod.Collection
import typings.immutable.mod.Collection.Keyed
import typings.immutable.mod.Collection.Set
import typings.immutable.mod.Map
import typings.immutable.mod.OrderedMap
import typings.immutable.mod.OrderedSet
import typings.immutable.mod.Record
import typings.immutable.mod.Seq
import typings.immutable.mod.Seq.Indexed
import typings.immutable.mod.Set_
import typings.immutable.mod.Stack
import typings.remotedevSerialize.mod.DefaultReplacer
import typings.remotedevSerialize.mod.DefaultReviver
import typings.remotedevSerialize.mod.Refs
import typings.remotedevSerialize.mod.Replacer
import typings.remotedevSerialize.mod.Reviver
import typings.std.ArrayLike
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Options extends StObject {
    
    var options: typings.remotedevSerialize.mod.Options
    
    def replacer(key: String, value: Any, replacer: DefaultReplacer): Any
    @JSName("replacer")
    var replacer_Original: Replacer
    
    def reviver(key: String, value: Any, reviver: DefaultReviver): Any
    @JSName("reviver")
    var reviver_Original: Reviver
  }
  object Options {
    
    inline def apply(
      options: typings.remotedevSerialize.mod.Options,
      replacer: (/* key */ String, /* value */ Any, /* replacer */ DefaultReplacer) => Any,
      reviver: (/* key */ String, /* value */ Any, /* reviver */ DefaultReviver) => Any
    ): Options = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], replacer = js.Any.fromFunction3(replacer), reviver = js.Any.fromFunction3(reviver))
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setOptions(value: typings.remotedevSerialize.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setReplacer(value: (/* key */ String, /* value */ Any, /* replacer */ DefaultReplacer) => Any): Self = StObject.set(x, "replacer", js.Any.fromFunction3(value))
      
      inline def setReviver(value: (/* key */ String, /* value */ Any, /* reviver */ DefaultReviver) => Any): Self = StObject.set(x, "reviver", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait Parse extends StObject {
    
    def parse(input: String): Any = js.native
    
    def serialize(immutable: TypeofImmutable): Options = js.native
    def serialize(immutable: TypeofImmutable, refs: Unit, customReplacer: Unit, customReviver: Reviver): Options = js.native
    def serialize(immutable: TypeofImmutable, refs: Unit, customReplacer: Replacer): Options = js.native
    def serialize(immutable: TypeofImmutable, refs: Unit, customReplacer: Replacer, customReviver: Reviver): Options = js.native
    def serialize(immutable: TypeofImmutable, refs: Refs): Options = js.native
    def serialize(immutable: TypeofImmutable, refs: Refs, customReplacer: Unit, customReviver: Reviver): Options = js.native
    def serialize(immutable: TypeofImmutable, refs: Refs, customReplacer: Replacer): Options = js.native
    def serialize(immutable: TypeofImmutable, refs: Refs, customReplacer: Replacer, customReviver: Reviver): Options = js.native
    
    def stringify(input: Any): String = js.native
  }
  
  @js.native
  trait TypeofCollection extends StObject {
    
    /**
      * Creates a Collection.
      *
      * The type of Collection created is based on the input.
      *
      *   * If an `Collection`, that same `Collection`.
      *   * If an Array-like, an `Collection.Indexed`.
      *   * If an Object with an Iterator defined, an `Collection.Indexed`.
      *   * If an Object, an `Collection.Keyed`.
      *
      * This methods forces the conversion of Objects and Strings to Collections.
      * If you want to ensure that a Collection of one item is returned, use
      * `Seq.of`.
      *
      * Note: An Iterator itself will be treated as an object, becoming a `Seq.Keyed`,
      * which is usually not what you want. You should turn your Iterator Object into
      * an iterable object by defining a Symbol.iterator (or @@iterator) method which
      * returns `this`.
      *
      * Note: `Collection` is a conversion function and not a class, and does not
      * use the `new` keyword during construction.
      */
    def apply[I /* <: Collection[Any, Any] */](collection: I): I = js.native
    def apply[T](collection: js.Iterable[T]): typings.immutable.mod.Collection.Indexed[T] = js.native
    def apply[T](collection: ArrayLike[T]): typings.immutable.mod.Collection.Indexed[T] = js.native
    def apply[V](obj: StringDictionary[V]): typings.immutable.mod.Collection.Keyed[String, V] = js.native
    def apply[K, V](): Collection[K, V] = js.native
    
    /**
      * Indexed Collections have incrementing numeric keys. They exhibit
      * slightly different behavior than `Collection.Keyed` for some methods in order
      * to better mirror the behavior of JavaScript's `Array`, and add methods
      * which do not make sense on non-indexed Collections such as `indexOf`.
      *
      * Unlike JavaScript arrays, `Collection.Indexed`s are always dense. "Unset"
      * indices and `undefined` indices are indistinguishable, and all indices from
      * 0 to `size` are visited when iterated.
      *
      * All Collection.Indexed methods return re-indexed Collections. In other words,
      * indices always start at 0 and increment until size. If you wish to
      * preserve indices, using them as keys, convert to a Collection.Keyed by
      * calling `toKeyedSeq`.
      */
    val Indexed: TypeofIndexed = js.native
    
    /**
      * Keyed Collections have discrete keys tied to each value.
      *
      * When iterating `Collection.Keyed`, each iteration will yield a `[K, V]`
      * tuple, in other words, `Collection#entries` is the default iterator for
      * Keyed Collections.
      */
    val Keyed: TypeofKeyed = js.native
    
    /**
      * Set Collections only represent values. They have no associated keys or
      * indices. Duplicate values are possible in the lazy `Seq.Set`s, however
      * the concrete `Set` Collection does not allow duplicate values.
      *
      * Collection methods on Collection.Set such as `map` and `forEach` will provide
      * the value as both the first and second arguments to the provided function.
      *
      * ```js
      * const { Collection } = require('immutable')
      * const seq = Collection.Set([ 'A', 'B', 'C' ])
      * // Seq { "A", "B", "C" }
      * seq.forEach((v, k) =>
      *  assert.equal(v, k)
      * )
      * ```
      */
    val Set: TypeofSet = js.native
    
    /**
      * @deprecated use `const { isAssociative } = require('immutable')`
      */
    def isAssociative(maybeAssociative: Any): Boolean = js.native
    
    /**
      * @deprecated use `const { isIndexed } = require('immutable')`
      */
    def isIndexed(maybeIndexed: Any): /* is immutable.immutable.Collection.Indexed<unknown> */ Boolean = js.native
    
    /**
      * @deprecated use `const { isKeyed } = require('immutable')`
      */
    def isKeyed(maybeKeyed: Any): /* is immutable.immutable.Collection.Keyed<unknown, unknown> */ Boolean = js.native
    
    /**
      * @deprecated use `const { isOrdered } = require('immutable')`
      */
    def isOrdered(maybeOrdered: Any): Boolean = js.native
  }
  
  @js.native
  trait TypeofFactory extends StObject {
    
    def apply[TProps /* <: js.Object */](): Record[TProps] & TProps = js.native
    def apply[TProps /* <: js.Object */](values: js.Iterable[js.Tuple2[String, Any]]): Record[TProps] & TProps = js.native
    def apply[TProps /* <: js.Object */](values: Partial[TProps]): Record[TProps] & TProps = js.native
  }
  
  @js.native
  trait TypeofImmutable extends StObject {
    
    /**
      * The `Collection` is a set of (key, value) entries which can be iterated, and
      * is the base class for all collections in `immutable`, allowing them to
      * make use of all the Collection methods (such as `map` and `filter`).
      *
      * Note: A collection is always iterated in the same order, however that order
      * may not always be well defined, as is the case for the `Map` and `Set`.
      *
      * Collection is the abstract base class for concrete data structures. It
      * cannot be constructed directly.
      *
      * Implementations should extend one of the subclasses, `Collection.Keyed`,
      * `Collection.Indexed`, or `Collection.Set`.
      */
    val Collection: TypeofCollection = js.native
    
    /**
      * Lists are ordered indexed dense collections, much like a JavaScript
      * Array.
      *
      * Lists are immutable and fully persistent with O(log32 N) gets and sets,
      * and O(1) push and pop.
      *
      * Lists implement Deque, with efficient addition and removal from both the
      * end (`push`, `pop`) and beginning (`unshift`, `shift`).
      *
      * Unlike a JavaScript Array, there is no distinction between an
      * "unset" index and an index set to `undefined`. `List#forEach` visits all
      * indices from 0 to size, regardless of whether they were explicitly defined.
      */
    val List: TypeofList = js.native
    
    /**
      * Immutable Map is an unordered Collection.Keyed of (key, value) pairs with
      * `O(log32 N)` gets and `O(log32 N)` persistent sets.
      *
      * Iteration order of a Map is undefined, however is stable. Multiple
      * iterations of the same Map will iterate in the same order.
      *
      * Map's keys can be of any type, and use `Immutable.is` to determine key
      * equality. This allows the use of any value (including NaN) as a key.
      *
      * Because `Immutable.is` returns equality based on value semantics, and
      * Immutable collections are treated as values, any Immutable collection may
      * be used as a key.
      *
      * <!-- runkit:activate -->
      * ```js
      * const { Map, List } = require('immutable');
      * Map().set(List([ 1 ]), 'listofone').get(List([ 1 ]));
      * // 'listofone'
      * ```
      *
      * Any JavaScript object may be used as a key, however strict identity is used
      * to evaluate key equality. Two similar looking objects will represent two
      * different keys.
      *
      * Implemented by a hash-array mapped trie.
      */
    val Map: TypeofMap = js.native
    
    /**
      * A type of Map that has the additional guarantee that the iteration order of
      * entries will be the order in which they were set().
      *
      * The iteration behavior of OrderedMap is the same as native ES6 Map and
      * JavaScript Object.
      *
      * Note that `OrderedMap` are more expensive than non-ordered `Map` and may
      * consume more memory. `OrderedMap#set` is amortized O(log32 N), but not
      * stable.
      */
    val OrderedMap: TypeofOrderedMap = js.native
    
    /**
      * A type of Set that has the additional guarantee that the iteration order of
      * values will be the order in which they were `add`ed.
      *
      * The iteration behavior of OrderedSet is the same as native ES6 Set.
      *
      * Note that `OrderedSet` are more expensive than non-ordered `Set` and may
      * consume more memory. `OrderedSet#add` is amortized O(log32 N), but not
      * stable.
      */
    val OrderedSet: TypeofOrderedSet = js.native
    
    /**
      * Returns a Seq.Indexed of numbers from `start` (inclusive) to `end`
      * (exclusive), by `step`, where `start` defaults to 0, `step` to 1, and `end` to
      * infinity. When `start` is equal to `end`, returns empty range.
      *
      * Note: `Range` is a factory function and not a class, and does not use the
      * `new` keyword during construction.
      *
      * ```js
      * const { Range } = require('immutable')
      * Range() // [ 0, 1, 2, 3, ... ]
      * Range(10) // [ 10, 11, 12, 13, ... ]
      * Range(10, 15) // [ 10, 11, 12, 13, 14 ]
      * Range(10, 30, 5) // [ 10, 15, 20, 25 ]
      * Range(30, 10, 5) // [ 30, 25, 20, 15 ]
      * Range(30, 30, 5) // []
      * ```
      */
    def Range(): Indexed[Double] = js.native
    def Range(start: Double): Indexed[Double] = js.native
    def Range(start: Double, end: Double): Indexed[Double] = js.native
    def Range(start: Double, end: Double, step: Double): Indexed[Double] = js.native
    def Range(start: Double, end: Unit, step: Double): Indexed[Double] = js.native
    def Range(start: Unit, end: Double): Indexed[Double] = js.native
    def Range(start: Unit, end: Double, step: Double): Indexed[Double] = js.native
    def Range(start: Unit, end: Unit, step: Double): Indexed[Double] = js.native
    
    /**
      * A record is similar to a JS object, but enforces a specific set of allowed
      * string keys, and has default values.
      *
      * The `Record()` function produces new Record Factories, which when called
      * create Record instances.
      *
      * ```js
      * const { Record } = require('immutable')
      * const ABRecord = Record({ a: 1, b: 2 })
      * const myRecord = ABRecord({ b: 3 })
      * ```
      *
      * Records always have a value for the keys they define. `remove`ing a key
      * from a record simply resets it to the default value for that key.
      *
      * ```js
      * myRecord.get('a') // 1
      * myRecord.get('b') // 3
      * const myRecordWithoutB = myRecord.remove('b')
      * myRecordWithoutB.get('b') // 2
      * ```
      *
      * Values provided to the constructor not found in the Record type will
      * be ignored. For example, in this case, ABRecord is provided a key "x" even
      * though only "a" and "b" have been defined. The value for "x" will be
      * ignored for this record.
      *
      * ```js
      * const myRecord = ABRecord({ b: 3, x: 10 })
      * myRecord.get('x') // undefined
      * ```
      *
      * Because Records have a known set of string keys, property get access works
      * as expected, however property sets will throw an Error.
      *
      * Note: IE8 does not support property access. Only use `get()` when
      * supporting IE8.
      *
      * ```js
      * myRecord.b // 3
      * myRecord.b = 5 // throws Error
      * ```
      *
      * Record Types can be extended as well, allowing for custom methods on your
      * Record. This is not a common pattern in functional environments, but is in
      * many JS programs.
      *
      * However Record Types are more restricted than typical JavaScript classes.
      * They do not use a class constructor, which also means they cannot use
      * class properties (since those are technically part of a constructor).
      *
      * While Record Types can be syntactically created with the JavaScript `class`
      * form, the resulting Record function is actually a factory function, not a
      * class constructor. Even though Record Types are not classes, JavaScript
      * currently requires the use of `new` when creating new Record instances if
      * they are defined as a `class`.
      *
      * ```
      * class ABRecord extends Record({ a: 1, b: 2 }) {
      *   getAB() {
      *     return this.a + this.b;
      *   }
      * }
      *
      * var myRecord = new ABRecord({b: 3})
      * myRecord.getAB() // 4
      * ```
      *
      *
      * **Flow Typing Records:**
      *
      * Immutable.js exports two Flow types designed to make it easier to use
      * Records with flow typed code, `RecordOf<TProps>` and `RecordFactory<TProps>`.
      *
      * When defining a new kind of Record factory function, use a flow type that
      * describes the values the record contains along with `RecordFactory<TProps>`.
      * To type instances of the Record (which the factory function returns),
      * use `RecordOf<TProps>`.
      *
      * Typically, new Record definitions will export both the Record factory
      * function as well as the Record instance type for use in other code.
      *
      * ```js
      * import type { RecordFactory, RecordOf } from 'immutable';
      *
      * // Use RecordFactory<TProps> for defining new Record factory functions.
      * type Point3DProps = { x: number, y: number, z: number };
      * const defaultValues: Point3DProps = { x: 0, y: 0, z: 0 };
      * const makePoint3D: RecordFactory<Point3DProps> = Record(defaultValues);
      * export makePoint3D;
      *
      * // Use RecordOf<T> for defining new instances of that Record.
      * export type Point3D = RecordOf<Point3DProps>;
      * const some3DPoint: Point3D = makePoint3D({ x: 10, y: 20, z: 30 });
      * ```
      *
      * **Flow Typing Record Subclasses:**
      *
      * Records can be subclassed as a means to add additional methods to Record
      * instances. This is generally discouraged in favor of a more functional API,
      * since Subclasses have some minor overhead. However the ability to create
      * a rich API on Record types can be quite valuable.
      *
      * When using Flow to type Subclasses, do not use `RecordFactory<TProps>`,
      * instead apply the props type when subclassing:
      *
      * ```js
      * type PersonProps = {name: string, age: number};
      * const defaultValues: PersonProps = {name: 'Aristotle', age: 2400};
      * const PersonRecord = Record(defaultValues);
      * class Person extends PersonRecord<PersonProps> {
      *   getName(): string {
      *     return this.get('name')
      *   }
      *
      *   setName(name: string): this {
      *     return this.set('name', name);
      *   }
      * }
      * ```
      *
      * **Choosing Records vs plain JavaScript objects**
      *
      * Records offer a persistently immutable alternative to plain JavaScript
      * objects, however they're not required to be used within Immutable.js
      * collections. In fact, the deep-access and deep-updating functions
      * like `getIn()` and `setIn()` work with plain JavaScript Objects as well.
      *
      * Deciding to use Records or Objects in your application should be informed
      * by the tradeoffs and relative benefits of each:
      *
      * - *Runtime immutability*: plain JS objects may be carefully treated as
      *   immutable, however Record instances will *throw* if attempted to be
      *   mutated directly. Records provide this additional guarantee, however at
      *   some marginal runtime cost. While JS objects are mutable by nature, the
      *   use of type-checking tools like [Flow](https://medium.com/@gcanti/immutability-with-flow-faa050a1aef4)
      *   can help gain confidence in code written to favor immutability.
      *
      * - *Value equality*: Records use value equality when compared with `is()`
      *   or `record.equals()`. That is, two Records with the same keys and values
      *   are equal. Plain objects use *reference equality*. Two objects with the
      *   same keys and values are not equal since they are different objects.
      *   This is important to consider when using objects as keys in a `Map` or
      *   values in a `Set`, which use equality when retrieving values.
      *
      * - *API methods*: Records have a full featured API, with methods like
      *   `.getIn()`, and `.equals()`. These can make working with these values
      *   easier, but comes at the cost of not allowing keys with those names.
      *
      * - *Default values*: Records provide default values for every key, which
      *   can be useful when constructing Records with often unchanging values.
      *   However default values can make using Flow and TypeScript more laborious.
      *
      * - *Serialization*: Records use a custom internal representation to
      *   efficiently store and update their values. Converting to and from this
      *   form isn't free. If converting Records to plain objects is common,
      *   consider sticking with plain objects to begin with.
      */
    val Record: TypeofRecord = js.native
    
    /**
      * Returns a Seq.Indexed of `value` repeated `times` times. When `times` is
      * not defined, returns an infinite `Seq` of `value`.
      *
      * Note: `Repeat` is a factory function and not a class, and does not use the
      * `new` keyword during construction.
      *
      * ```js
      * const { Repeat } = require('immutable')
      * Repeat('foo') // [ 'foo', 'foo', 'foo', ... ]
      * Repeat('bar', 4) // [ 'bar', 'bar', 'bar', 'bar' ]
      * ```
      */
    def Repeat[T](value: T): Indexed[T] = js.native
    def Repeat[T](value: T, times: Double): Indexed[T] = js.native
    
    /**
      * `Seq` describes a lazy operation, allowing them to efficiently chain
      * use of all the higher-order collection methods (such as `map` and `filter`)
      * by not creating intermediate collections.
      *
      * **Seq is immutable** — Once a Seq is created, it cannot be
      * changed, appended to, rearranged or otherwise modified. Instead, any
      * mutative method called on a `Seq` will return a new `Seq`.
      *
      * **Seq is lazy** — `Seq` does as little work as necessary to respond to any
      * method call. Values are often created during iteration, including implicit
      * iteration when reducing or converting to a concrete data structure such as
      * a `List` or JavaScript `Array`.
      *
      * For example, the following performs no work, because the resulting
      * `Seq`'s values are never iterated:
      *
      * ```js
      * const { Seq } = require('immutable')
      * const oddSquares = Seq([ 1, 2, 3, 4, 5, 6, 7, 8 ])
      *   .filter(x => x % 2 !== 0)
      *   .map(x => x * x)
      * ```
      *
      * Once the `Seq` is used, it performs only the work necessary. In this
      * example, no intermediate arrays are ever created, filter is called three
      * times, and map is only called once:
      *
      * ```js
      * oddSquares.get(1); // 9
      * ```
      *
      * Any collection can be converted to a lazy Seq with `Seq()`.
      *
      * <!-- runkit:activate -->
      * ```js
      * const { Map } = require('immutable')
      * const map = Map({ a: 1, b: 2, c: 3 })
      * const lazySeq = Seq(map)
      * ```
      *
      * `Seq` allows for the efficient chaining of operations, allowing for the
      * expression of logic that can otherwise be very tedious:
      *
      * ```js
      * lazySeq
      *   .flip()
      *   .map(key => key.toUpperCase())
      *   .flip()
      * // Seq { A: 1, B: 1, C: 1 }
      * ```
      *
      * As well as expressing logic that would otherwise seem memory or time
      * limited, for example `Range` is a special kind of Lazy sequence.
      *
      * <!-- runkit:activate -->
      * ```js
      * const { Range } = require('immutable')
      * Range(1, Infinity)
      *   .skip(1000)
      *   .map(n => -n)
      *   .filter(n => n % 2 === 0)
      *   .take(2)
      *   .reduce((r, n) => r * n, 1)
      * // 1006008
      * ```
      *
      * Seq is often used to provide a rich collection API to JavaScript Object.
      *
      * ```js
      * Seq({ x: 0, y: 1, z: 2 }).map(v => v * 2).toObject();
      * // { x: 0, y: 2, z: 4 }
      * ```
      */
    val Seq: TypeofSeq = js.native
    
    /**
      * A Collection of unique values with `O(log32 N)` adds and has.
      *
      * When iterating a Set, the entries will be (value, value) pairs. Iteration
      * order of a Set is undefined, however is stable. Multiple iterations of the
      * same Set will iterate in the same order.
      *
      * Set values, like Map keys, may be of any type. Equality is determined using
      * `Immutable.is`, enabling Sets to uniquely include other Immutable
      * collections, custom value types, and NaN.
      */
    val Set: TypeofSetFromKeys = js.native
    
    /**
      * Stacks are indexed collections which support very efficient O(1) addition
      * and removal from the front using `unshift(v)` and `shift()`.
      *
      * For familiarity, Stack also provides `push(v)`, `pop()`, and `peek()`, but
      * be aware that they also operate on the front of the list, unlike List or
      * a JavaScript Array.
      *
      * Note: `reverse()` or any inherent reverse traversal (`reduceRight`,
      * `lastIndexOf`, etc.) is not efficient with a Stack.
      *
      * Stack is implemented with a Single-Linked List.
      */
    val Stack: TypeofStack = js.native
    
    /**
      * Deeply converts plain JS objects and arrays to Immutable Maps and Lists.
      *
      * `fromJS` will convert Arrays and [array-like objects][2] to a List, and
      * plain objects (without a custom prototype) to a Map. [Iterable objects][3]
      * may be converted to List, Map, or Set.
      *
      * If a `reviver` is optionally provided, it will be called with every
      * collection as a Seq (beginning with the most nested collections
      * and proceeding to the top-level collection itself), along with the key
      * referring to each collection and the parent JS object provided as `this`.
      * For the top level, object, the key will be `""`. This `reviver` is expected
      * to return a new Immutable Collection, allowing for custom conversions from
      * deep JS objects. Finally, a `path` is provided which is the sequence of
      * keys to this value from the starting value.
      *
      * `reviver` acts similarly to the [same parameter in `JSON.parse`][1].
      *
      * If `reviver` is not provided, the default behavior will convert Objects
      * into Maps and Arrays into Lists like so:
      *
      * <!-- runkit:activate -->
      * ```js
      * const { fromJS, isKeyed } = require('immutable')
      * function (key, value) {
      *   return isKeyed(value) ? value.toMap() : value.toList()
      * }
      * ```
      *
      * Accordingly, this example converts native JS data to OrderedMap and List:
      *
      * <!-- runkit:activate -->
      * ```js
      * const { fromJS, isKeyed } = require('immutable')
      * fromJS({ a: {b: [10, 20, 30]}, c: 40}, function (key, value, path) {
      *   console.log(key, value, path)
      *   return isKeyed(value) ? value.toOrderedMap() : value.toList()
      * })
      *
      * > "b", [ 10, 20, 30 ], [ "a", "b" ]
      * > "a", {b: [10, 20, 30]}, [ "a" ]
      * > "", {a: {b: [10, 20, 30]}, c: 40}, []
      * ```
      *
      * Keep in mind, when using JS objects to construct Immutable Maps, that
      * JavaScript Object properties are always strings, even if written in a
      * quote-less shorthand, while Immutable Maps accept keys of any type.
      *
      * <!-- runkit:activate -->
      * ```js
      * const { Map } = require('immutable')
      * let obj = { 1: "one" };
      * Object.keys(obj); // [ "1" ]
      * assert.equal(obj["1"], obj[1]); // "one" === "one"
      *
      * let map = Map(obj);
      * assert.notEqual(map.get("1"), map.get(1)); // "one" !== undefined
      * ```
      *
      * Property access for JavaScript Objects first converts the key to a string,
      * but since Immutable Map keys can be of any type the argument to `get()` is
      * not altered.
      *
      * [1]: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/parse#Example.3A_Using_the_reviver_parameter
      *      "Using the reviver parameter"
      * [2]: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Indexed_collections#working_with_array-like_objects
      *      "Working with array-like objects"
      * [3]: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols#the_iterable_protocol
      *      "The iterable protocol"
      */
    def fromJS(jsValue: Any): typings.immutable.mod.Collection[Any, Any] = js.native
    def fromJS(
      jsValue: Any,
      reviver: js.Function3[
          /* key */ String | Double, 
          /* sequence */ (Keyed[String, Any]) | typings.immutable.mod.Collection.Indexed[Any], 
          /* path */ js.UndefOr[js.Array[String | Double]], 
          Any
        ]
    ): typings.immutable.mod.Collection[Any, Any] = js.native
    
    def get[V](collection: js.Array[V], key: Double): js.UndefOr[V] = js.native
    def get[V](collection: StringDictionary[V], key: String): js.UndefOr[V] = js.native
    def get[V, NSV](collection: js.Array[V], key: Double, notSetValue: NSV): V | NSV = js.native
    def get[V, NSV](collection: StringDictionary[V], key: String, notSetValue: NSV): V | NSV = js.native
    /**
      * Returns the value within the provided collection associated with the
      * provided key, or notSetValue if the key is not defined in the collection.
      *
      * A functional alternative to `collection.get(key)` which will also work on
      * plain Objects and Arrays as an alternative for `collection[key]`.
      *
      * <!-- runkit:activate -->
      * ```js
      * const { get } = require('immutable')
      * get([ 'dog', 'frog', 'cat' ], 2) // 'frog'
      * get({ x: 123, y: 456 }, 'x') // 123
      * get({ x: 123, y: 456 }, 'z', 'ifNotSet') // 'ifNotSet'
      * ```
      */
    def get[K, V](collection: typings.immutable.mod.Collection[K, V], key: K): js.UndefOr[V] = js.native
    def get[C /* <: js.Object */, K /* <: /* keyof C */ String */](`object`: C, key: K, notSetValue: Any): /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any = js.native
    def get[TProps /* <: js.Object */, K /* <: /* keyof TProps */ String */](record: typings.immutable.mod.Record[TProps], key: K, notSetValue: Any): /* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ js.Any = js.native
    def get[K, V, NSV](collection: typings.immutable.mod.Collection[K, V], key: K, notSetValue: NSV): V | NSV = js.native
    
    /**
      * Returns the value at the provided key path starting at the provided
      * collection, or notSetValue if the key path is not defined.
      *
      * A functional alternative to `collection.getIn(keypath)` which will also
      * work with plain Objects and Arrays.
      *
      * <!-- runkit:activate -->
      * ```js
      * const { getIn } = require('immutable')
      * getIn({ x: { y: { z: 123 }}}, ['x', 'y', 'z']) // 123
      * getIn({ x: { y: { z: 123 }}}, ['x', 'q', 'p'], 'ifNotSet') // 'ifNotSet'
      * ```
      */
    def getIn(collection: Any, keyPath: js.Iterable[Any]): Any = js.native
    def getIn(collection: Any, keyPath: js.Iterable[Any], notSetValue: Any): Any = js.native
    
    /**
      * Returns true if the key is defined in the provided collection.
      *
      * A functional alternative to `collection.has(key)` which will also work with
      * plain Objects and Arrays as an alternative for
      * `collection.hasOwnProperty(key)`.
      *
      * <!-- runkit:activate -->
      * ```js
      * const { has } = require('immutable')
      * has([ 'dog', 'frog', 'cat' ], 2) // true
      * has([ 'dog', 'frog', 'cat' ], 5) // false
      * has({ x: 123, y: 456 }, 'x') // true
      * has({ x: 123, y: 456 }, 'z') // false
      * ```
      */
    def has(collection: js.Object, key: Any): Boolean = js.native
    
    /**
      * Returns true if the key path is defined in the provided collection.
      *
      * A functional alternative to `collection.hasIn(keypath)` which will also
      * work with plain Objects and Arrays.
      *
      * <!-- runkit:activate -->
      * ```js
      * const { hasIn } = require('immutable')
      * hasIn({ x: { y: { z: 123 }}}, ['x', 'y', 'z']) // true
      * hasIn({ x: { y: { z: 123 }}}, ['x', 'q', 'p']) // false
      * ```
      */
    def hasIn(collection: Any, keyPath: js.Iterable[Any]): Boolean = js.native
    
    /**
      * The `hash()` function is an important part of how Immutable determines if
      * two values are equivalent and is used to determine how to store those
      * values. Provided with any value, `hash()` will return a 31-bit integer.
      *
      * When designing Objects which may be equal, it's important that when a
      * `.equals()` method returns true, that both values `.hashCode()` method
      * return the same value. `hash()` may be used to produce those values.
      *
      * For non-Immutable Objects that do not provide a `.hashCode()` functions
      * (including plain Objects, plain Arrays, Date objects, etc), a unique hash
      * value will be created for each *instance*. That is, the create hash
      * represents referential equality, and not value equality for Objects. This
      * ensures that if that Object is mutated over time that its hash code will
      * remain consistent, allowing Objects to be used as keys and values in
      * Immutable.js collections.
      *
      * Note that `hash()` attempts to balance between speed and avoiding
      * collisions, however it makes no attempt to produce secure hashes.
      *
      * *New in Version 4.0*
      */
    def hash(value: Any): Double = js.native
    
    /**
      * Value equality check with semantics similar to `Object.is`, but treats
      * Immutable `Collection`s as values, equal if the second `Collection` includes
      * equivalent values.
      *
      * It's used throughout Immutable when checking for equality, including `Map`
      * key equality and `Set` membership.
      *
      * <!-- runkit:activate -->
      * ```js
      * const { Map, is } = require('immutable')
      * const map1 = Map({ a: 1, b: 1, c: 1 })
      * const map2 = Map({ a: 1, b: 1, c: 1 })
      * assert.equal(map1 !== map2, true)
      * assert.equal(Object.is(map1, map2), false)
      * assert.equal(is(map1, map2), true)
      * ```
      *
      * `is()` compares primitive types like strings and numbers, Immutable.js
      * collections like `Map` and `List`, but also any custom object which
      * implements `ValueObject` by providing `equals()` and `hashCode()` methods.
      *
      * Note: Unlike `Object.is`, `Immutable.is` assumes `0` and `-0` are the same
      * value, matching the behavior of ES6 Map key equality.
      */
    def is(first: Any, second: Any): Boolean = js.native
    
    /**
      * True if `maybeAssociative` is either a Keyed or Indexed Collection.
      *
      * <!-- runkit:activate -->
      * ```js
      * const { isAssociative, Map, List, Stack, Set } = require('immutable');
      * isAssociative([]); // false
      * isAssociative({}); // false
      * isAssociative(Map()); // true
      * isAssociative(List()); // true
      * isAssociative(Stack()); // true
      * isAssociative(Set()); // false
      * ```
      */
    def isAssociative(maybeAssociative: Any): Boolean = js.native
    
    /**
      * True if `maybeCollection` is a Collection, or any of its subclasses.
      *
      * <!-- runkit:activate -->
      * ```js
      * const { isCollection, Map, List, Stack } = require('immutable');
      * isCollection([]); // false
      * isCollection({}); // false
      * isCollection(Map()); // true
      * isCollection(List()); // true
      * isCollection(Stack()); // true
      * ```
      */
    def isCollection(maybeCollection: Any): /* is immutable.immutable.Collection<unknown, unknown> */ Boolean = js.native
    
    /**
      * True if `maybeImmutable` is an Immutable Collection or Record.
      *
      * Note: Still returns true even if the collections is within a `withMutations()`.
      *
      * <!-- runkit:activate -->
      * ```js
      * const { isImmutable, Map, List, Stack } = require('immutable');
      * isImmutable([]); // false
      * isImmutable({}); // false
      * isImmutable(Map()); // true
      * isImmutable(List()); // true
      * isImmutable(Stack()); // true
      * isImmutable(Map().asMutable()); // true
      * ```
      */
    def isImmutable(maybeImmutable: Any): /* is immutable.immutable.Collection<unknown, unknown> */ Boolean = js.native
    
    /**
      * True if `maybeIndexed` is a Collection.Indexed, or any of its subclasses.
      *
      * <!-- runkit:activate -->
      * ```js
      * const { isIndexed, Map, List, Stack, Set } = require('immutable');
      * isIndexed([]); // false
      * isIndexed({}); // false
      * isIndexed(Map()); // false
      * isIndexed(List()); // true
      * isIndexed(Stack()); // true
      * isIndexed(Set()); // false
      * ```
      */
    def isIndexed(maybeIndexed: Any): /* is immutable.immutable.Collection.Indexed<unknown> */ Boolean = js.native
    
    /**
      * True if `maybeKeyed` is a Collection.Keyed, or any of its subclasses.
      *
      * <!-- runkit:activate -->
      * ```js
      * const { isKeyed, Map, List, Stack } = require('immutable');
      * isKeyed([]); // false
      * isKeyed({}); // false
      * isKeyed(Map()); // true
      * isKeyed(List()); // false
      * isKeyed(Stack()); // false
      * ```
      */
    def isKeyed(maybeKeyed: Any): /* is immutable.immutable.Collection.Keyed<unknown, unknown> */ Boolean = js.native
    
    /**
      * True if `maybeList` is a List.
      */
    def isList(maybeList: Any): /* is immutable.immutable.List<unknown> */ Boolean = js.native
    
    /**
      * True if `maybeMap` is a Map.
      *
      * Also true for OrderedMaps.
      */
    def isMap(maybeMap: Any): /* is immutable.immutable.Map<unknown, unknown> */ Boolean = js.native
    
    /**
      * True if `maybeOrdered` is a Collection where iteration order is well
      * defined. True for Collection.Indexed as well as OrderedMap and OrderedSet.
      *
      * <!-- runkit:activate -->
      * ```js
      * const { isOrdered, Map, OrderedMap, List, Set } = require('immutable');
      * isOrdered([]); // false
      * isOrdered({}); // false
      * isOrdered(Map()); // false
      * isOrdered(OrderedMap()); // true
      * isOrdered(List()); // true
      * isOrdered(Set()); // false
      * ```
      */
    def isOrdered(maybeOrdered: Any): Boolean = js.native
    
    /**
      * True if `maybeOrderedMap` is an OrderedMap.
      */
    def isOrderedMap(maybeOrderedMap: Any): /* is immutable.immutable.OrderedMap<unknown, unknown> */ Boolean = js.native
    
    /**
      * True if `maybeOrderedSet` is an OrderedSet.
      */
    def isOrderedSet(maybeOrderedSet: Any): /* is immutable.immutable.OrderedSet<unknown> */ Boolean = js.native
    
    /**
      * True if `maybeRecord` is a Record.
      */
    def isRecord(maybeRecord: Any): /* is immutable.immutable.Record<{}> */ Boolean = js.native
    
    /**
      * True if `maybeSeq` is a Seq.
      */
    def isSeq(maybeSeq: Any): Boolean = js.native
    
    /**
      * True if `maybeSet` is a Set.
      *
      * Also true for OrderedSets.
      */
    def isSet(maybeSet: Any): /* is immutable.immutable.Set<unknown> */ Boolean = js.native
    
    /**
      * True if `maybeStack` is a Stack.
      */
    def isStack(maybeStack: Any): /* is immutable.immutable.Stack<unknown> */ Boolean = js.native
    
    /**
      * True if `maybeValue` is a JavaScript Object which has *both* `equals()`
      * and `hashCode()` methods.
      *
      * Any two instances of *value objects* can be compared for value equality with
      * `Immutable.is()` and can be used as keys in a `Map` or members in a `Set`.
      */
    def isValueObject(maybeValue: Any): /* is immutable.immutable.ValueObject */ Boolean = js.native
    
    /**
      * Returns a copy of the collection with the remaining collections merged in.
      *
      * A functional alternative to `collection.merge()` which will also work with
      * plain Objects and Arrays.
      *
      * <!-- runkit:activate -->
      * ```js
      * const { merge } = require('immutable')
      * const original = { x: 123, y: 456 }
      * merge(original, { y: 789, z: 'abc' }) // { x: 123, y: 789, z: 'abc' }
      * console.log(original) // { x: 123, y: 456 }
      * ```
      */
    def merge[C](collection: C, collections: ((js.Iterable[Any | (js.Tuple2[Any, Any])]) | StringDictionary[Any])*): C = js.native
    
    /**
      * Like `merge()`, but when two compatible collections are encountered with
      * the same key, it merges them as well, recursing deeply through the nested
      * data. Two collections are considered to be compatible (and thus will be
      * merged together) if they both fall into one of three categories: keyed
      * (e.g., `Map`s, `Record`s, and objects), indexed (e.g., `List`s and
      * arrays), or set-like (e.g., `Set`s). If they fall into separate
      * categories, `mergeDeep` will replace the existing collection with the
      * collection being merged in. This behavior can be customized by using
      * `mergeDeepWith()`.
      *
      * Note: Indexed and set-like collections are merged using
      * `concat()`/`union()` and therefore do not recurse.
      *
      * A functional alternative to `collection.mergeDeep()` which will also work
      * with plain Objects and Arrays.
      *
      * <!-- runkit:activate -->
      * ```js
      * const { mergeDeep } = require('immutable')
      * const original = { x: { y: 123 }}
      * mergeDeep(original, { x: { z: 456 }}) // { x: { y: 123, z: 456 }}
      * console.log(original) // { x: { y: 123 }}
      * ```
      */
    def mergeDeep[C](collection: C, collections: ((js.Iterable[Any | (js.Tuple2[Any, Any])]) | StringDictionary[Any])*): C = js.native
    
    /**
      * Like `mergeDeep()`, but when two non-collections or incompatible
      * collections are encountered at the same key, it uses the `merger` function
      * to determine the resulting value. Collections are considered incompatible
      * if they fall into separate categories between keyed, indexed, and set-like.
      *
      * A functional alternative to `collection.mergeDeepWith()` which will also
      * work with plain Objects and Arrays.
      *
      * <!-- runkit:activate -->
      * ```js
      * const { mergeDeepWith } = require('immutable')
      * const original = { x: { y: 123 }}
      * mergeDeepWith(
      *   (oldVal, newVal) => oldVal + newVal,
      *   original,
      *   { x: { y: 456 }}
      * ) // { x: { y: 579 }}
      * console.log(original) // { x: { y: 123 }}
      * ```
      */
    def mergeDeepWith[C](
      merger: js.Function3[/* oldVal */ Any, /* newVal */ Any, /* key */ Any, Any],
      collection: C,
      collections: ((js.Iterable[Any | (js.Tuple2[Any, Any])]) | StringDictionary[Any])*
    ): C = js.native
    
    /**
      * Returns a copy of the collection with the remaining collections merged in,
      * calling the `merger` function whenever an existing value is encountered.
      *
      * A functional alternative to `collection.mergeWith()` which will also work
      * with plain Objects and Arrays.
      *
      * <!-- runkit:activate -->
      * ```js
      * const { mergeWith } = require('immutable')
      * const original = { x: 123, y: 456 }
      * mergeWith(
      *   (oldVal, newVal) => oldVal + newVal,
      *   original,
      *   { y: 789, z: 'abc' }
      * ) // { x: 123, y: 1245, z: 'abc' }
      * console.log(original) // { x: 123, y: 456 }
      * ```
      */
    def mergeWith[C](
      merger: js.Function3[/* oldVal */ Any, /* newVal */ Any, /* key */ Any, Any],
      collection: C,
      collections: ((js.Iterable[Any | (js.Tuple2[Any, Any])]) | StringDictionary[Any])*
    ): C = js.native
    
    def remove[C /* <: js.Array[Any] */](collection: C, key: Double): C = js.native
    /**
      * Returns a copy of the collection with the value at key removed.
      *
      * A functional alternative to `collection.remove(key)` which will also work
      * with plain Objects and Arrays as an alternative for
      * `delete collectionCopy[key]`.
      *
      * <!-- runkit:activate -->
      * ```js
      * const { remove } = require('immutable')
      * const originalArray = [ 'dog', 'frog', 'cat' ]
      * remove(originalArray, 1) // [ 'dog', 'cat' ]
      * console.log(originalArray) // [ 'dog', 'frog', 'cat' ]
      * const originalObject = { x: 123, y: 456 }
      * remove(originalObject, 'x') // { y: 456 }
      * console.log(originalObject) // { x: 123, y: 456 }
      * ```
      */
    def remove[K, C /* <: typings.immutable.mod.Collection[K, Any] */](collection: C, key: K): C = js.native
    
    /**
      * Returns a copy of the collection with the value at the key path removed.
      *
      * A functional alternative to `collection.removeIn(keypath)` which will also
      * work with plain Objects and Arrays.
      *
      * <!-- runkit:activate -->
      * ```js
      * const { removeIn } = require('immutable')
      * const original = { x: { y: { z: 123 }}}
      * removeIn(original, ['x', 'y', 'z']) // { x: { y: {}}}
      * console.log(original) // { x: { y: { z: 123 }}}
      * ```
      */
    def removeIn[C](collection: C, keyPath: js.Iterable[Any]): C = js.native
    
    @JSName("remove")
    def remove_CK[C, K /* <: /* keyof C */ String */](collection: C, key: K): C = js.native
    @JSName("remove")
    def remove_TPropsCK[TProps /* <: js.Object */, C /* <: typings.immutable.mod.Record[TProps] */, K /* <: /* keyof TProps */ String */](collection: C, key: K): C = js.native
    
    def set[V, C /* <: StringDictionary[V] */](collection: C, key: String, value: V): C = js.native
    def set[V, C /* <: js.Array[V] */](collection: C, key: Double, value: V): C = js.native
    def set[C, K /* <: /* keyof C */ String */](
      `object`: C,
      key: K,
      value: /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any
    ): C = js.native
    /**
      * Returns a copy of the collection with the value at key set to the provided
      * value.
      *
      * A functional alternative to `collection.set(key, value)` which will also
      * work with plain Objects and Arrays as an alternative for
      * `collectionCopy[key] = value`.
      *
      * <!-- runkit:activate -->
      * ```js
      * const { set } = require('immutable')
      * const originalArray = [ 'dog', 'frog', 'cat' ]
      * set(originalArray, 1, 'cow') // [ 'dog', 'cow', 'cat' ]
      * console.log(originalArray) // [ 'dog', 'frog', 'cat' ]
      * const originalObject = { x: 123, y: 456 }
      * set(originalObject, 'x', 789) // { x: 789, y: 456 }
      * console.log(originalObject) // { x: 123, y: 456 }
      * ```
      */
    def set[K, V, C /* <: typings.immutable.mod.Collection[K, V] */](collection: C, key: K, value: V): C = js.native
    
    /**
      * Returns a copy of the collection with the value at the key path set to the
      * provided value.
      *
      * A functional alternative to `collection.setIn(keypath)` which will also
      * work with plain Objects and Arrays.
      *
      * <!-- runkit:activate -->
      * ```js
      * const { setIn } = require('immutable')
      * const original = { x: { y: { z: 123 }}}
      * setIn(original, ['x', 'y', 'z'], 456) // { x: { y: { z: 456 }}}
      * console.log(original) // { x: { y: { z: 123 }}}
      * ```
      */
    def setIn[C](collection: C, keyPath: js.Iterable[Any], value: Any): C = js.native
    
    @JSName("set")
    def set_TPropsCK[TProps /* <: js.Object */, C /* <: typings.immutable.mod.Record[TProps] */, K /* <: /* keyof TProps */ String */](
      record: C,
      key: K,
      value: /* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ js.Any
    ): C = js.native
    
    def update[V](collection: js.Array[V], key: Double, updater: js.Function1[/* value */ V, V]): js.Array[V] = js.native
    def update[V, NSV](
      collection: js.Array[V],
      key: Double,
      notSetValue: NSV,
      updater: js.Function1[/* value */ V | NSV, V]
    ): js.Array[V] = js.native
    def update[C, K /* <: /* keyof C */ String */](
      `object`: C,
      key: K,
      updater: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ /* value */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any
        ]
    ): C = js.native
    def update[C, K /* <: /* keyof C */ String */, NSV](
      `object`: C,
      key: K,
      notSetValue: NSV,
      updater: js.Function1[
          /* value */ (/* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any) | NSV, 
          /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any
        ]
    ): C = js.native
    
    def updateIn[C](
      collection: C,
      keyPath: js.Iterable[Any],
      notSetValue: Any,
      updater: js.Function1[/* value */ Any, Any]
    ): C = js.native
    /**
      * Returns a copy of the collection with the value at key path set to the
      * result of providing the existing value to the updating function.
      *
      * A functional alternative to `collection.updateIn(keypath)` which will also
      * work with plain Objects and Arrays.
      *
      * <!-- runkit:activate -->
      * ```js
      * const { updateIn } = require('immutable')
      * const original = { x: { y: { z: 123 }}}
      * updateIn(original, ['x', 'y', 'z'], val => val * 6) // { x: { y: { z: 738 }}}
      * console.log(original) // { x: { y: { z: 123 }}}
      * ```
      */
    def updateIn[C](collection: C, keyPath: js.Iterable[Any], updater: js.Function1[/* value */ Any, Any]): C = js.native
    
    /**
      * Returns a copy of the collection with the value at key set to the result of
      * providing the existing value to the updating function.
      *
      * A functional alternative to `collection.update(key, fn)` which will also
      * work with plain Objects and Arrays as an alternative for
      * `collectionCopy[key] = fn(collection[key])`.
      *
      * <!-- runkit:activate -->
      * ```js
      * const { update } = require('immutable')
      * const originalArray = [ 'dog', 'frog', 'cat' ]
      * update(originalArray, 1, val => val.toUpperCase()) // [ 'dog', 'FROG', 'cat' ]
      * console.log(originalArray) // [ 'dog', 'frog', 'cat' ]
      * const originalObject = { x: 123, y: 456 }
      * update(originalObject, 'x', val => val * 6) // { x: 738, y: 456 }
      * console.log(originalObject) // { x: 123, y: 456 }
      * ```
      */
    @JSName("update")
    def update_KVC[K, V, C /* <: typings.immutable.mod.Collection[K, V] */](collection: C, key: K, updater: js.Function1[/* value */ js.UndefOr[V], V]): C = js.native
    @JSName("update")
    def update_KVCNSV[K, V, C /* <: typings.immutable.mod.Collection[K, V] */, NSV](collection: C, key: K, notSetValue: NSV, updater: js.Function1[/* value */ V | NSV, V]): C = js.native
    @JSName("update")
    def update_TPropsCK[TProps /* <: js.Object */, C /* <: typings.immutable.mod.Record[TProps] */, K /* <: /* keyof TProps */ String */](
      record: C,
      key: K,
      updater: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ /* value */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ js.Any
        ]
    ): C = js.native
    @JSName("update")
    def update_TPropsCKNSV[TProps /* <: js.Object */, C /* <: typings.immutable.mod.Record[TProps] */, K /* <: /* keyof TProps */ String */, NSV](
      record: C,
      key: K,
      notSetValue: NSV,
      updater: js.Function1[
          /* value */ (/* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ js.Any) | NSV, 
          /* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ js.Any
        ]
    ): C = js.native
    @JSName("update")
    def update_VCKNSV_StringDictionary[V, C /* <: StringDictionary[V] */, K /* <: /* keyof C */ String */, NSV](collection: C, key: K, notSetValue: NSV, updater: js.Function1[/* value */ V | NSV, V]): StringDictionary[V] = js.native
    @JSName("update")
    def update_VCK_StringDictionary[V, C /* <: StringDictionary[V] */, K /* <: /* keyof C */ String */](collection: C, key: K, updater: js.Function1[/* value */ V, V]): StringDictionary[V] = js.native
  }
  
  @js.native
  trait TypeofIndexed extends StObject {
    
    /**
      * Creates a new Collection.Indexed.
      *
      * Note: `Collection.Indexed` is a conversion function and not a class, and
      * does not use the `new` keyword during construction.
      */
    def apply[T](): typings.immutable.mod.Collection.Indexed[T] = js.native
    def apply[T](collection: js.Iterable[T]): typings.immutable.mod.Collection.Indexed[T] = js.native
    def apply[T](collection: ArrayLike[T]): typings.immutable.mod.Collection.Indexed[T] = js.native
  }
  
  @js.native
  trait TypeofIndexedOf extends StObject {
    
    /**
      * Always returns Seq.Indexed, discarding associated keys and
      * supplying incrementing indices.
      *
      * Note: `Seq.Indexed` is a conversion function and not a class, and does
      * not use the `new` keyword during construction.
      */
    def apply[T](): Indexed[T] = js.native
    def apply[T](collection: js.Iterable[T]): Indexed[T] = js.native
    def apply[T](collection: ArrayLike[T]): Indexed[T] = js.native
    
    /**
      * Provides an Seq.Indexed of the values provided.
      */
    def of[T](values: T*): Indexed[T] = js.native
  }
  
  @js.native
  trait TypeofKeyed extends StObject {
    
    def apply[V](obj: StringDictionary[V]): Keyed[String, V] = js.native
    /**
      * Creates a Collection.Keyed
      *
      * Similar to `Collection()`, however it expects collection-likes of [K, V]
      * tuples if not constructed from a Collection.Keyed or JS Object.
      *
      * Note: `Collection.Keyed` is a conversion function and not a class, and
      * does not use the `new` keyword during construction.
      */
    def apply[K, V](): Keyed[K, V] = js.native
    def apply[K, V](collection: js.Iterable[js.Tuple2[K, V]]): Keyed[K, V] = js.native
  }
  
  @js.native
  trait TypeofKeyed0 extends StObject {
    
    def apply[V](obj: StringDictionary[V]): typings.immutable.mod.Seq.Keyed[String, V] = js.native
    /**
      * Always returns a Seq.Keyed, if input is not keyed, expects an
      * collection of [K, V] tuples.
      *
      * Note: `Seq.Keyed` is a conversion function and not a class, and does not
      * use the `new` keyword during construction.
      */
    def apply[K, V](): typings.immutable.mod.Seq.Keyed[K, V] = js.native
    def apply[K, V](collection: js.Iterable[js.Tuple2[K, V]]): typings.immutable.mod.Seq.Keyed[K, V] = js.native
  }
  
  @js.native
  trait TypeofList extends StObject {
    
    /**
      * Create a new immutable List containing the values of the provided
      * collection-like.
      *
      * Note: `List` is a factory function and not a class, and does not use the
      * `new` keyword during construction.
      *
      * <!-- runkit:activate -->
      * ```js
      * const { List, Set } = require('immutable')
      *
      * const emptyList = List()
      * // List []
      *
      * const plainArray = [ 1, 2, 3, 4 ]
      * const listFromPlainArray = List(plainArray)
      * // List [ 1, 2, 3, 4 ]
      *
      * const plainSet = Set([ 1, 2, 3, 4 ])
      * const listFromPlainSet = List(plainSet)
      * // List [ 1, 2, 3, 4 ]
      *
      * const arrayIterator = plainArray[Symbol.iterator]()
      * const listFromCollectionArray = List(arrayIterator)
      * // List [ 1, 2, 3, 4 ]
      *
      * listFromPlainArray.equals(listFromCollectionArray) // true
      * listFromPlainSet.equals(listFromCollectionArray) // true
      * listFromPlainSet.equals(listFromPlainArray) // true
      * ```
      */
    def apply[T](): typings.immutable.mod.List[T] = js.native
    def apply[T](collection: js.Iterable[T]): typings.immutable.mod.List[T] = js.native
    def apply[T](collection: ArrayLike[T]): typings.immutable.mod.List[T] = js.native
    
    /**
      * True if the provided value is a List
      *
      * <!-- runkit:activate -->
      * ```js
      * const { List } = require('immutable');
      * List.isList([]); // false
      * List.isList(List()); // true
      * ```
      */
    def isList(maybeList: Any): /* is immutable.immutable.List<unknown> */ Boolean = js.native
    
    /**
      * Creates a new List containing `values`.
      *
      * <!-- runkit:activate -->
      * ```js
      * const { List } = require('immutable');
      * List.of(1, 2, 3, 4)
      * // List [ 1, 2, 3, 4 ]
      * ```
      *
      * Note: Values are not altered or converted in any way.
      *
      * <!-- runkit:activate -->
      * ```js
      * const { List } = require('immutable');
      * List.of({x:1}, 2, [3], 4)
      * // List [ { x: 1 }, 2, [ 3 ], 4 ]
      * ```
      */
    def of[T](values: T*): typings.immutable.mod.List[T] = js.native
  }
  
  @js.native
  trait TypeofMap extends StObject {
    
    def apply[V](obj: StringDictionary[V]): Map[String, V] = js.native
    /**
      * Creates a new Immutable Map.
      *
      * Created with the same key value pairs as the provided Collection.Keyed or
      * JavaScript Object or expects a Collection of [K, V] tuple entries.
      *
      * Note: `Map` is a factory function and not a class, and does not use the
      * `new` keyword during construction.
      *
      * <!-- runkit:activate -->
      * ```js
      * const { Map } = require('immutable')
      * Map({ key: "value" })
      * Map([ [ "key", "value" ] ])
      * ```
      *
      * Keep in mind, when using JS objects to construct Immutable Maps, that
      * JavaScript Object properties are always strings, even if written in a
      * quote-less shorthand, while Immutable Maps accept keys of any type.
      *
      * <!-- runkit:activate
      *      { "preamble": "const { Map } = require('immutable');" }
      * -->
      * ```js
      * let obj = { 1: "one" }
      * Object.keys(obj) // [ "1" ]
      * assert.equal(obj["1"], obj[1]) // "one" === "one"
      *
      * let map = Map(obj)
      * assert.notEqual(map.get("1"), map.get(1)) // "one" !== undefined
      * ```
      *
      * Property access for JavaScript Objects first converts the key to a string,
      * but since Immutable Map keys can be of any type the argument to `get()` is
      * not altered.
      */
    def apply[K, V](): Map[K, V] = js.native
    def apply[K, V](collection: js.Iterable[js.Tuple2[K, V]]): Map[K, V] = js.native
    def apply[K /* <: String | js.Symbol */, V](
      obj: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in K ]:? V} */ js.Any
    ): Map[K, V] = js.native
    
    /**
      * True if the provided value is a Map
      *
      * <!-- runkit:activate -->
      * ```js
      * const { Map } = require('immutable')
      * Map.isMap({}) // false
      * Map.isMap(Map()) // true
      * ```
      */
    def isMap(maybeMap: Any): /* is immutable.immutable.Map<unknown, unknown> */ Boolean = js.native
    
    /**
      * Creates a new Map from alternating keys and values
      *
      * <!-- runkit:activate -->
      * ```js
      * const { Map } = require('immutable')
      * Map.of(
      *   'key', 'value',
      *   'numerical value', 3,
      *    0, 'numerical key'
      * )
      * // Map { 0: "numerical key", "key": "value", "numerical value": 3 }
      * ```
      *
      * @deprecated Use Map([ [ 'k', 'v' ] ]) or Map({ k: 'v' })
      */
    def of(keyValues: Any*): Map[Any, Any] = js.native
  }
  
  @js.native
  trait TypeofOrderedMap extends StObject {
    
    def apply[V](obj: StringDictionary[V]): OrderedMap[String, V] = js.native
    /**
      * Creates a new Immutable OrderedMap.
      *
      * Created with the same key value pairs as the provided Collection.Keyed or
      * JavaScript Object or expects a Collection of [K, V] tuple entries.
      *
      * The iteration order of key-value pairs provided to this constructor will
      * be preserved in the OrderedMap.
      *
      *     let newOrderedMap = OrderedMap({key: "value"})
      *     let newOrderedMap = OrderedMap([["key", "value"]])
      *
      * Note: `OrderedMap` is a factory function and not a class, and does not use
      * the `new` keyword during construction.
      */
    def apply[K, V](): OrderedMap[K, V] = js.native
    def apply[K, V](collection: js.Iterable[js.Tuple2[K, V]]): OrderedMap[K, V] = js.native
    
    /**
      * True if the provided value is an OrderedMap.
      */
    def isOrderedMap(maybeOrderedMap: Any): /* is immutable.immutable.OrderedMap<unknown, unknown> */ Boolean = js.native
  }
  
  @js.native
  trait TypeofOrderedSet extends StObject {
    
    /**
      * Create a new immutable OrderedSet containing the values of the provided
      * collection-like.
      *
      * Note: `OrderedSet` is a factory function and not a class, and does not use
      * the `new` keyword during construction.
      */
    def apply[T](): OrderedSet[T] = js.native
    def apply[T](collection: js.Iterable[T]): OrderedSet[T] = js.native
    def apply[T](collection: ArrayLike[T]): OrderedSet[T] = js.native
    
    def fromKeys(obj: StringDictionary[Any]): OrderedSet[String] = js.native
    /**
      * `OrderedSet.fromKeys()` creates a new immutable OrderedSet containing
      * the keys from this Collection or JavaScript Object.
      */
    def fromKeys[T](iter: Collection[T, Any]): OrderedSet[T] = js.native
    
    /**
      * True if the provided value is an OrderedSet.
      */
    def isOrderedSet(maybeOrderedSet: Any): Boolean = js.native
    
    /**
      * Creates a new OrderedSet containing `values`.
      */
    def of[T](values: T*): OrderedSet[T] = js.native
  }
  
  @js.native
  trait TypeofRecord extends StObject {
    
    /**
      * Unlike other types in Immutable.js, the `Record()` function creates a new
      * Record Factory, which is a function that creates Record instances.
      *
      * See above for examples of using `Record()`.
      *
      * Note: `Record` is a factory function and not a class, and does not use the
      * `new` keyword during construction.
      */
    def apply[TProps /* <: js.Object */](defaultValues: TProps): typings.immutable.mod.Record.Factory[TProps] = js.native
    def apply[TProps /* <: js.Object */](defaultValues: TProps, name: String): typings.immutable.mod.Record.Factory[TProps] = js.native
    
    /**
      * A Record.Factory is created by the `Record()` function. Record instances
      * are created by passing it some of the accepted values for that Record
      * type:
      *
      * <!-- runkit:activate
      *      { "preamble": "const { Record } = require('immutable')" }
      * -->
      * ```js
      * // makePerson is a Record Factory function
      * const makePerson = Record({ name: null, favoriteColor: 'unknown' });
      *
      * // alan is a Record instance
      * const alan = makePerson({ name: 'Alan' });
      * ```
      *
      * Note that Record Factories return `Record<TProps> & Readonly<TProps>`,
      * this allows use of both the Record instance API, and direct property
      * access on the resulting instances:
      *
      * <!-- runkit:activate
      *      { "preamble": "const { Record } = require('immutable');const makePerson = Record({ name: null, favoriteColor: 'unknown' });const alan = makePerson({ name: 'Alan' });" }
      * -->
      * ```js
      * // Use the Record API
      * console.log('Record API: ' + alan.get('name'))
      *
      * // Or direct property access (Readonly)
      * console.log('property access: ' + alan.name)
      * ```
      *
      * **Flow Typing Records:**
      *
      * Use the `RecordFactory<TProps>` Flow type to get high quality type checking of
      * Records:
      *
      * ```js
      * import type { RecordFactory, RecordOf } from 'immutable';
      *
      * // Use RecordFactory<TProps> for defining new Record factory functions.
      * type PersonProps = { name: ?string, favoriteColor: string };
      * const makePerson: RecordFactory<PersonProps> = Record({ name: null, favoriteColor: 'unknown' });
      *
      * // Use RecordOf<T> for defining new instances of that Record.
      * type Person = RecordOf<PersonProps>;
      * const alan: Person = makePerson({ name: 'Alan' });
      * ```
      */
    val Factory: TypeofFactory = js.native
    
    /**
      * Records allow passing a second parameter to supply a descriptive name
      * that appears when converting a Record to a string or in any error
      * messages. A descriptive name for any record can be accessed by using this
      * method. If one was not provided, the string "Record" is returned.
      *
      * ```js
      * const { Record } = require('immutable')
      * const Person = Record({
      *   name: null
      * }, 'Person')
      *
      * var me = Person({ name: 'My Name' })
      * me.toString() // "Person { "name": "My Name" }"
      * Record.getDescriptiveName(me) // "Person"
      * ```
      */
    def getDescriptiveName(record: Record[Any]): String = js.native
    
    /**
      * True if `maybeRecord` is an instance of a Record.
      */
    def isRecord(maybeRecord: Any): /* is immutable.immutable.Record<{}> */ Boolean = js.native
  }
  
  @js.native
  trait TypeofSeq extends StObject {
    
    def apply[T](collection: js.Iterable[T]): typings.immutable.mod.Seq.Indexed[T] = js.native
    def apply[T](collection: typings.immutable.mod.Collection.Indexed[T]): typings.immutable.mod.Seq.Indexed[T] = js.native
    def apply[T](collection: typings.immutable.mod.Collection.Set[T]): typings.immutable.mod.Seq.Set[T] = js.native
    def apply[T](collection: ArrayLike[T]): typings.immutable.mod.Seq.Indexed[T] = js.native
    def apply[V](obj: StringDictionary[V]): typings.immutable.mod.Seq.Keyed[String, V] = js.native
    /**
      * Creates a Seq.
      *
      * Returns a particular kind of `Seq` based on the input.
      *
      *   * If a `Seq`, that same `Seq`.
      *   * If an `Collection`, a `Seq` of the same kind (Keyed, Indexed, or Set).
      *   * If an Array-like, an `Seq.Indexed`.
      *   * If an Iterable Object, an `Seq.Indexed`.
      *   * If an Object, a `Seq.Keyed`.
      *
      * Note: An Iterator itself will be treated as an object, becoming a `Seq.Keyed`,
      * which is usually not what you want. You should turn your Iterator Object into
      * an iterable object by defining a Symbol.iterator (or @@iterator) method which
      * returns `this`.
      *
      * Note: `Seq` is a conversion function and not a class, and does not use the
      * `new` keyword during construction.
      */
    def apply[S /* <: Seq[Any, Any] */](seq: S): S = js.native
    def apply[K, V](): Seq[K, V] = js.native
    def apply[K, V](collection: typings.immutable.mod.Collection.Keyed[K, V]): typings.immutable.mod.Seq.Keyed[K, V] = js.native
    
    /**
      * `Seq` which represents an ordered indexed list of values.
      */
    val Indexed: TypeofIndexedOf = js.native
    
    /**
      * `Seq` which represents key-value pairs.
      */
    val Keyed: TypeofKeyed0 = js.native
    
    /**
      * `Seq` which represents a set of values.
      *
      * Because `Seq` are often lazy, `Seq.Set` does not provide the same guarantee
      * of value uniqueness as the concrete `Set`.
      */
    val Set: TypeofSetOf = js.native
    
    /**
      * True if `maybeSeq` is a Seq, it is not backed by a concrete
      * structure such as Map, List, or Set.
      */
    def isSeq(maybeSeq: Any): Boolean = js.native
  }
  
  @js.native
  trait TypeofSet extends StObject {
    
    /**
      * Similar to `Collection()`, but always returns a Collection.Set.
      *
      * Note: `Collection.Set` is a factory function and not a class, and does
      * not use the `new` keyword during construction.
      */
    def apply[T](): Set[T] = js.native
    def apply[T](collection: js.Iterable[T]): Set[T] = js.native
    def apply[T](collection: ArrayLike[T]): Set[T] = js.native
  }
  
  @js.native
  trait TypeofSetFromKeys extends StObject {
    
    /**
      * Create a new immutable Set containing the values of the provided
      * collection-like.
      *
      * Note: `Set` is a factory function and not a class, and does not use the
      * `new` keyword during construction.
      */
    def apply[T](): Set_[T] = js.native
    def apply[T](collection: js.Iterable[T]): Set_[T] = js.native
    def apply[T](collection: ArrayLike[T]): Set_[T] = js.native
    
    def fromKeys(obj: StringDictionary[Any]): Set_[String] = js.native
    /**
      * `Set.fromKeys()` creates a new immutable Set containing the keys from
      * this Collection or JavaScript Object.
      */
    def fromKeys[T](iter: Collection[T, Any]): Set_[T] = js.native
    
    /**
      * `Set.intersect()` creates a new immutable Set that is the intersection of
      * a collection of other sets.
      *
      * ```js
      * const { Set } = require('immutable')
      * const intersected = Set.intersect([
      *   Set([ 'a', 'b', 'c' ])
      *   Set([ 'c', 'a', 't' ])
      * ])
      * // Set [ "a", "c" ]
      * ```
      */
    def intersect[T](sets: js.Iterable[js.Iterable[T]]): Set_[T] = js.native
    
    /**
      * True if the provided value is a Set
      */
    def isSet(maybeSet: Any): /* is immutable.immutable.Set<unknown> */ Boolean = js.native
    
    /**
      * Creates a new Set containing `values`.
      */
    def of[T](values: T*): Set_[T] = js.native
    
    /**
      * `Set.union()` creates a new immutable Set that is the union of a
      * collection of other sets.
      *
      * ```js
      * const { Set } = require('immutable')
      * const unioned = Set.union([
      *   Set([ 'a', 'b', 'c' ])
      *   Set([ 'c', 'a', 't' ])
      * ])
      * // Set [ "a", "b", "c", "t" ]
      * ```
      */
    def union[T](sets: js.Iterable[js.Iterable[T]]): Set_[T] = js.native
  }
  
  @js.native
  trait TypeofSetOf extends StObject {
    
    /**
      * Always returns a Seq.Set, discarding associated indices or keys.
      *
      * Note: `Seq.Set` is a conversion function and not a class, and does not
      * use the `new` keyword during construction.
      */
    def apply[T](): typings.immutable.mod.Seq.Set[T] = js.native
    def apply[T](collection: js.Iterable[T]): typings.immutable.mod.Seq.Set[T] = js.native
    def apply[T](collection: ArrayLike[T]): typings.immutable.mod.Seq.Set[T] = js.native
    
    /**
      * Returns a Seq.Set of the provided values
      */
    def of[T](values: T*): typings.immutable.mod.Seq.Set[T] = js.native
  }
  
  @js.native
  trait TypeofStack extends StObject {
    
    /**
      * Create a new immutable Stack containing the values of the provided
      * collection-like.
      *
      * The iteration order of the provided collection is preserved in the
      * resulting `Stack`.
      *
      * Note: `Stack` is a factory function and not a class, and does not use the
      * `new` keyword during construction.
      */
    def apply[T](): Stack[T] = js.native
    def apply[T](collection: js.Iterable[T]): Stack[T] = js.native
    def apply[T](collection: ArrayLike[T]): Stack[T] = js.native
    
    /**
      * True if the provided value is a Stack
      */
    def isStack(maybeStack: Any): /* is immutable.immutable.Stack<unknown> */ Boolean = js.native
    
    /**
      * Creates a new Stack containing `values`.
      */
    def of[T](values: T*): Stack[T] = js.native
  }
}
