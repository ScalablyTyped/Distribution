package typings
package sipDotJsLib.libUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/Utils", "Utils")
@js.native
object UtilsNs extends js.Object {
  trait Deferred[T] extends js.Object {
    var promise: js.Promise[T]
    def reject(): T
    def resolve(): T
  }
  
  def buildStatusLine(code: scala.Double): java.lang.String = js.native
  def buildStatusLine(code: scala.Double, reason: java.lang.String): java.lang.String = js.native
  def createRandomToken(size: scala.Double): java.lang.String = js.native
  def createRandomToken(size: scala.Double, base: scala.Double): java.lang.String = js.native
  def defer(): Deferred[_] = js.native
  def escapeUser(user: java.lang.String): java.lang.String = js.native
  /**
    * Create a Body given a BodyObj.
    * @param bodyObj Body Object
    */
  def fromBodyObj(bodyObj: sipDotJsLib.libSessionDashDescriptionDashHandlerMod.BodyObj): sipDotJsLib.libCoreMessagesBodyMod.Body = js.native
  def generateFakeSDP(body: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def getCancelReason(code: scala.Double, reason: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def getReasonHeaderValue(code: scala.Double): java.lang.String = js.native
  def getReasonHeaderValue(code: scala.Double, reason: java.lang.String): java.lang.String = js.native
  def getReasonPhrase(code: scala.Double): java.lang.String = js.native
  def getReasonPhrase(code: scala.Double, specific: java.lang.String): java.lang.String = js.native
  def headerize(str: java.lang.String): java.lang.String = js.native
  def isDecimal(num: java.lang.String): scala.Boolean = js.native
  def newTag(): java.lang.String = js.native
  def newUUID(): java.lang.String = js.native
  def normalizeTarget(target: java.lang.String): js.UndefOr[sipDotJsLib.libCoreMessagesUriMod.URI] = js.native
  def normalizeTarget(target: java.lang.String, domain: java.lang.String): js.UndefOr[sipDotJsLib.libCoreMessagesUriMod.URI] = js.native
  def normalizeTarget(target: sipDotJsLib.libCoreMessagesUriMod.URI): js.UndefOr[sipDotJsLib.libCoreMessagesUriMod.URI] = js.native
  def normalizeTarget(target: sipDotJsLib.libCoreMessagesUriMod.URI, domain: java.lang.String): js.UndefOr[sipDotJsLib.libCoreMessagesUriMod.URI] = js.native
  def reducePromises(
    arr: js.Array[
      sipDotJsLib.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifier
    ],
    `val`: js.Any
  ): js.Promise[_] = js.native
  def sipErrorCause(statusCode: scala.Double): java.lang.String = js.native
  def str_utf8_length(str: java.lang.String): scala.Double = js.native
  /**
    * Create a BodyObj given a Body.
    * @param bodyObj Body Object
    */
  def toBodyObj(body: sipDotJsLib.libCoreMessagesBodyMod.Body): sipDotJsLib.libSessionDashDescriptionDashHandlerMod.BodyObj = js.native
}

