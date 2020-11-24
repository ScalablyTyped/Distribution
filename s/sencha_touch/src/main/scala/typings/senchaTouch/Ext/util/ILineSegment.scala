package typings.senchaTouch.Ext.util

import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILineSegment extends IBase {
  
  /** [Method] Returns the point where two lines intersect
    * @param lineSegment Ext.util.LineSegment The line to intersect with.
    * @returns Ext.util.Point
    */
  var intersects: js.UndefOr[js.Function1[/* lineSegment */ js.UndefOr[this.type], IPoint]] = js.native
  
  /** [Method] Returns string representation of the line
    * @returns String For example Point[12,8] Point[0,0]
    */
  @JSName("toString")
  var toString_FILineSegment: js.UndefOr[js.Function0[String]] = js.native
}
object ILineSegment {
  
  @scala.inline
  def apply(): ILineSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILineSegment]
  }
  
  @scala.inline
  implicit class ILineSegmentOps[Self <: ILineSegment] (val x: Self) extends AnyVal {
    
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
    def setIntersects(value: /* lineSegment */ js.UndefOr[ILineSegment] => IPoint): Self = this.set("intersects", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIntersects: Self = this.set("intersects", js.undefined)
    
    @scala.inline
    def setToString(value: () => String): Self = this.set("toString", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteToString: Self = this.set("toString", js.undefined)
  }
}
