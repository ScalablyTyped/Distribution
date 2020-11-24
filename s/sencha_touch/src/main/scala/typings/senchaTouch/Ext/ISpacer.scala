package typings.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISpacer extends IComponent {
  
  /** [Method] Sets the value of width
    * @param width Number The new value.
    */
  @JSName("setWidth")
  var setWidth_ISpacer: js.UndefOr[js.Function1[/* width */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Config Option] (Number) */
  @JSName("width")
  var width_ISpacer: js.UndefOr[Double] = js.native
}
object ISpacer {
  
  @scala.inline
  def apply(): ISpacer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISpacer]
  }
  
  @scala.inline
  implicit class ISpacerOps[Self <: ISpacer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSetWidth(value: /* width */ js.UndefOr[Double] => Unit): Self = this.set("setWidth", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetWidth: Self = this.set("setWidth", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
