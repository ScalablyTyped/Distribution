package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InstanceType extends js.Object {
  var instanceType: js.UndefOr[String] = js.undefined
}

object Anon_InstanceType {
  @scala.inline
  def apply(instanceType: String = null): Anon_InstanceType = {
    val __obj = js.Dynamic.literal()
    if (instanceType != null) __obj.updateDynamic("instanceType")(instanceType)
    __obj.asInstanceOf[Anon_InstanceType]
  }
}

