package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.efs.GetFileSystemLifecyclePolicy
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getFileSystemMod {
  
  @JSImport("@pulumi/aws/efs/getFileSystem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFileSystem(): js.Promise[GetFileSystemResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileSystem")().asInstanceOf[js.Promise[GetFileSystemResult]]
  inline def getFileSystem(args: Unit, opts: InvokeOptions): js.Promise[GetFileSystemResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFileSystem")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetFileSystemResult]]
  inline def getFileSystem(args: GetFileSystemArgs): js.Promise[GetFileSystemResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileSystem")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetFileSystemResult]]
  inline def getFileSystem(args: GetFileSystemArgs, opts: InvokeOptions): js.Promise[GetFileSystemResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFileSystem")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetFileSystemResult]]
  
  trait GetFileSystemArgs extends StObject {
    
    /**
      * Restricts the list to the file system with this creation token.
      */
    val creationToken: js.UndefOr[String] = js.undefined
    
    /**
      * The ID that identifies the file system (e.g. fs-ccfc0d65).
      */
    val fileSystemId: js.UndefOr[String] = js.undefined
    
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object GetFileSystemArgs {
    
    inline def apply(): GetFileSystemArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetFileSystemArgs]
    }
    
    extension [Self <: GetFileSystemArgs](x: Self) {
      
      inline def setCreationToken(value: String): Self = StObject.set(x, "creationToken", value.asInstanceOf[js.Any])
      
      inline def setCreationTokenUndefined: Self = StObject.set(x, "creationToken", js.undefined)
      
      inline def setFileSystemId(value: String): Self = StObject.set(x, "fileSystemId", value.asInstanceOf[js.Any])
      
      inline def setFileSystemIdUndefined: Self = StObject.set(x, "fileSystemId", js.undefined)
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait GetFileSystemResult extends StObject {
    
    /**
      * Amazon Resource Name of the file system.
      */
    val arn: String
    
    val creationToken: String
    
    /**
      * The DNS name for the filesystem per [documented convention](http://docs.aws.amazon.com/efs/latest/ug/mounting-fs-mount-cmd-dns-name.html).
      */
    val dnsName: String
    
    /**
      * Whether EFS is encrypted.
      */
    val encrypted: Boolean
    
    val fileSystemId: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * The ARN for the KMS encryption key.
      */
    val kmsKeyId: String
    
    /**
      * A file system [lifecycle policy](https://docs.aws.amazon.com/efs/latest/ug/API_LifecyclePolicy.html) object.
      */
    val lifecyclePolicy: GetFileSystemLifecyclePolicy
    
    /**
      * The file system performance mode.
      */
    val performanceMode: String
    
    /**
      * The throughput, measured in MiB/s, that you want to provision for the file system.
      * * `tags` -A map of tags to assign to the file system.
      */
    val provisionedThroughputInMibps: Double
    
    /**
      * The current byte count used by the file system.
      */
    val sizeInBytes: Double
    
    val tags: StringDictionary[String]
    
    /**
      * Throughput mode for the file system.
      */
    val throughputMode: String
  }
  object GetFileSystemResult {
    
    inline def apply(
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
    
    extension [Self <: GetFileSystemResult](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setCreationToken(value: String): Self = StObject.set(x, "creationToken", value.asInstanceOf[js.Any])
      
      inline def setDnsName(value: String): Self = StObject.set(x, "dnsName", value.asInstanceOf[js.Any])
      
      inline def setEncrypted(value: Boolean): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
      
      inline def setFileSystemId(value: String): Self = StObject.set(x, "fileSystemId", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setKmsKeyId(value: String): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      inline def setLifecyclePolicy(value: GetFileSystemLifecyclePolicy): Self = StObject.set(x, "lifecyclePolicy", value.asInstanceOf[js.Any])
      
      inline def setPerformanceMode(value: String): Self = StObject.set(x, "performanceMode", value.asInstanceOf[js.Any])
      
      inline def setProvisionedThroughputInMibps(value: Double): Self = StObject.set(x, "provisionedThroughputInMibps", value.asInstanceOf[js.Any])
      
      inline def setSizeInBytes(value: Double): Self = StObject.set(x, "sizeInBytes", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setThroughputMode(value: String): Self = StObject.set(x, "throughputMode", value.asInstanceOf[js.Any])
    }
  }
}
