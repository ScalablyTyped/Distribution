package typings.reactMdUtils.anon

import typings.reactMdUtils.reactMdUtilsStrings.absolute
import typings.reactMdUtils.reactMdUtilsStrings.fixed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @react-md/utils.@react-md/utils/types/positioning/types.Coords & {  position :'fixed' | 'absolute',   transformOrigin :string | undefined} */
@js.native
trait Coordspositionfixedabsolu extends js.Object {
  var bottom: js.UndefOr[Double] = js.native
  var left: js.UndefOr[Double] = js.native
  var minWidth: js.UndefOr[Double] = js.native
  var position: fixed | absolute = js.native
  var right: js.UndefOr[Double] = js.native
  var top: js.UndefOr[Double] = js.native
  var transformOrigin: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
}

object Coordspositionfixedabsolu {
  @scala.inline
  def apply(position: fixed | absolute): Coordspositionfixedabsolu = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coordspositionfixedabsolu]
  }
  @scala.inline
  implicit class CoordspositionfixedabsoluOps[Self <: Coordspositionfixedabsolu] (val x: Self) extends AnyVal {
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
    def setPosition(value: fixed | absolute): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setBottom(value: Double): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setRight(value: Double): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    @scala.inline
    def setTransformOrigin(value: String): Self = this.set("transformOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransformOrigin: Self = this.set("transformOrigin", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

