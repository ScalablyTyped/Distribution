package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RegionTableName extends js.Object {
  var region: js.UndefOr[Input[String]] = js.undefined
  var tableName: Input[String]
  var useCallerCredentials: js.UndefOr[Input[Boolean]] = js.undefined
}

object Anon_RegionTableName {
  @scala.inline
  def apply(
    tableName: Input[String],
    region: Input[String] = null,
    useCallerCredentials: Input[Boolean] = null
  ): Anon_RegionTableName = {
    val __obj = js.Dynamic.literal(tableName = tableName.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (useCallerCredentials != null) __obj.updateDynamic("useCallerCredentials")(useCallerCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_RegionTableName]
  }
}

