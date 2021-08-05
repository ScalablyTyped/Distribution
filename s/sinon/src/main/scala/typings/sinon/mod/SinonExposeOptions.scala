package typings.sinon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SinonExposeOptions extends StObject {
  
  var includeFail: Boolean
  
  var prefix: String
}
object SinonExposeOptions {
  
  inline def apply(includeFail: Boolean, prefix: String): SinonExposeOptions = {
    val __obj = js.Dynamic.literal(includeFail = includeFail.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[SinonExposeOptions]
  }
  
  extension [Self <: SinonExposeOptions](x: Self) {
    
    inline def setIncludeFail(value: Boolean): Self = StObject.set(x, "includeFail", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
  }
}
