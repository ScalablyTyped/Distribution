package typings.sendgrid.mod.SendGrid.Helpers.Mail

import org.scalablytyped.runtime.StringDictionary
import typings.sendgrid.anon.Cc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Personalization extends StObject {
  
  def addBcc(email: Email): Unit
  
  def addCc(email: Email): Unit
  
  def addCustomArg(substitution: CustomArgs): Unit
  
  def addHeader(header: Header): Unit
  
  def addSubstitution(substitution: Substitution): Unit
  
  def addTo(email: Email): Unit
  
  def getBccs(): js.Array[Email]
  
  def getCcs(): js.Array[Email]
  
  def getCustomArgs(): js.Array[CustomArgs]
  
  def getHeaders(): js.Array[Header]
  
  def getSendAt(): Double
  
  def getSubject(): String
  
  def getSubstitutions(): StringDictionary[String]
  
  def getTos(): js.Array[Email]
  
  def setSendAt(sendAt: Double): Unit
  
  def setSubject(subject: String): Unit
  
  def toJSON(): Cc
}
object Personalization {
  
  inline def apply(
    addBcc: Email => Unit,
    addCc: Email => Unit,
    addCustomArg: CustomArgs => Unit,
    addHeader: Header => Unit,
    addSubstitution: Substitution => Unit,
    addTo: Email => Unit,
    getBccs: () => js.Array[Email],
    getCcs: () => js.Array[Email],
    getCustomArgs: () => js.Array[CustomArgs],
    getHeaders: () => js.Array[Header],
    getSendAt: () => Double,
    getSubject: () => String,
    getSubstitutions: () => StringDictionary[String],
    getTos: () => js.Array[Email],
    setSendAt: Double => Unit,
    setSubject: String => Unit,
    toJSON: () => Cc
  ): Personalization = {
    val __obj = js.Dynamic.literal(addBcc = js.Any.fromFunction1(addBcc), addCc = js.Any.fromFunction1(addCc), addCustomArg = js.Any.fromFunction1(addCustomArg), addHeader = js.Any.fromFunction1(addHeader), addSubstitution = js.Any.fromFunction1(addSubstitution), addTo = js.Any.fromFunction1(addTo), getBccs = js.Any.fromFunction0(getBccs), getCcs = js.Any.fromFunction0(getCcs), getCustomArgs = js.Any.fromFunction0(getCustomArgs), getHeaders = js.Any.fromFunction0(getHeaders), getSendAt = js.Any.fromFunction0(getSendAt), getSubject = js.Any.fromFunction0(getSubject), getSubstitutions = js.Any.fromFunction0(getSubstitutions), getTos = js.Any.fromFunction0(getTos), setSendAt = js.Any.fromFunction1(setSendAt), setSubject = js.Any.fromFunction1(setSubject), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[Personalization]
  }
  
  extension [Self <: Personalization](x: Self) {
    
    inline def setAddBcc(value: Email => Unit): Self = StObject.set(x, "addBcc", js.Any.fromFunction1(value))
    
    inline def setAddCc(value: Email => Unit): Self = StObject.set(x, "addCc", js.Any.fromFunction1(value))
    
    inline def setAddCustomArg(value: CustomArgs => Unit): Self = StObject.set(x, "addCustomArg", js.Any.fromFunction1(value))
    
    inline def setAddHeader(value: Header => Unit): Self = StObject.set(x, "addHeader", js.Any.fromFunction1(value))
    
    inline def setAddSubstitution(value: Substitution => Unit): Self = StObject.set(x, "addSubstitution", js.Any.fromFunction1(value))
    
    inline def setAddTo(value: Email => Unit): Self = StObject.set(x, "addTo", js.Any.fromFunction1(value))
    
    inline def setGetBccs(value: () => js.Array[Email]): Self = StObject.set(x, "getBccs", js.Any.fromFunction0(value))
    
    inline def setGetCcs(value: () => js.Array[Email]): Self = StObject.set(x, "getCcs", js.Any.fromFunction0(value))
    
    inline def setGetCustomArgs(value: () => js.Array[CustomArgs]): Self = StObject.set(x, "getCustomArgs", js.Any.fromFunction0(value))
    
    inline def setGetHeaders(value: () => js.Array[Header]): Self = StObject.set(x, "getHeaders", js.Any.fromFunction0(value))
    
    inline def setGetSendAt(value: () => Double): Self = StObject.set(x, "getSendAt", js.Any.fromFunction0(value))
    
    inline def setGetSubject(value: () => String): Self = StObject.set(x, "getSubject", js.Any.fromFunction0(value))
    
    inline def setGetSubstitutions(value: () => StringDictionary[String]): Self = StObject.set(x, "getSubstitutions", js.Any.fromFunction0(value))
    
    inline def setGetTos(value: () => js.Array[Email]): Self = StObject.set(x, "getTos", js.Any.fromFunction0(value))
    
    inline def setSetSendAt(value: Double => Unit): Self = StObject.set(x, "setSendAt", js.Any.fromFunction1(value))
    
    inline def setSetSubject(value: String => Unit): Self = StObject.set(x, "setSubject", js.Any.fromFunction1(value))
    
    inline def setToJSON(value: () => Cc): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
