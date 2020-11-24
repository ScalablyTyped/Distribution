package typings.reactNativeMaterialUi.mod

import typings.react.mod.global.JSX.Element
import typings.reactNativeMaterialUi.reactNativeMaterialUiNumbers.`1`
import typings.reactNativeMaterialUi.reactNativeMaterialUiNumbers.`2`
import typings.reactNativeMaterialUi.reactNativeMaterialUiNumbers.`3`
import typings.reactNativeMaterialUi.reactNativeMaterialUiStrings.dynamic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListItemProps extends js.Object {
  
  var centerElement: Element | String | ListItemCenterElement = js.native
  
  var dense: js.UndefOr[Boolean] = js.native
  
  var divider: js.UndefOr[Boolean] = js.native
  
  var leftElement: js.UndefOr[Element | String] = js.native
  
  var numberOfLines: js.UndefOr[`1` | `2` | `3` | dynamic] = js.native
  
  var onPress: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPressValue: js.UndefOr[js.Any] = js.native
  
  var onRightElementPress: js.UndefOr[js.Function0[Unit]] = js.native
  
  var rightElement: js.UndefOr[Element | String] = js.native
  
  var style: js.UndefOr[ListItemStyle] = js.native
  
  var testID: js.UndefOr[String] = js.native
}
object ListItemProps {
  
  @scala.inline
  def apply(centerElement: Element | String | ListItemCenterElement): ListItemProps = {
    val __obj = js.Dynamic.literal(centerElement = centerElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemProps]
  }
  
  @scala.inline
  implicit class ListItemPropsOps[Self <: ListItemProps] (val x: Self) extends AnyVal {
    
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
    def setCenterElement(value: Element | String | ListItemCenterElement): Self = this.set("centerElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDense(value: Boolean): Self = this.set("dense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDense: Self = this.set("dense", js.undefined)
    
    @scala.inline
    def setDivider(value: Boolean): Self = this.set("divider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDivider: Self = this.set("divider", js.undefined)
    
    @scala.inline
    def setLeftElement(value: Element | String): Self = this.set("leftElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftElement: Self = this.set("leftElement", js.undefined)
    
    @scala.inline
    def setNumberOfLines(value: `1` | `2` | `3` | dynamic): Self = this.set("numberOfLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfLines: Self = this.set("numberOfLines", js.undefined)
    
    @scala.inline
    def setOnPress(value: () => Unit): Self = this.set("onPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnPress: Self = this.set("onPress", js.undefined)
    
    @scala.inline
    def setOnPressValue(value: js.Any): Self = this.set("onPressValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPressValue: Self = this.set("onPressValue", js.undefined)
    
    @scala.inline
    def setOnRightElementPress(value: () => Unit): Self = this.set("onRightElementPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnRightElementPress: Self = this.set("onRightElementPress", js.undefined)
    
    @scala.inline
    def setRightElement(value: Element | String): Self = this.set("rightElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightElement: Self = this.set("rightElement", js.undefined)
    
    @scala.inline
    def setStyle(value: ListItemStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTestID(value: String): Self = this.set("testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestID: Self = this.set("testID", js.undefined)
  }
}
