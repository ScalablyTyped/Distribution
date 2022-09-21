package typings.serverless.anon

import typings.serverless.awsProviderMod.NumericFilter
import typings.serverless.awsProviderMod._Filter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Numeric
  extends StObject
     with _Filter {
  
  var numeric: NumericFilter
}
object Numeric {
  
  inline def apply(numeric: NumericFilter): Numeric = {
    val __obj = js.Dynamic.literal(numeric = numeric.asInstanceOf[js.Any])
    __obj.asInstanceOf[Numeric]
  }
  
  extension [Self <: Numeric](x: Self) {
    
    inline def setNumeric(value: NumericFilter): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
  }
}
