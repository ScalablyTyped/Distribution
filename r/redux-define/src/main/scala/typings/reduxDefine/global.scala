package typings.reduxDefine

import typings.reduxDefine.mod.Action
import typings.reduxDefine.mod.NamespaceString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ReduxDefine {
    
    @JSGlobal("ReduxDefine")
    @js.native
    val ^ : js.Any = js.native
    
    inline def defineAction[OwnAction /* <: String */](actionType: OwnAction): Action[OwnAction, Unit, Unit, js.Array[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("defineAction")(actionType.asInstanceOf[js.Any]).asInstanceOf[Action[OwnAction, Unit, Unit, js.Array[Unit]]]
    inline def defineAction[OwnAction /* <: String */, Namespace /* <: String | (Action[String, Unit, Unit, js.Array[Unit]]) */](actionType: OwnAction, namespace: Namespace): Action[OwnAction, String, NamespaceString[Namespace], js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("defineAction")(actionType.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[Action[OwnAction, String, NamespaceString[Namespace], js.Array[Any]]]
    inline def defineAction[OwnAction /* <: String */, SubAction /* <: String */, SubActions /* <: js.Array[SubAction] */, Namespace /* <: String | (Action[String, Unit, Unit, js.Array[Unit]]) */](actionType: OwnAction, subactions: SubActions, namespace: Namespace): Action[OwnAction, SubAction, NamespaceString[Namespace], SubActions] = (^.asInstanceOf[js.Dynamic].applyDynamic("defineAction")(actionType.asInstanceOf[js.Any], subactions.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[Action[OwnAction, SubAction, NamespaceString[Namespace], SubActions]]
    
    inline def defineAction_OwnActionSubActionSubActions[OwnAction /* <: String */, SubAction /* <: String */, SubActions /* <: js.Array[SubAction] */](actionType: OwnAction, subactions: SubActions): Action[OwnAction, SubAction, Unit, SubActions] = (^.asInstanceOf[js.Dynamic].applyDynamic("defineAction")(actionType.asInstanceOf[js.Any], subactions.asInstanceOf[js.Any])).asInstanceOf[Action[OwnAction, SubAction, Unit, SubActions]]
  }
}
