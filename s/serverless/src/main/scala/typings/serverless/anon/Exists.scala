package typings.serverless.anon

import typings.serverless.pluginsAwsProviderAwsProviderMod._Filter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exists
  extends StObject
     with _Filter {
  
  var exists: Boolean
}
object Exists {
  
  inline def apply(exists: Boolean): Exists = {
    val __obj = js.Dynamic.literal(exists = exists.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exists]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Exists] (val x: Self) extends AnyVal {
    
    inline def setExists(value: Boolean): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
  }
}
