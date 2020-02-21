package typings.pulumiAws.inputMod.s3

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsConfigurationFilter extends js.Object {
  var prefix: js.UndefOr[Input[String]] = js.native
  var tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object AnalyticsConfigurationFilter {
  @scala.inline
  def apply(prefix: Input[String] = null, tags: Input[StringDictionary[_]] = null): AnalyticsConfigurationFilter = {
    val __obj = js.Dynamic.literal()
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsConfigurationFilter]
  }
}

