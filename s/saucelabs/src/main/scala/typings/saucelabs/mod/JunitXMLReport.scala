package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JunitXMLReport
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var name: js.UndefOr[String] = js.undefined
}
object JunitXMLReport {
  
  @scala.inline
  def apply(): JunitXMLReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JunitXMLReport]
  }
  
  @scala.inline
  implicit class JunitXMLReportMutableBuilder[Self <: JunitXMLReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
