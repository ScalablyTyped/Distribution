package typings.ssri.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Strict extends StObject {
  
  var strict: js.UndefOr[Boolean] = js.undefined
}
object Strict {
  
  inline def apply(): Strict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Strict]
  }
  
  extension [Self <: Strict](x: Self) {
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
