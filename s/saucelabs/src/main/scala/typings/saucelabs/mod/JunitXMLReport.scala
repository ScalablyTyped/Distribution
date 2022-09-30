package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JunitXMLReport
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var name: js.UndefOr[String] = js.undefined
}
object JunitXMLReport {
  
  inline def apply(): JunitXMLReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JunitXMLReport]
  }
  
  extension [Self <: JunitXMLReport](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
