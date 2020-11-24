package typings.rcDrawer.idrawerproptypesMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDrawerChildProps extends IProps {
  
  var getContainer: js.UndefOr[js.Function0[HTMLElement]] = js.native
  
  var getOpenCount: js.UndefOr[js.Function0[Double]] = js.native
  
  var switchScrollingEffect: js.UndefOr[js.Function1[/* close */ js.UndefOr[Boolean], Unit]] = js.native
}
object IDrawerChildProps {
  
  @scala.inline
  def apply(): IDrawerChildProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDrawerChildProps]
  }
  
  @scala.inline
  implicit class IDrawerChildPropsOps[Self <: IDrawerChildProps] (val x: Self) extends AnyVal {
    
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
    def setGetContainer(value: () => HTMLElement): Self = this.set("getContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetContainer: Self = this.set("getContainer", js.undefined)
    
    @scala.inline
    def setGetOpenCount(value: () => Double): Self = this.set("getOpenCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetOpenCount: Self = this.set("getOpenCount", js.undefined)
    
    @scala.inline
    def setSwitchScrollingEffect(value: /* close */ js.UndefOr[Boolean] => Unit): Self = this.set("switchScrollingEffect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSwitchScrollingEffect: Self = this.set("switchScrollingEffect", js.undefined)
  }
}
