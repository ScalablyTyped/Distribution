package typings.atPulumiAws.typesOutputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketWebsite extends js.Object {
  /**
    * An absolute path to the document to return in case of a 4XX error.
    */
  var errorDocument: js.UndefOr[String] = js.native
  /**
    * Amazon S3 returns this index document when requests are made to the root domain or any of the subfolders.
    */
  var indexDocument: js.UndefOr[String] = js.native
  /**
    * A hostname to redirect all website requests for this bucket to. Hostname can optionally be prefixed with a protocol (`http://` or `https://`) to use when redirecting requests. The default is the protocol that is used in the original request.
    */
  var redirectAllRequestsTo: js.UndefOr[String] = js.native
  /**
    * A json array containing [routing rules](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules.html)
    * describing redirect behavior and when redirects are applied.
    */
  var routingRules: js.UndefOr[String] = js.native
}

object BucketWebsite {
  @scala.inline
  def apply(
    errorDocument: String = null,
    indexDocument: String = null,
    redirectAllRequestsTo: String = null,
    routingRules: String = null
  ): BucketWebsite = {
    val __obj = js.Dynamic.literal()
    if (errorDocument != null) __obj.updateDynamic("errorDocument")(errorDocument.asInstanceOf[js.Any])
    if (indexDocument != null) __obj.updateDynamic("indexDocument")(indexDocument.asInstanceOf[js.Any])
    if (redirectAllRequestsTo != null) __obj.updateDynamic("redirectAllRequestsTo")(redirectAllRequestsTo.asInstanceOf[js.Any])
    if (routingRules != null) __obj.updateDynamic("routingRules")(routingRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketWebsite]
  }
}

