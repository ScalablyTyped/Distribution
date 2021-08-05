package typings.servicenow.servicenow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlideEmailOutbound extends StObject {
  
  def addAddress(`type`: String, address: String, displayName: String): Unit
  
  def getSubject(): String
  
  def setBody(bodyText: String): Unit
  
  def setFrom(address: String): Unit
  
  def setReplyTo(address: String): Unit
  
  def setSubject(subject: String): Unit
}
object GlideEmailOutbound {
  
  inline def apply(
    addAddress: (String, String, String) => Unit,
    getSubject: () => String,
    setBody: String => Unit,
    setFrom: String => Unit,
    setReplyTo: String => Unit,
    setSubject: String => Unit
  ): GlideEmailOutbound = {
    val __obj = js.Dynamic.literal(addAddress = js.Any.fromFunction3(addAddress), getSubject = js.Any.fromFunction0(getSubject), setBody = js.Any.fromFunction1(setBody), setFrom = js.Any.fromFunction1(setFrom), setReplyTo = js.Any.fromFunction1(setReplyTo), setSubject = js.Any.fromFunction1(setSubject))
    __obj.asInstanceOf[GlideEmailOutbound]
  }
  
  extension [Self <: GlideEmailOutbound](x: Self) {
    
    inline def setAddAddress(value: (String, String, String) => Unit): Self = StObject.set(x, "addAddress", js.Any.fromFunction3(value))
    
    inline def setGetSubject(value: () => String): Self = StObject.set(x, "getSubject", js.Any.fromFunction0(value))
    
    inline def setSetBody(value: String => Unit): Self = StObject.set(x, "setBody", js.Any.fromFunction1(value))
    
    inline def setSetFrom(value: String => Unit): Self = StObject.set(x, "setFrom", js.Any.fromFunction1(value))
    
    inline def setSetReplyTo(value: String => Unit): Self = StObject.set(x, "setReplyTo", js.Any.fromFunction1(value))
    
    inline def setSetSubject(value: String => Unit): Self = StObject.set(x, "setSubject", js.Any.fromFunction1(value))
  }
}
