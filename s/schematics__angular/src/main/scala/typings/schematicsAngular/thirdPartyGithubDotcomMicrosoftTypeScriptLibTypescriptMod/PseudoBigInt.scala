package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a bigint literal value without requiring bigint support */
trait PseudoBigInt extends StObject {
  
  var base10Value: java.lang.String
  
  var negative: Boolean
}
object PseudoBigInt {
  
  inline def apply(base10Value: java.lang.String, negative: Boolean): PseudoBigInt = {
    val __obj = js.Dynamic.literal(base10Value = base10Value.asInstanceOf[js.Any], negative = negative.asInstanceOf[js.Any])
    __obj.asInstanceOf[PseudoBigInt]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PseudoBigInt] (val x: Self) extends AnyVal {
    
    inline def setBase10Value(value: java.lang.String): Self = StObject.set(x, "base10Value", value.asInstanceOf[js.Any])
    
    inline def setNegative(value: Boolean): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
  }
}
