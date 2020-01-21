package typings.pulumiAws.outputMod.rds

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceS3Import extends js.Object {
  /**
    * The bucket name where your backup is stored
    */
  var bucketName: String = js.native
  /**
    * Can be blank, but is the path to your backup
    */
  var bucketPrefix: js.UndefOr[String] = js.native
  /**
    * Role applied to load the data.
    */
  var ingestionRole: String = js.native
  /**
    * Source engine for the backup
    */
  var sourceEngine: String = js.native
  /**
    * Version of the source engine used to make the backup
    */
  var sourceEngineVersion: String = js.native
}

object InstanceS3Import {
  @scala.inline
  def apply(
    bucketName: String,
    ingestionRole: String,
    sourceEngine: String,
    sourceEngineVersion: String,
    bucketPrefix: String = null
  ): InstanceS3Import = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], ingestionRole = ingestionRole.asInstanceOf[js.Any], sourceEngine = sourceEngine.asInstanceOf[js.Any], sourceEngineVersion = sourceEngineVersion.asInstanceOf[js.Any])
    if (bucketPrefix != null) __obj.updateDynamic("bucketPrefix")(bucketPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceS3Import]
  }
}

