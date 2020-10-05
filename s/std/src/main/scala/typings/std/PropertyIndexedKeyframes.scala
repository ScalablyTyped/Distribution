package typings.std

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertyIndexedKeyframes
  extends /* property */ StringDictionary[
      js.UndefOr[java.lang.String | (js.Array[Double | Null | java.lang.String]) | Double | Null]
    ] {
  var composite: js.UndefOr[CompositeOperationOrAuto | js.Array[CompositeOperationOrAuto]] = js.native
  var easing: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.native
  var offset: js.UndefOr[Double | (js.Array[Double | Null])] = js.native
}

object PropertyIndexedKeyframes {
  @scala.inline
  def apply(): PropertyIndexedKeyframes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyIndexedKeyframes]
  }
  @scala.inline
  implicit class PropertyIndexedKeyframesOps[Self <: PropertyIndexedKeyframes] (val x: Self) extends AnyVal {
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
    def setCompositeVarargs(value: CompositeOperationOrAuto*): Self = this.set("composite", js.Array(value :_*))
    @scala.inline
    def setComposite(value: CompositeOperationOrAuto | js.Array[CompositeOperationOrAuto]): Self = this.set("composite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComposite: Self = this.set("composite", js.undefined)
    @scala.inline
    def setEasingVarargs(value: java.lang.String*): Self = this.set("easing", js.Array(value :_*))
    @scala.inline
    def setEasing(value: java.lang.String | js.Array[java.lang.String]): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    @scala.inline
    def setOffsetVarargs(value: (Double | Null)*): Self = this.set("offset", js.Array(value :_*))
    @scala.inline
    def setOffset(value: Double | (js.Array[Double | Null])): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
  }
  
}

