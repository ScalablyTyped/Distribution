package typings.atPulumiAws.efsGetFileSystemMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The ARN for the KMS encryption key.
    */
  val kmsKeyId: String = js.native
  /**
    * The PerformanceMode of the file system.
    */
  val performanceMode: String = js.native
  /**
    * The list of tags assigned to the file system.
    */
  val tags: StringDictionary[js.Any] = js.native
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
    performanceMode: String,
    tags: StringDictionary[js.Any]
  ): GetFileSystemResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], creationToken = creationToken.asInstanceOf[js.Any], dnsName = dnsName.asInstanceOf[js.Any], encrypted = encrypted.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any], performanceMode = performanceMode.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetFileSystemResult]
  }
}

