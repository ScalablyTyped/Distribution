package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApplyMethod extends js.Object {
  var applyMethod: js.UndefOr[String] = js.undefined
  var name: String
  var value: String
}

object Anon_ApplyMethod {
  @scala.inline
  def apply(name: String, value: String, applyMethod: String = null): Anon_ApplyMethod = {
    val __obj = js.Dynamic.literal(name = name, value = value)
    if (applyMethod != null) __obj.updateDynamic("applyMethod")(applyMethod)
    __obj.asInstanceOf[Anon_ApplyMethod]
  }
}

