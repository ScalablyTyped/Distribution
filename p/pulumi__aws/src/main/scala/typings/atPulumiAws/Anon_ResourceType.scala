package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ResourceType extends js.Object {
  var resource: js.UndefOr[Input[String]] = js.undefined
  var `type`: Input[String]
}

object Anon_ResourceType {
  @scala.inline
  def apply(`type`: Input[String], resource: Input[String] = null): Anon_ResourceType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ResourceType]
  }
}

