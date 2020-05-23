package typings.pulumiPulumi.mod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.assetMod.Archive
import typings.pulumiPulumi.assetMod.Asset
import typings.pulumiPulumi.codePathsMod.CodePathOptions
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.mocksMod.Mocks
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Inputs
import typings.pulumiPulumi.queryableMod.ResolvedResource
import typings.pulumiPulumi.resourceMod.ResourceOptions
import typings.pulumiPulumi.resourceMod.ResourceTransformation
import typings.pulumiPulumi.resourceMod.URN
import typings.pulumiPulumi.rpcMod.OutputResolvers
import typings.pulumiPulumi.serializeClosureMod.SerializeFunctionArgs
import typings.pulumiPulumi.serializeClosureMod.SerializedFunction
import typings.pulumiPulumi.stackMod.Stack
import typings.pulumiQuery.interfacesMod.AsyncIterable
import typings.pulumiQuery.interfacesMod.AsyncQueryable
import typings.std.Map
import typings.std.Record
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi", "runtime")
@js.native
object runtime extends js.Object {
  @js.native
  class StreamInvokeResponse[T] protected ()
    extends typings.pulumiPulumi.runtimeMod.StreamInvokeResponse[T] {
    def this(source: AsyncIterable[T], cancelSource: js.Function0[Unit]) = this()
  }
  
  var excessiveDebugOutput: Boolean = js.native
  val rootPulumiStackTypeName: /* "pulumi:pulumi:Stack" */ String = js.native
  val specialArchiveSig: /* "0def7320c3a5731c473e5ecbe6d01bc7" */ String = js.native
  val specialAssetSig: /* "c44067f5952c0a294b673a41bacd8c17" */ String = js.native
  val specialSecretSig: /* "1b47061264138c4ac30d75fd1eb44270" */ String = js.native
  val specialSigKey: /* "4dabf18193072939515e22adb298388d" */ String = js.native
  val unknownValue: /* "04da6b54-80e4-46f7-96ec-b56ff0331ba9" */ String = js.native
  def allConfig(): StringDictionary[String] = js.native
  def computeCodePaths(): js.Promise[Map[String, Asset | Archive]] = js.native
  def computeCodePaths(extraIncludePaths: js.Array[String]): js.Promise[Map[String, Asset | Archive]] = js.native
  def computeCodePaths(extraIncludePaths: js.Array[String], extraIncludePackages: js.Array[String]): js.Promise[Map[String, Asset | Archive]] = js.native
  def computeCodePaths(
    extraIncludePaths: js.Array[String],
    extraIncludePackages: js.Array[String],
    extraExcludePackages: js.Array[String]
  ): js.Promise[Map[String, Asset | Archive]] = js.native
  def computeCodePaths(options: CodePathOptions): js.Promise[Map[String, Asset | Archive]] = js.native
  def deserializeProperties(outputsStruct: js.Any): js.Any = js.native
  def deserializeProperty(prop: js.Any): js.Any = js.native
  def disconnect(): Unit = js.native
  def disconnectSync(): Unit = js.native
  def getConfig(k: String): js.UndefOr[String] = js.native
  def getEngine(): js.UndefOr[js.Object] = js.native
  def getMonitor(): js.UndefOr[js.Object] = js.native
  def getProject(): String = js.native
  def getRootResource(): js.Promise[js.UndefOr[URN]] = js.native
  def getStack(): String = js.native
  def getStackResource(): js.UndefOr[Stack] = js.native
  def hasMonitor(): Boolean = js.native
  def invoke(tok: String, props: Inputs): js.Promise[_] = js.native
  def invoke(tok: String, props: Inputs, opts: InvokeOptions): js.Promise[_] = js.native
  def invokeFallbackToAsync[T](tok: String, props: Inputs, opts: InvokeOptions): T = js.native
  def isDryRun(): Boolean = js.native
  def isLegacyApplyEnabled(): Boolean = js.native
  def isQueryMode(): Boolean = js.native
  def isTestModeEnabled(): Boolean = js.native
  def listResourceOutputs[U /* <: typings.pulumiPulumi.resourceMod.Resource */](): AsyncQueryable[ResolvedResource[U]] = js.native
  def listResourceOutputs[U /* <: typings.pulumiPulumi.resourceMod.Resource */](typeFilter: js.Function1[/* o */ js.Any, /* is U */ Boolean]): AsyncQueryable[ResolvedResource[U]] = js.native
  def listResourceOutputs[U /* <: typings.pulumiPulumi.resourceMod.Resource */](typeFilter: js.Function1[/* o */ js.Any, /* is U */ Boolean], stackName: String): AsyncQueryable[ResolvedResource[U]] = js.native
  def monitorSupportsSecrets(): js.Promise[Boolean] = js.native
  def readResource(
    res: typings.pulumiPulumi.resourceMod.Resource,
    t: String,
    name: String,
    props: Inputs,
    opts: ResourceOptions
  ): Unit = js.native
  def registerResource(
    res: typings.pulumiPulumi.resourceMod.Resource,
    t: String,
    name: String,
    custom: Boolean,
    props: Inputs,
    opts: ResourceOptions
  ): Unit = js.native
  def registerResourceOutputs(res: typings.pulumiPulumi.resourceMod.Resource, outputs: js.Promise[Inputs]): Unit = js.native
  def registerResourceOutputs(res: typings.pulumiPulumi.resourceMod.Resource, outputs: Inputs): Unit = js.native
  def registerResourceOutputs(
    res: typings.pulumiPulumi.resourceMod.Resource,
    outputs: typings.pulumiPulumi.outputMod.Output_[Inputs]
  ): Unit = js.native
  def registerStackTransformation(t: ResourceTransformation): Unit = js.native
  def resolveProperties(
    res: typings.pulumiPulumi.resourceMod.Resource,
    resolvers: Record[
      String, 
      js.Function3[/* v */ _, /* isKnown */ Boolean, /* isSecret */ Boolean, Unit]
    ],
    t: String,
    name: String,
    allProps: js.Any
  ): Unit = js.native
  def rpcKeepAlive(): js.Function0[Unit] = js.native
  def runInPulumiStack(init: js.Function0[js.Promise[_]]): js.Promise[js.UndefOr[Inputs]] = js.native
  def serialize(): Boolean = js.native
  def serializeFunction(func: js.Function): js.Promise[SerializedFunction] = js.native
  def serializeFunction(func: js.Function, args: SerializeFunctionArgs): js.Promise[SerializedFunction] = js.native
  def serializeFunctionAsync(func: js.Function): js.Promise[String] = js.native
  def serializeFunctionAsync(func: js.Function, serialize: js.Function1[/* o */ js.Any, Boolean]): js.Promise[String] = js.native
  def serializeProperties(label: String, props: Inputs): js.Promise[Record[String, _]] = js.native
  def serializeProperty(ctx: String, prop: Input[_], dependentResources: Set[typings.pulumiPulumi.resourceMod.Resource]): js.Promise[_] = js.native
  def serializeResourceProperties(label: String, props: Inputs): js.Promise[
    js.Tuple2[Record[String, _], Map[String, Set[typings.pulumiPulumi.resourceMod.Resource]]]
  ] = js.native
  def setConfig(k: String, v: String): Unit = js.native
  def setMockOptions(mockMonitor: js.Any): Unit = js.native
  def setMockOptions(mockMonitor: js.Any, project: String): Unit = js.native
  def setMockOptions(mockMonitor: js.Any, project: String, stack: String): Unit = js.native
  def setMockOptions(mockMonitor: js.Any, project: String, stack: String, preview: Boolean): Unit = js.native
  def setMocks(mocks: Mocks): Unit = js.native
  def setMocks(mocks: Mocks, project: String): Unit = js.native
  def setMocks(mocks: Mocks, project: String, stack: String): Unit = js.native
  def setMocks(mocks: Mocks, project: String, stack: String, preview: Boolean): Unit = js.native
  def setRootResource(res: typings.pulumiPulumi.resourceMod.ComponentResource[_]): js.Promise[Unit] = js.native
  def streamInvoke(tok: String, props: Inputs): js.Promise[typings.pulumiPulumi.runtimeInvokeMod.StreamInvokeResponse[_]] = js.native
  def streamInvoke(tok: String, props: Inputs, opts: InvokeOptions): js.Promise[typings.pulumiPulumi.runtimeInvokeMod.StreamInvokeResponse[_]] = js.native
  def transferProperties(onto: typings.pulumiPulumi.resourceMod.Resource, label: String, props: Inputs): OutputResolvers = js.native
}

