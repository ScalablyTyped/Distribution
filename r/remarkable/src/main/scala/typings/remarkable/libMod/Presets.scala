package typings.remarkable.libMod

import org.scalablytyped.runtime.StringDictionary
import typings.remarkable.Anon_Rules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Presets extends js.Object {
  var components: StringDictionary[Anon_Rules]
  var options: Options
}

object Presets {
  @scala.inline
  def apply(components: StringDictionary[Anon_Rules], options: Options): Presets = {
    val __obj = js.Dynamic.literal(components = components, options = options)
  
    __obj.asInstanceOf[Presets]
  }
}

