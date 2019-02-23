package typings
package atPulumiAwsLib.rdsOptionGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionGroupArgs extends js.Object {
  /**
    * Specifies the name of the engine that this option group should be associated with.
    */
  val engineName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Specifies the major version of the engine that this option group should be associated with.
    */
  val majorEngineVersion: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The Name of the setting.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`. Must be lowercase, to match as it is stored in AWS.
    */
  val namePrefix: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The description of the option group. Defaults to "Managed by Terraform".
    */
  val optionGroupDescription: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A list of Options to apply.
    */
  val options: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DbSecurityGroupMembershipsOptionName]
      ]
    ]
  ] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
}

