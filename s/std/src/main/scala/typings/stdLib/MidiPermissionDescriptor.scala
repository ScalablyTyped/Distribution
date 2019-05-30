package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MidiPermissionDescriptor extends PermissionDescriptor {
  @JSName("name")
  var name_MidiPermissionDescriptor: stdLib.stdLibStrings.midi
  var sysex: js.UndefOr[scala.Boolean] = js.undefined
}

object MidiPermissionDescriptor {
  @scala.inline
  def apply(name: stdLib.stdLibStrings.midi, sysex: js.UndefOr[scala.Boolean] = js.undefined): MidiPermissionDescriptor = {
    val __obj = js.Dynamic.literal(name = name)
    if (!js.isUndefined(sysex)) __obj.updateDynamic("sysex")(sysex)
    __obj.asInstanceOf[MidiPermissionDescriptor]
  }
}

