package typings
package restfulDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object restfulDotJsMod {
  type FullRequestInterceptor = js.Function5[
    /* params */ js.Any, 
    /* headers */ Headers, 
    /* data */ js.Any, 
    /* method */ java.lang.String, 
    /* url */ java.lang.String, 
    FullRequestInterceptorReturnValue
  ]
  type Headers = org.scalablytyped.runtime.StringDictionary[js.Any]
  type RequestInterceptor = js.Function4[
    /* data */ js.Any, 
    /* headers */ Headers, 
    /* method */ java.lang.String, 
    /* url */ java.lang.String, 
    js.Any
  ]
  type ResponseInterceptor = js.Function4[
    /* data */ js.Any, 
    /* headers */ Headers, 
    /* method */ java.lang.String, 
    /* url */ java.lang.String, 
    ResponseInterceptorReturnValue
  ]
}
