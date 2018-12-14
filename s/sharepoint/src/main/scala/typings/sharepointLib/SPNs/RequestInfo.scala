package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RequestInfo extends js.Object {
  var binaryStringRequestBody: js.UndefOr[scala.Boolean] = js.undefined
  /** Currently need fix to get ginary response. Details: http:// techmikael.blogspot.ru/2013/07/how-to-copy-files-between-sites-using.html */
  var binaryStringResponseBody: js.UndefOr[scala.Boolean] = js.undefined
  /** Can be string or bytearray depending on binaryStringRequestBody field */
  var body: js.UndefOr[java.lang.String | stdLib.Uint8Array] = js.undefined
  var error: js.UndefOr[
    js.Function3[
      /* response */ ResponseInfo, 
      /* error */ RequestExecutorErrors, 
      /* statusText */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var state: js.UndefOr[js.Any] = js.undefined
  var success: js.UndefOr[js.Function1[/* response */ ResponseInfo, scala.Unit]] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var url: java.lang.String
}

