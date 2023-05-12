package typings.sentryBrowser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Buildnumber extends StObject {
  
  var build_number: String
  
  var name: String
  
  var version: String
}
object Buildnumber {
  
  inline def apply(build_number: String, name: String, version: String): Buildnumber = {
    val __obj = js.Dynamic.literal(build_number = build_number.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buildnumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Buildnumber] (val x: Self) extends AnyVal {
    
    inline def setBuild_number(value: String): Self = StObject.set(x, "build_number", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
