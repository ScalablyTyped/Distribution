package typings.saxes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.saxes.mod.AttributeEventForOptions because Already inherited */ @js.native
trait SaxesAttributePlain extends SaxesAttribute {
  
  /**
    * The attribute's name.
    */
  var name: String = js.native
  
  /** The attribute's value. */
  var value: String = js.native
}
object SaxesAttributePlain {
  
  @scala.inline
  def apply(name: String, value: String): SaxesAttributePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaxesAttributePlain]
  }
  
  @scala.inline
  implicit class SaxesAttributePlainMutableBuilder[Self <: SaxesAttributePlain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
