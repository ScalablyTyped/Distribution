package typings.senchaTouch.Ext.util

import typings.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPoint
  extends StObject
     with IBase {
  
  /** [Method] Copy a new instance of this point
    * @returns Ext.util.Point The new point.
    */
  @JSName("clone")
  var clone_FIPoint: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  /** [Method] Clones this Point
    * @returns Ext.util.Point The new point.
    */
  var copy: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  /** [Method] Copy the x and y values of another point  object to this point itself
    * @param point Ext.util.Point/Object .
    * @returns Ext.util.Point This point.
    */
  var copyFrom: js.UndefOr[js.Function1[/* point */ js.UndefOr[Any], this.type]] = js.undefined
  
  /** [Method] Compare this point and another point
    * @param point Ext.util.Point/Object The point to compare with, either an instance of Ext.util.Point or an object with x and y properties.
    * @returns Boolean Returns whether they are equivalent.
    */
  @JSName("equals")
  var equals_FIPoint: js.UndefOr[js.Function1[/* point */ js.UndefOr[Any], Boolean]] = js.undefined
  
  /** [Method] Whether the given point is not away from this point within the given threshold amount
    * @param point Ext.util.Point/Object The point to check with, either an instance of Ext.util.Point or an object with x and y properties.
    * @param threshold Object/Number Can be either an object with x and y properties or a number.
    * @returns Boolean
    */
  var isCloseTo: js.UndefOr[
    js.Function2[/* point */ js.UndefOr[Any], /* threshold */ js.UndefOr[Any], Boolean]
  ] = js.undefined
  
  /** [Method] Returns true if this point is close to another one
    * @returns Boolean
    */
  var isWithin: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Compare this point with another point when the x and y values of both points are rounded
    * @param point Ext.util.Point/Object The point to compare with, either an instance of Ext.util.Point or an object with x and y properties.
    * @returns Boolean
    */
  var roundedEquals: js.UndefOr[js.Function1[/* point */ js.UndefOr[Any], Boolean]] = js.undefined
  
  /** [Method] Returns a human eye friendly string that represents this point useful for debugging
    * @returns String For example Point[12,8].
    */
  @JSName("toString")
  var toString_FIPoint: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Translate this point by the given amounts
    * @param x Number Amount to translate in the x-axis.
    * @param y Number Amount to translate in the y-axis.
    * @returns Boolean
    */
  var translate: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Boolean]] = js.undefined
}
object IPoint {
  
  inline def apply(): IPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPoint]
  }
  
  extension [Self <: IPoint](x: Self) {
    
    inline def setClone_(value: () => IPoint): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
    
    inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
    
    inline def setCopy(value: () => IPoint): Self = StObject.set(x, "copy", js.Any.fromFunction0(value))
    
    inline def setCopyFrom(value: /* point */ js.UndefOr[Any] => IPoint): Self = StObject.set(x, "copyFrom", js.Any.fromFunction1(value))
    
    inline def setCopyFromUndefined: Self = StObject.set(x, "copyFrom", js.undefined)
    
    inline def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
    
    inline def setEquals_(value: /* point */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
    
    inline def setIsCloseTo(value: (/* point */ js.UndefOr[Any], /* threshold */ js.UndefOr[Any]) => Boolean): Self = StObject.set(x, "isCloseTo", js.Any.fromFunction2(value))
    
    inline def setIsCloseToUndefined: Self = StObject.set(x, "isCloseTo", js.undefined)
    
    inline def setIsWithin(value: () => Boolean): Self = StObject.set(x, "isWithin", js.Any.fromFunction0(value))
    
    inline def setIsWithinUndefined: Self = StObject.set(x, "isWithin", js.undefined)
    
    inline def setRoundedEquals(value: /* point */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "roundedEquals", js.Any.fromFunction1(value))
    
    inline def setRoundedEqualsUndefined: Self = StObject.set(x, "roundedEquals", js.undefined)
    
    inline def setToString_(value: () => String): Self = StObject.set(x, "toString", js.Any.fromFunction0(value))
    
    inline def setToString_Undefined: Self = StObject.set(x, "toString", js.undefined)
    
    inline def setTranslate(value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Boolean): Self = StObject.set(x, "translate", js.Any.fromFunction2(value))
    
    inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
  }
}
