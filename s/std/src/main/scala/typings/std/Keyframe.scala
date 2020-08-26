package typings.std

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Keyframe
  extends /* property */ StringDictionary[js.UndefOr[java.lang.String | Double | Null]] {
  var composite: js.UndefOr[CompositeOperationOrAuto] = js.native
  var easing: js.UndefOr[java.lang.String] = js.native
  var offset: js.UndefOr[Double | Null] = js.native
}

object Keyframe {
  @scala.inline
  def apply(): Keyframe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Keyframe]
  }
  @scala.inline
  implicit class KeyframeOps[Self <: Keyframe] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setComposite(value: CompositeOperationOrAuto): Self = this.set("composite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComposite: Self = this.set("composite", js.undefined)
    @scala.inline
    def setEasing(value: java.lang.String): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setOffsetNull: Self = this.set("offset", null)
  }
  
}

