package typings
package atPulumiPulumiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/runtime", JSImport.Namespace)
@js.native
object runtimeMod extends js.Object {
  var excessiveDebugOutput: scala.Boolean = js.native
  val rootPulumiStackTypeName: /* pulumi:pulumi:Stack */ java.lang.String = js.native
  val specialArchiveSig: /* 0def7320c3a5731c473e5ecbe6d01bc7 */ java.lang.String = js.native
  val specialAssetSig: /* c44067f5952c0a294b673a41bacd8c17 */ java.lang.String = js.native
  val specialSecretSig: /* 1b47061264138c4ac30d75fd1eb44270 */ java.lang.String = js.native
  val specialSigKey: /* 4dabf18193072939515e22adb298388d */ java.lang.String = js.native
  val unknownValue: /* 04da6b54-80e4-46f7-96ec-b56ff0331ba9 */ java.lang.String = js.native
  def allConfig(): org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  def computeCodePaths(): js.Promise[
    nodeLib.Map[
      java.lang.String, 
      atPulumiPulumiLib.assetMod.Asset | atPulumiPulumiLib.assetMod.Archive
    ]
  ] = js.native
  def computeCodePaths(extraIncludePaths: js.Array[java.lang.String]): js.Promise[
    nodeLib.Map[
      java.lang.String, 
      atPulumiPulumiLib.assetMod.Asset | atPulumiPulumiLib.assetMod.Archive
    ]
  ] = js.native
  def computeCodePaths(extraIncludePaths: js.Array[java.lang.String], extraIncludePackages: js.Array[java.lang.String]): js.Promise[
    nodeLib.Map[
      java.lang.String, 
      atPulumiPulumiLib.assetMod.Asset | atPulumiPulumiLib.assetMod.Archive
    ]
  ] = js.native
  def computeCodePaths(
    extraIncludePaths: js.Array[java.lang.String],
    extraIncludePackages: js.Array[java.lang.String],
    extraExcludePackages: js.Array[java.lang.String]
  ): js.Promise[
    nodeLib.Map[
      java.lang.String, 
      atPulumiPulumiLib.assetMod.Asset | atPulumiPulumiLib.assetMod.Archive
    ]
  ] = js.native
  def computeCodePaths(options: atPulumiPulumiLib.runtimeClosureCodePathsMod.CodePathOptions): js.Promise[
    nodeLib.Map[
      java.lang.String, 
      atPulumiPulumiLib.assetMod.Asset | atPulumiPulumiLib.assetMod.Archive
    ]
  ] = js.native
  def deserializeProperties(outputsStruct: js.Any): js.Any = js.native
  def deserializeProperty(prop: js.Any): js.Any = js.native
  def disconnect(): scala.Unit = js.native
  def disconnectSync(): scala.Unit = js.native
  def getConfig(k: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def getEngine(): js.UndefOr[js.Object] = js.native
  def getMonitor(): js.Object = js.native
  def getProject(): js.UndefOr[java.lang.String] = js.native
  def getRootResource(): js.Promise[js.UndefOr[atPulumiPulumiLib.resourceMod.URN]] = js.native
  def getStack(): js.UndefOr[java.lang.String] = js.native
  def hasMonitor(): scala.Boolean = js.native
  def invoke(tok: java.lang.String, props: atPulumiPulumiLib.outputMod.Inputs): js.Promise[_] = js.native
  def invoke(
    tok: java.lang.String,
    props: atPulumiPulumiLib.outputMod.Inputs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[_] = js.native
  def isDryRun(): scala.Boolean = js.native
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
  def resolveProperties(
    res: atPulumiPulumiLib.resourceMod.Resource,
    resolvers: stdLib.Record[java.lang.String, js.Function2[/* v */ _, /* isKnown */ scala.Boolean, scala.Unit]],
    t: java.lang.String,
    name: java.lang.String,
    allProps: js.Any
  ): scala.Unit = js.native
  def rpcKeepAlive(): js.Function0[scala.Unit] = js.native
  def runInPulumiStack(init: js.Function0[_]): js.Promise[js.UndefOr[atPulumiPulumiLib.outputMod.Inputs]] = js.native
  def serialize(): scala.Boolean = js.native
  def serializeFunction(func: js.Function): js.Promise[atPulumiPulumiLib.runtimeClosureSerializeClosureMod.SerializedFunction] = js.native
  def serializeFunction(func: js.Function, args: atPulumiPulumiLib.runtimeClosureSerializeClosureMod.SerializeFunctionArgs): js.Promise[atPulumiPulumiLib.runtimeClosureSerializeClosureMod.SerializedFunction] = js.native
  def serializeFunctionAsync(func: js.Function): js.Promise[java.lang.String] = js.native
  def serializeFunctionAsync(func: js.Function, serialize: js.Function1[/* o */ js.Any, scala.Boolean]): js.Promise[java.lang.String] = js.native
  def serializeProperties(label: java.lang.String, props: atPulumiPulumiLib.outputMod.Inputs): js.Promise[stdLib.Record[java.lang.String, _]] = js.native
  def serializeProperty(
    ctx: java.lang.String,
    prop: atPulumiPulumiLib.outputMod.Input[_],
    dependentResources: nodeLib.Set[atPulumiPulumiLib.resourceMod.Resource]
  ): js.Promise[_] = js.native
  def serializeResourceProperties(label: java.lang.String, props: atPulumiPulumiLib.outputMod.Inputs): js.Promise[
    js.Tuple2[
      stdLib.Record[java.lang.String, _], 
      nodeLib.Map[java.lang.String, nodeLib.Set[atPulumiPulumiLib.resourceMod.Resource]]
    ]
  ] = js.native
  def setConfig(k: java.lang.String, v: java.lang.String): scala.Unit = js.native
  def setRootResource(res: atPulumiPulumiLib.resourceMod.ComponentResource): js.Promise[scala.Unit] = js.native
  def transferProperties(
    onto: atPulumiPulumiLib.resourceMod.Resource,
    label: java.lang.String,
    props: atPulumiPulumiLib.outputMod.Inputs
  ): atPulumiPulumiLib.runtimeRpcMod.OutputResolvers = js.native
}

