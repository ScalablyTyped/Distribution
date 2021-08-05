package typings.reactNavigationCore.anon

import typings.reactNavigationCore.reactNavigationCoreStrings.action
import typings.reactNavigationCore.reactNavigationCoreStrings.focus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddListener extends StObject {
  
  def addListener[T /* <: focus | action */](
    `type`: T,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.ListenerMap[T] */ js.Any
  ): js.Function0[Unit]
  
  var listeners: Focus
}
object AddListener {
  
  inline def apply(
    addListener: (js.Any, /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.ListenerMap[T] */ js.Any) => js.Function0[Unit],
    listeners: Focus
  ): AddListener = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), listeners = listeners.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddListener]
  }
  
  extension [Self <: AddListener](x: Self) {
    
    inline def setAddListener(
      value: (js.Any, /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.ListenerMap[T] */ js.Any) => js.Function0[Unit]
    ): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
    
    inline def setListeners(value: Focus): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
  }
}
