package typings
package atPulumiCloudLib.bucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bucket extends js.Object {
  /**
    * Delete a blob from the bucket.
    *
    * @param key The key of the blob to delete.
    * @returns A promise for the success or failure of the delete.
    */
  def delete(key: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    * Get a blob from the bucket.
    *
    * @param key The key of the blog to retrieve.
    * @returns A promise for the success or failure of the get.
    */
  def get(key: java.lang.String): js.Promise[nodeLib.Buffer] = js.native
  /**
    * Registers a handler to be notified when blobs are deleted from the bucket.
    *
    * @param name A unique name for the subscription.
    * @param filter A filter to decide which put events should be reported.
    * @param handler A callback to handle the event.
    */
  def onDelete(name: java.lang.String, handler: BucketHandler): scala.Unit = js.native
  def onDelete(name: java.lang.String, handler: BucketHandler, filter: BucketFilter): scala.Unit = js.native
  /**
    * Registers a handler to be notified when blobs are put into the bucket (created or updated).
    *
    * @param name A unique name for the subscription.
    * @param filter A filter to decide which put events should be reported.
    * @param handler A callback to handle the event.
    */
  def onPut(name: java.lang.String, handler: BucketHandler): scala.Unit = js.native
  def onPut(name: java.lang.String, handler: BucketHandler, filter: BucketFilter): scala.Unit = js.native
  /**
    * Insert a blob into the bucket.
    *
    * @param key The key to use for retreiving this blob later.
    * @returns A promise for the success or failure of the put.
    */
  def put(key: java.lang.String, contents: nodeLib.Buffer): js.Promise[scala.Unit] = js.native
}

@JSImport("@pulumi/cloud/bucket", "Bucket")
@js.native
class BucketCls protected () extends Bucket {
  /**
    * Creates a new Bucket.
    *
    * @param name A unique name for the bucket.
    * @param opts A bag of options that controls how this resource behaves.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, opts: atPulumiPulumiLib.resourceMod.ResourceOptions) = this()
}

