package typings
package atPulumiAwsLib.elastictranscoderPresetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elastictranscoder/preset", "Preset")
@js.native
class Preset protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a Preset resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: PresetArgs) = this()
  def this(name: java.lang.String, args: PresetArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  val arn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Audio parameters object (documented below).
    */
  val audio: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[atPulumiAwsLib.Anon_AudioPackingMode]] = js.native
  /**
    * Codec options for the audio parameters (documented below)
    */
  val audioCodecOptions: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[atPulumiAwsLib.Anon_BitDepth]] = js.native
  /**
    * The container type for the output file. Valid values are `flac`, `flv`, `fmp4`, `gif`, `mp3`, `mp4`, `mpg`, `mxf`, `oga`, `ogg`, `ts`, and `webm`.
    */
  val container: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * A description of the preset (maximum 255 characters)
    */
  val description: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The name of the preset. (maximum 40 characters)
    */
  val name: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Thumbnail parameters object (documented below)
    */
  val thumbnails: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[atPulumiAwsLib.Anon_AspectRatio]] = js.native
  val `type`: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Video parameters object (documented below)
    */
  val video: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[atPulumiAwsLib.Anon_AspectRatioBitRate]] = js.native
  val videoCodecOptions: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  /**
    * Watermark parameters for the video parameters (documented below)
    * * `video_codec_options` (Optional, Forces new resource) Codec options for the video parameters
    */
  val videoWatermarks: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_HorizontalAlign]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/elastictranscoder/preset", "Preset")
@js.native
object Preset extends js.Object {
  /**
    * Get an existing Preset resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.elastictranscoderPresetMod.Preset = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.elastictranscoderPresetMod.PresetState
  ): atPulumiAwsLib.elastictranscoderPresetMod.Preset = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.elastictranscoderPresetMod.PresetState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.elastictranscoderPresetMod.Preset = js.native
}

