package typings.remarkable.libMod

import org.scalablytyped.runtime.StringDictionary
import typings.remarkable.AnonRules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Presets extends js.Object {
  var components: StringDictionary[AnonRules]
  var options: Options
}

object Presets {
  @scala.inline
  def apply(components: StringDictionary[AnonRules], options: Options): Presets = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Presets]
  }
}

