package typings.reactNativeAwesomeCardIo.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardIOViewProps extends CardIOCommonProps {
  
  /**  This function will be called when the CardIOView completes its work and returns a CreditCard. */
  def didScanCard(card: CardDetails): Unit = js.native
  
  /**  Style props of CardIOViewProps */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
}
object CardIOViewProps {
  
  @scala.inline
  def apply(didScanCard: CardDetails => Unit): CardIOViewProps = {
    val __obj = js.Dynamic.literal(didScanCard = js.Any.fromFunction1(didScanCard))
    __obj.asInstanceOf[CardIOViewProps]
  }
  
  @scala.inline
  implicit class CardIOViewPropsOps[Self <: CardIOViewProps] (val x: Self) extends AnyVal {
    
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
    def setDidScanCard(value: CardDetails => Unit): Self = this.set("didScanCard", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
  }
}
