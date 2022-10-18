package typings.react.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Base component for plain JS classes
@JSImport("react", "Component")
@js.native
open class Component[P, S, SS] protected ()
  extends StObject
     with ComponentLifecycle[P, S, SS] {
  def this(props: P) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: P, context: Any) = this()
  
  /**
    * If using the new style context, re-declare this in your class to be the
    * `React.ContextType` of your `static contextType`.
    * Should be used with type annotation or static contextType.
    *
    * ```ts
    * static contextType = MyContext
    * // For TS pre-3.7:
    * context!: React.ContextType<typeof MyContext>
    * // For TS 3.7 and above:
    * declare context: React.ContextType<typeof MyContext>
    * ```
    *
    * @see https://reactjs.org/docs/context.html
    */
  var context: Any = js.native
  
  def forceUpdate(): Unit = js.native
  def forceUpdate(callback: js.Function0[Unit]): Unit = js.native
  
  val props: P = js.native
  
  /**
    * @deprecated
    * https://reactjs.org/docs/refs-and-the-dom.html#legacy-api-string-refs
    */
  var refs: StringDictionary[ReactInstance] = js.native
  
  def render(): ReactNode = js.native
  
  // We MUST keep setState() as a unified signature because it allows proper checking of the method return type.
  // See: https://github.com/DefinitelyTyped/DefinitelyTyped/issues/18365#issuecomment-351013257
  // Also, the ` | S` allows intellisense to not be dumbisense
  def setState[K /* <: /* keyof S */ String */](): Unit = js.native
  def setState[K /* <: /* keyof S */ String */](state: (Pick[S, K]) | S): Unit = js.native
  def setState[K /* <: /* keyof S */ String */](state: (Pick[S, K]) | S, callback: js.Function0[Unit]): Unit = js.native
  def setState[K /* <: /* keyof S */ String */](state: js.Function2[/* prevState */ S, /* props */ P, (Pick[S, K]) | S | Null]): Unit = js.native
  def setState[K /* <: /* keyof S */ String */](
    state: js.Function2[/* prevState */ S, /* props */ P, (Pick[S, K]) | S | Null],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def setState[K /* <: /* keyof S */ String */](state: Null, callback: js.Function0[Unit]): Unit = js.native
  
  var state: S = js.native
}
object Component {
  
  @JSImport("react", "Component")
  @js.native
  val ^ : js.Any = js.native
  
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
  /* static member */
  @JSImport("react", "Component.contextType")
  @js.native
  def contextType: js.UndefOr[Context[Any]] = js.native
  inline def contextType_=(x: js.UndefOr[Context[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
}
