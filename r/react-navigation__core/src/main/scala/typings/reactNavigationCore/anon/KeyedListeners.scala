package typings.reactNavigationCore.anon

import typings.reactNavigationCore.reactNavigationCoreStrings.beforeRemove
import typings.reactNavigationCore.reactNavigationCoreStrings.getState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyedListeners extends js.Object {
  
  def addKeyedListener[T /* <: beforeRemove | getState */](
    `type`: T,
    key: String,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap[T] */ js.Any
  ): js.Function0[Unit] = js.native
  
  var keyedListeners: BeforeRemove = js.native
}
object KeyedListeners {
  
  @scala.inline
  def apply(
    addKeyedListener: (js.Any, String, /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap[T] */ js.Any) => js.Function0[Unit],
    keyedListeners: BeforeRemove
  ): KeyedListeners = {
    val __obj = js.Dynamic.literal(addKeyedListener = js.Any.fromFunction3(addKeyedListener), keyedListeners = keyedListeners.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyedListeners]
  }
  
  @scala.inline
  implicit class KeyedListenersOps[Self <: KeyedListeners] (val x: Self) extends AnyVal {
    
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
    def setAddKeyedListener(
      value: (js.Any, String, /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap[T] */ js.Any) => js.Function0[Unit]
    ): Self = this.set("addKeyedListener", js.Any.fromFunction3(value))
    
    @scala.inline
    def setKeyedListeners(value: BeforeRemove): Self = this.set("keyedListeners", value.asInstanceOf[js.Any])
  }
}
