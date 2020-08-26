package typings.pulumiAws.analyticsConfigurationMod

import typings.pulumiAws.inputMod.s3.AnalyticsConfigurationFilter
import typings.pulumiAws.inputMod.s3.AnalyticsConfigurationStorageClassAnalysis
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsConfigurationState extends js.Object {
  /**
    * The name of the bucket this analytics configuration is associated with.
    */
  val bucket: js.UndefOr[Input[String]] = js.native
  /**
    * Object filtering that accepts a prefix, tags, or a logical AND of prefix and tags (documented below).
    */
  val filter: js.UndefOr[Input[AnalyticsConfigurationFilter]] = js.native
  /**
    * Unique identifier of the analytics configuration for the bucket.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Configuration for the analytics data export (documented below).
    */
  val storageClassAnalysis: js.UndefOr[Input[AnalyticsConfigurationStorageClassAnalysis]] = js.native
}

object AnalyticsConfigurationState {
  @scala.inline
  def apply(): AnalyticsConfigurationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsConfigurationState]
  }
  @scala.inline
  implicit class AnalyticsConfigurationStateOps[Self <: AnalyticsConfigurationState] (val x: Self) extends AnyVal {
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
    def setBucket(value: Input[String]): Self = this.set("bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucket: Self = this.set("bucket", js.undefined)
    @scala.inline
    def setFilter(value: Input[AnalyticsConfigurationFilter]): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setStorageClassAnalysis(value: Input[AnalyticsConfigurationStorageClassAnalysis]): Self = this.set("storageClassAnalysis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageClassAnalysis: Self = this.set("storageClassAnalysis", js.undefined)
  }
  
}

