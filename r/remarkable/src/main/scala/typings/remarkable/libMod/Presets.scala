package typings.remarkable.libMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Presets extends js.Object {
  var components: StringDictionary[typings.remarkable.anon.Rules] = js.native
  var options: Options = js.native
}

object Presets {
  @scala.inline
  def apply(components: StringDictionary[typings.remarkable.anon.Rules], options: Options): Presets = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Presets]
  }
  @scala.inline
  implicit class PresetsOps[Self <: Presets] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setComponents(value: StringDictionary[typings.remarkable.anon.Rules]): Self = this.set("components", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: Options): Self = this.set("options", value.asInstanceOf[js.Any])
  }
  
}

