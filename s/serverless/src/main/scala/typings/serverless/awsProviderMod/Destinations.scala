package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Destinations extends js.Object {
  var onFailure: js.UndefOr[String] = js.undefined
  var onSuccess: js.UndefOr[String] = js.undefined
}

object Destinations {
  @scala.inline
  def apply(onFailure: String = null, onSuccess: String = null): Destinations = {
    val __obj = js.Dynamic.literal()
    if (onFailure != null) __obj.updateDynamic("onFailure")(onFailure.asInstanceOf[js.Any])
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(onSuccess.asInstanceOf[js.Any])
    __obj.asInstanceOf[Destinations]
  }
}

