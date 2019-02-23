package typings
package atPulumiAwsLib.elasticbeanstalkApplicationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationArgs extends js.Object {
  val appversionLifecycle: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DeleteSourceFromS3MaxAgeInDays]
  ] = js.undefined
  /**
    * Short description of the application
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the application, must be unique within your account
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

