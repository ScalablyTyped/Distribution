package typings.pulumiAws.inputMod.rds

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceS3Import extends js.Object {
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

object InstanceS3Import {
  @scala.inline
  def apply(
    bucketName: Input[String],
    ingestionRole: Input[String],
    sourceEngine: Input[String],
    sourceEngineVersion: Input[String]
  ): InstanceS3Import = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], ingestionRole = ingestionRole.asInstanceOf[js.Any], sourceEngine = sourceEngine.asInstanceOf[js.Any], sourceEngineVersion = sourceEngineVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceS3Import]
  }
  @scala.inline
  implicit class InstanceS3ImportOps[Self <: InstanceS3Import] (val x: Self) extends AnyVal {
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
    def setBucketName(value: Input[String]): Self = this.set("bucketName", value.asInstanceOf[js.Any])
    @scala.inline
    def setIngestionRole(value: Input[String]): Self = this.set("ingestionRole", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceEngine(value: Input[String]): Self = this.set("sourceEngine", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceEngineVersion(value: Input[String]): Self = this.set("sourceEngineVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setBucketPrefix(value: Input[String]): Self = this.set("bucketPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucketPrefix: Self = this.set("bucketPrefix", js.undefined)
  }
  
}

