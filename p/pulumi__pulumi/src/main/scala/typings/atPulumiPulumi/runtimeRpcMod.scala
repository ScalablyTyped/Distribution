package typings.atPulumiPulumi

import typings.atPulumiPulumi.atPulumiPulumiStrings.`04da6b54-80e4-46f7-96ec-b56ff0331ba9`
import typings.atPulumiPulumi.atPulumiPulumiStrings.`0def7320c3a5731c473e5ecbe6d01bc7`
import typings.atPulumiPulumi.atPulumiPulumiStrings.`1b47061264138c4ac30d75fd1eb44270`
import typings.atPulumiPulumi.atPulumiPulumiStrings.`4dabf18193072939515e22adb298388d`
import typings.atPulumiPulumi.atPulumiPulumiStrings.c44067f5952c0a294b673a41bacd8c17
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Inputs
import typings.atPulumiPulumi.resourceMod.Resource
import typings.std.Map
import typings.std.Record
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/runtime/rpc", JSImport.Namespace)
@js.native
object runtimeRpcMod extends js.Object {
  val specialArchiveSig: `0def7320c3a5731c473e5ecbe6d01bc7` = js.native
  val specialAssetSig: c44067f5952c0a294b673a41bacd8c17 = js.native
  val specialSecretSig: `1b47061264138c4ac30d75fd1eb44270` = js.native
  val specialSigKey: `4dabf18193072939515e22adb298388d` = js.native
  val unknownValue: `04da6b54-80e4-46f7-96ec-b56ff0331ba9` = js.native
  def deserializeProperties(outputsStruct: js.Any): js.Any = js.native
  def deserializeProperty(prop: js.Any): js.Any = js.native
  def resolveProperties(
    res: Resource,
    resolvers: Record[
      String, 
      js.Function3[/* v */ _, /* isKnown */ Boolean, /* isSecret */ Boolean, Unit]
    ],
    t: String,
    name: String,
    allProps: js.Any
  ): Unit = js.native
  def serializeProperties(label: String, props: Inputs): js.Promise[Record[String, _]] = js.native
  def serializeProperty(ctx: String, prop: Input[_], dependentResources: Set[Resource]): js.Promise[_] = js.native
  def serializeResourceProperties(label: String, props: Inputs): js.Promise[js.Tuple2[Record[String, _], Map[String, Set[Resource]]]] = js.native
  def transferProperties(onto: Resource, label: String, props: Inputs): OutputResolvers = js.native
  type OutputResolvers = Record[
    String, 
    js.Function3[/* value */ js.Any, /* isStable */ Boolean, /* isSecret */ Boolean, Unit]
  ]
}

