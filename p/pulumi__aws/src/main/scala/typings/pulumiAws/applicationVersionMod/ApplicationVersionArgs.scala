package typings.pulumiAws.applicationVersionMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.bucketMod.Bucket
import typings.pulumiAws.elasticbeanstalkApplicationMod.Application
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationVersionArgs extends js.Object {
  /**
    * Name of the Beanstalk Application the version is associated with.
    */
  val application: Input[String | Application] = js.native
  /**
    * S3 bucket that contains the Application Version source bundle.
    */
  val bucket: Input[String | Bucket] = js.native
  /**
    * Short description of the Application Version.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * On delete, force an Application Version to be deleted when it may be in use
    * by multiple Elastic Beanstalk Environments.
    */
  val forceDelete: js.UndefOr[Input[Boolean]] = js.native
  /**
    * S3 object that is the Application Version source bundle.
    */
  val key: Input[String] = js.native
  /**
    * A unique name for the this Application Version.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value mapping of tags for the Elastic Beanstalk Application Version.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object ApplicationVersionArgs {
  @scala.inline
  def apply(
    application: Input[String | Application],
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

