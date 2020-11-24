package typings.senchaTouch.Ext.draw.engine

import typings.senchaTouch.Ext.draw.ISurface
import typings.senchaTouch.Ext.draw.sprite.ISprite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISvg extends ISurface {
  
  /** [Method] Clears the current transformation state on the surface  */
  var clearTransform: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Creates a DOM element under the SVG namespace of the given type
    * @param type String The type of the SVG DOM element.
    * @returns * The created element.
    */
  var createSvgNode: js.UndefOr[js.Function1[/* type */ js.UndefOr[String], _]] = js.native
  
  /** [Method] Destroys the Canvas element and prepares it for Garbage Collection
    * @param path Object
    * @param matrix Object
    * @param band Object
    */
  @JSName("destroy")
  var destroy_ISvg: js.UndefOr[
    js.Function3[
      /* path */ js.UndefOr[js.Any], 
      /* matrix */ js.UndefOr[js.Any], 
      /* band */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  /** [Method] Returns the value of highPrecision
    * @returns Boolean
    */
  var getHighPrecision: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Config Option] (Boolean) */
  var highPrecision: js.UndefOr[Boolean] = js.native
  
  /** [Method] Remove a given sprite from the surface optionally destroying the sprite in the process
    * @param sprite Object
    * @param destroySprite Object
    */
  @JSName("remove")
  var remove_ISvg: js.UndefOr[
    js.Function2[/* sprite */ js.UndefOr[js.Any], /* destroySprite */ js.UndefOr[js.Any], Unit]
  ] = js.native
  
  /** [Method] Renders a single sprite into the surface
    * @param sprite Ext.draw.sprite.Sprite The Sprite to be rendered.
    * @returns Boolean returns false to stop the rendering to continue.
    */
  var renderSprite: js.UndefOr[js.Function1[/* sprite */ js.UndefOr[ISprite], Boolean]] = js.native
  
  /** [Method] Sets the value of highPrecision
    * @param highPrecision Boolean The new value.
    */
  var setHighPrecision: js.UndefOr[js.Function1[/* highPrecision */ js.UndefOr[Boolean], Unit]] = js.native
}
object ISvg {
  
  @scala.inline
  def apply(): ISvg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISvg]
  }
  
  @scala.inline
  implicit class ISvgOps[Self <: ISvg] (val x: Self) extends AnyVal {
    
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
    def setCreateSvgNode(value: /* type */ js.UndefOr[String] => _): Self = this.set("createSvgNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCreateSvgNode: Self = this.set("createSvgNode", js.undefined)
    
    @scala.inline
    def setDestroy(
      value: (/* path */ js.UndefOr[js.Any], /* matrix */ js.UndefOr[js.Any], /* band */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("destroy", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    
    @scala.inline
    def setGetHighPrecision(value: () => Boolean): Self = this.set("getHighPrecision", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetHighPrecision: Self = this.set("getHighPrecision", js.undefined)
    
    @scala.inline
    def setHighPrecision(value: Boolean): Self = this.set("highPrecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighPrecision: Self = this.set("highPrecision", js.undefined)
    
    @scala.inline
    def setRemove(value: (/* sprite */ js.UndefOr[js.Any], /* destroySprite */ js.UndefOr[js.Any]) => Unit): Self = this.set("remove", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    
    @scala.inline
    def setRenderSprite(value: /* sprite */ js.UndefOr[ISprite] => Boolean): Self = this.set("renderSprite", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderSprite: Self = this.set("renderSprite", js.undefined)
    
    @scala.inline
    def setSetHighPrecision(value: /* highPrecision */ js.UndefOr[Boolean] => Unit): Self = this.set("setHighPrecision", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetHighPrecision: Self = this.set("setHighPrecision", js.undefined)
  }
}
