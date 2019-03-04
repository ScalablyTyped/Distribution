package typings
package roadsLib.roadsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Router extends js.Object {
  var method: java.lang.String
  var path: java.lang.String
  def fn(): scala.Unit
}

object Router {
  @scala.inline
  def apply(fn: js.Function0[scala.Unit], method: java.lang.String, path: java.lang.String): Router = {
    val __obj = js.Dynamic.literal(fn = fn, method = method, path = path)
  
    __obj.asInstanceOf[Router]
  }
}

