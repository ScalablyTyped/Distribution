package typings.slateReact

import typings.lodash.mod.DebouncedFunc
import typings.react.mod.RefObject
import typings.slateReact.distHooksAndroidInputManagerAndroidInputManagerMod.AndroidInputManager
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHooksAndroidInputManagerUseAndroidInputManagerMod {
  
  @JSImport("slate-react/dist/hooks/android-input-manager/use-android-input-manager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useAndroidInputManager(param0: UseAndroidInputManagerOptions): AndroidInputManager | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useAndroidInputManager")(param0.asInstanceOf[js.Any]).asInstanceOf[AndroidInputManager | Null]
  
  /* Inlined {  node :react.react.RefObject<std.HTMLElement>} & std.Omit<slate-react.slate-react/dist/hooks/android-input-manager/android-input-manager.CreateAndroidInputManagerOptions, 'editor' | 'onUserInput' | 'receivedUserInput'> */
  trait UseAndroidInputManagerOptions extends StObject {
    
    var node: RefObject[HTMLElement]
    
    var onDOMSelectionChange: DebouncedFunc[js.Function0[Unit]]
    
    var scheduleOnDOMSelectionChange: DebouncedFunc[js.Function0[Unit]]
  }
  object UseAndroidInputManagerOptions {
    
    inline def apply(
      node: RefObject[HTMLElement],
      onDOMSelectionChange: DebouncedFunc[js.Function0[Unit]],
      scheduleOnDOMSelectionChange: DebouncedFunc[js.Function0[Unit]]
    ): UseAndroidInputManagerOptions = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], onDOMSelectionChange = onDOMSelectionChange.asInstanceOf[js.Any], scheduleOnDOMSelectionChange = scheduleOnDOMSelectionChange.asInstanceOf[js.Any])
      __obj.asInstanceOf[UseAndroidInputManagerOptions]
    }
    
    extension [Self <: UseAndroidInputManagerOptions](x: Self) {
      
      inline def setNode(value: RefObject[HTMLElement]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setOnDOMSelectionChange(value: DebouncedFunc[js.Function0[Unit]]): Self = StObject.set(x, "onDOMSelectionChange", value.asInstanceOf[js.Any])
      
      inline def setScheduleOnDOMSelectionChange(value: DebouncedFunc[js.Function0[Unit]]): Self = StObject.set(x, "scheduleOnDOMSelectionChange", value.asInstanceOf[js.Any])
    }
  }
}
