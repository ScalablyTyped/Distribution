package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextPropsIOS extends js.Object {
  
  /**
    * Specifies whether font should be scaled down automatically to fit given style constraints.
    */
  var adjustsFontSizeToFit: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies smallest possible scale a font can reach when adjustsFontSizeToFit is enabled. (values 0.01-1.0).
    */
  var minimumFontScale: js.UndefOr[Double] = js.native
  
  /**
    * When `true`, no visual change is made when text is pressed down. By
    * default, a gray oval highlights the text on press down.
    */
  var suppressHighlighting: js.UndefOr[Boolean] = js.native
}
object TextPropsIOS {
  
  @scala.inline
  def apply(): TextPropsIOS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextPropsIOS]
  }
  
  @scala.inline
  implicit class TextPropsIOSOps[Self <: TextPropsIOS] (val x: Self) extends AnyVal {
    
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
    def setAdjustsFontSizeToFit(value: Boolean): Self = this.set("adjustsFontSizeToFit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdjustsFontSizeToFit: Self = this.set("adjustsFontSizeToFit", js.undefined)
    
    @scala.inline
    def setMinimumFontScale(value: Double): Self = this.set("minimumFontScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumFontScale: Self = this.set("minimumFontScale", js.undefined)
    
    @scala.inline
    def setSuppressHighlighting(value: Boolean): Self = this.set("suppressHighlighting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressHighlighting: Self = this.set("suppressHighlighting", js.undefined)
  }
}
