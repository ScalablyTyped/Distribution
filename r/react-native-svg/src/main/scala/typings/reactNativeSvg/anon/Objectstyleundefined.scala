package typings.reactNativeSvg.anon

import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Object & {  style :[] | {} | undefined} */
trait Objectstyleundefined extends StObject {
  
  /** The initial value of Object.prototype.constructor is the standard built-in Object constructor. */
  /* standard es5 */
  var constructor: js.Function
  
  /**
    * Determines whether an object has a property with the specified name.
    * @param v A property name.
    */
  /* standard es5 */
  def hasOwnProperty(v: PropertyKey): Boolean
  
  /**
    * Determines whether a specified property is enumerable.
    * @param v A property name.
    */
  /* standard es5 */
  def propertyIsEnumerable(v: PropertyKey): Boolean
  
  var style: js.UndefOr[js.Array[Any] | js.Object] = js.undefined
}
object Objectstyleundefined {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): Objectstyleundefined = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[Objectstyleundefined]
  }
  
  extension [Self <: Objectstyleundefined](x: Self) {
    
    inline def setConstructor(value: js.Function): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
    
    inline def setHasOwnProperty(value: PropertyKey => Boolean): Self = StObject.set(x, "hasOwnProperty", js.Any.fromFunction1(value))
    
    inline def setPropertyIsEnumerable(value: PropertyKey => Boolean): Self = StObject.set(x, "propertyIsEnumerable", js.Any.fromFunction1(value))
    
    inline def setStyle(value: js.Array[Any] | js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setStyleVarargs(value: Any*): Self = StObject.set(x, "style", js.Array(value*))
  }
}
