package typings.reactNativeSvg.anon

import typings.reactNativeSvg.libTypescriptLibExtractTypesMod.NumberProp
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Object & {  width :react-native-svg.react-native-svg/lib/typescript/lib/extract/types.NumberProp | undefined,   height :react-native-svg.react-native-svg/lib/typescript/lib/extract/types.NumberProp | undefined,   bbWidth :react-native-svg.react-native-svg/lib/typescript/lib/extract/types.NumberProp | undefined,   bbHeight :react-native-svg.react-native-svg/lib/typescript/lib/extract/types.NumberProp | undefined} */
trait ObjectwidthNumberPropunde extends StObject {
  
  var bbHeight: js.UndefOr[NumberProp] = js.undefined
  
  var bbWidth: js.UndefOr[NumberProp] = js.undefined
  
  /** The initial value of Object.prototype.constructor is the standard built-in Object constructor. */
  /* standard es5 */
  var constructor: js.Function
  
  /**
    * Determines whether an object has a property with the specified name.
    * @param v A property name.
    */
  /* standard es5 */
  def hasOwnProperty(v: PropertyKey): Boolean
  
  var height: js.UndefOr[NumberProp] = js.undefined
  
  /**
    * Determines whether a specified property is enumerable.
    * @param v A property name.
    */
  /* standard es5 */
  def propertyIsEnumerable(v: PropertyKey): Boolean
  
  var width: js.UndefOr[NumberProp] = js.undefined
}
object ObjectwidthNumberPropunde {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ObjectwidthNumberPropunde = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[ObjectwidthNumberPropunde]
  }
  
  extension [Self <: ObjectwidthNumberPropunde](x: Self) {
    
    inline def setBbHeight(value: NumberProp): Self = StObject.set(x, "bbHeight", value.asInstanceOf[js.Any])
    
    inline def setBbHeightUndefined: Self = StObject.set(x, "bbHeight", js.undefined)
    
    inline def setBbWidth(value: NumberProp): Self = StObject.set(x, "bbWidth", value.asInstanceOf[js.Any])
    
    inline def setBbWidthUndefined: Self = StObject.set(x, "bbWidth", js.undefined)
    
    inline def setConstructor(value: js.Function): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
    
    inline def setHasOwnProperty(value: PropertyKey => Boolean): Self = StObject.set(x, "hasOwnProperty", js.Any.fromFunction1(value))
    
    inline def setHeight(value: NumberProp): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setPropertyIsEnumerable(value: PropertyKey => Boolean): Self = StObject.set(x, "propertyIsEnumerable", js.Any.fromFunction1(value))
    
    inline def setWidth(value: NumberProp): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
