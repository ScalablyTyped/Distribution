package typings
package atPulumiAwsLib.redshiftParameterGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterGroupState extends js.Object {
  /**
    * The description of the Redshift parameter group. Defaults to "Managed by Terraform".
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The family of the Redshift parameter group.
    */
  val family: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the Redshift parameter.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A list of Redshift parameters to apply.
    */
  val parameters: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_NameValue]]]
  ] = js.undefined
}

