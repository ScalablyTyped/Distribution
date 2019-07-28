package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LaunchTemplateSpecification extends js.Object {
  var launchTemplateSpecification: Anon_LaunchTemplateId
  var overrides: js.UndefOr[js.Array[Anon_InstanceType]] = js.undefined
}

object Anon_LaunchTemplateSpecification {
  @scala.inline
  def apply(launchTemplateSpecification: Anon_LaunchTemplateId, overrides: js.Array[Anon_InstanceType] = null): Anon_LaunchTemplateSpecification = {
    val __obj = js.Dynamic.literal(launchTemplateSpecification = launchTemplateSpecification)
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    __obj.asInstanceOf[Anon_LaunchTemplateSpecification]
  }
}

