package typings
package atPulumiPulumiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/runtime/resource", JSImport.Namespace)
@js.native
object runtimeResourceMod extends js.Object {
  def listResourceOutputs[U /* <: atPulumiPulumiLib.resourceMod.Resource */](): atPulumiQueryLib.interfacesMod.AsyncQueryable[atPulumiPulumiLib.queryableMod.ResolvedResource[U]] = js.native
  def listResourceOutputs[U /* <: atPulumiPulumiLib.resourceMod.Resource */](typeFilter: js.Function1[/* o */ js.Any, /* is U */ scala.Boolean]): atPulumiQueryLib.interfacesMod.AsyncQueryable[atPulumiPulumiLib.queryableMod.ResolvedResource[U]] = js.native
  def listResourceOutputs[U /* <: atPulumiPulumiLib.resourceMod.Resource */](typeFilter: js.Function1[/* o */ js.Any, /* is U */ scala.Boolean], stackName: java.lang.String): atPulumiQueryLib.interfacesMod.AsyncQueryable[atPulumiPulumiLib.queryableMod.ResolvedResource[U]] = js.native
  def readResource(
    res: atPulumiPulumiLib.resourceMod.Resource,
    t: java.lang.String,
    name: java.lang.String,
    props: atPulumiPulumiLib.outputMod.Inputs,
    opts: atPulumiPulumiLib.resourceMod.ResourceOptions
  ): scala.Unit = js.native
  def registerResource(
    res: atPulumiPulumiLib.resourceMod.Resource,
    t: java.lang.String,
    name: java.lang.String,
    custom: scala.Boolean,
    props: atPulumiPulumiLib.outputMod.Inputs,
    opts: atPulumiPulumiLib.resourceMod.ResourceOptions
  ): scala.Unit = js.native
  def registerResourceOutputs(res: atPulumiPulumiLib.resourceMod.Resource, outputs: atPulumiPulumiLib.outputMod.Inputs): scala.Unit = js.native
  def registerResourceOutputs(
    res: atPulumiPulumiLib.resourceMod.Resource,
    outputs: atPulumiPulumiLib.outputMod.Output[atPulumiPulumiLib.outputMod.Inputs]
  ): scala.Unit = js.native
  def registerResourceOutputs(
    res: atPulumiPulumiLib.resourceMod.Resource,
    outputs: js.Promise[atPulumiPulumiLib.outputMod.Inputs]
  ): scala.Unit = js.native
}

