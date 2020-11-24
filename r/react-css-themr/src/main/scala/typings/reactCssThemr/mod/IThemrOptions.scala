package typings.reactCssThemr.mod

import typings.reactCssThemr.anon.Theme
import typings.reactCssThemr.reactCssThemrBooleans.`false`
import typings.reactCssThemr.reactCssThemrStrings.deeply
import typings.reactCssThemr.reactCssThemrStrings.softly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IThemrOptions extends js.Object {
  
  /** @default "deeply" */
  var composeTheme: js.UndefOr[deeply | softly | `false`] = js.native
  
  //currently there's no way to lift decorated component's generic type argument (P) to upper decorator
  //that's why just {}
  var mapThemrProps: js.UndefOr[TMapThemrProps[js.Object]] = js.native
}
object IThemrOptions {
  
  @scala.inline
  def apply(): IThemrOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IThemrOptions]
  }
  
  @scala.inline
  implicit class IThemrOptionsOps[Self <: IThemrOptions] (val x: Self) extends AnyVal {
    
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
    def setComposeTheme(value: deeply | softly | `false`): Self = this.set("composeTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComposeTheme: Self = this.set("composeTheme", js.undefined)
    
    @scala.inline
    def setMapThemrProps(value: (js.Object, /* theme */ TReactCSSThemrTheme) => js.Object with Theme): Self = this.set("mapThemrProps", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteMapThemrProps: Self = this.set("mapThemrProps", js.undefined)
  }
}
