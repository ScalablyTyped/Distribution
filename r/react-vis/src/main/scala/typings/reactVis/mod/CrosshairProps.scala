package typings.reactVis.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactVis.anon.Box
import typings.reactVis.anon.Title
import typings.reactVis.reactVisStrings.left
import typings.reactVis.reactVisStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrosshairProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var innerHeight: js.UndefOr[Double] = js.native
  var innerWidth: js.UndefOr[Double] = js.native
  var itemsFormat: js.UndefOr[js.Function1[/* x */ js.Any, js.Array[Title]]] = js.native
  var marginLeft: js.UndefOr[Double] = js.native
  var marginTop: js.UndefOr[Double] = js.native
  var orientation: js.UndefOr[left | right] = js.native
  var series: js.UndefOr[StringDictionary[js.Any]] = js.native
  var style: js.UndefOr[Box] = js.native
  var titleFormat: js.UndefOr[js.Function1[/* x */ js.Any, Title]] = js.native
  var values: js.UndefOr[js.Array[_]] = js.native
}

object CrosshairProps {
  @scala.inline
  def apply(): CrosshairProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrosshairProps]
  }
  @scala.inline
  implicit class CrosshairPropsOps[Self <: CrosshairProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setInnerHeight(value: Double): Self = this.set("innerHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerHeight: Self = this.set("innerHeight", js.undefined)
    @scala.inline
    def setInnerWidth(value: Double): Self = this.set("innerWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerWidth: Self = this.set("innerWidth", js.undefined)
    @scala.inline
    def setItemsFormat(value: /* x */ js.Any => js.Array[Title]): Self = this.set("itemsFormat", js.Any.fromFunction1(value))
    @scala.inline
    def deleteItemsFormat: Self = this.set("itemsFormat", js.undefined)
    @scala.inline
    def setMarginLeft(value: Double): Self = this.set("marginLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginLeft: Self = this.set("marginLeft", js.undefined)
    @scala.inline
    def setMarginTop(value: Double): Self = this.set("marginTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginTop: Self = this.set("marginTop", js.undefined)
    @scala.inline
    def setOrientation(value: left | right): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setSeries(value: StringDictionary[js.Any]): Self = this.set("series", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    @scala.inline
    def setStyle(value: Box): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTitleFormat(value: /* x */ js.Any => Title): Self = this.set("titleFormat", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTitleFormat: Self = this.set("titleFormat", js.undefined)
    @scala.inline
    def setValuesVarargs(value: js.Any*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[_]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

