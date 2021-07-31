package typings.std

import typings.std.stdStrings.midi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MidiPermissionDescriptor
  extends StObject
     with PermissionDescriptor {
  
  @JSName("name")
  var name_MidiPermissionDescriptor: midi
  
  var sysex: js.UndefOr[scala.Boolean] = js.undefined
}
object MidiPermissionDescriptor {
  
  @scala.inline
  def apply(): MidiPermissionDescriptor = {
    val __obj = js.Dynamic.literal(name = "midi")
    __obj.asInstanceOf[MidiPermissionDescriptor]
  }
  
  @scala.inline
  implicit class MidiPermissionDescriptorMutableBuilder[Self <: MidiPermissionDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: midi): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSysex(value: scala.Boolean): Self = StObject.set(x, "sysex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSysexUndefined: Self = StObject.set(x, "sysex", js.undefined)
  }
}
