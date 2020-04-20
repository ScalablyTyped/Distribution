package typings.sendgrid.mod.SendGrid.Helpers.Mail

import org.scalablytyped.runtime.StringDictionary
import typings.sendgrid.AnonCc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Personalization extends js.Object {
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
  def toJSON(): AnonCc
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
    toJSON: () => AnonCc
  ): Personalization = {
    val __obj = js.Dynamic.literal(addBcc = js.Any.fromFunction1(addBcc), addCc = js.Any.fromFunction1(addCc), addCustomArg = js.Any.fromFunction1(addCustomArg), addHeader = js.Any.fromFunction1(addHeader), addSubstitution = js.Any.fromFunction1(addSubstitution), addTo = js.Any.fromFunction1(addTo), getBccs = js.Any.fromFunction0(getBccs), getCcs = js.Any.fromFunction0(getCcs), getCustomArgs = js.Any.fromFunction0(getCustomArgs), getHeaders = js.Any.fromFunction0(getHeaders), getSendAt = js.Any.fromFunction0(getSendAt), getSubject = js.Any.fromFunction0(getSubject), getSubstitutions = js.Any.fromFunction0(getSubstitutions), getTos = js.Any.fromFunction0(getTos), setSendAt = js.Any.fromFunction1(setSendAt), setSubject = js.Any.fromFunction1(setSubject), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[Personalization]
  }
}

