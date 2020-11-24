package typings.senchaTouch.Ext.layout

import typings.senchaTouch.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDefault extends IAbstract {
  
  /** [Config Option] (Ext.fx.layout.Card) */
  var animation: js.UndefOr[typings.senchaTouch.Ext.fx.layout.ICard] = js.native
  
  /** [Method] Returns the value of animation
    * @returns Ext.fx.layout.Card
    */
  var getAnimation: js.UndefOr[js.Function0[typings.senchaTouch.Ext.fx.layout.ICard]] = js.native
  
  /** [Method]
    * @param item Ext.Component
    * @param isInner Boolean
    * @param destroying Boolean
    */
  var onItemInnerStateChange: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[IComponent], 
      /* isInner */ js.UndefOr[Boolean], 
      /* destroying */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.native
  
  /** [Method] Sets the value of animation
    * @param animation Ext.fx.layout.Card The new value.
    */
  var setAnimation: js.UndefOr[
    js.Function1[/* animation */ js.UndefOr[typings.senchaTouch.Ext.fx.layout.ICard], Unit]
  ] = js.native
}
object IDefault {
  
  @scala.inline
  def apply(): IDefault = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDefault]
  }
  
  @scala.inline
  implicit class IDefaultOps[Self <: IDefault] (val x: Self) extends AnyVal {
    
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
    def setAnimation(value: typings.senchaTouch.Ext.fx.layout.ICard): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setGetAnimation(value: () => typings.senchaTouch.Ext.fx.layout.ICard): Self = this.set("getAnimation", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAnimation: Self = this.set("getAnimation", js.undefined)
    
    @scala.inline
    def setOnItemInnerStateChange(
      value: (/* item */ js.UndefOr[IComponent], /* isInner */ js.UndefOr[Boolean], /* destroying */ js.UndefOr[Boolean]) => Unit
    ): Self = this.set("onItemInnerStateChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnItemInnerStateChange: Self = this.set("onItemInnerStateChange", js.undefined)
    
    @scala.inline
    def setSetAnimation(value: /* animation */ js.UndefOr[typings.senchaTouch.Ext.fx.layout.ICard] => Unit): Self = this.set("setAnimation", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetAnimation: Self = this.set("setAnimation", js.undefined)
  }
}
