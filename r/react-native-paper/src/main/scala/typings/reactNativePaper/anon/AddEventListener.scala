package typings.reactNativePaper.anon

import typings.reactNative.mod.EmitterSubscription
import typings.reactNative.mod.NativeEventSubscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddEventListener extends StObject {
  
  def addEventListener(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
  ): NativeEventSubscription | EmitterSubscription
  
  def removeEventListener(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
  ): Unit
}
object AddEventListener {
  
  inline def apply(
    addEventListener: Any => NativeEventSubscription | EmitterSubscription,
    removeEventListener: Any => Unit
  ): AddEventListener = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction1(addEventListener), removeEventListener = js.Any.fromFunction1(removeEventListener))
    __obj.asInstanceOf[AddEventListener]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddEventListener] (val x: Self) extends AnyVal {
    
    inline def setAddEventListener(value: Any => NativeEventSubscription | EmitterSubscription): Self = StObject.set(x, "addEventListener", js.Any.fromFunction1(value))
    
    inline def setRemoveEventListener(value: Any => Unit): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction1(value))
  }
}
