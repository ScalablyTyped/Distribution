package typings.pulumiAws.outputMod.s3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsConfigurationFilter extends js.Object {
  /**
    * Object prefix for filtering.
    */
  var prefix: js.UndefOr[String] = js.native
  /**
    * Set of object tags for filtering.
    */
  var tags: js.UndefOr[StringDictionary[String]] = js.native
}

object AnalyticsConfigurationFilter {
  @scala.inline
  def apply(): AnalyticsConfigurationFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsConfigurationFilter]
  }
  @scala.inline
  implicit class AnalyticsConfigurationFilterOps[Self <: AnalyticsConfigurationFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

