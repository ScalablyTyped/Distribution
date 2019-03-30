package typings
package remotedevDashSerializeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Options extends js.Object {
  var options: remotedevDashSerializeLib.remotedevDashSerializeMod.Options = js.native
  @JSName("replacer")
  var replacer_Original: remotedevDashSerializeLib.remotedevDashSerializeMod.Replacer = js.native
  @JSName("reviver")
  var reviver_Original: remotedevDashSerializeLib.remotedevDashSerializeMod.Reviver = js.native
  def replacer(
    key: java.lang.String,
    value: js.Any,
    replacer: remotedevDashSerializeLib.remotedevDashSerializeMod.DefaultReplacer
  ): js.Any = js.native
  def reviver(
    key: java.lang.String,
    value: js.Any,
    reviver: remotedevDashSerializeLib.remotedevDashSerializeMod.DefaultReviver
  ): js.Any = js.native
}

