package typings.reactNativeNavigation.optionsMod

import typings.reactNativeNavigation.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsTopBarBackground extends js.Object {
  
  /**
    * Enable background blur
    * #### (iOS specific)
    */
  var blur: js.UndefOr[Boolean] = js.native
  
  /**
    * Clip the top bar background to bounds if set to true.
    * #### (iOS specific)
    */
  var clipToBounds: js.UndefOr[Boolean] = js.native
  
  /**
    * Background color of the top bar
    */
  var color: js.UndefOr[Color] = js.native
  
  /**
    * Set a custom component for the Top Bar background
    */
  var component: js.UndefOr[Name] = js.native
  
  /**
    * Allows the NavBar to be translucent (blurred)
    * #### (iOS specific)
    */
  var translucent: js.UndefOr[Boolean] = js.native
}
object OptionsTopBarBackground {
  
  @scala.inline
  def apply(): OptionsTopBarBackground = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsTopBarBackground]
  }
  
  @scala.inline
  implicit class OptionsTopBarBackgroundOps[Self <: OptionsTopBarBackground] (val x: Self) extends AnyVal {
    
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
    def setBlur(value: Boolean): Self = this.set("blur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlur: Self = this.set("blur", js.undefined)
    
    @scala.inline
    def setClipToBounds(value: Boolean): Self = this.set("clipToBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipToBounds: Self = this.set("clipToBounds", js.undefined)
    
    @scala.inline
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setComponent(value: Name): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setTranslucent(value: Boolean): Self = this.set("translucent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslucent: Self = this.set("translucent", js.undefined)
  }
}
