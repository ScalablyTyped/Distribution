package typings.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParseOpts
  extends StObject
     with BaseParseOpts {
  
  /** If true, the parser will operate as if in a tag e.g. foo="bar" is parsed as an attribute rather than a string. */
  var attributes: js.UndefOr[Boolean] = js.undefined
  
  /** If true, will parse elements as plain text, which allows the resulting template to be used to produce templates that are also later parsed. */
  var textOnlyMode: js.UndefOr[Boolean] = js.undefined
}
object ParseOpts {
  
  @scala.inline
  def apply(): ParseOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseOpts]
  }
  
  @scala.inline
  implicit class ParseOptsMutableBuilder[Self <: ParseOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: Boolean): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setTextOnlyMode(value: Boolean): Self = StObject.set(x, "textOnlyMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextOnlyModeUndefined: Self = StObject.set(x, "textOnlyMode", js.undefined)
  }
}
