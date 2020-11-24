package typings.projectOxford.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Lines extends js.Object {
  
  var boundingBox: String = js.native
  
  var lines: js.Array[Words] = js.native
}
object Lines {
  
  @scala.inline
  def apply(boundingBox: String, lines: js.Array[Words]): Lines = {
    val __obj = js.Dynamic.literal(boundingBox = boundingBox.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lines]
  }
  
  @scala.inline
  implicit class LinesOps[Self <: Lines] (val x: Self) extends AnyVal {
    
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
    def setBoundingBox(value: String): Self = this.set("boundingBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinesVarargs(value: Words*): Self = this.set("lines", js.Array(value :_*))
    
    @scala.inline
    def setLines(value: js.Array[Words]): Self = this.set("lines", value.asInstanceOf[js.Any])
  }
}
