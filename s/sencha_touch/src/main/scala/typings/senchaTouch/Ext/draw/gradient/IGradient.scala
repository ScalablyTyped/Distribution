package typings.senchaTouch.Ext.draw.gradient

import typings.senchaTouch.Ext.draw.engine.ISvgContext
import typings.senchaTouch.Ext.mixin.IIdentifiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGradient extends IIdentifiable {
  /** [Config Option] (Array/Object) */
  var Defines: js.UndefOr[js.Any] = js.native
  /** [Method] Generates the gradient for the given context
    * @param ctx Ext.draw.engine.SvgContext The context.
    * @param bbox Object
    * @returns Object
    */
  var generateGradient: js.UndefOr[
    js.Function2[/* ctx */ js.UndefOr[ISvgContext], /* bbox */ js.UndefOr[js.Any], _]
  ] = js.native
  /** [Method] Retrieves the id of this component
    * @returns String id
    */
  @JSName("getId")
  var getId_IGradient: js.UndefOr[js.Function0[String]] = js.native
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
    def setDefines(value: js.Any): Self = this.set("Defines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefines: Self = this.set("Defines", js.undefined)
    @scala.inline
    def setGenerateGradient(value: (/* ctx */ js.UndefOr[ISvgContext], /* bbox */ js.UndefOr[js.Any]) => _): Self = this.set("generateGradient", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGenerateGradient: Self = this.set("generateGradient", js.undefined)
    @scala.inline
    def setGetId(value: () => String): Self = this.set("getId", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetId: Self = this.set("getId", js.undefined)
  }
  
}

