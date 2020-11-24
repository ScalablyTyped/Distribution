package typings.reactNativeOnboardingSwiper.mod

import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Page extends js.Object {
  
  /**
    * A background color. The color of the font and dots adapts to the background color.
    */
  var backgroundColor: String = js.native
  
  /**
    * A component (e.g. <Image />) to display at the top of the page.
    */
  var image: Element = js.native
  
  /**
    * Modify styles of a specific page's subtitle.
    */
  var subTitleStyles: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  /**
    * A string OR a React-Native component.
    */
  var subtitle: String | Element = js.native
  
  /**
    * A string OR a React-Native component.
    */
  var title: String | Element = js.native
  
  // INDIVIDUAL PAGE STYLES
  /**
    * Modify styles of a specific page's title.
    */
  var titleStyles: js.UndefOr[StyleProp[TextStyle]] = js.native
}
object Page {
  
  @scala.inline
  def apply(backgroundColor: String, image: Element, subtitle: String | Element, title: String | Element): Page = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Page]
  }
  
  @scala.inline
  implicit class PageOps[Self <: Page] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: Element): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitle(value: String | Element): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String | Element): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubTitleStyles(value: StyleProp[TextStyle]): Self = this.set("subTitleStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubTitleStyles: Self = this.set("subTitleStyles", js.undefined)
    
    @scala.inline
    def setSubTitleStylesNull: Self = this.set("subTitleStyles", null)
    
    @scala.inline
    def setTitleStyles(value: StyleProp[TextStyle]): Self = this.set("titleStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleStyles: Self = this.set("titleStyles", js.undefined)
    
    @scala.inline
    def setTitleStylesNull: Self = this.set("titleStyles", null)
  }
}
