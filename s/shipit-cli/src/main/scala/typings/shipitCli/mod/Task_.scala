package typings.shipitCli.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Task_ extends js.Object {
  var blocking: Boolean
  var dep: js.Array[String]
  var name: String
  def fn(): Unit
}

object Task_ {
  @scala.inline
  def apply(blocking: Boolean, dep: js.Array[String], fn: () => Unit, name: String): Task_ = {
    val __obj = js.Dynamic.literal(blocking = blocking.asInstanceOf[js.Any], dep = dep.asInstanceOf[js.Any], fn = js.Any.fromFunction0(fn), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Task_]
  }
}

