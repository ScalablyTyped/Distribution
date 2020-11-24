package typings.rcDialog.dialogMod

import typings.rcDialog.idialogproptypesMod.IDialogPropTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDialogChildProps extends IDialogPropTypes {
  
  def getOpenCount(): Double = js.native
  
  var switchScrollingEffect: js.UndefOr[js.Function0[Unit]] = js.native
}
object IDialogChildProps {
  
  @scala.inline
  def apply(getOpenCount: () => Double): IDialogChildProps = {
    val __obj = js.Dynamic.literal(getOpenCount = js.Any.fromFunction0(getOpenCount))
    __obj.asInstanceOf[IDialogChildProps]
  }
  
  @scala.inline
  implicit class IDialogChildPropsOps[Self <: IDialogChildProps] (val x: Self) extends AnyVal {
    
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
    def setGetOpenCount(value: () => Double): Self = this.set("getOpenCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSwitchScrollingEffect(value: () => Unit): Self = this.set("switchScrollingEffect", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSwitchScrollingEffect: Self = this.set("switchScrollingEffect", js.undefined)
  }
}
