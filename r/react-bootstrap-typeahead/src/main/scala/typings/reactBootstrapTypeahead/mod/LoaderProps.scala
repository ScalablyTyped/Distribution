package typings.reactBootstrapTypeahead.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoaderProps extends StObject {
  
  var label: js.UndefOr[String] = js.undefined
}
object LoaderProps {
  
  inline def apply(): LoaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoaderProps]
  }
  
  extension [Self <: LoaderProps](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
