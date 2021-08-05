package typings.sequelize.anon

import typings.sequelize.mod.DataTypeAbstract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subtype extends StObject {
  
  var subtype: DataTypeAbstract
}
object Subtype {
  
  inline def apply(subtype: DataTypeAbstract): Subtype = {
    val __obj = js.Dynamic.literal(subtype = subtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subtype]
  }
  
  extension [Self <: Subtype](x: Self) {
    
    inline def setSubtype(value: DataTypeAbstract): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
  }
}
