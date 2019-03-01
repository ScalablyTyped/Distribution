package typings
package remarkableLib.libMod.RemarkableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Presets extends js.Object {
  var components: org.scalablytyped.runtime.StringDictionary[remarkableLib.Anon_Rules]
  var options: Options
}

object Presets {
  @scala.inline
  def apply(components: org.scalablytyped.runtime.StringDictionary[remarkableLib.Anon_Rules], options: Options): Presets = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("components")(components)
    __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[Presets]
  }
}

