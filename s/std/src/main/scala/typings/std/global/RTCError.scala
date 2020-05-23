package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.RTCErrorDetailType
import typings.std.RTCErrorInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("RTCError")
@js.native
class RTCError protected ()
  extends typings.std.RTCError {
  def this(init: RTCErrorInit) = this()
  def this(init: RTCErrorInit, message: java.lang.String) = this()
  /* CompleteClass */
  override val ABORT_ERR: Double = js.native
  /* CompleteClass */
  override val DATA_CLONE_ERR: Double = js.native
  /* CompleteClass */
  override val DOMSTRING_SIZE_ERR: Double = js.native
  /* CompleteClass */
  override val HIERARCHY_REQUEST_ERR: Double = js.native
  /* CompleteClass */
  override val INDEX_SIZE_ERR: Double = js.native
  /* CompleteClass */
  override val INUSE_ATTRIBUTE_ERR: Double = js.native
  /* CompleteClass */
  override val INVALID_ACCESS_ERR: Double = js.native
  /* CompleteClass */
  override val INVALID_CHARACTER_ERR: Double = js.native
  /* CompleteClass */
  override val INVALID_MODIFICATION_ERR: Double = js.native
  /* CompleteClass */
  override val INVALID_NODE_TYPE_ERR: Double = js.native
  /* CompleteClass */
  override val INVALID_STATE_ERR: Double = js.native
  /* CompleteClass */
  override val NAMESPACE_ERR: Double = js.native
  /* CompleteClass */
  override val NETWORK_ERR: Double = js.native
  /* CompleteClass */
  override val NOT_FOUND_ERR: Double = js.native
  /* CompleteClass */
  override val NOT_SUPPORTED_ERR: Double = js.native
  /* CompleteClass */
  override val NO_DATA_ALLOWED_ERR: Double = js.native
  /* CompleteClass */
  override val NO_MODIFICATION_ALLOWED_ERR: Double = js.native
  /* CompleteClass */
  override val QUOTA_EXCEEDED_ERR: Double = js.native
  /* CompleteClass */
  override val SECURITY_ERR: Double = js.native
  /* CompleteClass */
  override val SYNTAX_ERR: Double = js.native
  /* CompleteClass */
  override val TIMEOUT_ERR: Double = js.native
  /* CompleteClass */
  override val TYPE_MISMATCH_ERR: Double = js.native
  /* CompleteClass */
  override val URL_MISMATCH_ERR: Double = js.native
  /* CompleteClass */
  override val VALIDATION_ERR: Double = js.native
  /* CompleteClass */
  override val WRONG_DOCUMENT_ERR: Double = js.native
  /* CompleteClass */
  override val code: Double = js.native
  /* CompleteClass */
  override val errorDetail: RTCErrorDetailType = js.native
  /* CompleteClass */
  override val httpRequestStatusCode: Double | Null = js.native
  /* CompleteClass */
  override val message: java.lang.String = js.native
  /* CompleteClass */
  override val name: java.lang.String = js.native
  /* CompleteClass */
  override val receivedAlert: Double | Null = js.native
  /* CompleteClass */
  override val sctpCauseCode: Double | Null = js.native
  /* CompleteClass */
  override val sdpLineNumber: Double | Null = js.native
  /* CompleteClass */
  override val sentAlert: Double | Null = js.native
}

@JSGlobal("RTCError")
@js.native
object RTCError
  extends Instantiable1[/* init */ RTCErrorInit, typings.std.RTCError]
     with Instantiable2[/* init */ RTCErrorInit, /* message */ java.lang.String, typings.std.RTCError]

