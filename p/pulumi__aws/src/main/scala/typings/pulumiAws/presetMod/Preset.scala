package typings.pulumiAws.presetMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.elastictranscoder.PresetAudio
import typings.pulumiAws.outputMod.elastictranscoder.PresetAudioCodecOptions
import typings.pulumiAws.outputMod.elastictranscoder.PresetThumbnails
import typings.pulumiAws.outputMod.elastictranscoder.PresetVideo
import typings.pulumiAws.outputMod.elastictranscoder.PresetVideoWatermark
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  val arn: Output_[String] = js.native
  
  /**
    * Audio parameters object (documented below).
    */
  val audio: Output_[js.UndefOr[PresetAudio]] = js.native
  
  /**
    * Codec options for the audio parameters (documented below)
    */
  val audioCodecOptions: Output_[js.UndefOr[PresetAudioCodecOptions]] = js.native
  
  /**
    * The container type for the output file. Valid values are `flac`, `flv`, `fmp4`, `gif`, `mp3`, `mp4`, `mpg`, `mxf`, `oga`, `ogg`, `ts`, and `webm`.
    */
  val container: Output_[String] = js.native
  
  /**
    * A description of the preset (maximum 255 characters)
    */
  val description: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The name of the preset. (maximum 40 characters)
    */
  val name: Output_[String] = js.native
  
  /**
    * Thumbnail parameters object (documented below)
    */
  val thumbnails: Output_[js.UndefOr[PresetThumbnails]] = js.native
  
  val `type`: Output_[String] = js.native
  
  /**
    * Video parameters object (documented below)
    */
  val video: Output_[js.UndefOr[PresetVideo]] = js.native
  
  /**
    * Codec options for the video parameters
    */
  val videoCodecOptions: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * Watermark parameters for the video parameters (documented below)
    */
  val videoWatermarks: Output_[js.UndefOr[js.Array[PresetVideoWatermark]]] = js.native
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
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Preset = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Preset = js.native
  def get(name: String, id: Input[ID], state: PresetState): Preset = js.native
  def get(name: String, id: Input[ID], state: PresetState, opts: CustomResourceOptions): Preset = js.native
  
  /**
    * Returns true if the given object is an instance of Preset.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elastictranscoder/preset.Preset */ Boolean = js.native
}
