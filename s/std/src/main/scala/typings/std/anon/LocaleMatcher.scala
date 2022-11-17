package typings.std.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocaleMatcher extends StObject {
  
  /* standard es2018.intl */
  var localeMatcher: js.UndefOr["lookup" | ("best fit")] = js.undefined
}
object LocaleMatcher {
  
  inline def apply(): LocaleMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocaleMatcher]
  }
  
  extension [Self <: LocaleMatcher](x: Self) {
    
    inline def setLocaleMatcher(value: "lookup" | ("best fit")): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
    
    inline def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
  }
}
