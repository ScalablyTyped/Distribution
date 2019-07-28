package typings.atPulumiCloud.atPulumiCloudMod

import typings.atPulumiCloud.bucketMod.Bucket
import typings.atPulumiPulumi.resourceMod.ResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/cloud", "Bucket")
@js.native
class BucketCls protected () extends Bucket {
  /**
    * Creates a new Bucket.
    *
    * @param name A unique name for the bucket.
    * @param opts A bag of options that controls how this resource behaves.
    */
  def this(name: String) = this()
  def this(name: String, opts: ResourceOptions) = this()
}

