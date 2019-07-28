package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FailureThreshold extends js.Object {
  var failureThreshold: js.UndefOr[Double] = js.undefined
  var resourcePath: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object Anon_FailureThreshold {
  @scala.inline
  def apply(failureThreshold: Int | Double = null, resourcePath: String = null, `type`: String = null): Anon_FailureThreshold = {
    val __obj = js.Dynamic.literal()
    if (failureThreshold != null) __obj.updateDynamic("failureThreshold")(failureThreshold.asInstanceOf[js.Any])
    if (resourcePath != null) __obj.updateDynamic("resourcePath")(resourcePath)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_FailureThreshold]
  }
}

