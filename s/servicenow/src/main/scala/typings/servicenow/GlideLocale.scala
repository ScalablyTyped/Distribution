package typings.servicenow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlideLocale extends StObject {
  
  def getDecimalSeparator(): String = js.native
  
  def getGroupingSeparator(): String = js.native
}
object GlideLocale {
  
  @scala.inline
  def apply(getDecimalSeparator: () => String, getGroupingSeparator: () => String): GlideLocale = {
    val __obj = js.Dynamic.literal(getDecimalSeparator = js.Any.fromFunction0(getDecimalSeparator), getGroupingSeparator = js.Any.fromFunction0(getGroupingSeparator))
    __obj.asInstanceOf[GlideLocale]
  }
  
  @scala.inline
  implicit class GlideLocaleMutableBuilder[Self <: GlideLocale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDecimalSeparator(value: () => String): Self = StObject.set(x, "getDecimalSeparator", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetGroupingSeparator(value: () => String): Self = StObject.set(x, "getGroupingSeparator", js.Any.fromFunction0(value))
  }
}
