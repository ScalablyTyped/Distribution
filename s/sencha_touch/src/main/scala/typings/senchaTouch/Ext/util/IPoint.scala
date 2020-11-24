package typings.senchaTouch.Ext.util

import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPoint extends IBase {
  
  /** [Method] Copy a new instance of this point
    * @returns Ext.util.Point The new point.
    */
  @JSName("clone")
  var clone_FIPoint: js.UndefOr[js.Function0[this.type]] = js.native
  
  /** [Method] Clones this Point
    * @returns Ext.util.Point The new point.
    */
  var copy: js.UndefOr[js.Function0[this.type]] = js.native
  
  /** [Method] Copy the x and y values of another point  object to this point itself
    * @param point Ext.util.Point/Object .
    * @returns Ext.util.Point This point.
    */
  var copyFrom: js.UndefOr[js.Function1[/* point */ js.UndefOr[js.Any], this.type]] = js.native
  
  /** [Method] Compare this point and another point
    * @param point Ext.util.Point/Object The point to compare with, either an instance of Ext.util.Point or an object with x and y properties.
    * @returns Boolean Returns whether they are equivalent.
    */
  @JSName("equals")
  var equals_FIPoint: js.UndefOr[js.Function1[/* point */ js.UndefOr[js.Any], Boolean]] = js.native
  
  /** [Method] Whether the given point is not away from this point within the given threshold amount
    * @param point Ext.util.Point/Object The point to check with, either an instance of Ext.util.Point or an object with x and y properties.
    * @param threshold Object/Number Can be either an object with x and y properties or a number.
    * @returns Boolean
    */
  var isCloseTo: js.UndefOr[
    js.Function2[/* point */ js.UndefOr[js.Any], /* threshold */ js.UndefOr[js.Any], Boolean]
  ] = js.native
  
  /** [Method] Returns true if this point is close to another one
    * @returns Boolean
    */
  var isWithin: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Compare this point with another point when the x and y values of both points are rounded
    * @param point Ext.util.Point/Object The point to compare with, either an instance of Ext.util.Point or an object with x and y properties.
    * @returns Boolean
    */
  var roundedEquals: js.UndefOr[js.Function1[/* point */ js.UndefOr[js.Any], Boolean]] = js.native
  
  /** [Method] Returns a human eye friendly string that represents this point useful for debugging
    * @returns String For example Point[12,8].
    */
  @JSName("toString")
  var toString_FIPoint: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Translate this point by the given amounts
    * @param x Number Amount to translate in the x-axis.
    * @param y Number Amount to translate in the y-axis.
    * @returns Boolean
    */
  var translate: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Boolean]] = js.native
}
object IPoint {
  
  @scala.inline
  def apply(): IPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPoint]
  }
  
  @scala.inline
  implicit class IPointOps[Self <: IPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClone(value: () => IPoint): Self = this.set("clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteClone: Self = this.set("clone", js.undefined)
    
    @scala.inline
    def setCopy(value: () => IPoint): Self = this.set("copy", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCopy: Self = this.set("copy", js.undefined)
    
    @scala.inline
    def setCopyFrom(value: /* point */ js.UndefOr[js.Any] => IPoint): Self = this.set("copyFrom", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCopyFrom: Self = this.set("copyFrom", js.undefined)
    
    @scala.inline
    def setEquals(value: /* point */ js.UndefOr[js.Any] => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEquals: Self = this.set("equals", js.undefined)
    
    @scala.inline
    def setIsCloseTo(value: (/* point */ js.UndefOr[js.Any], /* threshold */ js.UndefOr[js.Any]) => Boolean): Self = this.set("isCloseTo", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteIsCloseTo: Self = this.set("isCloseTo", js.undefined)
    
    @scala.inline
    def setIsWithin(value: () => Boolean): Self = this.set("isWithin", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIsWithin: Self = this.set("isWithin", js.undefined)
    
    @scala.inline
    def setRoundedEquals(value: /* point */ js.UndefOr[js.Any] => Boolean): Self = this.set("roundedEquals", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRoundedEquals: Self = this.set("roundedEquals", js.undefined)
    
    @scala.inline
    def setToString(value: () => String): Self = this.set("toString", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteToString: Self = this.set("toString", js.undefined)
    
    @scala.inline
    def setTranslate(value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Boolean): Self = this.set("translate", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteTranslate: Self = this.set("translate", js.undefined)
  }
}
