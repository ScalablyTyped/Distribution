package typings.pulumiAws.inputMod.cloudfront

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributionRestrictionsGeoRestriction extends js.Object {
  /**
    * The [ISO 3166-1-alpha-2 codes][4] for which you
    * want CloudFront either to distribute your content (`whitelist`) or not
    * distribute your content (`blacklist`).
    */
  var locations: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The method that you want to use to restrict
    * distribution of your content by country: `none`, `whitelist`, or
    * `blacklist`.
    */
  var restrictionType: Input[String] = js.native
}

object DistributionRestrictionsGeoRestriction {
  @scala.inline
  def apply(restrictionType: Input[String]): DistributionRestrictionsGeoRestriction = {
    val __obj = js.Dynamic.literal(restrictionType = restrictionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionRestrictionsGeoRestriction]
  }
  @scala.inline
  implicit class DistributionRestrictionsGeoRestrictionOps[Self <: DistributionRestrictionsGeoRestriction] (val x: Self) extends AnyVal {
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
    def setRestrictionType(value: Input[String]): Self = this.set("restrictionType", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocationsVarargs(value: Input[String]*): Self = this.set("locations", js.Array(value :_*))
    @scala.inline
    def setLocations(value: Input[js.Array[Input[String]]]): Self = this.set("locations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocations: Self = this.set("locations", js.undefined)
  }
  
}

