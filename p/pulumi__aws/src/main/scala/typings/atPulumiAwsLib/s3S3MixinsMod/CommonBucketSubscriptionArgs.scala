package typings
package atPulumiAwsLib.s3S3MixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonBucketSubscriptionArgs extends js.Object {
  /**
    * An optional prefix to filter down notifications.  See
    * aws.s3.BucketNotification.lambdaFunctions for more details.
    */
  var filterPrefix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An optional suffix to filter down notifications.  See
    * aws.s3.BucketNotification.lambdaFunctions for more details.
    */
  var filterSuffix: js.UndefOr[java.lang.String] = js.undefined
}

