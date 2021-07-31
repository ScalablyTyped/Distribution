package typings.storybookClientApi.typesMod

import typings.std.Record
import typings.storybookClientApi.storybookClientApiStrings.`object`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SBObjectType
  extends StObject
     with SBBaseType
     with SBType {
  
  var name: `object`
  
  var value: Record[String, SBType]
}
object SBObjectType {
  
  @scala.inline
  def apply(value: Record[String, SBType]): SBObjectType = {
    val __obj = js.Dynamic.literal(name = "object", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SBObjectType]
  }
  
  @scala.inline
  implicit class SBObjectTypeMutableBuilder[Self <: SBObjectType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: `object`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Record[String, SBType]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
