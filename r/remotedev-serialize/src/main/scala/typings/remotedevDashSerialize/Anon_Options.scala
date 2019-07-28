package typings.remotedevDashSerialize

import typings.remotedevDashSerialize.remotedevDashSerializeMod.DefaultReplacer
import typings.remotedevDashSerialize.remotedevDashSerializeMod.DefaultReviver
import typings.remotedevDashSerialize.remotedevDashSerializeMod.Options
import typings.remotedevDashSerialize.remotedevDashSerializeMod.Replacer
import typings.remotedevDashSerialize.remotedevDashSerializeMod.Reviver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Options extends js.Object {
  var options: Options = js.native
  @JSName("replacer")
  var replacer_Original: Replacer = js.native
  @JSName("reviver")
  var reviver_Original: Reviver = js.native
  def replacer(key: String, value: js.Any, replacer: DefaultReplacer): js.Any = js.native
  def reviver(key: String, value: js.Any, reviver: DefaultReviver): js.Any = js.native
}

