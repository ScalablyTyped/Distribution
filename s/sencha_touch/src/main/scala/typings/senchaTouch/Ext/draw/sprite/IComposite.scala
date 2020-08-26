package typings.senchaTouch.Ext.draw.sprite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IComposite extends ISprite {
  /** [Method] Adds a sprite to the composite
    * @param sprite Object
    */
  var add: js.UndefOr[js.Function1[/* sprite */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Renders all sprites contained in the composite to the surface
    * @param surface Object
    * @param ctx Object
    * @param region Object
    */
  @JSName("render")
  var render_IComposite: js.UndefOr[
    js.Function3[
      /* surface */ js.UndefOr[js.Any], 
      /* ctx */ js.UndefOr[js.Any], 
      /* region */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
}

object IComposite {
  @scala.inline
  def apply(): IComposite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IComposite]
  }
  @scala.inline
  implicit class ICompositeOps[Self <: IComposite] (val x: Self) extends AnyVal {
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
    def setAdd(value: /* sprite */ js.UndefOr[js.Any] => Unit): Self = this.set("add", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    @scala.inline
    def setRender(
      value: (/* surface */ js.UndefOr[js.Any], /* ctx */ js.UndefOr[js.Any], /* region */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("render", js.Any.fromFunction3(value))
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
  }
  
}

