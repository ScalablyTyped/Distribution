package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Database...
  */
trait IDatabase extends StObject {
  
  /**
    * Is set to true if the database is set by default.
    */
  var qIsDefault: Boolean
  
  /**
    * Name of the database.
    */
  var qName: String
}
object IDatabase {
  
  @scala.inline
  def apply(qIsDefault: Boolean, qName: String): IDatabase = {
    val __obj = js.Dynamic.literal(qIsDefault = qIsDefault.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatabase]
  }
  
  @scala.inline
  implicit class IDatabaseMutableBuilder[Self <: IDatabase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQIsDefault(value: Boolean): Self = StObject.set(x, "qIsDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQName(value: String): Self = StObject.set(x, "qName", value.asInstanceOf[js.Any])
  }
}
