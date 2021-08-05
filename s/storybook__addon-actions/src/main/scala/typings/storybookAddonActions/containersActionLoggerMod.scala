package typings.storybookAddonActions

import typings.react.mod.Component
import typings.storybookAddonActions.actionDisplayMod.ActionDisplay
import typings.storybookApi.mod.API
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containersActionLoggerMod {
  
  @JSImport("@storybook/addon-actions/dist/containers/ActionLogger", JSImport.Default)
  @js.native
  class default protected () extends ActionLogger {
    def this(props: ActionLoggerProps) = this()
  }
  
  @js.native
  trait ActionLogger
    extends Component[ActionLoggerProps, ActionLoggerState, js.Any] {
    
    def addAction(action: ActionDisplay): Unit = js.native
    
    def clearActions(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MActionLogger(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MActionLogger(): Unit = js.native
    
    def handleStoryChange(): Unit = js.native
    
    /* private */ var mounted: js.Any = js.native
  }
  
  trait ActionLoggerProps extends StObject {
    
    var active: Boolean
    
    var api: API
  }
  object ActionLoggerProps {
    
    inline def apply(active: Boolean, api: API): ActionLoggerProps = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionLoggerProps]
    }
    
    extension [Self <: ActionLoggerProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setApi(value: API): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    }
  }
  
  trait ActionLoggerState extends StObject {
    
    var actions: js.Array[ActionDisplay]
  }
  object ActionLoggerState {
    
    inline def apply(actions: js.Array[ActionDisplay]): ActionLoggerState = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionLoggerState]
    }
    
    extension [Self <: ActionLoggerState](x: Self) {
      
      inline def setActions(value: js.Array[ActionDisplay]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsVarargs(value: ActionDisplay*): Self = StObject.set(x, "actions", js.Array(value :_*))
    }
  }
}
