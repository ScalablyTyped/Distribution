package typings
package atPulumiAwsLib.s3S3MixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketEventSubscriptionArgs extends CommonBucketSubscriptionArgs {
  /**
    * Events to subscribe to. For example: "[s3:ObjectCreated:*]".  Cannot be empty.
    */
  var events: js.Array[java.lang.String]
}

