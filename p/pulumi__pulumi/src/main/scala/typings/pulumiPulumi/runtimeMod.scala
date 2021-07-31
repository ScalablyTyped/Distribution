package typings.pulumiPulumi

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.assetMod.Archive
import typings.pulumiPulumi.assetMod.Asset
import typings.pulumiPulumi.codePathsMod.CodePathOptions
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.mocksMod.Mocks
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Inputs
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.queryableMod.ResolvedResource
import typings.pulumiPulumi.resourceMod.ComponentResource
import typings.pulumiPulumi.resourceMod.Resource
import typings.pulumiPulumi.resourceMod.ResourceOptions
import typings.pulumiPulumi.resourceMod.ResourceTransformation
import typings.pulumiPulumi.resourceMod.URN
import typings.pulumiPulumi.rpcMod.OutputResolvers
import typings.pulumiPulumi.rpcMod.ResourceModule
import typings.pulumiPulumi.rpcMod.ResourcePackage
import typings.pulumiPulumi.serializeClosureMod.SerializeFunctionArgs
import typings.pulumiPulumi.serializeClosureMod.SerializedFunction
import typings.pulumiPulumi.stackMod.Stack
import typings.pulumiQuery.interfacesMod.AsyncIterable
import typings.pulumiQuery.interfacesMod.AsyncQueryable
import typings.std.Error
import typings.std.Map
import typings.std.Record
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runtimeMod {
  
  @JSImport("@pulumi/pulumi/runtime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "StreamInvokeResponse")
  @js.native
  class StreamInvokeResponse[T] protected ()
    extends typings.pulumiPulumi.runtimeInvokeMod.StreamInvokeResponse[T] {
    def this(source: AsyncIterable[T], cancelSource: js.Function0[Unit]) = this()
  }
  
  @scala.inline
  def allConfig(): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("allConfig")().asInstanceOf[StringDictionary[String]]
  
  @scala.inline
  def computeCodePaths(): js.Promise[Map[String, Asset | Archive]] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeCodePaths")().asInstanceOf[js.Promise[Map[String, Asset | Archive]]]
  @scala.inline
  def computeCodePaths(extraIncludePaths: js.Array[String]): js.Promise[Map[String, Asset | Archive]] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeCodePaths")(extraIncludePaths.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Map[String, Asset | Archive]]]
  @scala.inline
  def computeCodePaths(extraIncludePaths: js.Array[String], extraIncludePackages: js.Array[String]): js.Promise[Map[String, Asset | Archive]] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeCodePaths")(extraIncludePaths.asInstanceOf[js.Any], extraIncludePackages.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Map[String, Asset | Archive]]]
  @scala.inline
  def computeCodePaths(
    extraIncludePaths: js.Array[String],
    extraIncludePackages: js.Array[String],
    extraExcludePackages: js.Array[String]
  ): js.Promise[Map[String, Asset | Archive]] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeCodePaths")(extraIncludePaths.asInstanceOf[js.Any], extraIncludePackages.asInstanceOf[js.Any], extraExcludePackages.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Map[String, Asset | Archive]]]
  @scala.inline
  def computeCodePaths(
    extraIncludePaths: js.Array[String],
    extraIncludePackages: Unit,
    extraExcludePackages: js.Array[String]
  ): js.Promise[Map[String, Asset | Archive]] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeCodePaths")(extraIncludePaths.asInstanceOf[js.Any], extraIncludePackages.asInstanceOf[js.Any], extraExcludePackages.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Map[String, Asset | Archive]]]
  @scala.inline
  def computeCodePaths(extraIncludePaths: Unit, extraIncludePackages: js.Array[String]): js.Promise[Map[String, Asset | Archive]] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeCodePaths")(extraIncludePaths.asInstanceOf[js.Any], extraIncludePackages.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Map[String, Asset | Archive]]]
  @scala.inline
  def computeCodePaths(
    extraIncludePaths: Unit,
    extraIncludePackages: js.Array[String],
    extraExcludePackages: js.Array[String]
  ): js.Promise[Map[String, Asset | Archive]] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeCodePaths")(extraIncludePaths.asInstanceOf[js.Any], extraIncludePackages.asInstanceOf[js.Any], extraExcludePackages.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Map[String, Asset | Archive]]]
  @scala.inline
  def computeCodePaths(extraIncludePaths: Unit, extraIncludePackages: Unit, extraExcludePackages: js.Array[String]): js.Promise[Map[String, Asset | Archive]] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeCodePaths")(extraIncludePaths.asInstanceOf[js.Any], extraIncludePackages.asInstanceOf[js.Any], extraExcludePackages.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Map[String, Asset | Archive]]]
  @scala.inline
  def computeCodePaths(options: CodePathOptions): js.Promise[Map[String, Asset | Archive]] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeCodePaths")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Map[String, Asset | Archive]]]
  
  @scala.inline
  def deserializeProperties(outputsStruct: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeProperties")(outputsStruct.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def deserializeProperty(prop: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeProperty")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def disconnect(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")().asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def disconnectSync(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnectSync")().asInstanceOf[Unit]
  
  @JSImport("@pulumi/pulumi/runtime", "excessiveDebugOutput")
  @js.native
  def excessiveDebugOutput: Boolean = js.native
  @scala.inline
  def excessiveDebugOutput_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("excessiveDebugOutput")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def getConfig(k: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")(k.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  @scala.inline
  def getEngine(): js.UndefOr[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEngine")().asInstanceOf[js.UndefOr[js.Object]]
  
  @scala.inline
  def getMonitor(): js.UndefOr[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonitor")().asInstanceOf[js.UndefOr[js.Object]]
  
  @scala.inline
  def getProject(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getProject")().asInstanceOf[String]
  
  @scala.inline
  def getRootResource(): js.Promise[js.UndefOr[URN]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRootResource")().asInstanceOf[js.Promise[js.UndefOr[URN]]]
  
  @scala.inline
  def getStack(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStack")().asInstanceOf[String]
  
  @scala.inline
  def getStackResource(): js.UndefOr[Stack] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStackResource")().asInstanceOf[js.UndefOr[Stack]]
  
  @scala.inline
  def hasEngine(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasEngine")().asInstanceOf[Boolean]
  
  @scala.inline
  def hasMonitor(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasMonitor")().asInstanceOf[Boolean]
  
  @scala.inline
  def invoke(tok: String, props: Inputs): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("invoke")(tok.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  @scala.inline
  def invoke(tok: String, props: Inputs, opts: InvokeOptions): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("invoke")(tok.asInstanceOf[js.Any], props.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  @scala.inline
  def isDryRun(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDryRun")().asInstanceOf[Boolean]
  
  @scala.inline
  def isLegacyApplyEnabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLegacyApplyEnabled")().asInstanceOf[Boolean]
  
  @scala.inline
  def isQueryMode(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isQueryMode")().asInstanceOf[Boolean]
  
  @scala.inline
  def isRpcSecret(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRpcSecret")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isTestModeEnabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTestModeEnabled")().asInstanceOf[Boolean]
  
  @scala.inline
  def leakedPromises(): js.Tuple2[Set[js.Promise[js.Any]], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("leakedPromises")().asInstanceOf[js.Tuple2[Set[js.Promise[js.Any]], String]]
  
  @scala.inline
  def listResourceOutputs[U /* <: Resource */](): AsyncQueryable[ResolvedResource[U]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listResourceOutputs")().asInstanceOf[AsyncQueryable[ResolvedResource[U]]]
  @scala.inline
  def listResourceOutputs[U /* <: Resource */](typeFilter: js.Function1[/* o */ js.Any, /* is U */ Boolean]): AsyncQueryable[ResolvedResource[U]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listResourceOutputs")(typeFilter.asInstanceOf[js.Any]).asInstanceOf[AsyncQueryable[ResolvedResource[U]]]
  @scala.inline
  def listResourceOutputs[U /* <: Resource */](typeFilter: js.Function1[/* o */ js.Any, /* is U */ Boolean], stackName: String): AsyncQueryable[ResolvedResource[U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("listResourceOutputs")(typeFilter.asInstanceOf[js.Any], stackName.asInstanceOf[js.Any])).asInstanceOf[AsyncQueryable[ResolvedResource[U]]]
  @scala.inline
  def listResourceOutputs[U /* <: Resource */](typeFilter: Unit, stackName: String): AsyncQueryable[ResolvedResource[U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("listResourceOutputs")(typeFilter.asInstanceOf[js.Any], stackName.asInstanceOf[js.Any])).asInstanceOf[AsyncQueryable[ResolvedResource[U]]]
  
  @JSImport("@pulumi/pulumi/runtime", "maxRPCMessageSize")
  @js.native
  val maxRPCMessageSize: Double = js.native
  
  @scala.inline
  def monitorSupportsFeature(feature: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("monitorSupportsFeature")(feature.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  @scala.inline
  def monitorSupportsResourceReferences(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("monitorSupportsResourceReferences")().asInstanceOf[js.Promise[Boolean]]
  
  @scala.inline
  def monitorSupportsSecrets(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("monitorSupportsSecrets")().asInstanceOf[js.Promise[Boolean]]
  
  @scala.inline
  def readResource(res: Resource, t: String, name: String, props: Inputs, opts: ResourceOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readResource")(res.asInstanceOf[js.Any], t.asInstanceOf[js.Any], name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def registerResource(
    res: Resource,
    t: String,
    name: String,
    custom: Boolean,
    remote: Boolean,
    newDependency: js.Function1[/* urn */ URN, Resource],
    props: Inputs,
    opts: ResourceOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerResource")(res.asInstanceOf[js.Any], t.asInstanceOf[js.Any], name.asInstanceOf[js.Any], custom.asInstanceOf[js.Any], remote.asInstanceOf[js.Any], newDependency.asInstanceOf[js.Any], props.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def registerResourceModule(name: String, version: String, module: ResourceModule): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerResourceModule")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], module.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def registerResourceOutputs(res: Resource, outputs: js.Promise[Inputs]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerResourceOutputs")(res.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def registerResourceOutputs(res: Resource, outputs: Inputs): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerResourceOutputs")(res.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def registerResourceOutputs(res: Resource, outputs: Output_[Inputs]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerResourceOutputs")(res.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def registerResourcePackage(name: String, version: String, pkg: ResourcePackage): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerResourcePackage")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], pkg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def registerStackTransformation(t: ResourceTransformation): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerStackTransformation")(t.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def resetOptions(
    project: String,
    stack: String,
    parallel: Double,
    engineAddr: String,
    monitorAddr: String,
    preview: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resetOptions")(project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], parallel.asInstanceOf[js.Any], engineAddr.asInstanceOf[js.Any], monitorAddr.asInstanceOf[js.Any], preview.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def resolveProperties(
    res: Resource,
    resolvers: Record[
      String, 
      js.Function5[
        /* v */ js.Any, 
        /* isKnown */ Boolean, 
        /* isSecret */ Boolean, 
        /* deps */ js.UndefOr[js.Array[Resource]], 
        /* err */ js.UndefOr[Error], 
        Unit
      ]
    ],
    t: String,
    name: String,
    allProps: js.Any,
    deps: Record[String, js.Array[Resource]]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveProperties")(res.asInstanceOf[js.Any], resolvers.asInstanceOf[js.Any], t.asInstanceOf[js.Any], name.asInstanceOf[js.Any], allProps.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def resolveProperties(
    res: Resource,
    resolvers: Record[
      String, 
      js.Function5[
        /* v */ js.Any, 
        /* isKnown */ Boolean, 
        /* isSecret */ Boolean, 
        /* deps */ js.UndefOr[js.Array[Resource]], 
        /* err */ js.UndefOr[Error], 
        Unit
      ]
    ],
    t: String,
    name: String,
    allProps: js.Any,
    deps: Record[String, js.Array[Resource]],
    err: Error
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveProperties")(res.asInstanceOf[js.Any], resolvers.asInstanceOf[js.Any], t.asInstanceOf[js.Any], name.asInstanceOf[js.Any], allProps.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], err.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@pulumi/pulumi/runtime", "rootPulumiStackTypeName")
  @js.native
  val rootPulumiStackTypeName: /* "pulumi:pulumi:Stack" */ String = js.native
  
  @scala.inline
  def rpcKeepAlive(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("rpcKeepAlive")().asInstanceOf[js.Function0[Unit]]
  
  @scala.inline
  def runInPulumiStack(init: js.Function0[js.Promise[js.Any]]): js.Promise[js.UndefOr[Inputs]] = ^.asInstanceOf[js.Dynamic].applyDynamic("runInPulumiStack")(init.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[Inputs]]]
  
  @scala.inline
  def serialize(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")().asInstanceOf[Boolean]
  
  @scala.inline
  def serializeFunction(func: js.Function): js.Promise[SerializedFunction] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeFunction")(func.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SerializedFunction]]
  @scala.inline
  def serializeFunction(func: js.Function, args: SerializeFunctionArgs): js.Promise[SerializedFunction] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeFunction")(func.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SerializedFunction]]
  
  @scala.inline
  def serializeFunctionAsync(func: js.Function): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeFunctionAsync")(func.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  @scala.inline
  def serializeFunctionAsync(func: js.Function, serialize: js.Function1[/* o */ js.Any, Boolean]): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeFunctionAsync")(func.asInstanceOf[js.Any], serialize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  @scala.inline
  def serializeProperties(label: String, props: Inputs): js.Promise[Record[String, js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeProperties")(label.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Record[String, js.Any]]]
  
  @scala.inline
  def serializeProperty(ctx: String, prop: Input[js.Any], dependentResources: Set[Resource]): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeProperty")(ctx.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], dependentResources.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  @scala.inline
  def serializeResourceProperties(label: String, props: Inputs): js.Promise[js.Tuple2[Record[String, js.Any], Map[String, Set[Resource]]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeResourceProperties")(label.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[Record[String, js.Any], Map[String, Set[Resource]]]]]
  
  @scala.inline
  def setAllConfig(c: StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAllConfig")(c.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setConfig(k: String, v: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setConfig")(k.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setMockOptions(mockMonitor: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMockOptions")(mockMonitor.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def setMockOptions(mockMonitor: js.Any, project: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMockOptions")(mockMonitor.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def setMockOptions(mockMonitor: js.Any, project: String, stack: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMockOptions")(mockMonitor.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def setMockOptions(mockMonitor: js.Any, project: String, stack: String, preview: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMockOptions")(mockMonitor.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def setMockOptions(mockMonitor: js.Any, project: String, stack: Unit, preview: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMockOptions")(mockMonitor.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def setMockOptions(mockMonitor: js.Any, project: Unit, stack: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMockOptions")(mockMonitor.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def setMockOptions(mockMonitor: js.Any, project: Unit, stack: String, preview: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMockOptions")(mockMonitor.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def setMockOptions(mockMonitor: js.Any, project: Unit, stack: Unit, preview: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMockOptions")(mockMonitor.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setMocks(mocks: Mocks): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMocks")(mocks.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def setMocks(mocks: Mocks, project: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMocks")(mocks.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def setMocks(mocks: Mocks, project: String, stack: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMocks")(mocks.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def setMocks(mocks: Mocks, project: String, stack: String, preview: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMocks")(mocks.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def setMocks(mocks: Mocks, project: String, stack: Unit, preview: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMocks")(mocks.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def setMocks(mocks: Mocks, project: Unit, stack: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMocks")(mocks.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def setMocks(mocks: Mocks, project: Unit, stack: String, preview: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMocks")(mocks.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def setMocks(mocks: Mocks, project: Unit, stack: Unit, preview: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMocks")(mocks.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setRootResource(res: ComponentResource[js.Any]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setRootResource")(res.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("@pulumi/pulumi/runtime", "specialArchiveSig")
  @js.native
  val specialArchiveSig: /* "0def7320c3a5731c473e5ecbe6d01bc7" */ String = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "specialAssetSig")
  @js.native
  val specialAssetSig: /* "c44067f5952c0a294b673a41bacd8c17" */ String = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "specialResourceSig")
  @js.native
  val specialResourceSig: /* "5cf8f73096256a8f31e491e813e4eb8e" */ String = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "specialSecretSig")
  @js.native
  val specialSecretSig: /* "1b47061264138c4ac30d75fd1eb44270" */ String = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "specialSigKey")
  @js.native
  val specialSigKey: /* "4dabf18193072939515e22adb298388d" */ String = js.native
  
  @scala.inline
  def streamInvoke(tok: String, props: Inputs): js.Promise[typings.pulumiPulumi.runtimeInvokeMod.StreamInvokeResponse[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("streamInvoke")(tok.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiPulumi.runtimeInvokeMod.StreamInvokeResponse[js.Any]]]
  @scala.inline
  def streamInvoke(tok: String, props: Inputs, opts: InvokeOptions): js.Promise[typings.pulumiPulumi.runtimeInvokeMod.StreamInvokeResponse[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("streamInvoke")(tok.asInstanceOf[js.Any], props.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiPulumi.runtimeInvokeMod.StreamInvokeResponse[js.Any]]]
  
  @scala.inline
  def suppressUnhandledGrpcRejections[T](p: js.Promise[T]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("suppressUnhandledGrpcRejections")(p.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  
  @scala.inline
  def terminateRpcs(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("terminateRpcs")().asInstanceOf[Unit]
  
  @scala.inline
  def transferProperties(onto: Resource, label: String, props: Inputs): OutputResolvers = (^.asInstanceOf[js.Dynamic].applyDynamic("transferProperties")(onto.asInstanceOf[js.Any], label.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[OutputResolvers]
  
  @JSImport("@pulumi/pulumi/runtime", "unknownValue")
  @js.native
  val unknownValue: /* "04da6b54-80e4-46f7-96ec-b56ff0331ba9" */ String = js.native
  
  @scala.inline
  def unwrapRpcSecret(obj: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrapRpcSecret")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
