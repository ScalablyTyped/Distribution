package typings.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SanitizeOpts extends StObject {
  
  /** A list of element names to remove from the template. */
  var elements: js.Array[String] = js.native
  
  /** Whether or not to remove DOM event listener attributes, like onclick, from the template. */
  var eventAttributes: js.UndefOr[Boolean] = js.native
}
object SanitizeOpts {
  
  @scala.inline
  def apply(elements: js.Array[String]): SanitizeOpts = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.asInstanceOf[SanitizeOpts]
  }
  
  @scala.inline
  implicit class SanitizeOptsMutableBuilder[Self <: SanitizeOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElements(value: js.Array[String]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementsVarargs(value: String*): Self = StObject.set(x, "elements", js.Array(value :_*))
    
    @scala.inline
    def setEventAttributes(value: Boolean): Self = StObject.set(x, "eventAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventAttributesUndefined: Self = StObject.set(x, "eventAttributes", js.undefined)
  }
}
