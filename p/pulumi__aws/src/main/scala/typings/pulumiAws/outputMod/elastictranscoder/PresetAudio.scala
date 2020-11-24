package typings.pulumiAws.outputMod.elastictranscoder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PresetAudio extends js.Object {
  
  /**
    * The method of organizing audio channels and tracks. Use Audio:Channels to specify the number of channels in your output, and Audio:AudioPackingMode to specify the number of tracks and their relation to the channels. If you do not specify an Audio:AudioPackingMode, Elastic Transcoder uses SingleTrack.
    */
  var audioPackingMode: js.UndefOr[String] = js.native
  
  /**
    * The bit rate of the audio stream in the output file, in kilobits/second. Enter an integer between 64 and 320, inclusive.
    */
  var bitRate: js.UndefOr[String] = js.native
  
  /**
    * The number of audio channels in the output file
    */
  var channels: js.UndefOr[String] = js.native
  
  /**
    * The audio codec for the output file. Valid values are `AAC`, `flac`, `mp2`, `mp3`, `pcm`, and `vorbis`.
    */
  var codec: js.UndefOr[String] = js.native
  
  /**
    * The sample rate of the audio stream in the output file, in hertz. Valid values are: `auto`, `22050`, `32000`, `44100`, `48000`, `96000`
    */
  var sampleRate: js.UndefOr[String] = js.native
}
object PresetAudio {
  
  @scala.inline
  def apply(): PresetAudio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PresetAudio]
  }
  
  @scala.inline
  implicit class PresetAudioOps[Self <: PresetAudio] (val x: Self) extends AnyVal {
    
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
    def setAudioPackingMode(value: String): Self = this.set("audioPackingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioPackingMode: Self = this.set("audioPackingMode", js.undefined)
    
    @scala.inline
    def setBitRate(value: String): Self = this.set("bitRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBitRate: Self = this.set("bitRate", js.undefined)
    
    @scala.inline
    def setChannels(value: String): Self = this.set("channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannels: Self = this.set("channels", js.undefined)
    
    @scala.inline
    def setCodec(value: String): Self = this.set("codec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodec: Self = this.set("codec", js.undefined)
    
    @scala.inline
    def setSampleRate(value: String): Self = this.set("sampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampleRate: Self = this.set("sampleRate", js.undefined)
  }
}
