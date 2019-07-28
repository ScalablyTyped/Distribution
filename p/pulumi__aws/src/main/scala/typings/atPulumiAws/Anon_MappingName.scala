package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MappingName extends js.Object {
  var mapping: js.UndefOr[Input[String]] = js.undefined
  var name: Input[String]
  var sqlType: Input[String]
}

object Anon_MappingName {
  @scala.inline
  def apply(name: Input[String], sqlType: Input[String], mapping: Input[String] = null): Anon_MappingName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sqlType = sqlType.asInstanceOf[js.Any])
    if (mapping != null) __obj.updateDynamic("mapping")(mapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MappingName]
  }
}

