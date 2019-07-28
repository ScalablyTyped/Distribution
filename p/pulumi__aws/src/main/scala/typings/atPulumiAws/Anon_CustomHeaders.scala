package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomHeaders extends js.Object {
  var customHeaders: js.UndefOr[js.Array[Anon_Name]] = js.undefined
  var customOriginConfig: js.UndefOr[Anon_HttpPort] = js.undefined
  var domainName: String
  var originId: String
  var originPath: js.UndefOr[String] = js.undefined
  var s3OriginConfig: js.UndefOr[Anon_OriginAccessIdentity] = js.undefined
}

object Anon_CustomHeaders {
  @scala.inline
  def apply(
    domainName: String,
    originId: String,
    customHeaders: js.Array[Anon_Name] = null,
    customOriginConfig: Anon_HttpPort = null,
    originPath: String = null,
    s3OriginConfig: Anon_OriginAccessIdentity = null
  ): Anon_CustomHeaders = {
    val __obj = js.Dynamic.literal(domainName = domainName, originId = originId)
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders)
    if (customOriginConfig != null) __obj.updateDynamic("customOriginConfig")(customOriginConfig)
    if (originPath != null) __obj.updateDynamic("originPath")(originPath)
    if (s3OriginConfig != null) __obj.updateDynamic("s3OriginConfig")(s3OriginConfig)
    __obj.asInstanceOf[Anon_CustomHeaders]
  }
}

