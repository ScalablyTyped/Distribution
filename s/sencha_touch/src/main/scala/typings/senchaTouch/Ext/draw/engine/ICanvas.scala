package typings.senchaTouch.Ext.draw.engine

import typings.senchaTouch.Ext.draw.ISurface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICanvas extends ISurface {
  
  /** [Method] Clears the current transformation state on the surface  */
  var clearTransform: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Returns the value of highPrecision
    * @returns Boolean
    */
  var getHighPrecision: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Config Option] (Boolean) */
  var highPrecision: js.UndefOr[Boolean] = js.native
  
  /** [Method] Initialize the canvas element  */
  var initElement: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Sets the value of highPrecision
    * @param highPrecision Boolean The new value.
    */
  var setHighPrecision: js.UndefOr[js.Function1[/* highPrecision */ js.UndefOr[Boolean], Unit]] = js.native
}
object ICanvas {
  
  @scala.inline
  def apply(): ICanvas = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICanvas]
  }
  
  @scala.inline
  implicit class ICanvasOps[Self <: ICanvas] (val x: Self) extends AnyVal {
    
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
    def setClearTransform(value: () => Unit): Self = this.set("clearTransform", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteClearTransform: Self = this.set("clearTransform", js.undefined)
    
    @scala.inline
    def setGetHighPrecision(value: () => Boolean): Self = this.set("getHighPrecision", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetHighPrecision: Self = this.set("getHighPrecision", js.undefined)
    
    @scala.inline
    def setHighPrecision(value: Boolean): Self = this.set("highPrecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighPrecision: Self = this.set("highPrecision", js.undefined)
    
    @scala.inline
    def setInitElement(value: () => Unit): Self = this.set("initElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteInitElement: Self = this.set("initElement", js.undefined)
    
    @scala.inline
    def setSetHighPrecision(value: /* highPrecision */ js.UndefOr[Boolean] => Unit): Self = this.set("setHighPrecision", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetHighPrecision: Self = this.set("setHighPrecision", js.undefined)
  }
}
