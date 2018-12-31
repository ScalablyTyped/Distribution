package typings
package senchaUnderscoreTouchLib.ExtNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRegion
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Method] Modifies the current region to be adjusted by offsets
  		* @param top Number Top offset
  		* @param right Number Right offset
  		* @param bottom Number Bottom offset
  		* @param left Number Left offset
  		* @returns Ext.util.Region this
  		*/
  var adjust: js.UndefOr[
    js.Function4[
      /* top */ js.UndefOr[scala.Double], 
      /* right */ js.UndefOr[scala.Double], 
      /* bottom */ js.UndefOr[scala.Double], 
      /* left */ js.UndefOr[scala.Double], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Modifies the current region to be constrained to the targetRegion
  		* @param targetRegion Ext.util.Region
  		* @returns Ext.util.Region this
  		*/
  var constrainTo: js.UndefOr[js.Function1[/* targetRegion */ js.UndefOr[this.type], this.type]] = js.undefined
  /** [Method] Checks if this region completely contains the region that is passed in
  		* @param region Ext.util.Region
  		* @returns Boolean
  		*/
  var contains: js.UndefOr[js.Function1[/* region */ js.UndefOr[this.type], scala.Boolean]] = js.undefined
  /** [Method] Copy a new instance
  		* @returns Ext.util.Region
  		*/
  var copy: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Check whether this region is equivalent to the given region
  		* @param region Ext.util.Region The region to compare with.
  		* @returns Boolean
  		*/
  @JSName("equals")
  var equals_FIRegion: js.UndefOr[js.Function1[/* region */ js.UndefOr[this.type], scala.Boolean]] = js.undefined
  /** [Method] Get the offset amount of a point outside the region
  		* @param axis String/Object optional.
  		* @param p Ext.util.Point The point.
  		* @returns Ext.util.Region
  		*/
  var getOutOfBoundOffset: js.UndefOr[
    js.Function2[/* axis */ js.UndefOr[js.Any], /* p */ js.UndefOr[IPoint], this.type]
  ] = js.undefined
  /** [Method] Get the offset amount on the x axis
  		* @param p Number The offset.
  		* @returns Number
  		*/
  var getOutOfBoundOffsetX: js.UndefOr[js.Function1[/* p */ js.UndefOr[scala.Double], scala.Double]] = js.undefined
  /** [Method] Get the offset amount on the y axis
  		* @param p Number The offset.
  		* @returns Number
  		*/
  var getOutOfBoundOffsetY: js.UndefOr[js.Function1[/* p */ js.UndefOr[scala.Double], scala.Double]] = js.undefined
  /** [Method] Checks if this region intersects the region passed in
  		* @param region Ext.util.Region
  		* @returns Ext.util.Region/Boolean Returns the intersected region or false if there is no intersection.
  		*/
  var intersect: js.UndefOr[js.Function1[/* region */ js.UndefOr[this.type], _]] = js.undefined
  /** [Method] Check whether the point  offset is out of bounds
  		* @param axis String optional
  		* @param p Ext.util.Point/Number The point / offset.
  		* @returns Boolean
  		*/
  var isOutOfBound: js.UndefOr[
    js.Function2[/* axis */ js.UndefOr[java.lang.String], /* p */ js.UndefOr[js.Any], scala.Boolean]
  ] = js.undefined
  /** [Method] Check whether the offset is out of bound in the x axis
  		* @param p Number The offset.
  		* @returns Boolean
  		*/
  var isOutOfBoundX: js.UndefOr[js.Function1[/* p */ js.UndefOr[scala.Double], scala.Boolean]] = js.undefined
  /** [Method] Check whether the offset is out of bound in the y axis
  		* @param p Number The offset.
  		* @returns Boolean
  		*/
  var isOutOfBoundY: js.UndefOr[js.Function1[/* p */ js.UndefOr[scala.Double], scala.Boolean]] = js.undefined
  /** [Method] Round all the properties of this region
  		* @returns Ext.util.Region This Region.
  		*/
  var round: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Dump this to an eye friendly string great for debugging
  		* @returns String For example Region[0,1,3,2].
  		*/
  @JSName("toString")
  var toString_FIRegion: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Translate this region by the given offset amount
  		* @param offset Object
  		* @returns Ext.util.Region This Region.
  		*/
  var translateBy: js.UndefOr[js.Function1[/* offset */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Returns the smallest region that contains the current AND targetRegion
  		* @param region Ext.util.Region
  		* @returns Ext.util.Region
  		*/
  var union: js.UndefOr[js.Function1[/* region */ js.UndefOr[this.type], this.type]] = js.undefined
}

