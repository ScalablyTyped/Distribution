package typings.storybookAddonActions

import typings.react.mod.global.JSX.Element
import typings.std.Pick
import typings.storybookAddonActions.actionDisplayMod.ActionDisplay
import typings.storybookTheming.mod.StyledComponent
import typings.storybookTheming.mod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionLoggerMod {
  
  @JSImport("@storybook/addon-actions/dist/ts3.9/components/ActionLogger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ActionLogger(hasActionsOnClear: ActionLoggerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ActionLogger")(hasActionsOnClear.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@storybook/addon-actions/dist/ts3.9/components/ActionLogger", "Wrapper")
  @js.native
  val Wrapper: StyledComponent[Any, Pick[Any, String | Double | js.Symbol], Theme] = js.native
  
  trait ActionLoggerProps extends StObject {
    
    var actions: js.Array[ActionDisplay]
    
    def onClear(): Unit
  }
  object ActionLoggerProps {
    
    inline def apply(actions: js.Array[ActionDisplay], onClear: () => Unit): ActionLoggerProps = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], onClear = js.Any.fromFunction0(onClear))
      __obj.asInstanceOf[ActionLoggerProps]
    }
    
    extension [Self <: ActionLoggerProps](x: Self) {
      
      inline def setActions(value: js.Array[ActionDisplay]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsVarargs(value: ActionDisplay*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setOnClear(value: () => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction0(value))
    }
  }
}
