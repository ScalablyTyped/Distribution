package typings
package restifyLib.restifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Route extends js.Object {
  var chain: Chain
  var method: java.lang.String
  var name: java.lang.String
  var path: java.lang.String | stdLib.RegExp
  var spec: RouteSpec
}

