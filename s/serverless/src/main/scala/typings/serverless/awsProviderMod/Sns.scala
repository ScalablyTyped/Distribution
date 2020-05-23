package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sns extends js.Object {
  var displayName: js.UndefOr[String] = js.undefined
  var filterPolicy: js.UndefOr[js.Array[String] | StringDictionary[String]] = js.undefined
  var redrivePolicy: js.UndefOr[RedrivePolicy] = js.undefined
  var topicName: String
}

object Sns {
  @scala.inline
  def apply(
    topicName: String,
    displayName: String = null,
    filterPolicy: js.Array[String] | StringDictionary[String] = null,
    redrivePolicy: RedrivePolicy = null
  ): Sns = {
    val __obj = js.Dynamic.literal(topicName = topicName.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (filterPolicy != null) __obj.updateDynamic("filterPolicy")(filterPolicy.asInstanceOf[js.Any])
    if (redrivePolicy != null) __obj.updateDynamic("redrivePolicy")(redrivePolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sns]
  }
}

