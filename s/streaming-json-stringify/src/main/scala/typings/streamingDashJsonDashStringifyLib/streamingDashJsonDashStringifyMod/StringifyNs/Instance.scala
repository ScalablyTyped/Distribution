package typings
package streamingDashJsonDashStringifyLib.streamingDashJsonDashStringifyMod.StringifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance extends js.Object {
  var closer: java.lang.String = js.native
  var opener: java.lang.String = js.native
  @JSName("replacer")
  var replacer_Original: Replacer = js.native
  var seperator: java.lang.String = js.native
  var space: java.lang.String | scala.Double = js.native
  def replacer(key: java.lang.String, value: js.Any): js.Any = js.native
  def stringifier(value: js.Any, replacer: Replacer, space: java.lang.String): java.lang.String = js.native
  def stringifier(value: js.Any, replacer: Replacer, space: scala.Double): java.lang.String = js.native
}

