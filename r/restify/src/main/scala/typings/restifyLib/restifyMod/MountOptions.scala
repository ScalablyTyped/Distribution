package typings
package restifyLib.restifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MountOptions extends js.Object {
  var contentType: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var method: java.lang.String
  var name: java.lang.String
  var path: js.UndefOr[java.lang.String | stdLib.RegExp] = js.undefined
  var url: js.UndefOr[java.lang.String | stdLib.RegExp] = js.undefined
  var urlParamPattern: js.UndefOr[stdLib.RegExp] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
  var versions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

