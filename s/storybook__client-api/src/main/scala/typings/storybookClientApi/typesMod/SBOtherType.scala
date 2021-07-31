package typings.storybookClientApi.typesMod

import typings.storybookClientApi.storybookClientApiStrings.other
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SBOtherType
  extends StObject
     with SBBaseType
     with SBType {
  
  var name: other
  
  var value: String
}
object SBOtherType {
  
  @scala.inline
  def apply(value: String): SBOtherType = {
    val __obj = js.Dynamic.literal(name = "other", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SBOtherType]
  }
  
  @scala.inline
  implicit class SBOtherTypeMutableBuilder[Self <: SBOtherType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: other): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
