package typings
package atPulumiCloudLib.apiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Request extends js.Object {
  /**
       * The base url on which this http request was served.
       */
  var baseUrl: java.lang.String
  /**
       * The body of the HTTP request.
       */
  var body: nodeLib.Buffer
  /**
       * The headers of the HTTP request.
       */
  var headers: ScalablyTyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  /**
       * The hostname of the request.
       */
  var hostname: java.lang.String
  /**
       * The method of the HTTP request.
       */
  var method: java.lang.String
  /**
       * The path parameters of the HTTP request. Each `{param}` in the matched
       * route is available as a property of this oject.
       */
  var params: ScalablyTyped.runtime.StringDictionary[java.lang.String]
  /**
       * The raw path from the HTTP request.
       */
  var path: java.lang.String
  /**
       * The protocol of the request (e.g. HTTP/HTTPS).
       */
  var protocol: java.lang.String
  /**
       * The query parameters parsed from the query string of the request URL.
       */
  var query: ScalablyTyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  /**
       * The headers of the HTTP request.
       */
  var rawHeaders: js.Array[java.lang.String]
}

