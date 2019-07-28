package typings.atPulumiAws

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Autoprovision extends js.Object {
  var autoprovision: js.UndefOr[Boolean] = js.undefined
  var driver: js.UndefOr[String] = js.undefined
  var driverOpts: js.UndefOr[StringDictionary[String]] = js.undefined
  var labels: js.UndefOr[StringDictionary[String]] = js.undefined
  var scope: String
}

object Anon_Autoprovision {
  @scala.inline
  def apply(
    scope: String,
    autoprovision: js.UndefOr[Boolean] = js.undefined,
    driver: String = null,
    driverOpts: StringDictionary[String] = null,
    labels: StringDictionary[String] = null
  ): Anon_Autoprovision = {
    val __obj = js.Dynamic.literal(scope = scope)
    if (!js.isUndefined(autoprovision)) __obj.updateDynamic("autoprovision")(autoprovision)
    if (driver != null) __obj.updateDynamic("driver")(driver)
    if (driverOpts != null) __obj.updateDynamic("driverOpts")(driverOpts)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    __obj.asInstanceOf[Anon_Autoprovision]
  }
}

