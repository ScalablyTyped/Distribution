package typings.atPulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoprovisionDriver extends js.Object {
  var autoprovision: js.UndefOr[Input[Boolean]] = js.undefined
  var driver: js.UndefOr[Input[String]] = js.undefined
  var driverOpts: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  var labels: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  var scope: js.UndefOr[Input[String]] = js.undefined
}

object Anon_AutoprovisionDriver {
  @scala.inline
  def apply(
    autoprovision: Input[Boolean] = null,
    driver: Input[String] = null,
    driverOpts: Input[StringDictionary[Input[String]]] = null,
    labels: Input[StringDictionary[Input[String]]] = null,
    scope: Input[String] = null
  ): Anon_AutoprovisionDriver = {
    val __obj = js.Dynamic.literal()
    if (autoprovision != null) __obj.updateDynamic("autoprovision")(autoprovision.asInstanceOf[js.Any])
    if (driver != null) __obj.updateDynamic("driver")(driver.asInstanceOf[js.Any])
    if (driverOpts != null) __obj.updateDynamic("driverOpts")(driverOpts.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AutoprovisionDriver]
  }
}

