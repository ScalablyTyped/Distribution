package typings.reactNativeSvg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformProps extends TransformObject {
  var transform: js.UndefOr[ColumnMajorTransformMatrix | String | TransformObject] = js.native
}

object TransformProps {
  @scala.inline
  def apply(): TransformProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformProps]
  }
  @scala.inline
  implicit class TransformPropsOps[Self <: TransformProps] (val x: Self) extends AnyVal {
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
    def setTransform(value: ColumnMajorTransformMatrix | String | TransformObject): Self = this.set("transform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
  }
  
}

