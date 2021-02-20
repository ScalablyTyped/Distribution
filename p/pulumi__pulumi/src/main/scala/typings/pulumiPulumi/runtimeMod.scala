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
import scala.scalajs.js.`|`
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
  
  @JSImport("@pulumi/pulumi/runtime", "allConfig")
  @js.native
  def allConfig(): StringDictionary[String] = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "computeCodePaths")
  @js.native
  def computeCodePaths(): js.Promise[Map[String, Asset | Archive]] = js.native
  @JSImport("@pulumi/pulumi/runtime", "computeCodePaths")
  @js.native
  def computeCodePaths(
    extraIncludePaths: js.UndefOr[scala.Nothing],
    extraIncludePackages: js.UndefOr[scala.Nothing],
    extraExcludePackages: js.Array[String]
  ): js.Promise[Map[String, Asset | Archive]] = js.native
  @JSImport("@pulumi/pulumi/runtime", "computeCodePaths")
  @js.native
  def computeCodePaths(extraIncludePaths: js.UndefOr[scala.Nothing], extraIncludePackages: js.Array[String]): js.Promise[Map[String, Asset | Archive]] = js.native
  @JSImport("@pulumi/pulumi/runtime", "computeCodePaths")
  @js.native
  def computeCodePaths(
    extraIncludePaths: js.UndefOr[scala.Nothing],
    extraIncludePackages: js.Array[String],
    extraExcludePackages: js.Array[String]
  ): js.Promise[Map[String, Asset | Archive]] = js.native
  @JSImport("@pulumi/pulumi/runtime", "computeCodePaths")
  @js.native
  def computeCodePaths(extraIncludePaths: js.Array[String]): js.Promise[Map[String, Asset | Archive]] = js.native
  @JSImport("@pulumi/pulumi/runtime", "computeCodePaths")
  @js.native
  def computeCodePaths(
    extraIncludePaths: js.Array[String],
    extraIncludePackages: js.UndefOr[scala.Nothing],
    extraExcludePackages: js.Array[String]
  ): js.Promise[Map[String, Asset | Archive]] = js.native
  @JSImport("@pulumi/pulumi/runtime", "computeCodePaths")
  @js.native
  def computeCodePaths(extraIncludePaths: js.Array[String], extraIncludePackages: js.Array[String]): js.Promise[Map[String, Asset | Archive]] = js.native
  @JSImport("@pulumi/pulumi/runtime", "computeCodePaths")
  @js.native
  def computeCodePaths(
    extraIncludePaths: js.Array[String],
    extraIncludePackages: js.Array[String],
    extraExcludePackages: js.Array[String]
  ): js.Promise[Map[String, Asset | Archive]] = js.native
  @JSImport("@pulumi/pulumi/runtime", "computeCodePaths")
  @js.native
  def computeCodePaths(options: CodePathOptions): js.Promise[Map[String, Asset | Archive]] = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "deserializeProperties")
  @js.native
  def deserializeProperties(outputsStruct: js.Any): js.Any = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "deserializeProperty")
  @js.native
  def deserializeProperty(prop: js.Any): js.Any = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "disconnect")
  @js.native
  def disconnect(): js.Promise[Unit] = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "disconnectSync")
  @js.native
  def disconnectSync(): Unit = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "excessiveDebugOutput")
  @js.native
  def excessiveDebugOutput: Boolean = js.native
  @scala.inline
  def excessiveDebugOutput_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("excessiveDebugOutput")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/pulumi/runtime", "getConfig")
  @js.native
  def getConfig(k: String): js.UndefOr[String] = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "getEngine")
  @js.native
  def getEngine(): js.UndefOr[js.Object] = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "getMonitor")
  @js.native
  def getMonitor(): js.UndefOr[js.Object] = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "getProject")
  @js.native
  def getProject(): String = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "getRootResource")
  @js.native
  def getRootResource(): js.Promise[js.UndefOr[URN]] = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "getStack")
  @js.native
  def getStack(): String = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "getStackResource")
  @js.native
  def getStackResource(): js.UndefOr[Stack] = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "hasEngine")
  @js.native
  def hasEngine(): Boolean = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "hasMonitor")
  @js.native
  def hasMonitor(): Boolean = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "invoke")
  @js.native
  def invoke(tok: String, props: Inputs): js.Promise[_] = js.native
  @JSImport("@pulumi/pulumi/runtime", "invoke")
  @js.native
  def invoke(tok: String, props: Inputs, opts: InvokeOptions): js.Promise[_] = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "isDryRun")
  @js.native
  def isDryRun(): Boolean = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "isLegacyApplyEnabled")
  @js.native
  def isLegacyApplyEnabled(): Boolean = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "isQueryMode")
  @js.native
  def isQueryMode(): Boolean = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "isRpcSecret")
  @js.native
  def isRpcSecret(obj: js.Any): Boolean = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "isTestModeEnabled")
  @js.native
  def isTestModeEnabled(): Boolean = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "leakedPromises")
  @js.native
  def leakedPromises(): js.Tuple2[Set[js.Promise[_]], String] = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "listResourceOutputs")
  @js.native
  def listResourceOutputs[U /* <: Resource */](): AsyncQueryable[ResolvedResource[U]] = js.native
  @JSImport("@pulumi/pulumi/runtime", "listResourceOutputs")
  @js.native
  def listResourceOutputs[U /* <: Resource */](typeFilter: js.UndefOr[scala.Nothing], stackName: String): AsyncQueryable[ResolvedResource[U]] = js.native
  @JSImport("@pulumi/pulumi/runtime", "listResourceOutputs")
  @js.native
  def listResourceOutputs[U /* <: Resource */](typeFilter: js.Function1[/* o */ js.Any, /* is U */ Boolean]): AsyncQueryable[ResolvedResource[U]] = js.native
  @JSImport("@pulumi/pulumi/runtime", "listResourceOutputs")
  @js.native
  def listResourceOutputs[U /* <: Resource */](typeFilter: js.Function1[/* o */ js.Any, /* is U */ Boolean], stackName: String): AsyncQueryable[ResolvedResource[U]] = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "maxRPCMessageSize")
  @js.native
  val maxRPCMessageSize: Double = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "monitorSupportsFeature")
  @js.native
  def monitorSupportsFeature(feature: String): js.Promise[Boolean] = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "monitorSupportsResourceReferences")
  @js.native
  def monitorSupportsResourceReferences(): js.Promise[Boolean] = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "monitorSupportsSecrets")
  @js.native
  def monitorSupportsSecrets(): js.Promise[Boolean] = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "readResource")
  @js.native
  def readResource(res: Resource, t: String, name: String, props: Inputs, opts: ResourceOptions): Unit = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "registerResource")
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
  
  @JSImport("@pulumi/pulumi/runtime", "registerResourceModule")
  @js.native
  def registerResourceModule(name: String, version: String, module: ResourceModule): Unit = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "registerResourceOutputs")
  @js.native
  def registerResourceOutputs(res: Resource, outputs: js.Promise[Inputs]): Unit = js.native
  @JSImport("@pulumi/pulumi/runtime", "registerResourceOutputs")
  @js.native
  def registerResourceOutputs(res: Resource, outputs: Inputs): Unit = js.native
  @JSImport("@pulumi/pulumi/runtime", "registerResourceOutputs")
  @js.native
  def registerResourceOutputs(res: Resource, outputs: Output_[Inputs]): Unit = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "registerResourcePackage")
  @js.native
  def registerResourcePackage(name: String, version: String, pkg: ResourcePackage): Unit = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "registerStackTransformation")
  @js.native
  def registerStackTransformation(t: ResourceTransformation): Unit = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "resetOptions")
  @js.native
  def resetOptions(
    project: String,
    stack: String,
    parallel: Double,
    engineAddr: String,
    monitorAddr: String,
    preview: Boolean
  ): Unit = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "resolveProperties")
  @js.native
  def resolveProperties(
    res: Resource,
    resolvers: Record[
      String, 
      js.Function5[
        /* v */ _, 
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
  ): Unit = js.native
  @JSImport("@pulumi/pulumi/runtime", "resolveProperties")
  @js.native
  def resolveProperties(
    res: Resource,
    resolvers: Record[
      String, 
      js.Function5[
        /* v */ _, 
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
  ): Unit = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "rootPulumiStackTypeName")
  @js.native
  val rootPulumiStackTypeName: /* "pulumi:pulumi:Stack" */ String = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "rpcKeepAlive")
  @js.native
  def rpcKeepAlive(): js.Function0[Unit] = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "runInPulumiStack")
  @js.native
  def runInPulumiStack(init: js.Function0[js.Promise[_]]): js.Promise[js.UndefOr[Inputs]] = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "serialize")
  @js.native
  def serialize(): Boolean = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "serializeFunction")
  @js.native
  def serializeFunction(func: js.Function): js.Promise[SerializedFunction] = js.native
  @JSImport("@pulumi/pulumi/runtime", "serializeFunction")
  @js.native
  def serializeFunction(func: js.Function, args: SerializeFunctionArgs): js.Promise[SerializedFunction] = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "serializeFunctionAsync")
  @js.native
  def serializeFunctionAsync(func: js.Function): js.Promise[String] = js.native
  @JSImport("@pulumi/pulumi/runtime", "serializeFunctionAsync")
  @js.native
  def serializeFunctionAsync(func: js.Function, serialize: js.Function1[/* o */ js.Any, Boolean]): js.Promise[String] = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "serializeProperties")
  @js.native
  def serializeProperties(label: String, props: Inputs): js.Promise[Record[String, _]] = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "serializeProperty")
  @js.native
  def serializeProperty(ctx: String, prop: Input[_], dependentResources: Set[Resource]): js.Promise[_] = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "serializeResourceProperties")
  @js.native
  def serializeResourceProperties(label: String, props: Inputs): js.Promise[js.Tuple2[Record[String, _], Map[String, Set[Resource]]]] = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "setAllConfig")
  @js.native
  def setAllConfig(c: StringDictionary[String]): Unit = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "setConfig")
  @js.native
  def setConfig(k: String, v: String): Unit = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "setMockOptions")
  @js.native
  def setMockOptions(mockMonitor: js.Any): Unit = js.native
  @JSImport("@pulumi/pulumi/runtime", "setMockOptions")
  @js.native
  def setMockOptions(
    mockMonitor: js.Any,
    project: js.UndefOr[scala.Nothing],
    stack: js.UndefOr[scala.Nothing],
    preview: Boolean
  ): Unit = js.native
  @JSImport("@pulumi/pulumi/runtime", "setMockOptions")
  @js.native
  def setMockOptions(mockMonitor: js.Any, project: js.UndefOr[scala.Nothing], stack: String): Unit = js.native
  @JSImport("@pulumi/pulumi/runtime", "setMockOptions")
  @js.native
  def setMockOptions(mockMonitor: js.Any, project: js.UndefOr[scala.Nothing], stack: String, preview: Boolean): Unit = js.native
  @JSImport("@pulumi/pulumi/runtime", "setMockOptions")
  @js.native
  def setMockOptions(mockMonitor: js.Any, project: String): Unit = js.native
  @JSImport("@pulumi/pulumi/runtime", "setMockOptions")
  @js.native
  def setMockOptions(mockMonitor: js.Any, project: String, stack: js.UndefOr[scala.Nothing], preview: Boolean): Unit = js.native
  @JSImport("@pulumi/pulumi/runtime", "setMockOptions")
  @js.native
  def setMockOptions(mockMonitor: js.Any, project: String, stack: String): Unit = js.native
  @JSImport("@pulumi/pulumi/runtime", "setMockOptions")
  @js.native
  def setMockOptions(mockMonitor: js.Any, project: String, stack: String, preview: Boolean): Unit = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "setMocks")
  @js.native
  def setMocks(mocks: Mocks): Unit = js.native
  @JSImport("@pulumi/pulumi/runtime", "setMocks")
  @js.native
  def setMocks(
    mocks: Mocks,
    project: js.UndefOr[scala.Nothing],
    stack: js.UndefOr[scala.Nothing],
    preview: Boolean
  ): Unit = js.native
  @JSImport("@pulumi/pulumi/runtime", "setMocks")
  @js.native
  def setMocks(mocks: Mocks, project: js.UndefOr[scala.Nothing], stack: String): Unit = js.native
  @JSImport("@pulumi/pulumi/runtime", "setMocks")
  @js.native
  def setMocks(mocks: Mocks, project: js.UndefOr[scala.Nothing], stack: String, preview: Boolean): Unit = js.native
  @JSImport("@pulumi/pulumi/runtime", "setMocks")
  @js.native
  def setMocks(mocks: Mocks, project: String): Unit = js.native
  @JSImport("@pulumi/pulumi/runtime", "setMocks")
  @js.native
  def setMocks(mocks: Mocks, project: String, stack: js.UndefOr[scala.Nothing], preview: Boolean): Unit = js.native
  @JSImport("@pulumi/pulumi/runtime", "setMocks")
  @js.native
  def setMocks(mocks: Mocks, project: String, stack: String): Unit = js.native
  @JSImport("@pulumi/pulumi/runtime", "setMocks")
  @js.native
  def setMocks(mocks: Mocks, project: String, stack: String, preview: Boolean): Unit = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "setRootResource")
  @js.native
  def setRootResource(res: ComponentResource[_]): js.Promise[Unit] = js.native
  
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
  
  @JSImport("@pulumi/pulumi/runtime", "streamInvoke")
  @js.native
  def streamInvoke(tok: String, props: Inputs): js.Promise[typings.pulumiPulumi.runtimeInvokeMod.StreamInvokeResponse[_]] = js.native
  @JSImport("@pulumi/pulumi/runtime", "streamInvoke")
  @js.native
  def streamInvoke(tok: String, props: Inputs, opts: InvokeOptions): js.Promise[typings.pulumiPulumi.runtimeInvokeMod.StreamInvokeResponse[_]] = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "suppressUnhandledGrpcRejections")
  @js.native
  def suppressUnhandledGrpcRejections[T](p: js.Promise[T]): js.Promise[T] = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "terminateRpcs")
  @js.native
  def terminateRpcs(): Unit = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "transferProperties")
  @js.native
  def transferProperties(onto: Resource, label: String, props: Inputs): OutputResolvers = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "unknownValue")
  @js.native
  val unknownValue: /* "04da6b54-80e4-46f7-96ec-b56ff0331ba9" */ String = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "unwrapRpcSecret")
  @js.native
  def unwrapRpcSecret(obj: js.Any): js.Any = js.native
}
