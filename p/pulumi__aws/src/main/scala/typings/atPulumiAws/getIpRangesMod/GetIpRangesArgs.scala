package typings.atPulumiAws.getIpRangesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIpRangesArgs extends js.Object {
  /**
    * Filter IP ranges by regions (or include all regions, if
    * omitted). Valid items are `global` (for `cloudfront`) as well as all AWS regions
    * (e.g. `eu-central-1`)
    */
  val regions: js.UndefOr[js.Array[String]] = js.native
  /**
    * Filter IP ranges by services. Valid items are `amazon`
    * (for amazon.com), `cloudfront`, `codebuild`, `ec2`, `route53`, `route53Healthchecks` and `S3`.
    */
  val services: js.Array[String] = js.native
  /**
    * Custom URL for source JSON file. Syntax must match [AWS IP Address Ranges documention][1]. Defaults to `https://ip-ranges.amazonaws.com/ip-ranges.json`.
    */
  val url: js.UndefOr[String] = js.native
}

object GetIpRangesArgs {
  @scala.inline
  def apply(services: js.Array[String], regions: js.Array[String] = null, url: String = null): GetIpRangesArgs = {
    val __obj = js.Dynamic.literal(services = services.asInstanceOf[js.Any])
    if (regions != null) __obj.updateDynamic("regions")(regions.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIpRangesArgs]
  }
}

