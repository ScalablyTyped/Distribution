package typings.reactNativePaper.anon

import typings.reactNative.mod.EmitterSubscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddListener extends StObject {
  
  def addListener(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
  ): EmitterSubscription
  
  def removeEventListener(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
  ): Unit
}
object AddListener {
  
  inline def apply(addListener: Any => EmitterSubscription, removeEventListener: Any => Unit): AddListener = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener), removeEventListener = js.Any.fromFunction1(removeEventListener))
    __obj.asInstanceOf[AddListener]
  }
  
  extension [Self <: AddListener](x: Self) {
    
    inline def setAddListener(value: Any => EmitterSubscription): Self = StObject.set(x, "addListener", js.Any.fromFunction1(value))
    
    inline def setRemoveEventListener(value: Any => Unit): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction1(value))
  }
}
