package typings
package atPulumiAwsLib.efsGetFileSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFileSystemResult extends js.Object {
  /**
    * Amazon Resource Name of the file system.
    */
  val arn: java.lang.String
  val creationToken: java.lang.String
  /**
    * The DNS name for the filesystem per [documented convention](http://docs.aws.amazon.com/efs/latest/ug/mounting-fs-mount-cmd-dns-name.html).
    */
  val dnsName: java.lang.String
  /**
    * Whether EFS is encrypted.
    */
  val encrypted: scala.Boolean
  val fileSystemId: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * The ARN for the KMS encryption key.
    */
  val kmsKeyId: java.lang.String
  /**
    * The PerformanceMode of the file system.
    */
  val performanceMode: java.lang.String
  /**
    * The list of tags assigned to the file system.
    */
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
}

