package typings.sharepoint.Srch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefinerStructure extends js.Object {
  
  /** Keyword */
  var k: String = js.native
  
  var l: Double = js.native
  
  var r: js.Array[RefinementCategory] = js.native
}
object RefinerStructure {
  
  @scala.inline
  def apply(k: String, l: Double, r: js.Array[RefinementCategory]): RefinerStructure = {
    val __obj = js.Dynamic.literal(k = k.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefinerStructure]
  }
  
  @scala.inline
  implicit class RefinerStructureOps[Self <: RefinerStructure] (val x: Self) extends AnyVal {
    
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
    def setK(value: String): Self = this.set("k", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL(value: Double): Self = this.set("l", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRVarargs(value: RefinementCategory*): Self = this.set("r", js.Array(value :_*))
    
    @scala.inline
    def setR(value: js.Array[RefinementCategory]): Self = this.set("r", value.asInstanceOf[js.Any])
  }
}
