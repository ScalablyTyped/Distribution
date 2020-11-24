package typings.senchaTouch.Ext.util

import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRegion extends IBase {
  
  /** [Method] Modifies the current region to be adjusted by offsets
    * @param top Number Top offset
    * @param right Number Right offset
    * @param bottom Number Bottom offset
    * @param left Number Left offset
    * @returns Ext.util.Region this
    */
  var adjust: js.UndefOr[
    js.Function4[
      /* top */ js.UndefOr[Double], 
      /* right */ js.UndefOr[Double], 
      /* bottom */ js.UndefOr[Double], 
      /* left */ js.UndefOr[Double], 
      this.type
    ]
  ] = js.native
  
  /** [Method] Modifies the current region to be constrained to the targetRegion
    * @param targetRegion Ext.util.Region
    * @returns Ext.util.Region this
    */
  var constrainTo: js.UndefOr[js.Function1[/* targetRegion */ js.UndefOr[this.type], this.type]] = js.native
  
  /** [Method] Checks if this region completely contains the region that is passed in
    * @param region Ext.util.Region
    * @returns Boolean
    */
  var contains: js.UndefOr[js.Function1[/* region */ js.UndefOr[this.type], Boolean]] = js.native
  
  /** [Method] Copy a new instance
    * @returns Ext.util.Region
    */
  var copy: js.UndefOr[js.Function0[this.type]] = js.native
  
  /** [Method] Check whether this region is equivalent to the given region
    * @param region Ext.util.Region The region to compare with.
    * @returns Boolean
    */
  @JSName("equals")
  var equals_FIRegion: js.UndefOr[js.Function1[/* region */ js.UndefOr[this.type], Boolean]] = js.native
  
  /** [Method] Get the offset amount of a point outside the region
    * @param axis String/Object optional.
    * @param p Ext.util.Point The point.
    * @returns Ext.util.Region
    */
  var getOutOfBoundOffset: js.UndefOr[
    js.Function2[/* axis */ js.UndefOr[js.Any], /* p */ js.UndefOr[IPoint], this.type]
  ] = js.native
  
  /** [Method] Get the offset amount on the x axis
    * @param p Number The offset.
    * @returns Number
    */
  var getOutOfBoundOffsetX: js.UndefOr[js.Function1[/* p */ js.UndefOr[Double], Double]] = js.native
  
  /** [Method] Get the offset amount on the y axis
    * @param p Number The offset.
    * @returns Number
    */
  var getOutOfBoundOffsetY: js.UndefOr[js.Function1[/* p */ js.UndefOr[Double], Double]] = js.native
  
  /** [Method] Checks if this region intersects the region passed in
    * @param region Ext.util.Region
    * @returns Ext.util.Region/Boolean Returns the intersected region or false if there is no intersection.
    */
  var intersect: js.UndefOr[js.Function1[/* region */ js.UndefOr[this.type], _]] = js.native
  
  /** [Method] Check whether the point  offset is out of bounds
    * @param axis String optional
    * @param p Ext.util.Point/Number The point / offset.
    * @returns Boolean
    */
  var isOutOfBound: js.UndefOr[js.Function2[/* axis */ js.UndefOr[String], /* p */ js.UndefOr[js.Any], Boolean]] = js.native
  
  /** [Method] Check whether the offset is out of bound in the x axis
    * @param p Number The offset.
    * @returns Boolean
    */
  var isOutOfBoundX: js.UndefOr[js.Function1[/* p */ js.UndefOr[Double], Boolean]] = js.native
  
  /** [Method] Check whether the offset is out of bound in the y axis
    * @param p Number The offset.
    * @returns Boolean
    */
  var isOutOfBoundY: js.UndefOr[js.Function1[/* p */ js.UndefOr[Double], Boolean]] = js.native
  
  /** [Method] Round all the properties of this region
    * @returns Ext.util.Region This Region.
    */
  var round: js.UndefOr[js.Function0[this.type]] = js.native
  
  /** [Method] Dump this to an eye friendly string great for debugging
    * @returns String For example Region[0,1,3,2].
    */
  @JSName("toString")
  var toString_FIRegion: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Translate this region by the given offset amount
    * @param offset Object
    * @returns Ext.util.Region This Region.
    */
  var translateBy: js.UndefOr[js.Function1[/* offset */ js.UndefOr[js.Any], this.type]] = js.native
  
  /** [Method] Returns the smallest region that contains the current AND targetRegion
    * @param region Ext.util.Region
    * @returns Ext.util.Region
    */
  var union: js.UndefOr[js.Function1[/* region */ js.UndefOr[this.type], this.type]] = js.native
}
object IRegion {
  
  @scala.inline
  def apply(): IRegion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRegion]
  }
  
  @scala.inline
  implicit class IRegionOps[Self <: IRegion] (val x: Self) extends AnyVal {
    
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
    def setAdjust(
      value: (/* top */ js.UndefOr[Double], /* right */ js.UndefOr[Double], /* bottom */ js.UndefOr[Double], /* left */ js.UndefOr[Double]) => IRegion
    ): Self = this.set("adjust", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteAdjust: Self = this.set("adjust", js.undefined)
    
    @scala.inline
    def setConstrainTo(value: /* targetRegion */ js.UndefOr[IRegion] => IRegion): Self = this.set("constrainTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteConstrainTo: Self = this.set("constrainTo", js.undefined)
    
    @scala.inline
    def setContains(value: /* region */ js.UndefOr[IRegion] => Boolean): Self = this.set("contains", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteContains: Self = this.set("contains", js.undefined)
    
    @scala.inline
    def setCopy(value: () => IRegion): Self = this.set("copy", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCopy: Self = this.set("copy", js.undefined)
    
    @scala.inline
    def setEquals(value: /* region */ js.UndefOr[IRegion] => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEquals: Self = this.set("equals", js.undefined)
    
    @scala.inline
    def setGetOutOfBoundOffset(value: (/* axis */ js.UndefOr[js.Any], /* p */ js.UndefOr[IPoint]) => IRegion): Self = this.set("getOutOfBoundOffset", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetOutOfBoundOffset: Self = this.set("getOutOfBoundOffset", js.undefined)
    
    @scala.inline
    def setGetOutOfBoundOffsetX(value: /* p */ js.UndefOr[Double] => Double): Self = this.set("getOutOfBoundOffsetX", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetOutOfBoundOffsetX: Self = this.set("getOutOfBoundOffsetX", js.undefined)
    
    @scala.inline
    def setGetOutOfBoundOffsetY(value: /* p */ js.UndefOr[Double] => Double): Self = this.set("getOutOfBoundOffsetY", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetOutOfBoundOffsetY: Self = this.set("getOutOfBoundOffsetY", js.undefined)
    
    @scala.inline
    def setIntersect(value: /* region */ js.UndefOr[IRegion] => _): Self = this.set("intersect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIntersect: Self = this.set("intersect", js.undefined)
    
    @scala.inline
    def setIsOutOfBound(value: (/* axis */ js.UndefOr[String], /* p */ js.UndefOr[js.Any]) => Boolean): Self = this.set("isOutOfBound", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteIsOutOfBound: Self = this.set("isOutOfBound", js.undefined)
    
    @scala.inline
    def setIsOutOfBoundX(value: /* p */ js.UndefOr[Double] => Boolean): Self = this.set("isOutOfBoundX", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIsOutOfBoundX: Self = this.set("isOutOfBoundX", js.undefined)
    
    @scala.inline
    def setIsOutOfBoundY(value: /* p */ js.UndefOr[Double] => Boolean): Self = this.set("isOutOfBoundY", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIsOutOfBoundY: Self = this.set("isOutOfBoundY", js.undefined)
    
    @scala.inline
    def setRound(value: () => IRegion): Self = this.set("round", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRound: Self = this.set("round", js.undefined)
    
    @scala.inline
    def setToString(value: () => String): Self = this.set("toString", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteToString: Self = this.set("toString", js.undefined)
    
    @scala.inline
    def setTranslateBy(value: /* offset */ js.UndefOr[js.Any] => IRegion): Self = this.set("translateBy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTranslateBy: Self = this.set("translateBy", js.undefined)
    
    @scala.inline
    def setUnion(value: /* region */ js.UndefOr[IRegion] => IRegion): Self = this.set("union", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUnion: Self = this.set("union", js.undefined)
  }
}
