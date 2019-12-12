package typings.resourceDashLoader.resourceDashLoaderMod.Resource

import org.scalablytyped.runtime.TopLevel
import typings.resourceDashLoader.resourceDashLoaderMod.Resource.XHR_RESPONSE_TYPE.BLOB
import typings.resourceDashLoader.resourceDashLoaderMod.Resource.XHR_RESPONSE_TYPE.BUFFER
import typings.resourceDashLoader.resourceDashLoaderMod.Resource.XHR_RESPONSE_TYPE.DEFAULT
import typings.resourceDashLoader.resourceDashLoaderMod.Resource.XHR_RESPONSE_TYPE.DOCUMENT
import typings.resourceDashLoader.resourceDashLoaderMod.Resource.XHR_RESPONSE_TYPE.JSON
import typings.resourceDashLoader.resourceDashLoaderMod.Resource.XHR_RESPONSE_TYPE.TEXT
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[XHR_RESPONSE_TYPE with Double] = js.native
  /* 2 */ @js.native
  object BLOB extends TopLevel[BLOB with Double]
  
  /* 1 */ @js.native
  object BUFFER extends TopLevel[BUFFER with Double]
  
  /* 0 */ @js.native
  object DEFAULT extends TopLevel[DEFAULT with Double]
  
  /* 3 */ @js.native
  object DOCUMENT extends TopLevel[DOCUMENT with Double]
  
  /* 4 */ @js.native
  object JSON extends TopLevel[JSON with Double]
  
  /* 5 */ @js.native
  object TEXT extends TopLevel[TEXT with Double]
  
}

