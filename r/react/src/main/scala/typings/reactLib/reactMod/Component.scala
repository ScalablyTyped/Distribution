package typings
package reactLib.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Base component for plain JS classes
// tslint:disable-next-line:no-empty-interface
@JSImport("react", "Component")
@js.native
class Component[P, S, SS] protected () extends ComponentLifecycle[P, S, SS] {
  def this(props: P) = this()
  def this(props: P, context: js.Any) = this()
  /**
    * If using the new style context, re-declare this in your class to be the
    * `React.ContextType` of your `static contextType`.
    *
    * ```ts
    * static contextType = MyContext
    * context!: React.ContextType<typeof MyContext>
    * ```
    *
    * @deprecated if used without a type annotation, or without static contextType
    * @see https://reactjs.org/docs/legacy-context.html
    */
  // TODO (TypeScript 3.0): unknown
  var context: js.Any = js.native
  // React.Props<T> is now deprecated, which means that the `children`
  // property is not available on `P` by default, even though you can
  // always pass children as variadic arguments to `createElement`.
  // In the future, if we can define its call signature conditionally
  // on the existence of `children` in `P`, then we should remove this.
  val props: P with reactLib.Anon_Children = js.native
  /**
    * @deprecated
    * https://reactjs.org/docs/refs-and-the-dom.html#legacy-api-string-refs
    */
  var refs: org.scalablytyped.runtime.StringDictionary[ReactInstance] = js.native
  var state: S = js.native
  def forceUpdate(): scala.Unit = js.native
  def forceUpdate(callBack: js.Function0[scala.Unit]): scala.Unit = js.native
  def render(): ReactNode = js.native
  def setState[K /* <: java.lang.String */](): scala.Unit = js.native
  def setState[K /* <: java.lang.String */](state: S): scala.Unit = js.native
  def setState[K /* <: java.lang.String */](state: S, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  // We MUST keep setState() as a unified signature because it allows proper checking of the method return type.
  // See: https://github.com/DefinitelyTyped/DefinitelyTyped/issues/18365#issuecomment-351013257
  // Also, the ` | S` allows intellisense to not be dumbisense
  def setState[K /* <: java.lang.String */](state: js.Function2[/* prevState */ S, /* props */ P, (stdLib.Pick[S, K]) | S | scala.Null]): scala.Unit = js.native
  def setState[K /* <: java.lang.String */](
    state: js.Function2[/* prevState */ S, /* props */ P, (stdLib.Pick[S, K]) | S | scala.Null],
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def setState[K /* <: java.lang.String */](state: scala.Null, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def setState[K /* <: java.lang.String */](state: stdLib.Pick[S, K]): scala.Unit = js.native
  def setState[K /* <: java.lang.String */](state: stdLib.Pick[S, K], callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

/* static members */
@JSImport("react", "Component")
@js.native
object Component extends js.Object {
  // tslint won't let me format the sample code in a way that vscode likes it :(
  /**
    * If set, `this.context` will be set at runtime to the current value of the given Context.
    *
    * Usage:
    *
    * ```ts
    * type MyContext = number
    * const Ctx = React.createContext<MyContext>(0)
    *
    * class Foo extends React.Component {
    *   static contextType = Ctx
    *   context!: React.ContextType<typeof Ctx>
    *   render () {
    *     return <>My context's value: {this.context}</>;
    *   }
    * }
    * ```
    *
    * @see https://reactjs.org/docs/context.html#classcontexttype
    */
  var contextType: js.UndefOr[reactLib.reactMod.Context[_]] = js.native
}

