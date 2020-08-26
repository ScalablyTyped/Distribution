package typings.recharts.mod

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreemapProps
  extends EventAttributes
     with Animatable {
  var aspectRatio: js.UndefOr[Double] = js.native
   // As the source code states, dataKey will replace valueKey in 1.1.0 and it'll be required (it's already required in current implementation).
  var children: js.UndefOr[js.Array[ReactNode] | ReactNode] = js.native
  var className: js.UndefOr[String] = js.native
  var content: js.UndefOr[ReactElement | ContentRenderer[_]] = js.native
  var data: js.UndefOr[js.Array[_]] = js.native
  var dataKey: js.UndefOr[DataKey] = js.native
  var fill: js.UndefOr[String] = js.native
  var height: js.UndefOr[Double] = js.native
  var nameKey: js.UndefOr[String | Double | RechartsFunction] = js.native
  var stroke: js.UndefOr[String] = js.native
  var style: js.UndefOr[js.Object] = js.native
  var width: js.UndefOr[Double] = js.native
}

object TreemapProps {
  @scala.inline
  def apply(): TreemapProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreemapProps]
  }
  @scala.inline
  implicit class TreemapPropsOps[Self <: TreemapProps] (val x: Self) extends AnyVal {
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
    def setAspectRatio(value: Double): Self = this.set("aspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAspectRatio: Self = this.set("aspectRatio", js.undefined)
    @scala.inline
    def setChildrenVarargs(value: ReactNode*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[ReactNode] | ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setContentFunction1(value: _ => ReactNode): Self = this.set("content", js.Any.fromFunction1(value))
    @scala.inline
    def setContent(value: ReactElement | ContentRenderer[_]): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDataKeyFunction1(value: /* dataObject */ js.Any => String | Double | (js.Tuple2[Double, Double]) | Null): Self = this.set("dataKey", js.Any.fromFunction1(value))
    @scala.inline
    def setDataKey(value: DataKey): Self = this.set("dataKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataKey: Self = this.set("dataKey", js.undefined)
    @scala.inline
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setNameKeyFunction1(value: /* repeated */ js.Any => Unit): Self = this.set("nameKey", js.Any.fromFunction1(value))
    @scala.inline
    def setNameKey(value: String | Double | RechartsFunction): Self = this.set("nameKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNameKey: Self = this.set("nameKey", js.undefined)
    @scala.inline
    def setStroke(value: String): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

