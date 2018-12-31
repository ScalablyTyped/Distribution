package typings
package reactLib.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Base component for plain JS classes
// tslint:disable-next-line:no-empty-interface
@JSImport("react", "Component")
@js.native
class Component[P, S, SS] protected ()
  extends reactLib.reactMod.ReactNs.Component[P, S, SS] {
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: P) = this()
  def this(props: stdLib.Readonly[P]) = this()
  def this(props: P, context: js.Any) = this()
}

// Base component for plain JS classes
// tslint:disable-next-line:no-empty-interface
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
  var contextType: js.UndefOr[reactLib.reactMod.ReactNs.Context[_]] = js.native
}

