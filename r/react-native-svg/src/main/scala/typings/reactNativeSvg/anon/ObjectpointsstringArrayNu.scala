package typings.reactNativeSvg.anon

import typings.reactNativeSvg.typesMod.NumberProp
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Object & {  points :string | std.Array<react-native-svg.react-native-svg/lib/typescript/lib/extract/types.NumberProp> | undefined,   d :string | undefined} */
trait ObjectpointsstringArrayNu extends StObject {
  
  /** The initial value of Object.prototype.constructor is the standard built-in Object constructor. */
  /* standard es5 */
  var constructor: js.Function
  
  var d: js.UndefOr[String] = js.undefined
  
  /**
    * Determines whether an object has a property with the specified name.
    * @param v A property name.
    */
  /* standard es5 */
  def hasOwnProperty(v: PropertyKey): Boolean
  
  var points: js.UndefOr[String | js.Array[NumberProp]] = js.undefined
  
  /**
    * Determines whether a specified property is enumerable.
    * @param v A property name.
    */
  /* standard es5 */
  def propertyIsEnumerable(v: PropertyKey): Boolean
}
object ObjectpointsstringArrayNu {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ObjectpointsstringArrayNu = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[ObjectpointsstringArrayNu]
  }
  
  extension [Self <: ObjectpointsstringArrayNu](x: Self) {
    
    inline def setConstructor(value: js.Function): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
    
    inline def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setDUndefined: Self = StObject.set(x, "d", js.undefined)
    
    inline def setHasOwnProperty(value: PropertyKey => Boolean): Self = StObject.set(x, "hasOwnProperty", js.Any.fromFunction1(value))
    
    inline def setPoints(value: String | js.Array[NumberProp]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    inline def setPointsVarargs(value: NumberProp*): Self = StObject.set(x, "points", js.Array(value*))
    
    inline def setPropertyIsEnumerable(value: PropertyKey => Boolean): Self = StObject.set(x, "propertyIsEnumerable", js.Any.fromFunction1(value))
  }
}
