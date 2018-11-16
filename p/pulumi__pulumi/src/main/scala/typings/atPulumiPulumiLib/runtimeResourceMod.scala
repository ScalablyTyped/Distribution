package typings
package atPulumiPulumiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/runtime/resource", JSImport.Namespace)
@js.native
object runtimeResourceMod extends js.Object {
  def readResource(
    res: atPulumiPulumiLib.resourceMod.Resource,
    t: java.lang.String,
    name: java.lang.String,
    props: atPulumiPulumiLib.resourceMod.Inputs,
    opts: atPulumiPulumiLib.resourceMod.ResourceOptions
  ): scala.Unit = js.native
  def registerResource(
    res: atPulumiPulumiLib.resourceMod.Resource,
    t: java.lang.String,
    name: java.lang.String,
    custom: scala.Boolean,
    props: atPulumiPulumiLib.resourceMod.Inputs,
    opts: atPulumiPulumiLib.resourceMod.ResourceOptions
  ): scala.Unit = js.native
  def registerResourceOutputs(res: atPulumiPulumiLib.resourceMod.Resource, outputs: atPulumiPulumiLib.resourceMod.Inputs): scala.Unit = js.native
  def registerResourceOutputs(
    res: atPulumiPulumiLib.resourceMod.Resource,
    outputs: atPulumiPulumiLib.resourceMod.Output[atPulumiPulumiLib.resourceMod.Inputs]
  ): scala.Unit = js.native
  def registerResourceOutputs(
    res: atPulumiPulumiLib.resourceMod.Resource,
    outputs: stdLib.Promise[atPulumiPulumiLib.resourceMod.Inputs]
  ): scala.Unit = js.native
}

