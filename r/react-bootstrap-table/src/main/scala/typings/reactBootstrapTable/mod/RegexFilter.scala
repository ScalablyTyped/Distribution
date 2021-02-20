package typings.reactBootstrapTable.mod

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegexFilter extends _Filter {
  
  /**
    * Default value
    */
  var defaultValue: js.UndefOr[String] = js.native
  
  /**
    * Delay time in milliseconds after the last key press prior to applying the filter. Defaults to 500ms.
    */
  var delay: js.UndefOr[Double] = js.native
  
  /**
    * Placeholder text to show in the filter.
    */
  var placeholder: js.UndefOr[String] = js.native
  
  /**
    * CSS Style to use for the select filter.
    */
  var style: js.UndefOr[CSSProperties] = js.native
  
  /**
    * Filter type must be 'RegexFilter'
    */
  var `type`: typings.reactBootstrapTable.reactBootstrapTableStrings.RegexFilter = js.native
}
object RegexFilter {
  
  @scala.inline
  def apply(`type`: typings.reactBootstrapTable.reactBootstrapTableStrings.RegexFilter): RegexFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegexFilter]
  }
  
  @scala.inline
  implicit class RegexFilterMutableBuilder[Self <: RegexFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setType(value: typings.reactBootstrapTable.reactBootstrapTableStrings.RegexFilter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
