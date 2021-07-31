package typings.storybookClientApi.typesMod

import typings.storybookClientApi.storybookClientApiStrings.array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SBArrayType
  extends StObject
     with SBBaseType
     with SBType {
  
  var name: array
  
  var value: SBType
}
object SBArrayType {
  
  @scala.inline
  def apply(value: SBType): SBArrayType = {
    val __obj = js.Dynamic.literal(name = "array", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SBArrayType]
  }
  
  @scala.inline
  implicit class SBArrayTypeMutableBuilder[Self <: SBArrayType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: array): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: SBType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
