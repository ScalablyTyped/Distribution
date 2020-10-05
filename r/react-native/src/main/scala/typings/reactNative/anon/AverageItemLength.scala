package typings.reactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AverageItemLength extends js.Object {
  var averageItemLength: Double = js.native
  var highestMeasuredFrameIndex: Double = js.native
  var index: Double = js.native
}

object AverageItemLength {
  @scala.inline
  def apply(averageItemLength: Double, highestMeasuredFrameIndex: Double, index: Double): AverageItemLength = {
    val __obj = js.Dynamic.literal(averageItemLength = averageItemLength.asInstanceOf[js.Any], highestMeasuredFrameIndex = highestMeasuredFrameIndex.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[AverageItemLength]
  }
  @scala.inline
  implicit class AverageItemLengthOps[Self <: AverageItemLength] (val x: Self) extends AnyVal {
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
    def setAverageItemLength(value: Double): Self = this.set("averageItemLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setHighestMeasuredFrameIndex(value: Double): Self = this.set("highestMeasuredFrameIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
  }
  
}

