package typings.atPulumiAws.elasticbeanstalkApplicationVersionMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.elasticbeanstalkApplicationMod.Application
import typings.atPulumiAws.s3BucketMod.Bucket
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationVersionState extends js.Object {
  /**
    * Name of the Beanstalk Application the version is associated with.
    */
  val application: js.UndefOr[Input[Application]] = js.native
  /**
    * The ARN assigned by AWS for this Elastic Beanstalk Application.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * S3 bucket that contains the Application Version source bundle.
    */
  val bucket: js.UndefOr[Input[String | Bucket]] = js.native
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
  val key: js.UndefOr[Input[String]] = js.native
  /**
    * A unique name for the this Application Version.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value mapping of tags for the Elastic Beanstalk Application Version.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object ApplicationVersionState {
  @scala.inline
  def apply(
    application: Input[Application] = null,
    arn: Input[String] = null,
    bucket: Input[String | Bucket] = null,
    description: Input[String] = null,
    forceDelete: Input[Boolean] = null,
    key: Input[String] = null,
    name: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): ApplicationVersionState = {
    val __obj = js.Dynamic.literal()
    if (application != null) __obj.updateDynamic("application")(application.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (bucket != null) __obj.updateDynamic("bucket")(bucket.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (forceDelete != null) __obj.updateDynamic("forceDelete")(forceDelete.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationVersionState]
  }
}

