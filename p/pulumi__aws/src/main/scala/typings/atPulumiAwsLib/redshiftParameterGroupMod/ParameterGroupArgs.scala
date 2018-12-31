package typings
package atPulumiAwsLib.redshiftParameterGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterGroupArgs extends js.Object {
  /**
    * The description of the Redshift parameter group. Defaults to "Managed by Terraform".
    */
  val description: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The family of the Redshift parameter group.
    */
  val family: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The name of the Redshift parameter.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A list of Redshift parameters to apply.
    */
  val parameters: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_ValueNameInput]]
    ]
  ] = js.undefined
}

