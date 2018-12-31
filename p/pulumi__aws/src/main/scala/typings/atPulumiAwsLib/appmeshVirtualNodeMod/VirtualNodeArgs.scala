package typings
package atPulumiAwsLib.appmeshVirtualNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualNodeArgs extends js.Object {
  /**
    * The name of the service mesh in which to create the virtual node.
    */
  val meshName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The name to use for the virtual node.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The virtual node specification to apply.
    */
  val spec: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_Listener]
}

