package typings
package atPulumiAwsLib.iotThingPrincipalAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThingPrincipalAttachmentArgs extends js.Object {
  /**
    * The AWS IoT Certificate ARN or Amazon Cognito Identity ID.
    */
  val principal: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.arnMod.ARN]
  /**
    * The name of the thing.
    */
  val thing: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

