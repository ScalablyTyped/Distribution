package typings.reactNavigationCore.anon

import typings.reactNavigationCore.reactNavigationCoreStrings.action
import typings.reactNavigationCore.reactNavigationCoreStrings.focus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddListener extends js.Object {
  
  def addListener[T /* <: focus | action */](
    `type`: T,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.ListenerMap[T] */ js.Any
  ): js.Function0[Unit] = js.native
  
  var listeners: Focus = js.native
}
object AddListener {
  
  @scala.inline
  def apply(
    addListener: (js.Any, /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.ListenerMap[T] */ js.Any) => js.Function0[Unit],
    listeners: Focus
  ): AddListener = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), listeners = listeners.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddListener]
  }
  
  @scala.inline
  implicit class AddListenerOps[Self <: AddListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddListener(
      value: (js.Any, /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.ListenerMap[T] */ js.Any) => js.Function0[Unit]
    ): Self = this.set("addListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setListeners(value: Focus): Self = this.set("listeners", value.asInstanceOf[js.Any])
  }
}
