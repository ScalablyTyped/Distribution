package typings
package atPulumiAwsLib.appmeshVirtualRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualRouterState extends js.Object {
  /**
    * The ARN of the virtual router.
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The creation date of the virtual router.
    */
  val createdDate: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The last update date of the virtual router.
    */
  val lastUpdatedDate: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the service mesh in which to create the virtual router.
    */
  val meshName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name to use for the virtual router.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The virtual router specification to apply.
    */
  val spec: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ServiceNamesArray]] = js.undefined
}

