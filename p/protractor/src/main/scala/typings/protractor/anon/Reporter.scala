package typings.protractor.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reporter
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var reporter: js.UndefOr[String] = js.undefined
  
  var ui: js.UndefOr[String] = js.undefined
}
object Reporter {
  
  inline def apply(): Reporter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Reporter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Reporter] (val x: Self) extends AnyVal {
    
    inline def setReporter(value: String): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
    
    inline def setReporterUndefined: Self = StObject.set(x, "reporter", js.undefined)
    
    inline def setUi(value: String): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
    
    inline def setUiUndefined: Self = StObject.set(x, "ui", js.undefined)
  }
}
