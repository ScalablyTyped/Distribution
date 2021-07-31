package typings.storybookClientApi.typesMod

import typings.storybookClientApi.storybookClientApiStrings.union
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SBUnionType
  extends StObject
     with SBBaseType
     with SBType {
  
  var name: union
  
  var value: js.Array[SBType]
}
object SBUnionType {
  
  @scala.inline
  def apply(value: js.Array[SBType]): SBUnionType = {
    val __obj = js.Dynamic.literal(name = "union", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SBUnionType]
  }
  
  @scala.inline
  implicit class SBUnionTypeMutableBuilder[Self <: SBUnionType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: union): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Array[SBType]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: SBType*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
