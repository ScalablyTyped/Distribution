package typings.puppeteer.mod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSSCoverageOptions] (val x: Self) extends AnyVal {
    
    inline def setResetOnNavigation(value: Boolean): Self = StObject.set(x, "resetOnNavigation", value.asInstanceOf[js.Any])
    
    inline def setResetOnNavigationUndefined: Self = StObject.set(x, "resetOnNavigation", js.undefined)
  }
}
