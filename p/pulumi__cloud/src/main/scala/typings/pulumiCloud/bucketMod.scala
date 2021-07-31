package typings.pulumiCloud

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.node.Buffer
import typings.pulumiPulumi.resourceMod.ResourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bucketMod {
  
  @JSImport("@pulumi/cloud/bucket", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Bucket extends StObject {
    
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
  def Bucket: BucketConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/cloud/bucket", "Bucket")
  @js.native
  class BucketCls protected ()
    extends StObject
       with Bucket {
    /**
      * Creates a new Bucket.
      *
      * @param name A unique name for the bucket.
      * @param opts A bag of options that controls how this resource behaves.
      */
    def this(name: String) = this()
    def this(name: String, opts: ResourceOptions) = this()
  }
  
  @scala.inline
  def Bucket_=(x: BucketConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Bucket")(x.asInstanceOf[js.Any])
  
  @js.native
  trait BucketConstructor
    extends StObject
       with /**
    * Creates a new Bucket.
    *
    * @param name A unique name for the bucket.
    * @param opts A bag of options that controls how this resource behaves.
    */
  Instantiable1[/* name */ String, Bucket]
       with Instantiable2[/* name */ String, /* opts */ ResourceOptions, Bucket]
  
  trait BucketFilter extends StObject {
    
    var keyPrefix: js.UndefOr[String] = js.undefined
    
    var keySuffix: js.UndefOr[String] = js.undefined
  }
  object BucketFilter {
    
    @scala.inline
    def apply(): BucketFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BucketFilter]
    }
    
    @scala.inline
    implicit class BucketFilterMutableBuilder[Self <: BucketFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeyPrefix(value: String): Self = StObject.set(x, "keyPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyPrefixUndefined: Self = StObject.set(x, "keyPrefix", js.undefined)
      
      @scala.inline
      def setKeySuffix(value: String): Self = StObject.set(x, "keySuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeySuffixUndefined: Self = StObject.set(x, "keySuffix", js.undefined)
    }
  }
  
  type BucketHandler = js.Function1[/* args */ BucketHandlerArgs, js.Promise[Unit]]
  
  trait BucketHandlerArgs extends StObject {
    
    /**
      * The time (in ISO-8601 format) when the [put] or [delete] was completed.
      */
    var eventTime: String
    
    /**
      * The key that was updated or deleted by the operation.
      */
    var key: String
    
    /**
      * The size, in bytes, of the blob that was [put].
      */
    var size: Double
  }
  object BucketHandlerArgs {
    
    @scala.inline
    def apply(eventTime: String, key: String, size: Double): BucketHandlerArgs = {
      val __obj = js.Dynamic.literal(eventTime = eventTime.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[BucketHandlerArgs]
    }
    
    @scala.inline
    implicit class BucketHandlerArgsMutableBuilder[Self <: BucketHandlerArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEventTime(value: String): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
