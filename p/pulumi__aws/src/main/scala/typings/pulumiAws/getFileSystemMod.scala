package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.efs.GetFileSystemLifecyclePolicy
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getFileSystemMod {
  
  @JSImport("@pulumi/aws/efs/getFileSystem", "getFileSystem")
  @js.native
  def getFileSystem(): js.Promise[GetFileSystemResult] = js.native
  @JSImport("@pulumi/aws/efs/getFileSystem", "getFileSystem")
  @js.native
  def getFileSystem(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetFileSystemResult] = js.native
  @JSImport("@pulumi/aws/efs/getFileSystem", "getFileSystem")
  @js.native
  def getFileSystem(args: GetFileSystemArgs): js.Promise[GetFileSystemResult] = js.native
  @JSImport("@pulumi/aws/efs/getFileSystem", "getFileSystem")
  @js.native
  def getFileSystem(args: GetFileSystemArgs, opts: InvokeOptions): js.Promise[GetFileSystemResult] = js.native
  
  @js.native
  trait GetFileSystemArgs extends StObject {
    
    /**
      * Restricts the list to the file system with this creation token.
      */
    val creationToken: js.UndefOr[String] = js.native
    
    /**
      * The ID that identifies the file system (e.g. fs-ccfc0d65).
      */
    val fileSystemId: js.UndefOr[String] = js.native
    
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetFileSystemArgs {
    
    @scala.inline
    def apply(): GetFileSystemArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetFileSystemArgs]
    }
    
    @scala.inline
    implicit class GetFileSystemArgsMutableBuilder[Self <: GetFileSystemArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreationToken(value: String): Self = StObject.set(x, "creationToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationTokenUndefined: Self = StObject.set(x, "creationToken", js.undefined)
      
      @scala.inline
      def setFileSystemId(value: String): Self = StObject.set(x, "fileSystemId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileSystemIdUndefined: Self = StObject.set(x, "fileSystemId", js.undefined)
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait GetFileSystemResult extends StObject {
    
    /**
      * Amazon Resource Name of the file system.
      */
    val arn: String = js.native
    
    val creationToken: String = js.native
    
    /**
      * The DNS name for the filesystem per [documented convention](http://docs.aws.amazon.com/efs/latest/ug/mounting-fs-mount-cmd-dns-name.html).
      */
    val dnsName: String = js.native
    
    /**
      * Whether EFS is encrypted.
      */
    val encrypted: Boolean = js.native
    
    val fileSystemId: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * The ARN for the KMS encryption key.
      */
    val kmsKeyId: String = js.native
    
    /**
      * A file system [lifecycle policy](https://docs.aws.amazon.com/efs/latest/ug/API_LifecyclePolicy.html) object.
      */
    val lifecyclePolicy: GetFileSystemLifecyclePolicy = js.native
    
    /**
      * The file system performance mode.
      */
    val performanceMode: String = js.native
    
    /**
      * The throughput, measured in MiB/s, that you want to provision for the file system.
      * * `tags` -A map of tags to assign to the file system.
      */
    val provisionedThroughputInMibps: Double = js.native
    
    /**
      * The current byte count used by the file system.
      */
    val sizeInBytes: Double = js.native
    
    val tags: StringDictionary[String] = js.native
    
    /**
      * Throughput mode for the file system.
      */
    val throughputMode: String = js.native
  }
  object GetFileSystemResult {
    
    @scala.inline
    def apply(
      arn: String,
      creationToken: String,
      dnsName: String,
      encrypted: Boolean,
      fileSystemId: String,
      id: String,
      kmsKeyId: String,
      lifecyclePolicy: GetFileSystemLifecyclePolicy,
      performanceMode: String,
      provisionedThroughputInMibps: Double,
      sizeInBytes: Double,
      tags: StringDictionary[String],
      throughputMode: String
    ): GetFileSystemResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], creationToken = creationToken.asInstanceOf[js.Any], dnsName = dnsName.asInstanceOf[js.Any], encrypted = encrypted.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any], lifecyclePolicy = lifecyclePolicy.asInstanceOf[js.Any], performanceMode = performanceMode.asInstanceOf[js.Any], provisionedThroughputInMibps = provisionedThroughputInMibps.asInstanceOf[js.Any], sizeInBytes = sizeInBytes.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], throughputMode = throughputMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetFileSystemResult]
    }
    
    @scala.inline
    implicit class GetFileSystemResultMutableBuilder[Self <: GetFileSystemResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationToken(value: String): Self = StObject.set(x, "creationToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDnsName(value: String): Self = StObject.set(x, "dnsName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncrypted(value: Boolean): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileSystemId(value: String): Self = StObject.set(x, "fileSystemId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyId(value: String): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLifecyclePolicy(value: GetFileSystemLifecyclePolicy): Self = StObject.set(x, "lifecyclePolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPerformanceMode(value: String): Self = StObject.set(x, "performanceMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedThroughputInMibps(value: Double): Self = StObject.set(x, "provisionedThroughputInMibps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeInBytes(value: Double): Self = StObject.set(x, "sizeInBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThroughputMode(value: String): Self = StObject.set(x, "throughputMode", value.asInstanceOf[js.Any])
    }
  }
}
