package typings
package atPulumiAwsLib.ramPrincipalAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrincipalAssociationState extends js.Object {
  /**
    * The principal to associate with the resource share. Possible values are an AWS account ID, an AWS Organizations Organization ID, or an AWS Organizations Organization Unit ID.
    */
  val principal: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the resource share.
    */
  val resourceShareArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

