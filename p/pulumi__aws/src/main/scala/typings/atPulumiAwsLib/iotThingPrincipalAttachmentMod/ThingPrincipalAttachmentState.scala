package typings
package atPulumiAwsLib.iotThingPrincipalAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThingPrincipalAttachmentState extends js.Object {
  /**
    * The AWS IoT Certificate ARN or Amazon Cognito Identity ID.
    */
  val principal: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.arnMod.ARN]] = js.undefined
  /**
    * The name of the thing.
    */
  val thing: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

