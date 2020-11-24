package typings.radium.mod.Radium

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleProps extends js.Object {
  
  /**
    * An object of styles, or an object of CSS rules to render. Each key of the rules object is a CSS
    * selector and the value is an object of styles. If rules is empty, the component will render nothing.
    */
  var rules: CSSProperties | StyleRules = js.native
  
  /**
    * A string that any included selectors in rules will be appended to.
    * Use to scope styles in the component to a particular element. A good use case might be to generate a unique
    * ID for a component to scope any styles to the particular component that owns the <Style> component instance.
    */
  var scopeSelector: js.UndefOr[String] = js.native
}
object StyleProps {
  
  @scala.inline
  def apply(rules: CSSProperties | StyleRules): StyleProps = {
    val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleProps]
  }
  
  @scala.inline
  implicit class StylePropsOps[Self <: StyleProps] (val x: Self) extends AnyVal {
    
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
    def setRules(value: CSSProperties | StyleRules): Self = this.set("rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeSelector(value: String): Self = this.set("scopeSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScopeSelector: Self = this.set("scopeSelector", js.undefined)
  }
}
