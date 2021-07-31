package typings.sequelize.anon

import typings.sequelize.mod.DataTypeAbstract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  var `type`: DataTypeAbstract
}
object Type {
  
  @scala.inline
  def apply(`type`: DataTypeAbstract): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: DataTypeAbstract): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
