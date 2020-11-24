package typings.pulumiAws.getFileSystemMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.efs.GetFileSystemLifecyclePolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFileSystemResult extends js.Object {
  
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
  implicit class GetFileSystemResultOps[Self <: GetFileSystemResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationToken(value: String): Self = this.set("creationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsName(value: String): Self = this.set("dnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncrypted(value: Boolean): Self = this.set("encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSystemId(value: String): Self = this.set("fileSystemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyId(value: String): Self = this.set("kmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecyclePolicy(value: GetFileSystemLifecyclePolicy): Self = this.set("lifecyclePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformanceMode(value: String): Self = this.set("performanceMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedThroughputInMibps(value: Double): Self = this.set("provisionedThroughputInMibps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeInBytes(value: Double): Self = this.set("sizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThroughputMode(value: String): Self = this.set("throughputMode", value.asInstanceOf[js.Any])
  }
}
