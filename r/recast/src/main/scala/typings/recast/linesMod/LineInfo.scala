package typings.recast.linesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineInfo extends js.Object {
  
  val indent: Double = js.native
  
  val line: String = js.native
  
  val locked: Boolean = js.native
  
  val sliceEnd: Double = js.native
  
  val sliceStart: Double = js.native
}
object LineInfo {
  
  @scala.inline
  def apply(indent: Double, line: String, locked: Boolean, sliceEnd: Double, sliceStart: Double): LineInfo = {
    val __obj = js.Dynamic.literal(indent = indent.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], sliceEnd = sliceEnd.asInstanceOf[js.Any], sliceStart = sliceStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineInfo]
  }
  
  @scala.inline
  implicit class LineInfoOps[Self <: LineInfo] (val x: Self) extends AnyVal {
    
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
    def setIndent(value: Double): Self = this.set("indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: String): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocked(value: Boolean): Self = this.set("locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSliceEnd(value: Double): Self = this.set("sliceEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSliceStart(value: Double): Self = this.set("sliceStart", value.asInstanceOf[js.Any])
  }
}
