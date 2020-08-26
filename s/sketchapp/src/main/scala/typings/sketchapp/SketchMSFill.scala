package typings.sketchapp

import typings.sketchapp.sketchappStrings.fill
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSFill extends js.Object {
  var _class: fill = js.native
  var color: js.UndefOr[SketchMSColor] = js.native
  var fillType: SketchMSFillTypeEnum = js.native
  var image: js.UndefOr[SketchMSImageDataReference] = js.native
  var isEnabled: Boolean = js.native
  var noiseIndex: Double = js.native
  var noiseIntensity: Double = js.native
  var patternFillType: SketchMSPatternFillTypeEnum = js.native
  var patternTileScale: Double = js.native
}

object SketchMSFill {
  @scala.inline
  def apply(
    _class: fill,
    fillType: SketchMSFillTypeEnum,
    isEnabled: Boolean,
    noiseIndex: Double,
    noiseIntensity: Double,
    patternFillType: SketchMSPatternFillTypeEnum,
    patternTileScale: Double
  ): SketchMSFill = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], fillType = fillType.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], noiseIndex = noiseIndex.asInstanceOf[js.Any], noiseIntensity = noiseIntensity.asInstanceOf[js.Any], patternFillType = patternFillType.asInstanceOf[js.Any], patternTileScale = patternTileScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSFill]
  }
  @scala.inline
  implicit class SketchMSFillOps[Self <: SketchMSFill] (val x: Self) extends AnyVal {
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
    def set_class(value: fill): Self = this.set("_class", value.asInstanceOf[js.Any])
    @scala.inline
    def setFillType(value: SketchMSFillTypeEnum): Self = this.set("fillType", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsEnabled(value: Boolean): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoiseIndex(value: Double): Self = this.set("noiseIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoiseIntensity(value: Double): Self = this.set("noiseIntensity", value.asInstanceOf[js.Any])
    @scala.inline
    def setPatternFillType(value: SketchMSPatternFillTypeEnum): Self = this.set("patternFillType", value.asInstanceOf[js.Any])
    @scala.inline
    def setPatternTileScale(value: Double): Self = this.set("patternTileScale", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: SketchMSColor): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setImage(value: SketchMSImageDataReference): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
  }
  
}

