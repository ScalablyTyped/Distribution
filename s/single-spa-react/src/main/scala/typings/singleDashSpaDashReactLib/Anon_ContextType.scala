package typings
package singleDashSpaDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ContextType
  extends org.scalablytyped.runtime.Instantiable1[
      /* props */ stdLib.Readonly[/* import warning: RewrittenClass.unapply cls $anonfun was tparam P */ js.Any], 
      reactLib.reactMod.Component[js.Object, js.Object, js.Object]
    ] {
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

