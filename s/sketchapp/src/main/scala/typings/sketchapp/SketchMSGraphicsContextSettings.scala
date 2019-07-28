package typings.sketchapp

import typings.sketchapp.sketchappStrings.graphicsContextSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSGraphicsContextSettings extends js.Object {
  var _class: graphicsContextSettings
  var blendMode: Double
  var do_objectID: js.UndefOr[String] = js.undefined
  var opacity: Double
}

object SketchMSGraphicsContextSettings {
  @scala.inline
  def apply(_class: graphicsContextSettings, blendMode: Double, opacity: Double, do_objectID: String = null): SketchMSGraphicsContextSettings = {
    val __obj = js.Dynamic.literal(_class = _class, blendMode = blendMode, opacity = opacity)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSGraphicsContextSettings]
  }
}

