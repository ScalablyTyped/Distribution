package typings.reactCssThemr.anon

import typings.reactCssThemr.mod.TMapThemrProps
import typings.reactCssThemr.mod.TReactCSSThemrTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapThemrProps[P] extends js.Object {
  
  var mapThemrProps: js.UndefOr[TMapThemrProps[P]] = js.native
}
object MapThemrProps {
  
  @scala.inline
  def apply[P](): MapThemrProps[P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapThemrProps[P]]
  }
  
  @scala.inline
  implicit class MapThemrPropsOps[Self <: MapThemrProps[_], P] (val x: Self with MapThemrProps[P]) extends AnyVal {
    
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
    def setMapThemrProps(value: (P, /* theme */ TReactCSSThemrTheme) => P with Theme): Self = this.set("mapThemrProps", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteMapThemrProps: Self = this.set("mapThemrProps", js.undefined)
  }
}
