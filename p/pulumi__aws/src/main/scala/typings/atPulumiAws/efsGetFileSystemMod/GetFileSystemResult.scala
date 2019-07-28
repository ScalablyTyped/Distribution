package typings.atPulumiAws.efsGetFileSystemMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFileSystemResult extends js.Object {
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
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * The ARN for the KMS encryption key.
    */
  val kmsKeyId: String
  /**
    * The PerformanceMode of the file system.
    */
  val performanceMode: String
  /**
    * The list of tags assigned to the file system.
    */
  val tags: StringDictionary[js.Any]
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
    val __obj = js.Dynamic.literal(arn = arn, creationToken = creationToken, dnsName = dnsName, encrypted = encrypted, fileSystemId = fileSystemId, id = id, kmsKeyId = kmsKeyId, performanceMode = performanceMode, tags = tags)
  
    __obj.asInstanceOf[GetFileSystemResult]
  }
}

