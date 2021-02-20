package typings.reactNativeMaterialUi.mod

import typings.react.mod.global.JSX.Element
import typings.reactNativeMaterialUi.reactNativeMaterialUiNumbers.`1`
import typings.reactNativeMaterialUi.reactNativeMaterialUiNumbers.`2`
import typings.reactNativeMaterialUi.reactNativeMaterialUiNumbers.`3`
import typings.reactNativeMaterialUi.reactNativeMaterialUiStrings.dynamic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListItemProps extends StObject {
  
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
  implicit class ListItemPropsMutableBuilder[Self <: ListItemProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenterElement(value: Element | String | ListItemCenterElement): Self = StObject.set(x, "centerElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDense(value: Boolean): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDenseUndefined: Self = StObject.set(x, "dense", js.undefined)
    
    @scala.inline
    def setDivider(value: Boolean): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDividerUndefined: Self = StObject.set(x, "divider", js.undefined)
    
    @scala.inline
    def setLeftElement(value: Element | String): Self = StObject.set(x, "leftElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftElementUndefined: Self = StObject.set(x, "leftElement", js.undefined)
    
    @scala.inline
    def setNumberOfLines(value: `1` | `2` | `3` | dynamic): Self = StObject.set(x, "numberOfLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfLinesUndefined: Self = StObject.set(x, "numberOfLines", js.undefined)
    
    @scala.inline
    def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    @scala.inline
    def setOnPressValue(value: js.Any): Self = StObject.set(x, "onPressValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPressValueUndefined: Self = StObject.set(x, "onPressValue", js.undefined)
    
    @scala.inline
    def setOnRightElementPress(value: () => Unit): Self = StObject.set(x, "onRightElementPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnRightElementPressUndefined: Self = StObject.set(x, "onRightElementPress", js.undefined)
    
    @scala.inline
    def setRightElement(value: Element | String): Self = StObject.set(x, "rightElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightElementUndefined: Self = StObject.set(x, "rightElement", js.undefined)
    
    @scala.inline
    def setStyle(value: ListItemStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
  }
}
