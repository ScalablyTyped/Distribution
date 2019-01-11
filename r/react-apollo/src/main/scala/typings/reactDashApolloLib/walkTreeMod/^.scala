package typings
package reactDashApolloLib.walkTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-apollo/walkTree", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def walkTree(
    element: reactLib.reactMod.ReactNs.ReactNode,
    context: reactDashApolloLib.walkTreeMod.Context,
    visitor: js.Function5[
      /* element */ reactLib.reactMod.ReactNs.ReactNode, 
      /* instance */ (reactLib.reactMod.Component[_, js.Object, _]) | scala.Null, 
      /* newContextMap */ lodashLib.lodashMod.Global.Map[_, _], 
      /* context */ reactDashApolloLib.walkTreeMod.Context, 
      /* childContext */ js.UndefOr[reactDashApolloLib.walkTreeMod.Context], 
      scala.Boolean | scala.Unit
    ]
  ): scala.Unit = js.native
  def walkTree(
    element: reactLib.reactMod.ReactNs.ReactNode,
    context: reactDashApolloLib.walkTreeMod.Context,
    visitor: js.Function5[
      /* element */ reactLib.reactMod.ReactNs.ReactNode, 
      /* instance */ (reactLib.reactMod.Component[_, js.Object, _]) | scala.Null, 
      /* newContextMap */ lodashLib.lodashMod.Global.Map[_, _], 
      /* context */ reactDashApolloLib.walkTreeMod.Context, 
      /* childContext */ js.UndefOr[reactDashApolloLib.walkTreeMod.Context], 
      scala.Boolean | scala.Unit
    ],
    newContext: lodashLib.lodashMod.Global.Map[_, _]
  ): scala.Unit = js.native
}

