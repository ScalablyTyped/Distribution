package typings.reactNavigationCore.anon

import typings.reactNavigationCore.reactNavigationCoreStrings.beforeRemove
import typings.reactNavigationCore.reactNavigationCoreStrings.getState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyedListeners extends StObject {
  
  def addKeyedListener[T /* <: beforeRemove | getState */](
    `type`: T,
    key: String,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap[T] */ js.Any
  ): js.Function0[Unit]
  
  var keyedListeners: BeforeRemove
}
object KeyedListeners {
  
  inline def apply(
    addKeyedListener: (js.Any, String, /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap[T] */ js.Any) => js.Function0[Unit],
    keyedListeners: BeforeRemove
  ): KeyedListeners = {
    val __obj = js.Dynamic.literal(addKeyedListener = js.Any.fromFunction3(addKeyedListener), keyedListeners = keyedListeners.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyedListeners]
  }
  
  extension [Self <: KeyedListeners](x: Self) {
    
    inline def setAddKeyedListener(
      value: (js.Any, String, /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap[T] */ js.Any) => js.Function0[Unit]
    ): Self = StObject.set(x, "addKeyedListener", js.Any.fromFunction3(value))
    
    inline def setKeyedListeners(value: BeforeRemove): Self = StObject.set(x, "keyedListeners", value.asInstanceOf[js.Any])
  }
}
