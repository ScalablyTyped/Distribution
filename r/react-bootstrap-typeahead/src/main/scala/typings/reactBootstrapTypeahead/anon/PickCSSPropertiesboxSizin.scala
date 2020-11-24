package typings.reactBootstrapTypeahead.anon

import typings.csstype.mod.BoxSizingProperty
import typings.csstype.mod.WidthProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react.react.CSSProperties, 'boxSizing' | 'width'> */
@js.native
trait PickCSSPropertiesboxSizin extends js.Object {
  
  var boxSizing: js.UndefOr[BoxSizingProperty] = js.native
  
  var width: js.UndefOr[WidthProperty[String | Double]] = js.native
}
object PickCSSPropertiesboxSizin {
  
  @scala.inline
  def apply(): PickCSSPropertiesboxSizin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickCSSPropertiesboxSizin]
  }
  
  @scala.inline
  implicit class PickCSSPropertiesboxSizinOps[Self <: PickCSSPropertiesboxSizin] (val x: Self) extends AnyVal {
    
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
    def setBoxSizing(value: BoxSizingProperty): Self = this.set("boxSizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoxSizing: Self = this.set("boxSizing", js.undefined)
    
    @scala.inline
    def setWidth(value: WidthProperty[String | Double]): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
