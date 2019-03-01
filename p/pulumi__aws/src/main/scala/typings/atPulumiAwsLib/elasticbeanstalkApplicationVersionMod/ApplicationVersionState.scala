package typings
package atPulumiAwsLib.elasticbeanstalkApplicationVersionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationVersionState extends js.Object {
  /**
    * Name of the Beanstalk Application the version is associated with.
    */
  val application: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.elasticbeanstalkApplicationMod.Application]
  ] = js.undefined
  /**
    * S3 bucket that contains the Application Version source bundle.
    */
  val bucket: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[java.lang.String | atPulumiAwsLib.s3BucketMod.Bucket]
  ] = js.undefined
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
  val key: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A unique name for the this Application Version.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object ApplicationVersionState {
  @scala.inline
  def apply(
    application: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.elasticbeanstalkApplicationMod.Application] = null,
    bucket: atPulumiPulumiLib.outputMod.Input[java.lang.String | atPulumiAwsLib.s3BucketMod.Bucket] = null,
    description: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    forceDelete: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    key: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): ApplicationVersionState = {
    val __obj = js.Dynamic.literal()
    if (application != null) __obj.updateDynamic("application")(application.asInstanceOf[js.Any])
    if (bucket != null) __obj.updateDynamic("bucket")(bucket.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (forceDelete != null) __obj.updateDynamic("forceDelete")(forceDelete.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationVersionState]
  }
}

