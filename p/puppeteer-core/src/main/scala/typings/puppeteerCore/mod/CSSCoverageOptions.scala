package typings.puppeteerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSCoverageOptions extends StObject {
  
  /**
    * Whether to reset coverage on every navigation.
    */
  var resetOnNavigation: js.UndefOr[Boolean] = js.undefined
}
object CSSCoverageOptions {
  
  inline def apply(): CSSCoverageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSSCoverageOptions]
  }
  
  extension [Self <: CSSCoverageOptions](x: Self) {
    
    inline def setResetOnNavigation(value: Boolean): Self = StObject.set(x, "resetOnNavigation", value.asInstanceOf[js.Any])
    
    inline def setResetOnNavigationUndefined: Self = StObject.set(x, "resetOnNavigation", js.undefined)
  }
}
