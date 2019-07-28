package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TypeValue extends js.Object {
  var `type`: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object Anon_TypeValue {
  @scala.inline
  def apply(`type`: String = null, value: Int | Double = null): Anon_TypeValue = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TypeValue]
  }
}

