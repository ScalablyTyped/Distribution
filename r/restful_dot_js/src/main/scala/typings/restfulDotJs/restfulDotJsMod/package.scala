package typings.restfulDotJs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object restfulDotJsMod {
  type FullRequestInterceptor = js.Function5[
    /* params */ js.Any, 
    /* headers */ Headers, 
    /* data */ js.Any, 
    /* method */ String, 
    /* url */ String, 
    FullRequestInterceptorReturnValue
  ]
  type Headers = StringDictionary[js.Any]
  type RequestInterceptor = js.Function4[/* data */ js.Any, /* headers */ Headers, /* method */ String, /* url */ String, js.Any]
  type ResponseInterceptor = js.Function4[
    /* data */ js.Any, 
    /* headers */ Headers, 
    /* method */ String, 
    /* url */ String, 
    ResponseInterceptorReturnValue
  ]
}
