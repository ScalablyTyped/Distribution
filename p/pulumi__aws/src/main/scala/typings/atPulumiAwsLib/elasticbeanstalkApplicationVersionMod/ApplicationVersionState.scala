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

