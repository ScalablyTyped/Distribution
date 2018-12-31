package typings
package serverLib.typingsCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var cookie: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var data: js.Any
  var error: nodeLib.Error
  var files: formidableLib.formidableMod.Files
  var headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var ip: java.lang.String
  var ips: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var method: java.lang.String
  var options: serverLib.typingsOptionsMod.Options
  var params: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var path: java.lang.String
  var query: org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  var req: expressLib.expressMod.eNs.Request
  var res: expressLib.expressMod.eNs.Response
  var secure: scala.Boolean
  var session: js.Object
  var url: java.lang.String
  var xhr: scala.Boolean
}

