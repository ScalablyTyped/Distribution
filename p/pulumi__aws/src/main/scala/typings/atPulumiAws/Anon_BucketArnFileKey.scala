package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketArnFileKey extends js.Object {
  var bucketArn: Input[String]
  var fileKey: Input[String]
  var roleArn: Input[String]
}

object Anon_BucketArnFileKey {
  @scala.inline
  def apply(bucketArn: Input[String], fileKey: Input[String], roleArn: Input[String]): Anon_BucketArnFileKey = {
    val __obj = js.Dynamic.literal(bucketArn = bucketArn.asInstanceOf[js.Any], fileKey = fileKey.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BucketArnFileKey]
  }
}

