package typings.roads.roadsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Router extends js.Object {
  var method: String
  var path: String
  def fn(): Unit
}

object Router {
  @scala.inline
  def apply(fn: () => Unit, method: String, path: String): Router = {
    val __obj = js.Dynamic.literal(fn = js.Any.fromFunction0(fn), method = method, path = path)
  
    __obj.asInstanceOf[Router]
  }
}

