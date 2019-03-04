package typings
package qiniuDashJsLib.qiniuDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedInfo
  extends /* key */ org.scalablytyped.runtime.StringDictionary[qiniuDashJsLib.Anon_Type | scala.Double | java.lang.String] {
  var code: scala.Double
  var error: java.lang.String
}

object ExtendedInfo {
  @scala.inline
  def apply(
    code: scala.Double,
    error: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[qiniuDashJsLib.Anon_Type | scala.Double | java.lang.String] = null
  ): ExtendedInfo = {
    val __obj = js.Dynamic.literal(code = code, error = error)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ExtendedInfo]
  }
}

