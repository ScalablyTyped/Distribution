package typings.reactNativeNavigation

import typings.reactNativeNavigation.anon.Modals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-navigation/lib/dist/adapters/NativeCommandsSender", JSImport.Namespace)
@js.native
object nativeCommandsSenderMod extends js.Object {
  
  @js.native
  class NativeCommandsSender () extends js.Object {
    
    def dismissAllModals(commandId: String): js.Promise[_] = js.native
    def dismissAllModals(commandId: String, options: js.Object): js.Promise[_] = js.native
    
    def dismissModal(commandId: String, componentId: String): js.Promise[_] = js.native
    def dismissModal(commandId: String, componentId: String, options: js.Object): js.Promise[_] = js.native
    
    def dismissOverlay(commandId: String, componentId: String): js.Promise[_] = js.native
    
    def getLaunchArgs(commandId: String): js.Promise[_] = js.native
    
    def mergeOptions(componentId: String, options: js.Object): Unit = js.native
    
    val nativeCommandsModule: js.Any = js.native
    
    def pop(commandId: String, componentId: String): js.Promise[_] = js.native
    def pop(commandId: String, componentId: String, options: js.Object): js.Promise[_] = js.native
    
    def popTo(commandId: String, componentId: String): js.Promise[_] = js.native
    def popTo(commandId: String, componentId: String, options: js.Object): js.Promise[_] = js.native
    
    def popToRoot(commandId: String, componentId: String): js.Promise[_] = js.native
    def popToRoot(commandId: String, componentId: String, options: js.Object): js.Promise[_] = js.native
    
    def push(commandId: String, onComponentId: String, layout: js.Object): js.Promise[_] = js.native
    
    def setDefaultOptions(options: js.Object): Unit = js.native
    
    def setRoot(commandId: String, layout: Modals): js.Promise[_] = js.native
    
    def setStackRoot(commandId: String, onComponentId: String, layout: js.Object): js.Promise[_] = js.native
    
    def showModal(commandId: String, layout: js.Object): js.Promise[_] = js.native
    
    def showOverlay(commandId: String, layout: js.Object): js.Promise[_] = js.native
  }
}
