package typings.remarkable.libMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Presets extends js.Object {
  var components: StringDictionary[typings.remarkable.anon.Rules]
  var options: Options
}

object Presets {
  @scala.inline
  def apply(components: StringDictionary[typings.remarkable.anon.Rules], options: Options): Presets = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Presets]
  }
}

