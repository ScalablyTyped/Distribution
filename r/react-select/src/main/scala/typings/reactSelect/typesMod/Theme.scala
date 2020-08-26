package typings.reactSelect.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Theme extends js.Object {
  var borderRadius: Double = js.native
  var colors: StringDictionary[String] = js.native
  var spacing: ThemeSpacing = js.native
}

object Theme {
  @scala.inline
  def apply(borderRadius: Double, colors: StringDictionary[String], spacing: ThemeSpacing): Theme = {
    val __obj = js.Dynamic.literal(borderRadius = borderRadius.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme]
  }
  @scala.inline
  implicit class ThemeOps[Self <: Theme] (val x: Self) extends AnyVal {
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
    def setBorderRadius(value: Double): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def setColors(value: StringDictionary[String]): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpacing(value: ThemeSpacing): Self = this.set("spacing", value.asInstanceOf[js.Any])
  }
  
}

