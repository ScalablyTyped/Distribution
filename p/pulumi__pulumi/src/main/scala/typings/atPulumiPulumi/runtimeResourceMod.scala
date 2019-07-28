package typings.atPulumiPulumi

import typings.atPulumiPulumi.outputMod.Inputs
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.queryableMod.ResolvedResource
import typings.atPulumiPulumi.resourceMod.Resource
import typings.atPulumiPulumi.resourceMod.ResourceOptions
import typings.atPulumiQuery.interfacesMod.AsyncQueryable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/runtime/resource", JSImport.Namespace)
@js.native
object runtimeResourceMod extends js.Object {
  def listResourceOutputs[U /* <: Resource */](): AsyncQueryable[ResolvedResource[U]] = js.native
  def listResourceOutputs[U /* <: Resource */](typeFilter: js.Function1[/* o */ js.Any, /* is U */ Boolean]): AsyncQueryable[ResolvedResource[U]] = js.native
  def listResourceOutputs[U /* <: Resource */](typeFilter: js.Function1[/* o */ js.Any, /* is U */ Boolean], stackName: String): AsyncQueryable[ResolvedResource[U]] = js.native
  def readResource(res: Resource, t: String, name: String, props: Inputs, opts: ResourceOptions): Unit = js.native
  def registerResource(res: Resource, t: String, name: String, custom: Boolean, props: Inputs, opts: ResourceOptions): Unit = js.native
  def registerResourceOutputs(res: Resource, outputs: js.Promise[Inputs]): Unit = js.native
  def registerResourceOutputs(res: Resource, outputs: Inputs): Unit = js.native
  def registerResourceOutputs(res: Resource, outputs: Output[Inputs]): Unit = js.native
}

