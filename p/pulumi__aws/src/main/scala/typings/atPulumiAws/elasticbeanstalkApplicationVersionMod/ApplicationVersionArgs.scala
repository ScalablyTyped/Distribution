package typings.atPulumiAws.elasticbeanstalkApplicationVersionMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.elasticbeanstalkApplicationMod.Application
import typings.atPulumiAws.s3BucketMod.Bucket
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationVersionArgs extends js.Object {
  /**
    * Name of the Beanstalk Application the version is associated with.
    */
  val application: Input[Application]
  /**
    * S3 bucket that contains the Application Version source bundle.
    */
  val bucket: Input[String | Bucket]
  /**
    * Short description of the Application Version.
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * On delete, force an Application Version to be deleted when it may be in use
    * by multiple Elastic Beanstalk Environments.
    */
  val forceDelete: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * S3 object that is the Application Version source bundle.
    */
  val key: Input[String]
  /**
    * A unique name for the this Application Version.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Key-value mapping of tags for the Elastic Beanstalk Application Version.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object ApplicationVersionArgs {
  @scala.inline
  def apply(
    application: Input[Application],
    bucket: Input[String | Bucket],
    key: Input[String],
    description: Input[String] = null,
    forceDelete: Input[Boolean] = null,
    name: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): ApplicationVersionArgs = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], bucket = bucket.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (forceDelete != null) __obj.updateDynamic("forceDelete")(forceDelete.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationVersionArgs]
  }
}

