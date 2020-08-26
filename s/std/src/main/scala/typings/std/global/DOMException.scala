package typings.std.global

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DOMException")
@js.native
class DOMException ()
  extends typings.std.DOMException {
  def this(message: java.lang.String) = this()
  def this(message: js.UndefOr[scala.Nothing], name: java.lang.String) = this()
  def this(message: java.lang.String, name: java.lang.String) = this()
}

@JSGlobal("DOMException")
@js.native
object DOMException
  extends Instantiable0[typings.std.DOMException]
     with Instantiable1[/* message */ java.lang.String, typings.std.DOMException]
     with Instantiable2[
      js.UndefOr[/* message */ java.lang.String], 
      /* name */ java.lang.String, 
      typings.std.DOMException
    ] {
  val ABORT_ERR: Double = js.native
  val DATA_CLONE_ERR: Double = js.native
  val DOMSTRING_SIZE_ERR: Double = js.native
  val HIERARCHY_REQUEST_ERR: Double = js.native
  val INDEX_SIZE_ERR: Double = js.native
  val INUSE_ATTRIBUTE_ERR: Double = js.native
  val INVALID_ACCESS_ERR: Double = js.native
  val INVALID_CHARACTER_ERR: Double = js.native
  val INVALID_MODIFICATION_ERR: Double = js.native
  val INVALID_NODE_TYPE_ERR: Double = js.native
  val INVALID_STATE_ERR: Double = js.native
  val NAMESPACE_ERR: Double = js.native
  val NETWORK_ERR: Double = js.native
  val NOT_FOUND_ERR: Double = js.native
  val NOT_SUPPORTED_ERR: Double = js.native
  val NO_DATA_ALLOWED_ERR: Double = js.native
  val NO_MODIFICATION_ALLOWED_ERR: Double = js.native
  val QUOTA_EXCEEDED_ERR: Double = js.native
  val SECURITY_ERR: Double = js.native
  val SYNTAX_ERR: Double = js.native
  val TIMEOUT_ERR: Double = js.native
  val TYPE_MISMATCH_ERR: Double = js.native
  val URL_MISMATCH_ERR: Double = js.native
  val VALIDATION_ERR: Double = js.native
  val WRONG_DOCUMENT_ERR: Double = js.native
}

