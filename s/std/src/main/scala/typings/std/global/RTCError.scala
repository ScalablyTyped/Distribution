package typings.std.global

import typings.std.RTCErrorDetailType
import typings.std.RTCErrorInit
import typings.std.stdInts.`10`
import typings.std.stdInts.`11`
import typings.std.stdInts.`12`
import typings.std.stdInts.`13`
import typings.std.stdInts.`14`
import typings.std.stdInts.`15`
import typings.std.stdInts.`16`
import typings.std.stdInts.`17`
import typings.std.stdInts.`18`
import typings.std.stdInts.`19`
import typings.std.stdInts.`1`
import typings.std.stdInts.`20`
import typings.std.stdInts.`21`
import typings.std.stdInts.`22`
import typings.std.stdInts.`23`
import typings.std.stdInts.`24`
import typings.std.stdInts.`25`
import typings.std.stdInts.`2`
import typings.std.stdInts.`3`
import typings.std.stdInts.`4`
import typings.std.stdInts.`5`
import typings.std.stdInts.`6`
import typings.std.stdInts.`7`
import typings.std.stdInts.`8`
import typings.std.stdInts.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("RTCError")
@js.native
open class RTCError protected ()
  extends StObject
     with typings.std.RTCError {
  /* standard dom */
  def this(init: RTCErrorInit) = this()
  def this(init: RTCErrorInit, message: java.lang.String) = this()
  
  /* standard dom */
  /* CompleteClass */
  override val ABORT_ERR: `20` = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val DATA_CLONE_ERR: `25` = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val DOMSTRING_SIZE_ERR: `2` = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val HIERARCHY_REQUEST_ERR: `3` = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val INDEX_SIZE_ERR: `1` = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val INUSE_ATTRIBUTE_ERR: `10` = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val INVALID_ACCESS_ERR: `15` = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val INVALID_CHARACTER_ERR: `5` = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val INVALID_MODIFICATION_ERR: `13` = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val INVALID_NODE_TYPE_ERR: `24` = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val INVALID_STATE_ERR: `11` = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val NAMESPACE_ERR: `14` = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val NETWORK_ERR: `19` = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val NOT_FOUND_ERR: `8` = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val NOT_SUPPORTED_ERR: `9` = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val NO_DATA_ALLOWED_ERR: `6` = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val NO_MODIFICATION_ALLOWED_ERR: `7` = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val QUOTA_EXCEEDED_ERR: `22` = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val SECURITY_ERR: `18` = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val SYNTAX_ERR: `12` = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val TIMEOUT_ERR: `23` = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val TYPE_MISMATCH_ERR: `17` = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val URL_MISMATCH_ERR: `21` = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val VALIDATION_ERR: `16` = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val WRONG_DOCUMENT_ERR: `4` = js.native
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException/code)
    */
  /* standard dom */
  /* CompleteClass */
  override val code: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCError/errorDetail) */
  /* standard dom */
  /* CompleteClass */
  override val errorDetail: RTCErrorDetailType = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var message: java.lang.String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCError/receivedAlert) */
  /* standard dom */
  /* CompleteClass */
  override val receivedAlert: Double | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCError/sctpCauseCode) */
  /* standard dom */
  /* CompleteClass */
  override val sctpCauseCode: Double | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCError/sdpLineNumber) */
  /* standard dom */
  /* CompleteClass */
  override val sdpLineNumber: Double | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCError/sentAlert) */
  /* standard dom */
  /* CompleteClass */
  override val sentAlert: Double | Null = js.native
}
