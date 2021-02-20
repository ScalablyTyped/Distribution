package typings.servicenowLondon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlideLocale extends StObject {
  
  /**
    * Returns the decimal separator.
    *
    * @returns The decimal separator.
    * @example
    *
    * var locale = GlideLocale.get();
    * var decimalSeparator = locale.getDecimalSeparator();
    * gs.info( "The decimal separator is " + decimalSeparator);
    * // The decimal separator is .
    */
  def getDecimalSeparator(): String = js.native
  
  /**
    * Returns the grouping separator.
    *
    * @returns The grouping separator.
    * @example
    *
    * var locale = GlideLocale.get();
    * var groupingSeparator = locale.getGroupingSeparator();
    * gs.info( "The grouping separator is " + groupingSeparator);
    */
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
