package typings.reactNativeMaterialUi.mod

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolbarProps extends js.Object {
  
  var centerElement: js.UndefOr[Element | String] = js.native
  
  var hidden: js.UndefOr[Boolean] = js.native
  
  var isSearchActive: js.UndefOr[Boolean] = js.native
  
  var leftElement: js.UndefOr[Element | String] = js.native
  
  var onLeftElementPress: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPress: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onRightElementPress: js.UndefOr[js.Function1[/* e */ RightElementPressEvent, Unit]] = js.native
  
  var rightElement: js.UndefOr[Element | String | js.Array[String] | ToolBarRightElement] = js.native
  
  var searchable: js.UndefOr[Searchable] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[ToolbarStyle] = js.native
}
object ToolbarProps {
  
  @scala.inline
  def apply(): ToolbarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolbarProps]
  }
  
  @scala.inline
  implicit class ToolbarPropsOps[Self <: ToolbarProps] (val x: Self) extends AnyVal {
    
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
    def setCenterElement(value: Element | String): Self = this.set("centerElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenterElement: Self = this.set("centerElement", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setIsSearchActive(value: Boolean): Self = this.set("isSearchActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSearchActive: Self = this.set("isSearchActive", js.undefined)
    
    @scala.inline
    def setLeftElement(value: Element | String): Self = this.set("leftElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftElement: Self = this.set("leftElement", js.undefined)
    
    @scala.inline
    def setOnLeftElementPress(value: () => Unit): Self = this.set("onLeftElementPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnLeftElementPress: Self = this.set("onLeftElementPress", js.undefined)
    
    @scala.inline
    def setOnPress(value: () => Unit): Self = this.set("onPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnPress: Self = this.set("onPress", js.undefined)
    
    @scala.inline
    def setOnRightElementPress(value: /* e */ RightElementPressEvent => Unit): Self = this.set("onRightElementPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRightElementPress: Self = this.set("onRightElementPress", js.undefined)
    
    @scala.inline
    def setRightElementVarargs(value: String*): Self = this.set("rightElement", js.Array(value :_*))
    
    @scala.inline
    def setRightElement(value: Element | String | js.Array[String] | ToolBarRightElement): Self = this.set("rightElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightElement: Self = this.set("rightElement", js.undefined)
    
    @scala.inline
    def setSearchable(value: Searchable): Self = this.set("searchable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchable: Self = this.set("searchable", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStyle(value: ToolbarStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
