package typings.atPulumiAws.typesOutputMod.elastictranscoder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipelineContentConfigPermission extends js.Object {
  /**
    * The permission that you want to give to the AWS user that you specified in `thumbnail_config_permissions.grantee`.
    */
  var accesses: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The AWS user or group that you want to have access to thumbnail files.
    */
  var grantee: js.UndefOr[String] = js.undefined
  /**
    * Specify the type of value that appears in the `thumbnail_config_permissions.grantee` object.
    */
  var granteeType: js.UndefOr[String] = js.undefined
}

object PipelineContentConfigPermission {
  @scala.inline
  def apply(accesses: js.Array[String] = null, grantee: String = null, granteeType: String = null): PipelineContentConfigPermission = {
    val __obj = js.Dynamic.literal()
    if (accesses != null) __obj.updateDynamic("accesses")(accesses)
    if (grantee != null) __obj.updateDynamic("grantee")(grantee)
    if (granteeType != null) __obj.updateDynamic("granteeType")(granteeType)
    __obj.asInstanceOf[PipelineContentConfigPermission]
  }
}

