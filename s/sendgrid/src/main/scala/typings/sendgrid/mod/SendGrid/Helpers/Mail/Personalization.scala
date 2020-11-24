package typings.sendgrid.mod.SendGrid.Helpers.Mail

import org.scalablytyped.runtime.StringDictionary
import typings.sendgrid.anon.Cc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Personalization extends js.Object {
  
  def addBcc(email: Email): Unit = js.native
  
  def addCc(email: Email): Unit = js.native
  
  def addCustomArg(substitution: CustomArgs): Unit = js.native
  
  def addHeader(header: Header): Unit = js.native
  
  def addSubstitution(substitution: Substitution): Unit = js.native
  
  def addTo(email: Email): Unit = js.native
  
  def getBccs(): js.Array[Email] = js.native
  
  def getCcs(): js.Array[Email] = js.native
  
  def getCustomArgs(): js.Array[CustomArgs] = js.native
  
  def getHeaders(): js.Array[Header] = js.native
  
  def getSendAt(): Double = js.native
  
  def getSubject(): String = js.native
  
  def getSubstitutions(): StringDictionary[String] = js.native
  
  def getTos(): js.Array[Email] = js.native
  
  def setSendAt(sendAt: Double): Unit = js.native
  
  def setSubject(subject: String): Unit = js.native
  
  def toJSON(): Cc = js.native
}
object Personalization {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class PersonalizationOps[Self <: Personalization] (val x: Self) extends AnyVal {
    
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
    def setAddBcc(value: Email => Unit): Self = this.set("addBcc", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddCc(value: Email => Unit): Self = this.set("addCc", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddCustomArg(value: CustomArgs => Unit): Self = this.set("addCustomArg", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddHeader(value: Header => Unit): Self = this.set("addHeader", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddSubstitution(value: Substitution => Unit): Self = this.set("addSubstitution", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddTo(value: Email => Unit): Self = this.set("addTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetBccs(value: () => js.Array[Email]): Self = this.set("getBccs", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCcs(value: () => js.Array[Email]): Self = this.set("getCcs", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCustomArgs(value: () => js.Array[CustomArgs]): Self = this.set("getCustomArgs", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHeaders(value: () => js.Array[Header]): Self = this.set("getHeaders", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSendAt(value: () => Double): Self = this.set("getSendAt", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSubject(value: () => String): Self = this.set("getSubject", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSubstitutions(value: () => StringDictionary[String]): Self = this.set("getSubstitutions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTos(value: () => js.Array[Email]): Self = this.set("getTos", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetSendAt(value: Double => Unit): Self = this.set("setSendAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSubject(value: String => Unit): Self = this.set("setSubject", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToJSON(value: () => Cc): Self = this.set("toJSON", js.Any.fromFunction0(value))
  }
}
