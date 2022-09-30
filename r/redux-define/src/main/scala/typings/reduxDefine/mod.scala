package typings.reduxDefine

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-define", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defineAction[OwnAction /* <: String */](actionType: OwnAction): Action[OwnAction, Unit, Unit, js.Array[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("defineAction")(actionType.asInstanceOf[js.Any]).asInstanceOf[Action[OwnAction, Unit, Unit, js.Array[Unit]]]
  inline def defineAction[OwnAction /* <: String */, Namespace /* <: String | (Action[String, Unit, Unit, js.Array[Unit]]) */](actionType: OwnAction, namespace: Namespace): Action[OwnAction, String, NamespaceString[Namespace], js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("defineAction")(actionType.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[Action[OwnAction, String, NamespaceString[Namespace], js.Array[Any]]]
  inline def defineAction[OwnAction /* <: String */, SubAction /* <: String */, SubActions /* <: js.Array[SubAction] */, Namespace /* <: String | (Action[String, Unit, Unit, js.Array[Unit]]) */](actionType: OwnAction, subactions: SubActions, namespace: Namespace): Action[OwnAction, SubAction, NamespaceString[Namespace], SubActions] = (^.asInstanceOf[js.Dynamic].applyDynamic("defineAction")(actionType.asInstanceOf[js.Any], subactions.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[Action[OwnAction, SubAction, NamespaceString[Namespace], SubActions]]
  
  inline def defineAction_OwnActionSubActionSubActions[OwnAction /* <: String */, SubAction /* <: String */, SubActions /* <: js.Array[SubAction] */](actionType: OwnAction, subactions: SubActions): Action[OwnAction, SubAction, Unit, SubActions] = (^.asInstanceOf[js.Dynamic].applyDynamic("defineAction")(actionType.asInstanceOf[js.Any], subactions.asInstanceOf[js.Any])).asInstanceOf[Action[OwnAction, SubAction, Unit, SubActions]]
  
  type Action[OwnAction /* <: String */, SubAction /* <: js.UndefOr[String] */, Namespace /* <: js.UndefOr[String] */, SubActions /* <: js.Array[SubAction] */] = (PlainAction[OwnAction, Namespace]) | ((PlainAction[OwnAction, Namespace]) & (SubActionProps[SubAction, SubActions, Namespace, OwnAction]))
  
  type NamespaceString[Namespace /* <: (Action[String, Unit, Unit, js.Array[Unit]]) | String */] = Namespace | (/* import warning: importer.ImportType#apply Failed type conversion: Namespace['ACTION'] */ js.Any)
  
  trait PlainAction[OwnAction /* <: String */, Namespace /* <: js.UndefOr[String] */] extends StObject {
    
    var ACTION: WithNamespace[OwnAction, Namespace]
    
    def defineAction[Parent /* <: Action[String, Unit, Unit, js.Array[Unit]] */, OwnAction /* <: String */](actionType: OwnAction): Action[
        OwnAction, 
        String, 
        /* import warning: importer.ImportType#apply Failed type conversion: Parent['ACTION'] */ js.Any, 
        js.Array[Any]
      ]
    def defineAction[OwnAction /* <: String */, Namespace /* <: String | (Action[String, Unit, Unit, js.Array[Unit]]) */](actionType: OwnAction, namespace: Namespace): Action[OwnAction, String, NamespaceString[Namespace], js.Array[Any]]
    def defineAction[Parent /* <: Action[String, Unit, Unit, js.Array[Unit]] */, OwnAction /* <: String */, SubAction /* <: String */, SubActions /* <: js.Array[SubAction] */](actionType: OwnAction, subactions: SubActions, namespace: String): Action[
        OwnAction, 
        SubAction, 
        /* import warning: importer.ImportType#apply Failed type conversion: Parent['ACTION'] */ js.Any, 
        SubActions
      ]
    def defineAction[Parent /* <: Action[String, Unit, Unit, js.Array[Unit]] */, OwnAction /* <: String */, SubAction /* <: String */, SubActions /* <: js.Array[SubAction] */](
      actionType: OwnAction,
      subactions: SubActions,
      namespace: Action[String, Unit, Unit, js.Array[Unit]]
    ): Action[
        OwnAction, 
        SubAction, 
        /* import warning: importer.ImportType#apply Failed type conversion: Parent['ACTION'] */ js.Any, 
        SubActions
      ]
    @JSName("defineAction")
    var defineAction_Original: defineChildAction & defineChildActionWithNamespace & defineChildActionWithSubactionsAndNamespace
    @JSName("defineAction")
    def defineAction_ParentOwnActionSubActionSubActions[Parent /* <: Action[String, Unit, Unit, js.Array[Unit]] */, OwnAction /* <: String */, SubAction /* <: String */, SubActions /* <: js.Array[SubAction] */](actionType: OwnAction, subactions: SubActions): Action[
        OwnAction, 
        SubAction, 
        /* import warning: importer.ImportType#apply Failed type conversion: Parent['ACTION'] */ js.Any, 
        SubActions
      ]
  }
  object PlainAction {
    
    inline def apply[OwnAction /* <: String */, Namespace /* <: js.UndefOr[String] */](
      ACTION: WithNamespace[OwnAction, Namespace],
      defineAction: defineChildAction & defineChildActionWithNamespace & defineChildActionWithSubactionsAndNamespace
    ): PlainAction[OwnAction, Namespace] = {
      val __obj = js.Dynamic.literal(ACTION = ACTION.asInstanceOf[js.Any], defineAction = defineAction.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlainAction[OwnAction, Namespace]]
    }
    
    extension [Self <: PlainAction[?, ?], OwnAction /* <: String */, Namespace /* <: js.UndefOr[String] */](x: Self & (PlainAction[OwnAction, Namespace])) {
      
      inline def setACTION(value: WithNamespace[OwnAction, Namespace]): Self = StObject.set(x, "ACTION", value.asInstanceOf[js.Any])
      
      inline def setDefineAction(
        value: defineChildAction & defineChildActionWithNamespace & defineChildActionWithSubactionsAndNamespace
      ): Self = StObject.set(x, "defineAction", value.asInstanceOf[js.Any])
    }
  }
  
  type SubActionProps[SubAction /* <: String */, // This is necessary to force narrowing of the subaction type, as described here https://github.com/microsoft/TypeScript/issues/30680
  SubActions /* <: js.Array[SubAction] */, Namespace /* <: js.UndefOr[String] */, OwnAction /* <: String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in SubActions[number] ]: / * template literal string: ${Namespaceextendsstring?${Namespace}/:}${OwnAction}_${k} * / string}
    */ typings.reduxDefine.reduxDefineStrings.SubActionProps & TopLevel[Any]
  
  type WithNamespace[OwnAction /* <: String */, Namespace /* <: js.UndefOr[String] */] = OwnAction | (/* template literal string: ${Namespace}/${OwnAction} */ String)
  
  type defineChildAction = js.ThisFunction1[
    /* this */ Action[String, Unit, Unit, js.Array[Unit]], 
    /* actionType */ String, 
    Action[
      String, 
      String, 
      /* import warning: importer.ImportType#apply Failed type conversion: redux-define.redux-define.Action<string, undefined, undefined, std.Array<undefined>>['ACTION'] */ js.Any, 
      js.Array[Any]
    ]
  ]
  
  type defineChildActionWithNamespace = js.ThisFunction2[
    /* this */ Action[String, Unit, Unit, js.Array[Unit]], 
    /* actionType */ String, 
    /* namespace */ String | (Action[String, Unit, Unit, js.Array[Unit]]), 
    Action[
      String, 
      String, 
      NamespaceString[String | (Action[String, Unit, Unit, js.Array[Unit]])], 
      js.Array[Any]
    ]
  ]
  
  type defineChildActionWithSubactionsAndNamespace = js.ThisFunction3[
    /* this */ Action[String, Unit, Unit, js.Array[Unit]], 
    /* actionType */ String, 
    /* subactions */ js.Array[String], 
    /* namespace */ js.UndefOr[String | (Action[String, Unit, Unit, js.Array[Unit]])], 
    Action[
      String, 
      String, 
      /* import warning: importer.ImportType#apply Failed type conversion: redux-define.redux-define.Action<string, undefined, undefined, std.Array<undefined>>['ACTION'] */ js.Any, 
      js.Array[String]
    ]
  ]
}
