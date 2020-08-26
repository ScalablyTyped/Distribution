package typings.senchaTouch.Ext.draw.engine.svgcontext

import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGradient extends IBase {
  /** [Method] Adds a color stop with the given color to the gradient at the given offset
    * @param offset Number
    * @param color String
    */
  var addColorStop: js.UndefOr[
    js.Function2[/* offset */ js.UndefOr[Double], /* color */ js.UndefOr[String], Unit]
  ] = js.native
}

object IGradient {
  @scala.inline
  def apply(): IGradient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGradient]
  }
  @scala.inline
  implicit class IGradientOps[Self <: IGradient] (val x: Self) extends AnyVal {
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
    def setAddColorStop(value: (/* offset */ js.UndefOr[Double], /* color */ js.UndefOr[String]) => Unit): Self = this.set("addColorStop", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAddColorStop: Self = this.set("addColorStop", js.undefined)
  }
  
}

