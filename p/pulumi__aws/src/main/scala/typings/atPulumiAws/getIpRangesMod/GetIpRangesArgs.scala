package typings.atPulumiAws.getIpRangesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetIpRangesArgs extends js.Object {
  /**
    * Filter IP ranges by regions (or include all regions, if
    * omitted). Valid items are `global` (for `cloudfront`) as well as all AWS regions
    * (e.g. `eu-central-1`)
    */
  val regions: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Filter IP ranges by services. Valid items are `amazon`
    * (for amazon.com), `cloudfront`, `codebuild`, `ec2`, `route53`, `route53Healthchecks` and `S3`.
    */
  val services: js.Array[String]
  /**
    * Custom URL for source JSON file. Syntax must match [AWS IP Address Ranges documention][1]. Defaults to `https://ip-ranges.amazonaws.com/ip-ranges.json`.
    */
  val url: js.UndefOr[String] = js.undefined
}

object GetIpRangesArgs {
  @scala.inline
  def apply(services: js.Array[String], regions: js.Array[String] = null, url: String = null): GetIpRangesArgs = {
    val __obj = js.Dynamic.literal(services = services)
    if (regions != null) __obj.updateDynamic("regions")(regions)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[GetIpRangesArgs]
  }
}

