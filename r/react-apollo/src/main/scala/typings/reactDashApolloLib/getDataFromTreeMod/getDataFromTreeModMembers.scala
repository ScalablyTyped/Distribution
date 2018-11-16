package typings
package reactDashApolloLib.getDataFromTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-apollo/getDataFromTree", JSImport.Namespace)
@js.native
object getDataFromTreeModMembers extends js.Object {
  def default(rootElement: reactLib.reactMod.ReactNs.ReactNode): stdLib.Promise[_] = js.native
  def default(rootElement: reactLib.reactMod.ReactNs.ReactNode, rootContext: js.Any): stdLib.Promise[_] = js.native
  def walkTree(
    element: reactLib.reactMod.ReactNs.ReactNode,
    context: Context,
    visitor: js.Function5[
      /* element */ reactLib.reactMod.ReactNs.ReactNode, 
      /* instance */ (reactLib.reactMod.Component[_, js.Object, _]) | scala.Null, 
      /* newContextMap */ lodashLib.lodashMod.Global.Map[_, _], 
      /* context */ Context, 
      /* childContext */ js.UndefOr[Context], 
      scala.Boolean | scala.Unit
    ]
  ): scala.Unit = js.native
  def walkTree(
    element: reactLib.reactMod.ReactNs.ReactNode,
    context: Context,
    visitor: js.Function5[
      /* element */ reactLib.reactMod.ReactNs.ReactNode, 
      /* instance */ (reactLib.reactMod.Component[_, js.Object, _]) | scala.Null, 
      /* newContextMap */ lodashLib.lodashMod.Global.Map[_, _], 
      /* context */ Context, 
      /* childContext */ js.UndefOr[Context], 
      scala.Boolean | scala.Unit
    ],
    newContext: lodashLib.lodashMod.Global.Map[_, _]
  ): scala.Unit = js.native
}

