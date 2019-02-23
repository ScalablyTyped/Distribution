package typings
package atPulumiAwsLib.appmeshVirtualRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualRouterArgs extends js.Object {
  /**
    * The name of the service mesh in which to create the virtual router.
    */
  val meshName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The name to use for the virtual router.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The virtual router specification to apply.
    */
  val spec: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ServiceNamesArray]
}

