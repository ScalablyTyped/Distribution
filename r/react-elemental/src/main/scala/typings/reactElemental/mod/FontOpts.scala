package typings.reactElemental.mod

import typings.reactElemental.anon.Regular
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontOpts extends StObject {
  
  var primary: js.UndefOr[Regular] = js.undefined
  
  var secondary: js.UndefOr[Regular] = js.undefined
}
object FontOpts {
  
  inline def apply(): FontOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontOpts]
  }
  
  extension [Self <: FontOpts](x: Self) {
    
    inline def setPrimary(value: Regular): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    inline def setSecondary(value: Regular): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    
    inline def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
  }
}
