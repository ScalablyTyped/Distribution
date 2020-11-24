package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NxHighlightRanges extends js.Object {
  
  var qRanges: js.Array[CharRange] = js.native
}
object NxHighlightRanges {
  
  @scala.inline
  def apply(qRanges: js.Array[CharRange]): NxHighlightRanges = {
    val __obj = js.Dynamic.literal(qRanges = qRanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxHighlightRanges]
  }
  
  @scala.inline
  implicit class NxHighlightRangesOps[Self <: NxHighlightRanges] (val x: Self) extends AnyVal {
    
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
    def setQRangesVarargs(value: CharRange*): Self = this.set("qRanges", js.Array(value :_*))
    
    @scala.inline
    def setQRanges(value: js.Array[CharRange]): Self = this.set("qRanges", value.asInstanceOf[js.Any])
  }
}
