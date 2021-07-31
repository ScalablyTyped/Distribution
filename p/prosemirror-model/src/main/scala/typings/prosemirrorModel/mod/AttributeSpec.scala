package typings.prosemirrorModel.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeSpec extends StObject {
  
  /**
    * The default value for this attribute, to use when no explicit
    * value is provided. Attributes that have no default must be
    * provided whenever a node or mark of a type that has them is
    * created.
    */
  var default: js.UndefOr[js.Any] = js.undefined
}
object AttributeSpec {
  
  @scala.inline
  def apply(): AttributeSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeSpec]
  }
  
  @scala.inline
  implicit class AttributeSpecMutableBuilder[Self <: AttributeSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
  }
}
