package typings
package senchaUnderscoreTouchLib.ExtNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILineSegment
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Method] Returns the point where two lines intersect
  		* @param lineSegment Ext.util.LineSegment The line to intersect with.
  		* @returns Ext.util.Point
  		*/
  var intersects: js.UndefOr[js.Function1[/* lineSegment */ js.UndefOr[this.type], IPoint]] = js.undefined
  /** [Method] Returns string representation of the line
  		* @returns String For example Point[12,8] Point[0,0]
  		*/
  @JSName("toString")
  var toString_FILineSegment: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
}

