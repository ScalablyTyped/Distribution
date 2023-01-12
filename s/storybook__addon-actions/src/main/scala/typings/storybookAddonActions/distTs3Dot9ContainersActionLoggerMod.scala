package typings.storybookAddonActions

import typings.react.mod.Component
import typings.storybookAddonActions.distTs3Dot9ModelsActionDisplayMod.ActionDisplay
import typings.storybookApi.mod.API
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ContainersActionLoggerMod {
  
  @JSImport("@storybook/addon-actions/dist/ts3.9/containers/ActionLogger", JSImport.Default)
  @js.native
  open class default protected () extends ActionLogger {
    def this(props: ActionLoggerProps) = this()
  }
  
  @js.native
  trait ActionLogger extends Component[ActionLoggerProps, ActionLoggerState, Any] {
    
    def addAction(action: ActionDisplay): Unit = js.native
    
    def clearActions(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MActionLogger(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MActionLogger(): Unit = js.native
    
    def handleStoryChange(): Unit = js.native
    
    /* private */ var mounted: Any = js.native
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActionLoggerProps] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActionLoggerState] (val x: Self) extends AnyVal {
      
      inline def setActions(value: js.Array[ActionDisplay]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsVarargs(value: ActionDisplay*): Self = StObject.set(x, "actions", js.Array(value*))
    }
  }
}
