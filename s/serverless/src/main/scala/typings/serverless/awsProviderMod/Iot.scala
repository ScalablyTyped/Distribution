package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Iot extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var name: String
  
  var sql: String
  
  var sqlVersion: String
}
object Iot {
  
  inline def apply(name: String, sql: String, sqlVersion: String): Iot = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any], sqlVersion = sqlVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Iot]
  }
  
  extension [Self <: Iot](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSql(value: String): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
    
    inline def setSqlVersion(value: String): Self = StObject.set(x, "sqlVersion", value.asInstanceOf[js.Any])
  }
}
