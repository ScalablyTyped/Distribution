package typings.storybookClientApi.typesMod

import typings.storybookClientApi.storybookClientApiStrings.`enum`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SBEnumType
  extends StObject
     with SBBaseType
     with SBType {
  
  var name: `enum`
  
  var value: js.Array[String | Double]
}
object SBEnumType {
  
  @scala.inline
  def apply(value: js.Array[String | Double]): SBEnumType = {
    val __obj = js.Dynamic.literal(name = "enum", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SBEnumType]
  }
  
  @scala.inline
  implicit class SBEnumTypeMutableBuilder[Self <: SBEnumType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: `enum`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Array[String | Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: (String | Double)*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
