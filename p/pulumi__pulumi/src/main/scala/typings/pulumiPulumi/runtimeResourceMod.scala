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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runtimeResourceMod {
  
  @JSImport("@pulumi/pulumi/runtime/resource", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def listResourceOutputs[U /* <: Resource */](): AsyncQueryable[ResolvedResource[U]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listResourceOutputs")().asInstanceOf[AsyncQueryable[ResolvedResource[U]]]
  inline def listResourceOutputs[U /* <: Resource */](typeFilter: js.Function1[/* o */ js.Any, /* is U */ Boolean]): AsyncQueryable[ResolvedResource[U]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listResourceOutputs")(typeFilter.asInstanceOf[js.Any]).asInstanceOf[AsyncQueryable[ResolvedResource[U]]]
  inline def listResourceOutputs[U /* <: Resource */](typeFilter: js.Function1[/* o */ js.Any, /* is U */ Boolean], stackName: String): AsyncQueryable[ResolvedResource[U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("listResourceOutputs")(typeFilter.asInstanceOf[js.Any], stackName.asInstanceOf[js.Any])).asInstanceOf[AsyncQueryable[ResolvedResource[U]]]
  inline def listResourceOutputs[U /* <: Resource */](typeFilter: Unit, stackName: String): AsyncQueryable[ResolvedResource[U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("listResourceOutputs")(typeFilter.asInstanceOf[js.Any], stackName.asInstanceOf[js.Any])).asInstanceOf[AsyncQueryable[ResolvedResource[U]]]
  
  inline def readResource(res: Resource, t: String, name: String, props: Inputs, opts: ResourceOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readResource")(res.asInstanceOf[js.Any], t.asInstanceOf[js.Any], name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerResource(
    res: Resource,
    t: String,
    name: String,
    custom: Boolean,
    remote: Boolean,
    newDependency: js.Function1[/* urn */ URN, Resource],
    props: Inputs,
    opts: ResourceOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerResource")(res.asInstanceOf[js.Any], t.asInstanceOf[js.Any], name.asInstanceOf[js.Any], custom.asInstanceOf[js.Any], remote.asInstanceOf[js.Any], newDependency.asInstanceOf[js.Any], props.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerResourceOutputs(res: Resource, outputs: js.Promise[Inputs]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerResourceOutputs")(res.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def registerResourceOutputs(res: Resource, outputs: Inputs): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerResourceOutputs")(res.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def registerResourceOutputs(res: Resource, outputs: Output_[Inputs]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerResourceOutputs")(res.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
