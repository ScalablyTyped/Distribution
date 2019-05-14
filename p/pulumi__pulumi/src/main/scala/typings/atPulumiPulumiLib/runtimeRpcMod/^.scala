package typings
package atPulumiPulumiLib.runtimeRpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/runtime/rpc", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val specialArchiveSig: atPulumiPulumiLib.atPulumiPulumiLibStrings.`0def7320c3a5731c473e5ecbe6d01bc7` = js.native
  val specialAssetSig: atPulumiPulumiLib.atPulumiPulumiLibStrings.c44067f5952c0a294b673a41bacd8c17 = js.native
  val specialSecretSig: atPulumiPulumiLib.atPulumiPulumiLibStrings.`1b47061264138c4ac30d75fd1eb44270` = js.native
  val specialSigKey: atPulumiPulumiLib.atPulumiPulumiLibStrings.`4dabf18193072939515e22adb298388d` = js.native
  val unknownValue: atPulumiPulumiLib.atPulumiPulumiLibStrings.`04da6b54-80e4-46f7-96ec-b56ff0331ba9` = js.native
  def deserializeProperties(outputsStruct: js.Any): js.Any = js.native
  def deserializeProperty(prop: js.Any): js.Any = js.native
  def resolveProperties(
    res: atPulumiPulumiLib.resourceMod.Resource,
    resolvers: stdLib.Record[
      java.lang.String, 
      js.Function3[/* v */ _, /* isKnown */ scala.Boolean, /* isSecret */ scala.Boolean, scala.Unit]
    ],
    t: java.lang.String,
    name: java.lang.String,
    allProps: js.Any
  ): scala.Unit = js.native
  def serializeProperties(label: java.lang.String, props: atPulumiPulumiLib.outputMod.Inputs): js.Promise[stdLib.Record[java.lang.String, _]] = js.native
  def serializeProperty(
    ctx: java.lang.String,
    prop: atPulumiPulumiLib.outputMod.Input[_],
    dependentResources: stdLib.Set[atPulumiPulumiLib.resourceMod.Resource]
  ): js.Promise[_] = js.native
  def serializeResourceProperties(label: java.lang.String, props: atPulumiPulumiLib.outputMod.Inputs): js.Promise[
    js.Tuple2[
      stdLib.Record[java.lang.String, _], 
      stdLib.Map[java.lang.String, stdLib.Set[atPulumiPulumiLib.resourceMod.Resource]]
    ]
  ] = js.native
  def transferProperties(
    onto: atPulumiPulumiLib.resourceMod.Resource,
    label: java.lang.String,
    props: atPulumiPulumiLib.outputMod.Inputs
  ): OutputResolvers = js.native
}

