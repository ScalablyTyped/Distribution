package typings
package sendgridLib.sendgridMod.SendGridNs.HelpersNs.MailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Personalization extends js.Object {
  def addBcc(email: Email): scala.Unit
  def addCc(email: Email): scala.Unit
  def addCustomArg(substitution: CustomArgs): scala.Unit
  def addHeader(header: Header): scala.Unit
  def addSubstitution(substitution: Substitution): scala.Unit
  def addTo(email: Email): scala.Unit
  def getBccs(): js.Array[Email]
  def getCcs(): js.Array[Email]
  def getCustomArgs(): js.Array[CustomArgs]
  def getHeaders(): js.Array[Header]
  def getSendAt(): scala.Double
  def getSubject(): java.lang.String
  def getSubstitutions(): org.scalablytyped.runtime.StringDictionary[java.lang.String]
  def getTos(): js.Array[Email]
  def setSendAt(sendAt: scala.Double): scala.Unit
  def setSubject(subject: java.lang.String): scala.Unit
  def toJSON(): sendgridLib.Anon_BccCc
}

object Personalization {
  @scala.inline
  def apply(
    addBcc: Email => scala.Unit,
    addCc: Email => scala.Unit,
    addCustomArg: CustomArgs => scala.Unit,
    addHeader: Header => scala.Unit,
    addSubstitution: Substitution => scala.Unit,
    addTo: Email => scala.Unit,
    getBccs: () => js.Array[Email],
    getCcs: () => js.Array[Email],
    getCustomArgs: () => js.Array[CustomArgs],
    getHeaders: () => js.Array[Header],
    getSendAt: () => scala.Double,
    getSubject: () => java.lang.String,
    getSubstitutions: () => org.scalablytyped.runtime.StringDictionary[java.lang.String],
    getTos: () => js.Array[Email],
    setSendAt: scala.Double => scala.Unit,
    setSubject: java.lang.String => scala.Unit,
    toJSON: () => sendgridLib.Anon_BccCc
  ): Personalization = {
    val __obj = js.Dynamic.literal(addBcc = js.Any.fromFunction1(addBcc), addCc = js.Any.fromFunction1(addCc), addCustomArg = js.Any.fromFunction1(addCustomArg), addHeader = js.Any.fromFunction1(addHeader), addSubstitution = js.Any.fromFunction1(addSubstitution), addTo = js.Any.fromFunction1(addTo), getBccs = js.Any.fromFunction0(getBccs), getCcs = js.Any.fromFunction0(getCcs), getCustomArgs = js.Any.fromFunction0(getCustomArgs), getHeaders = js.Any.fromFunction0(getHeaders), getSendAt = js.Any.fromFunction0(getSendAt), getSubject = js.Any.fromFunction0(getSubject), getSubstitutions = js.Any.fromFunction0(getSubstitutions), getTos = js.Any.fromFunction0(getTos), setSendAt = js.Any.fromFunction1(setSendAt), setSubject = js.Any.fromFunction1(setSubject), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[Personalization]
  }
}

