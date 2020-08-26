package typings.pulumiAws.getVaultMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVaultResult extends js.Object {
  /**
    * The ARN of the vault.
    */
  val arn: String = js.native
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The server-side encryption key that is used to protect your backups.
    */
  val kmsKeyArn: String = js.native
  val name: String = js.native
  /**
    * The number of recovery points that are stored in a backup vault.
    */
  val recoveryPoints: Double = js.native
  /**
    * Metadata that you can assign to help organize the resources that you create.
    */
  val tags: StringDictionary[String] = js.native
}

object GetVaultResult {
  @scala.inline
  def apply(
    arn: String,
    id: String,
    kmsKeyArn: String,
    name: String,
    recoveryPoints: Double,
    tags: StringDictionary[String]
  ): GetVaultResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kmsKeyArn = kmsKeyArn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], recoveryPoints = recoveryPoints.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVaultResult]
  }
  @scala.inline
  implicit class GetVaultResultOps[Self <: GetVaultResult] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setKmsKeyArn(value: String): Self = this.set("kmsKeyArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecoveryPoints(value: Double): Self = this.set("recoveryPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
  }
  
}

