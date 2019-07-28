package typings.atPulumiAws.elastictranscoderPresetMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_AspectRatio
import typings.atPulumiAws.Anon_AspectRatioBitRate
import typings.atPulumiAws.Anon_AudioPackingMode
import typings.atPulumiAws.Anon_BitDepth
import typings.atPulumiAws.Anon_HorizontalAlign
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elastictranscoder/preset", "Preset")
@js.native
class Preset protected () extends CustomResource {
  /**
    * Create a Preset resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: PresetArgs) = this()
  def this(name: String, args: PresetArgs, opts: CustomResourceOptions) = this()
  val arn: Output[String] = js.native
  /**
    * Audio parameters object (documented below).
    */
  val audio: Output[js.UndefOr[Anon_AudioPackingMode]] = js.native
  /**
    * Codec options for the audio parameters (documented below)
    */
  val audioCodecOptions: Output[js.UndefOr[Anon_BitDepth]] = js.native
  /**
    * The container type for the output file. Valid values are `flac`, `flv`, `fmp4`, `gif`, `mp3`, `mp4`, `mpg`, `mxf`, `oga`, `ogg`, `ts`, and `webm`.
    */
  val container: Output[String] = js.native
  /**
    * A description of the preset (maximum 255 characters)
    */
  val description: Output[js.UndefOr[String]] = js.native
  /**
    * The name of the preset. (maximum 40 characters)
    */
  val name: Output[String] = js.native
  /**
    * Thumbnail parameters object (documented below)
    */
  val thumbnails: Output[js.UndefOr[Anon_AspectRatio]] = js.native
  val `type`: Output[String] = js.native
  /**
    * Video parameters object (documented below)
    */
  val video: Output[js.UndefOr[Anon_AspectRatioBitRate]] = js.native
  val videoCodecOptions: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * Watermark parameters for the video parameters (documented below)
    * * `video_codec_options` (Optional, Forces new resource) Codec options for the video parameters
    */
  val videoWatermarks: Output[js.UndefOr[js.Array[Anon_HorizontalAlign]]] = js.native
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
  def get(name: String, id: Input[ID]): Preset = js.native
  def get(name: String, id: Input[ID], state: PresetState): Preset = js.native
  def get(name: String, id: Input[ID], state: PresetState, opts: CustomResourceOptions): Preset = js.native
  /**
    * Returns true if the given object is an instance of Preset.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elastictranscoder/preset.Preset */ Boolean = js.native
}

