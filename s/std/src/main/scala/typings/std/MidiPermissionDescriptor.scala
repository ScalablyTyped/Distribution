package typings.std

import typings.std.stdStrings.midi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MidiPermissionDescriptor extends PermissionDescriptor {
  
  @JSName("name")
  var name_MidiPermissionDescriptor: midi = js.native
  
  var sysex: js.UndefOr[scala.Boolean] = js.native
}
object MidiPermissionDescriptor {
  
  @scala.inline
  def apply(name: midi): MidiPermissionDescriptor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MidiPermissionDescriptor]
  }
  
  @scala.inline
  implicit class MidiPermissionDescriptorOps[Self <: MidiPermissionDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: midi): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSysex(value: scala.Boolean): Self = this.set("sysex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSysex: Self = this.set("sysex", js.undefined)
  }
}
