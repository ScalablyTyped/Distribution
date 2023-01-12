package typings.steamUser.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Apps extends StObject {
  
  var apps: Record[String, Any]
  
  var changenumber: Double
  
  var packages: Record[String, Any]
}
object Apps {
  
  inline def apply(apps: Record[String, Any], changenumber: Double, packages: Record[String, Any]): Apps = {
    val __obj = js.Dynamic.literal(apps = apps.asInstanceOf[js.Any], changenumber = changenumber.asInstanceOf[js.Any], packages = packages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Apps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Apps] (val x: Self) extends AnyVal {
    
    inline def setApps(value: Record[String, Any]): Self = StObject.set(x, "apps", value.asInstanceOf[js.Any])
    
    inline def setChangenumber(value: Double): Self = StObject.set(x, "changenumber", value.asInstanceOf[js.Any])
    
    inline def setPackages(value: Record[String, Any]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
  }
}
