package typings.resourceLoader.resourceLoaderMod.Resource

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait XHR_RESPONSE_TYPE extends js.Object
/**
  * The XHR ready states, used internally.
  *
  * @static
  * @readonly
  * @enum {string}
  */
@JSImport("resource-loader", "Resource.XHR_RESPONSE_TYPE")
@js.native
object XHR_RESPONSE_TYPE extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[XHR_RESPONSE_TYPE with Double] = js.native
  
  @js.native
  sealed trait BLOB extends XHR_RESPONSE_TYPE
  /* 2 */ @js.native
  object BLOB extends TopLevel[BLOB with Double]
  
  @js.native
  sealed trait BUFFER extends XHR_RESPONSE_TYPE
  /* 1 */ @js.native
  object BUFFER extends TopLevel[BUFFER with Double]
  
  @js.native
  sealed trait DEFAULT extends XHR_RESPONSE_TYPE
  /* 0 */ @js.native
  object DEFAULT extends TopLevel[DEFAULT with Double]
  
  @js.native
  sealed trait DOCUMENT extends XHR_RESPONSE_TYPE
  /* 3 */ @js.native
  object DOCUMENT extends TopLevel[DOCUMENT with Double]
  
  @js.native
  sealed trait JSON extends XHR_RESPONSE_TYPE
  /* 4 */ @js.native
  object JSON extends TopLevel[JSON with Double]
  
  @js.native
  sealed trait TEXT extends XHR_RESPONSE_TYPE
  /* 5 */ @js.native
  object TEXT extends TopLevel[TEXT with Double]
}
