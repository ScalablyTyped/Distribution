package typings.sipJs.mod

import typings.sipJs.bodyMod.Body
import typings.sipJs.libSessionDescriptionHandlerMod.BodyObj
import typings.sipJs.libSessionDescriptionHandlerMod.SessionDescriptionHandlerModifier
import typings.sipJs.libUtilsMod.Utils.Deferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Utils")
@js.native
object Utils extends js.Object {
  def buildStatusLine(code: Double): String = js.native
  def buildStatusLine(code: Double, reason: String): String = js.native
  def createRandomToken(size: Double): String = js.native
  def createRandomToken(size: Double, base: Double): String = js.native
  def defer(): Deferred[_] = js.native
  def escapeUser(user: String): String = js.native
  /**
    * Create a Body given a BodyObj.
    * @param bodyObj Body Object
    */
  def fromBodyObj(bodyObj: BodyObj): Body = js.native
  def generateFakeSDP(body: String): js.UndefOr[String] = js.native
  def getCancelReason(code: Double, reason: String): js.UndefOr[String] = js.native
  def getReasonHeaderValue(code: Double): String = js.native
  def getReasonHeaderValue(code: Double, reason: String): String = js.native
  def getReasonPhrase(code: Double): String = js.native
  def getReasonPhrase(code: Double, specific: String): String = js.native
  def headerize(str: String): String = js.native
  def isDecimal(num: String): Boolean = js.native
  def newTag(): String = js.native
  def newUUID(): String = js.native
  def normalizeTarget(target: String): js.UndefOr[typings.sipJs.uriMod.URI] = js.native
  def normalizeTarget(target: String, domain: String): js.UndefOr[typings.sipJs.uriMod.URI] = js.native
  def normalizeTarget(target: typings.sipJs.uriMod.URI): js.UndefOr[typings.sipJs.uriMod.URI] = js.native
  def normalizeTarget(target: typings.sipJs.uriMod.URI, domain: String): js.UndefOr[typings.sipJs.uriMod.URI] = js.native
  def reducePromises(arr: js.Array[SessionDescriptionHandlerModifier], `val`: js.Any): js.Promise[_] = js.native
  def sipErrorCause(statusCode: Double): String = js.native
  @JSName("str_utf8_length")
  def strUtf8Length(str: String): Double = js.native
  /**
    * Create a BodyObj given a Body.
    * @param bodyObj Body Object
    */
  def toBodyObj(body: Body): BodyObj = js.native
}

