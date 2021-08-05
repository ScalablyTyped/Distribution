package typings.sequelize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Through[TJoinTableAttributes] extends StObject {
  
  var through: TJoinTableAttributes
}
object Through {
  
  inline def apply[TJoinTableAttributes](through: TJoinTableAttributes): Through[TJoinTableAttributes] = {
    val __obj = js.Dynamic.literal(through = through.asInstanceOf[js.Any])
    __obj.asInstanceOf[Through[TJoinTableAttributes]]
  }
  
  extension [Self <: Through[?], TJoinTableAttributes](x: Self & Through[TJoinTableAttributes]) {
    
    inline def setThrough(value: TJoinTableAttributes): Self = StObject.set(x, "through", value.asInstanceOf[js.Any])
  }
}
