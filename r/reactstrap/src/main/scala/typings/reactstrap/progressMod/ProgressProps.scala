package typings.reactstrap.progressMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.HTMLAttributes
import typings.reactstrap.mod.CSSModule
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressProps
  extends HTMLAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  
  var animated: js.UndefOr[Boolean] = js.native
  
  var bar: js.UndefOr[Boolean] = js.native
  
  var barAriaLabelledBy: js.UndefOr[String] = js.native
  
  var barAriaValueText: js.UndefOr[String] = js.native
  
  var barClassName: js.UndefOr[String] = js.native
  
  var cssModule: js.UndefOr[CSSModule] = js.native
  
  var max: js.UndefOr[String | Double] = js.native
  
  var min: js.UndefOr[String | Double] = js.native
  
  var multi: js.UndefOr[Boolean] = js.native
  
  var striped: js.UndefOr[Boolean] = js.native
  
  var tag: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[String | Double] = js.native
}
object ProgressProps {
  
  @scala.inline
  def apply(): ProgressProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressProps]
  }
  
  @scala.inline
  implicit class ProgressPropsOps[Self <: ProgressProps] (val x: Self) extends AnyVal {
    
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
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimated: Self = this.set("animated", js.undefined)
    
    @scala.inline
    def setBar(value: Boolean): Self = this.set("bar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBar: Self = this.set("bar", js.undefined)
    
    @scala.inline
    def setBarAriaLabelledBy(value: String): Self = this.set("barAriaLabelledBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarAriaLabelledBy: Self = this.set("barAriaLabelledBy", js.undefined)
    
    @scala.inline
    def setBarAriaValueText(value: String): Self = this.set("barAriaValueText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarAriaValueText: Self = this.set("barAriaValueText", js.undefined)
    
    @scala.inline
    def setBarClassName(value: String): Self = this.set("barClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarClassName: Self = this.set("barClassName", js.undefined)
    
    @scala.inline
    def setCssModule(value: CSSModule): Self = this.set("cssModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssModule: Self = this.set("cssModule", js.undefined)
    
    @scala.inline
    def setMax(value: String | Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: String | Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setMulti(value: Boolean): Self = this.set("multi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMulti: Self = this.set("multi", js.undefined)
    
    @scala.inline
    def setStriped(value: Boolean): Self = this.set("striped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStriped: Self = this.set("striped", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    
    @scala.inline
    def setValue(value: String | Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
