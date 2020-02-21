package typings.pulumiAws.outputMod.s3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsConfigurationFilter extends js.Object {
  var prefix: js.UndefOr[String] = js.native
  var tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object AnalyticsConfigurationFilter {
  @scala.inline
  def apply(prefix: String = null, tags: StringDictionary[js.Any] = null): AnalyticsConfigurationFilter = {
    val __obj = js.Dynamic.literal()
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsConfigurationFilter]
  }
}

