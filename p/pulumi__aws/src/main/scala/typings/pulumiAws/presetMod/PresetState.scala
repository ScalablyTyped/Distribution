package typings.pulumiAws.presetMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.elastictranscoder.PresetAudio
import typings.pulumiAws.inputMod.elastictranscoder.PresetAudioCodecOptions
import typings.pulumiAws.inputMod.elastictranscoder.PresetThumbnails
import typings.pulumiAws.inputMod.elastictranscoder.PresetVideo
import typings.pulumiAws.inputMod.elastictranscoder.PresetVideoWatermark
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PresetState extends js.Object {
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Audio parameters object (documented below).
    */
  val audio: js.UndefOr[Input[PresetAudio]] = js.native
  /**
    * Codec options for the audio parameters (documented below)
    */
  val audioCodecOptions: js.UndefOr[Input[PresetAudioCodecOptions]] = js.native
  /**
    * The container type for the output file. Valid values are `flac`, `flv`, `fmp4`, `gif`, `mp3`, `mp4`, `mpg`, `mxf`, `oga`, `ogg`, `ts`, and `webm`.
    */
  val container: js.UndefOr[Input[String]] = js.native
  /**
    * A description of the preset (maximum 255 characters)
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the preset. (maximum 40 characters)
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Thumbnail parameters object (documented below)
    */
  val thumbnails: js.UndefOr[Input[PresetThumbnails]] = js.native
  val `type`: js.UndefOr[Input[String]] = js.native
  /**
    * Video parameters object (documented below)
    */
  val video: js.UndefOr[Input[PresetVideo]] = js.native
  /**
    * Codec options for the video parameters
    */
  val videoCodecOptions: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * Watermark parameters for the video parameters (documented below)
    */
  val videoWatermarks: js.UndefOr[Input[js.Array[Input[PresetVideoWatermark]]]] = js.native
}

object PresetState {
  @scala.inline
  def apply(): PresetState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PresetState]
  }
  @scala.inline
  implicit class PresetStateOps[Self <: PresetState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setAudio(value: Input[PresetAudio]): Self = this.set("audio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudio: Self = this.set("audio", js.undefined)
    @scala.inline
    def setAudioCodecOptions(value: Input[PresetAudioCodecOptions]): Self = this.set("audioCodecOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioCodecOptions: Self = this.set("audioCodecOptions", js.undefined)
    @scala.inline
    def setContainer(value: Input[String]): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setThumbnails(value: Input[PresetThumbnails]): Self = this.set("thumbnails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbnails: Self = this.set("thumbnails", js.undefined)
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVideo(value: Input[PresetVideo]): Self = this.set("video", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideo: Self = this.set("video", js.undefined)
    @scala.inline
    def setVideoCodecOptions(value: Input[StringDictionary[Input[String]]]): Self = this.set("videoCodecOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoCodecOptions: Self = this.set("videoCodecOptions", js.undefined)
    @scala.inline
    def setVideoWatermarksVarargs(value: Input[PresetVideoWatermark]*): Self = this.set("videoWatermarks", js.Array(value :_*))
    @scala.inline
    def setVideoWatermarks(value: Input[js.Array[Input[PresetVideoWatermark]]]): Self = this.set("videoWatermarks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoWatermarks: Self = this.set("videoWatermarks", js.undefined)
  }
  
}

