package typings.atPulumiAws.typesOutputMod.rds

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceS3Import extends js.Object {
  /**
    * The bucket name where your backup is stored
    */
  var bucketName: String
  /**
    * Can be blank, but is the path to your backup
    */
  var bucketPrefix: js.UndefOr[String] = js.undefined
  /**
    * Role applied to load the data.
    */
  var ingestionRole: String
  /**
    * Source engine for the backup
    */
  var sourceEngine: String
  /**
    * Version of the source engine used to make the backup
    */
  var sourceEngineVersion: String
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
    val __obj = js.Dynamic.literal(bucketName = bucketName, ingestionRole = ingestionRole, sourceEngine = sourceEngine, sourceEngineVersion = sourceEngineVersion)
    if (bucketPrefix != null) __obj.updateDynamic("bucketPrefix")(bucketPrefix)
    __obj.asInstanceOf[InstanceS3Import]
  }
}

