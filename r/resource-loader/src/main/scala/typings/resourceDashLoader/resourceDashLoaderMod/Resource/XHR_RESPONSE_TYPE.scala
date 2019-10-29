package typings.resourceDashLoader.resourceDashLoaderMod.Resource

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  @js.native
  sealed trait BLOB extends XHR_RESPONSE_TYPE
  
  @js.native
  sealed trait BUFFER extends XHR_RESPONSE_TYPE
  
  @js.native
  sealed trait DEFAULT extends XHR_RESPONSE_TYPE
  
  @js.native
  sealed trait DOCUMENT extends XHR_RESPONSE_TYPE
  
  @js.native
  sealed trait JSON extends XHR_RESPONSE_TYPE
  
  @js.native
  sealed trait TEXT extends XHR_RESPONSE_TYPE
  
  /* 2 */ val BLOB: typings.resourceDashLoader.resourceDashLoaderMod.Resource.XHR_RESPONSE_TYPE.BLOB with Double = js.native
  /* 1 */ val BUFFER: typings.resourceDashLoader.resourceDashLoaderMod.Resource.XHR_RESPONSE_TYPE.BUFFER with Double = js.native
  /* 0 */ val DEFAULT: typings.resourceDashLoader.resourceDashLoaderMod.Resource.XHR_RESPONSE_TYPE.DEFAULT with Double = js.native
  /* 3 */ val DOCUMENT: typings.resourceDashLoader.resourceDashLoaderMod.Resource.XHR_RESPONSE_TYPE.DOCUMENT with Double = js.native
  /* 4 */ val JSON: typings.resourceDashLoader.resourceDashLoaderMod.Resource.XHR_RESPONSE_TYPE.JSON with Double = js.native
  /* 5 */ val TEXT: typings.resourceDashLoader.resourceDashLoaderMod.Resource.XHR_RESPONSE_TYPE.TEXT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[XHR_RESPONSE_TYPE with Double] = js.native
}

