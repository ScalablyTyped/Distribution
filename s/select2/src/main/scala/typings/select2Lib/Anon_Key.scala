package typings
package select2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  def reset(): scala.Unit
  def set(key: java.lang.String, value: js.Any): scala.Unit
}

object Anon_Key {
  @scala.inline
  def apply(reset: js.Function0[scala.Unit], set: js.Function2[java.lang.String, js.Any, scala.Unit]): Anon_Key = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("reset")(reset)
    __obj.updateDynamic("set")(set)
    __obj.asInstanceOf[Anon_Key]
  }
}

