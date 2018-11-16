package typings
package slimerjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ResourceResponse extends js.Object {
  var body: js.Any
  var bodySize: scala.Double
  var contentCharset: java.lang.String
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  var headers: ScalablyTyped.runtime.StringDictionary[java.lang.String]
  var httpVersion: HttpVersion
  var id: scala.Double
  var isFileDownloading: scala.Boolean
  var redirectURL: js.UndefOr[java.lang.String] = js.undefined
  var referrer: java.lang.String
  var stage: java.lang.String
  var status: scala.Double
  var statusText: java.lang.String
  var time: stdLib.Date
  var url: java.lang.String
}

