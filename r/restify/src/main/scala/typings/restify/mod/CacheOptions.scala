package typings.restify.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheOptions extends StObject {
  
  var maxAge: Double
}
object CacheOptions {
  
  @scala.inline
  def apply(maxAge: Double): CacheOptions = {
    val __obj = js.Dynamic.literal(maxAge = maxAge.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheOptions]
  }
  
  @scala.inline
  implicit class CacheOptionsMutableBuilder[Self <: CacheOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
  }
}
