package typings.scriptableIos.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Performs HTTP requests._
  *
  * Constructs a new request that will be sent to the provided URL. The request is not sent until an appropriate load method is called, e.g. loadImage for downloading and interpreting
  * the response as an image.
  * @see https://docs.scriptable.app/request/#-new-request
  */
@JSGlobal("Request")
@js.native
open class Request protected ()
  extends StObject
     with typings.scriptableIos.Request {
  /**
    * _Performs HTTP requests._
    *
    * Constructs a new request that will be sent to the provided URL. The request is not sent until an appropriate load method is called, e.g. loadImage for downloading and interpreting
    * the response as an image.
    * @param url - URL to send request to.
    * @see https://docs.scriptable.app/request/#-new-request
    */
  def this(url: String) = this()
}
