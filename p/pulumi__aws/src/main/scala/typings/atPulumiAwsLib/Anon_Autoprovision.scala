package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Autoprovision extends js.Object {
  var autoprovision: js.UndefOr[scala.Boolean] = js.undefined
  var driver: js.UndefOr[java.lang.String] = js.undefined
  var driverOpts: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var labels: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var scope: java.lang.String
}

object Anon_Autoprovision {
  @scala.inline
  def apply(
    scope: java.lang.String,
    autoprovision: js.UndefOr[scala.Boolean] = js.undefined,
    driver: java.lang.String = null,
    driverOpts: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    labels: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): Anon_Autoprovision = {
    val __obj = js.Dynamic.literal(scope = scope)
    if (!js.isUndefined(autoprovision)) __obj.updateDynamic("autoprovision")(autoprovision)
    if (driver != null) __obj.updateDynamic("driver")(driver)
    if (driverOpts != null) __obj.updateDynamic("driverOpts")(driverOpts)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    __obj.asInstanceOf[Anon_Autoprovision]
  }
}

