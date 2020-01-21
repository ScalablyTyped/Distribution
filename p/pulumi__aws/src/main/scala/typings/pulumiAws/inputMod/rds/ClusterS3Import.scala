package typings.pulumiAws.inputMod.rds

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterS3Import extends js.Object {
  /**
    * The bucket name where your backup is stored
    */
  var bucketName: Input[String] = js.native
  /**
    * Can be blank, but is the path to your backup
    */
  var bucketPrefix: js.UndefOr[Input[String]] = js.native
  /**
    * Role applied to load the data.
    */
  var ingestionRole: Input[String] = js.native
  /**
    * Source engine for the backup
    */
  var sourceEngine: Input[String] = js.native
  /**
    * Version of the source engine used to make the backup
    */
  var sourceEngineVersion: Input[String] = js.native
}

object ClusterS3Import {
  @scala.inline
  def apply(
    bucketName: Input[String],
    ingestionRole: Input[String],
    sourceEngine: Input[String],
    sourceEngineVersion: Input[String],
    bucketPrefix: Input[String] = null
  ): ClusterS3Import = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], ingestionRole = ingestionRole.asInstanceOf[js.Any], sourceEngine = sourceEngine.asInstanceOf[js.Any], sourceEngineVersion = sourceEngineVersion.asInstanceOf[js.Any])
    if (bucketPrefix != null) __obj.updateDynamic("bucketPrefix")(bucketPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterS3Import]
  }
}

