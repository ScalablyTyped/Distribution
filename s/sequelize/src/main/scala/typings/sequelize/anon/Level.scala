package typings.sequelize.anon

import typings.sequelize.mod.Model
import typings.sequelize.mod.TransactionLockLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Level extends StObject {
  
  var level: TransactionLockLevel
  
  var of: Model[js.Any, js.Any, js.Any]
}
object Level {
  
  inline def apply(level: TransactionLockLevel, of: Model[js.Any, js.Any, js.Any]): Level = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], of = of.asInstanceOf[js.Any])
    __obj.asInstanceOf[Level]
  }
  
  extension [Self <: Level](x: Self) {
    
    inline def setLevel(value: TransactionLockLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setOf(value: Model[js.Any, js.Any, js.Any]): Self = StObject.set(x, "of", value.asInstanceOf[js.Any])
  }
}
