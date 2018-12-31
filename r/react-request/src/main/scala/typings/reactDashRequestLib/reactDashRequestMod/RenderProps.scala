package typings
package reactDashRequestLib.reactDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderProps[T] extends js.Object {
  var data: T | scala.Null
  var error: stdLib.Error | scala.Null
  var failed: scala.Boolean
  var fetching: scala.Boolean
  var requestKey: java.lang.String
  var requestName: java.lang.String
  var response: stdLib.Response | scala.Null
  var url: java.lang.String
}

