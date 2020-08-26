package typings.qtip2.QTip2

import typings.qtip2.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Position extends js.Object {
  var adjust: js.UndefOr[PositionAdjust] = js.native
  var at: js.UndefOr[String | Boolean] = js.native
  var container: js.UndefOr[JQuery | Boolean] = js.native
  var effect: js.UndefOr[
    Boolean | (js.Function3[/* api */ Api, /* pos */ js.Any, /* viewport */ js.Any, Unit])
  ] = js.native
  var my: js.UndefOr[String | Boolean] = js.native
  var target: js.UndefOr[Target | Boolean] = js.native
  var viewport: js.UndefOr[JQuery | Boolean] = js.native
}

object Position {
  @scala.inline
  def apply(): Position = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Position]
  }
  @scala.inline
  implicit class PositionOps[Self <: Position] (val x: Self) extends AnyVal {
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
    def setAdjust(value: PositionAdjust): Self = this.set("adjust", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdjust: Self = this.set("adjust", js.undefined)
    @scala.inline
    def setAt(value: String | Boolean): Self = this.set("at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAt: Self = this.set("at", js.undefined)
    @scala.inline
    def setContainer(value: JQuery | Boolean): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setEffectFunction3(value: (/* api */ Api, /* pos */ js.Any, /* viewport */ js.Any) => Unit): Self = this.set("effect", js.Any.fromFunction3(value))
    @scala.inline
    def setEffect(value: Boolean | (js.Function3[/* api */ Api, /* pos */ js.Any, /* viewport */ js.Any, Unit])): Self = this.set("effect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEffect: Self = this.set("effect", js.undefined)
    @scala.inline
    def setMy(value: String | Boolean): Self = this.set("my", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMy: Self = this.set("my", js.undefined)
    @scala.inline
    def setTargetVarargs(value: Double*): Self = this.set("target", js.Array(value :_*))
    @scala.inline
    def setTarget(value: Target | Boolean): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setViewport(value: JQuery | Boolean): Self = this.set("viewport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewport: Self = this.set("viewport", js.undefined)
  }
  
}

