package typings.snyk.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Severities extends StObject {
  
  var severities: StringDictionary[String]
}
object Severities {
  
  inline def apply(severities: StringDictionary[String]): Severities = {
    val __obj = js.Dynamic.literal(severities = severities.asInstanceOf[js.Any])
    __obj.asInstanceOf[Severities]
  }
  
  extension [Self <: Severities](x: Self) {
    
    inline def setSeverities(value: StringDictionary[String]): Self = StObject.set(x, "severities", value.asInstanceOf[js.Any])
  }
}
