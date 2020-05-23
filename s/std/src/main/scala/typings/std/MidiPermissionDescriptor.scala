package typings.std

import typings.std.stdStrings.midi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MidiPermissionDescriptor extends PermissionDescriptor {
  @JSName("name")
  var name_MidiPermissionDescriptor: midi
  var sysex: js.UndefOr[scala.Boolean] = js.undefined
}

object MidiPermissionDescriptor {
  @scala.inline
  def apply(name: midi, sysex: js.UndefOr[scala.Boolean] = js.undefined): MidiPermissionDescriptor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(sysex)) __obj.updateDynamic("sysex")(sysex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MidiPermissionDescriptor]
  }
}

