package typings.splitJs.mod

import typings.splitJs.splitJsStrings.height
import typings.splitJs.splitJsStrings.horizontal
import typings.splitJs.splitJsStrings.vertical
import typings.splitJs.splitJsStrings.width
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  // Cursor to display while dragging.
  var cursor: js.UndefOr[String] = js.native
  // Direction to split: horizontal or vertical.
  var direction: js.UndefOr[horizontal | vertical] = js.native
  var dragInterval: js.UndefOr[Double] = js.native
  // Called to set the style of each element.
  var elementStyle: js.UndefOr[
    js.Function4[
      /* dimension */ width | height, 
      /* elementSize */ Double, 
      /* gutterSize */ Double, 
      /* index */ Double, 
      CSSStyleDeclarationPartial
    ]
  ] = js.native
  var expandToMin: js.UndefOr[Boolean] = js.native
  // Called to create each gutter element
  var gutter: js.UndefOr[
    js.Function2[/* index */ Double, /* direction */ horizontal | vertical, HTMLElement]
  ] = js.native
  var gutterAlign: js.UndefOr[String] = js.native
  // Gutter size in pixels.
  var gutterSize: js.UndefOr[Double] = js.native
  // Called to set the style of the gutter.
  var gutterStyle: js.UndefOr[
    js.Function3[
      /* dimension */ width | height, 
      /* gutterSize */ Double, 
      /* index */ Double, 
      CSSStyleDeclarationPartial
    ]
  ] = js.native
  // Minimum size of each element.
  var minSize: js.UndefOr[Double | js.Array[Double]] = js.native
  // Callback on drag.
  var onDrag: js.UndefOr[js.Function1[/* sizes */ js.Array[Double], Unit]] = js.native
  // Callback on drag end.
  var onDragEnd: js.UndefOr[js.Function1[/* sizes */ js.Array[Double], Unit]] = js.native
  // Callback on drag start.
  var onDragStart: js.UndefOr[js.Function1[/* sizes */ js.Array[Double], Unit]] = js.native
  // Initial sizes of each element in percents or CSS values.
  var sizes: js.UndefOr[js.Array[Double]] = js.native
  // Snap to minimum size offset in pixels.
  var snapOffset: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    @scala.inline
    def setDirection(value: horizontal | vertical): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setDragInterval(value: Double): Self = this.set("dragInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragInterval: Self = this.set("dragInterval", js.undefined)
    @scala.inline
    def setElementStyle(
      value: (/* dimension */ width | height, /* elementSize */ Double, /* gutterSize */ Double, /* index */ Double) => CSSStyleDeclarationPartial
    ): Self = this.set("elementStyle", js.Any.fromFunction4(value))
    @scala.inline
    def deleteElementStyle: Self = this.set("elementStyle", js.undefined)
    @scala.inline
    def setExpandToMin(value: Boolean): Self = this.set("expandToMin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandToMin: Self = this.set("expandToMin", js.undefined)
    @scala.inline
    def setGutter(value: (/* index */ Double, /* direction */ horizontal | vertical) => HTMLElement): Self = this.set("gutter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGutter: Self = this.set("gutter", js.undefined)
    @scala.inline
    def setGutterAlign(value: String): Self = this.set("gutterAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGutterAlign: Self = this.set("gutterAlign", js.undefined)
    @scala.inline
    def setGutterSize(value: Double): Self = this.set("gutterSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGutterSize: Self = this.set("gutterSize", js.undefined)
    @scala.inline
    def setGutterStyle(
      value: (/* dimension */ width | height, /* gutterSize */ Double, /* index */ Double) => CSSStyleDeclarationPartial
    ): Self = this.set("gutterStyle", js.Any.fromFunction3(value))
    @scala.inline
    def deleteGutterStyle: Self = this.set("gutterStyle", js.undefined)
    @scala.inline
    def setMinSizeVarargs(value: Double*): Self = this.set("minSize", js.Array(value :_*))
    @scala.inline
    def setMinSize(value: Double | js.Array[Double]): Self = this.set("minSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinSize: Self = this.set("minSize", js.undefined)
    @scala.inline
    def setOnDrag(value: /* sizes */ js.Array[Double] => Unit): Self = this.set("onDrag", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDrag: Self = this.set("onDrag", js.undefined)
    @scala.inline
    def setOnDragEnd(value: /* sizes */ js.Array[Double] => Unit): Self = this.set("onDragEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragEnd: Self = this.set("onDragEnd", js.undefined)
    @scala.inline
    def setOnDragStart(value: /* sizes */ js.Array[Double] => Unit): Self = this.set("onDragStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
    @scala.inline
    def setSizesVarargs(value: Double*): Self = this.set("sizes", js.Array(value :_*))
    @scala.inline
    def setSizes(value: js.Array[Double]): Self = this.set("sizes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizes: Self = this.set("sizes", js.undefined)
    @scala.inline
    def setSnapOffset(value: Double): Self = this.set("snapOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapOffset: Self = this.set("snapOffset", js.undefined)
  }
  
}

