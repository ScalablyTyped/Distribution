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
  
  @scala.inline
  def apply(name: String, sql: String, sqlVersion: String): Iot = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any], sqlVersion = sqlVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Iot]
  }
  
  @scala.inline
  implicit class IotMutableBuilder[Self <: Iot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSql(value: String): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlVersion(value: String): Self = StObject.set(x, "sqlVersion", value.asInstanceOf[js.Any])
  }
}
