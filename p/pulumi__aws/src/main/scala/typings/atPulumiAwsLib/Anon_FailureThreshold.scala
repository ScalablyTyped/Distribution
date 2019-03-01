package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FailureThreshold extends js.Object {
  var failureThreshold: js.UndefOr[scala.Double] = js.undefined
  var resourcePath: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_FailureThreshold {
  @scala.inline
  def apply(
    failureThreshold: scala.Int | scala.Double = null,
    resourcePath: java.lang.String = null,
    `type`: java.lang.String = null
  ): Anon_FailureThreshold = {
    val __obj = js.Dynamic.literal()
    if (failureThreshold != null) __obj.updateDynamic("failureThreshold")(failureThreshold.asInstanceOf[js.Any])
    if (resourcePath != null) __obj.updateDynamic("resourcePath")(resourcePath)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_FailureThreshold]
  }
}

