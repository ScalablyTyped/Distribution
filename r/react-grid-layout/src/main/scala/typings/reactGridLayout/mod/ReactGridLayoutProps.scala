package typings.reactGridLayout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactGridLayoutProps extends CoreProps {
  /**
    * Number of columns in this layout.
    */
  var cols: js.UndefOr[Double] = js.native
  /**
    * Padding inside the container `[x, y]` in px.
    */
  var containerPadding: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  /**
    * Layout is an array of object with the format:
    *
    * `{x: number, y: number, w: number, h: number}`
    *
    * The index into the layout must match the key used on each item component.
    * If you choose to use custom keys, you can specify that key in the layout
    * array objects like so:
    *
    * `{i: string, x: number, y: number, w: number, h: number}`
    *
    * If not provided, use data-grid props on children.
    */
  var layout: js.UndefOr[js.Array[Layout]] = js.native
  /**
    * Margin between items `[x, y]` in px.
    */
  var margin: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  /**
    * Callback so you can save the layout.
    * Calls back with (currentLayout) after every drag or resize stop.
    */
  var onLayoutChange: js.UndefOr[js.Function1[/* layout */ js.Array[Layout], Unit]] = js.native
}

object ReactGridLayoutProps {
  @scala.inline
  def apply(): ReactGridLayoutProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactGridLayoutProps]
  }
  @scala.inline
  implicit class ReactGridLayoutPropsOps[Self <: ReactGridLayoutProps] (val x: Self) extends AnyVal {
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
    def setCols(value: Double): Self = this.set("cols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCols: Self = this.set("cols", js.undefined)
    @scala.inline
    def setContainerPadding(value: js.Tuple2[Double, Double]): Self = this.set("containerPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerPadding: Self = this.set("containerPadding", js.undefined)
    @scala.inline
    def setLayoutVarargs(value: Layout*): Self = this.set("layout", js.Array(value :_*))
    @scala.inline
    def setLayout(value: js.Array[Layout]): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setMargin(value: js.Tuple2[Double, Double]): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setOnLayoutChange(value: /* layout */ js.Array[Layout] => Unit): Self = this.set("onLayoutChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLayoutChange: Self = this.set("onLayoutChange", js.undefined)
  }
  
}

