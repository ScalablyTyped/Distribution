package typings.pulumiPulumi

import typings.pulumiPulumi.outputMod.Inputs
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.queryableMod.ResolvedResource
import typings.pulumiPulumi.resourceMod.Resource
import typings.pulumiPulumi.resourceMod.ResourceOptions
import typings.pulumiPulumi.resourceMod.URN
import typings.pulumiQuery.interfacesMod.AsyncQueryable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runtimeResourceMod {
  
  @JSImport("@pulumi/pulumi/runtime/resource", "listResourceOutputs")
  @js.native
  def listResourceOutputs[U /* <: Resource */](): AsyncQueryable[ResolvedResource[U]] = js.native
  @JSImport("@pulumi/pulumi/runtime/resource", "listResourceOutputs")
  @js.native
  def listResourceOutputs[U /* <: Resource */](typeFilter: js.UndefOr[scala.Nothing], stackName: String): AsyncQueryable[ResolvedResource[U]] = js.native
  @JSImport("@pulumi/pulumi/runtime/resource", "listResourceOutputs")
  @js.native
  def listResourceOutputs[U /* <: Resource */](typeFilter: js.Function1[/* o */ js.Any, /* is U */ Boolean]): AsyncQueryable[ResolvedResource[U]] = js.native
  @JSImport("@pulumi/pulumi/runtime/resource", "listResourceOutputs")
  @js.native
  def listResourceOutputs[U /* <: Resource */](typeFilter: js.Function1[/* o */ js.Any, /* is U */ Boolean], stackName: String): AsyncQueryable[ResolvedResource[U]] = js.native
  
  @JSImport("@pulumi/pulumi/runtime/resource", "readResource")
  @js.native
  def readResource(res: Resource, t: String, name: String, props: Inputs, opts: ResourceOptions): Unit = js.native
  
  @JSImport("@pulumi/pulumi/runtime/resource", "registerResource")
  @js.native
  def registerResource(
    res: Resource,
    t: String,
    name: String,
    custom: Boolean,
    remote: Boolean,
    newDependency: js.Function1[/* urn */ URN, Resource],
    props: Inputs,
    opts: ResourceOptions
  ): Unit = js.native
  
  @JSImport("@pulumi/pulumi/runtime/resource", "registerResourceOutputs")
  @js.native
  def registerResourceOutputs(res: Resource, outputs: js.Promise[Inputs]): Unit = js.native
  @JSImport("@pulumi/pulumi/runtime/resource", "registerResourceOutputs")
  @js.native
  def registerResourceOutputs(res: Resource, outputs: Inputs): Unit = js.native
  @JSImport("@pulumi/pulumi/runtime/resource", "registerResourceOutputs")
  @js.native
  def registerResourceOutputs(res: Resource, outputs: Output_[Inputs]): Unit = js.native
}
