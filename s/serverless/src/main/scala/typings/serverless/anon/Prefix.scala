package typings.serverless.anon

import typings.serverless.pluginsAwsProviderAwsProviderMod._Filter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Prefix
  extends StObject
     with _Filter {
  
  var prefix: String
}
object Prefix {
  
  inline def apply(prefix: String): Prefix = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Prefix]
  }
  
  extension [Self <: Prefix](x: Self) {
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
  }
}
