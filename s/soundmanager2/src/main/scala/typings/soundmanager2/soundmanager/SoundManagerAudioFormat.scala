package typings.soundmanager2.soundmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SoundManagerAudioFormat extends js.Object {
  
  var related: js.UndefOr[js.Array[String]] = js.native
  
  var required: Boolean = js.native
  
  var `type`: js.Array[String] = js.native
}
object SoundManagerAudioFormat {
  
  @scala.inline
  def apply(required: Boolean, `type`: js.Array[String]): SoundManagerAudioFormat = {
    val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoundManagerAudioFormat]
  }
  
  @scala.inline
  implicit class SoundManagerAudioFormatOps[Self <: SoundManagerAudioFormat] (val x: Self) extends AnyVal {
    
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
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeVarargs(value: String*): Self = this.set("type", js.Array(value :_*))
    
    @scala.inline
    def setType(value: js.Array[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedVarargs(value: String*): Self = this.set("related", js.Array(value :_*))
    
    @scala.inline
    def setRelated(value: js.Array[String]): Self = this.set("related", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelated: Self = this.set("related", js.undefined)
  }
}
