package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApplyMethod extends js.Object {
  var applyMethod: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var value: java.lang.String
}

object Anon_ApplyMethod {
  @scala.inline
  def apply(name: java.lang.String, value: java.lang.String, applyMethod: java.lang.String = null): Anon_ApplyMethod = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("value")(value)
    if (applyMethod != null) __obj.updateDynamic("applyMethod")(applyMethod)
    __obj.asInstanceOf[Anon_ApplyMethod]
  }
}

