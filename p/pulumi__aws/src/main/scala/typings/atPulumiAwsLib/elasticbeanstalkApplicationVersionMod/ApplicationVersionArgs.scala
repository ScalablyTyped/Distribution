package typings
package atPulumiAwsLib.elasticbeanstalkApplicationVersionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationVersionArgs extends js.Object {
  /**
    * Name of the Beanstalk Application the version is associated with.
    */
  val application: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.elasticbeanstalkApplicationMod.Application]
  /**
    * S3 bucket that contains the Application Version source bundle.
    */
  val bucket: atPulumiPulumiLib.outputMod.Input[java.lang.String | atPulumiAwsLib.s3BucketMod.Bucket]
  /**
    * Short description of the Application Version.
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * On delete, force an Application Version to be deleted when it may be in use
    * by multiple Elastic Beanstalk Environments.
    */
  val forceDelete: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * S3 object that is the Application Version source bundle.
    */
  val key: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * A unique name for the this Application Version.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object ApplicationVersionArgs {
  @scala.inline
  def apply(
    application: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.elasticbeanstalkApplicationMod.Application],
    bucket: atPulumiPulumiLib.outputMod.Input[java.lang.String | atPulumiAwsLib.s3BucketMod.Bucket],
    key: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    description: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    forceDelete: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): ApplicationVersionArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application")(application.asInstanceOf[js.Any])
    __obj.updateDynamic("bucket")(bucket.asInstanceOf[js.Any])
    __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (forceDelete != null) __obj.updateDynamic("forceDelete")(forceDelete.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationVersionArgs]
  }
}

