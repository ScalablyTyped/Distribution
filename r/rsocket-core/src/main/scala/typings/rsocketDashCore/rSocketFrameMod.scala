package typings.rsocketDashCore

import typings.rsocketDashCore.rsocketDashCoreNumbers.`0`
import typings.rsocketDashCore.rsocketDashCoreNumbers.`1023`
import typings.rsocketDashCore.rsocketDashCoreNumbers.`10`
import typings.rsocketDashCore.rsocketDashCoreNumbers.`16777215`
import typings.rsocketDashCore.rsocketDashCoreNumbers.`2147483647`
import typings.rsocketDashCore.rsocketDashCoreNumbers.`255`
import typings.rsocketDashCore.rsocketDashCoreNumbers.`65535`
import typings.rsocketDashTypes.reactiveSocketTypesMod.ErrorFrame
import typings.rsocketDashTypes.reactiveSocketTypesMod.Frame
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-core/RSocketFrame", JSImport.Namespace)
@js.native
object rSocketFrameMod extends js.Object {
  val CONNECTION_STREAM_ID: `0` = js.native
  val FLAGS_MASK: `1023` = js.native
  val FRAME_TYPE_OFFFSET: `10` = js.native
  val MAX_CODE: `2147483647` = js.native
  val MAX_KEEPALIVE: `2147483647` = js.native
  val MAX_LIFETIME: `2147483647` = js.native
  val MAX_METADATA_LENGTH: `16777215` = js.native
  val MAX_MIME_LENGTH: `255` = js.native
  val MAX_REQUEST_COUNT: `2147483647` = js.native
  val MAX_REQUEST_N: `2147483647` = js.native
  val MAX_RESUME_LENGTH: `65535` = js.native
  val MAX_STREAM_ID: `2147483647` = js.native
  val MAX_TTL: `2147483647` = js.native
  val MAX_VERSION: `65535` = js.native
  def createErrorFromFrame(frame: ErrorFrame): Error = js.native
  def getErrorCodeExplanation(code: Double): String = js.native
  def getFrameTypeName(`type`: Double): String = js.native
  def isComplete(flags: Double): Boolean = js.native
  def isIgnore(flags: Double): Boolean = js.native
  def isLease(flags: Double): Boolean = js.native
  def isMetadata(flags: Double): Boolean = js.native
  def isNext(flags: Double): Boolean = js.native
  def isRespond(flags: Double): Boolean = js.native
  def isResumeEnable(flags: Double): Boolean = js.native
  def isResumePositionFrameType(`type`: Double): Boolean = js.native
  def printFrame(frame: Frame): String = js.native
  @js.native
  object ERROR_CODES extends js.Object {
    var APPLICATION_ERROR: Double = js.native
    var CANCELED: Double = js.native
    var CONNECTION_CLOSE: Double = js.native
    var CONNECTION_ERROR: Double = js.native
    var INVALID: Double = js.native
    var INVALID_SETUP: Double = js.native
    var REJECTED: Double = js.native
    var REJECTED_RESUME: Double = js.native
    var REJECTED_SETUP: Double = js.native
    var RESERVED: Double = js.native
    var RESERVED_EXTENSION: Double = js.native
    var UNSUPPORTED_SETUP: Double = js.native
  }
  
  @js.native
  object FLAGS extends js.Object {
    var COMPLETE: Double = js.native
    var FOLLOWS: Double = js.native
    var IGNORE: Double = js.native
    var LEASE: Double = js.native
    var METADATA: Double = js.native
    var NEXT: Double = js.native
    var RESPOND: Double = js.native
    var RESUME_ENABLE: Double = js.native
  }
  
  @js.native
  object FRAME_TYPES extends js.Object {
    var CANCEL: Double = js.native
    var ERROR: Double = js.native
    var EXT: Double = js.native
    var KEEPALIVE: Double = js.native
    var LEASE: Double = js.native
    var METADATA_PUSH: Double = js.native
    var PAYLOAD: Double = js.native
    var REQUEST_CHANNEL: Double = js.native
    var REQUEST_FNF: Double = js.native
    var REQUEST_N: Double = js.native
    var REQUEST_RESPONSE: Double = js.native
    var REQUEST_STREAM: Double = js.native
    var RESERVED: Double = js.native
    var RESUME: Double = js.native
    var RESUME_OK: Double = js.native
    var SETUP: Double = js.native
  }
  
}

