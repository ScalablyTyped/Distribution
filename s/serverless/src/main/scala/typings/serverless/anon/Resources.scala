package typings.serverless.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resources extends StObject {
  
  var Resources: StringDictionary[Any]
}
object Resources {
  
  inline def apply(Resources: StringDictionary[Any]): Resources = {
    val __obj = js.Dynamic.literal(Resources = Resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resources]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Resources] (val x: Self) extends AnyVal {
    
    inline def setResources(value: StringDictionary[Any]): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
  }
}
