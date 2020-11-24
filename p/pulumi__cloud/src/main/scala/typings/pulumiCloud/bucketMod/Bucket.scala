package typings.pulumiCloud.bucketMod

import org.scalablytyped.runtime.TopLevel
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bucket extends js.Object {
  
  /**
    * Delete a blob from the bucket.
    *
    * @param key The key of the blob to delete.
    * @returns A promise for the success or failure of the delete.
    */
  def delete(key: String): js.Promise[Unit] = js.native
  
  /**
    * Get a blob from the bucket.
    *
    * @param key The key of the blog to retrieve.
    * @returns A promise for the success or failure of the get.
    */
  def get(key: String): js.Promise[Buffer] = js.native
  
  /**
    * Registers a handler to be notified when blobs are deleted from the bucket.
    *
    * @param name A unique name for the subscription.
    * @param filter A filter to decide which put events should be reported.
    * @param handler A callback to handle the event.
    */
  def onDelete(name: String, handler: BucketHandler): Unit = js.native
  def onDelete(name: String, handler: BucketHandler, filter: BucketFilter): Unit = js.native
  
  /**
    * Registers a handler to be notified when blobs are put into the bucket (created or updated).
    *
    * @param name A unique name for the subscription.
    * @param filter A filter to decide which put events should be reported.
    * @param handler A callback to handle the event.
    */
  def onPut(name: String, handler: BucketHandler): Unit = js.native
  def onPut(name: String, handler: BucketHandler, filter: BucketFilter): Unit = js.native
  
  /**
    * Insert a blob into the bucket.
    *
    * @param key The key to use for retreiving this blob later.
    * @returns A promise for the success or failure of the put.
    */
  def put(key: String, contents: Buffer): js.Promise[Unit] = js.native
}
@JSImport("@pulumi/cloud/bucket", "Bucket")
@js.native
object Bucket extends TopLevel[BucketConstructor]
