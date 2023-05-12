package typings.storybookCsf.mod

import typings.std.Record
import typings.storybookCsf.storybookCsfStrings.`object`
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
  
  inline def apply(value: Record[String, SBType]): SBObjectType = {
    val __obj = js.Dynamic.literal(name = "object", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SBObjectType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SBObjectType] (val x: Self) extends AnyVal {
    
    inline def setName(value: `object`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Record[String, SBType]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
