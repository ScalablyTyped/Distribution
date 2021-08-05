package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
//  Deferrable
// ~~~~~~~~~~~~
//
//  https://github.com/sequelize/sequelize/blob/v3.4.1/lib/deferrable.js
//
/**
  * Abstract Deferrable interface. Use this if you want to create an interface that has a value any of the
  * Deferrables that Sequelize supports.
  */
trait DeferrableAbstract extends StObject {
  
  def toSql(): String
}
object DeferrableAbstract {
  
  inline def apply(toSql: () => String): DeferrableAbstract = {
    val __obj = js.Dynamic.literal(toSql = js.Any.fromFunction0(toSql))
    __obj.asInstanceOf[DeferrableAbstract]
  }
  
  extension [Self <: DeferrableAbstract](x: Self) {
    
    inline def setToSql(value: () => String): Self = StObject.set(x, "toSql", js.Any.fromFunction0(value))
  }
}
