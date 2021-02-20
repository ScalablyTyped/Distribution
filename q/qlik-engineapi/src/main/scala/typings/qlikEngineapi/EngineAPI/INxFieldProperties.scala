package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INxFieldProperties extends StObject {
  
  var qOneAndOnlyOne: Boolean = js.native
}
object INxFieldProperties {
  
  @scala.inline
  def apply(qOneAndOnlyOne: Boolean): INxFieldProperties = {
    val __obj = js.Dynamic.literal(qOneAndOnlyOne = qOneAndOnlyOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxFieldProperties]
  }
  
  @scala.inline
  implicit class INxFieldPropertiesMutableBuilder[Self <: INxFieldProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQOneAndOnlyOne(value: Boolean): Self = StObject.set(x, "qOneAndOnlyOne", value.asInstanceOf[js.Any])
  }
}
