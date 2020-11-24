package typings.projectNameGenerator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Project extends js.Object {
  
  var dashed: String = js.native
  
  var raw: js.Array[String | Double] = js.native
  
  var spaced: String = js.native
}
object Project {
  
  @scala.inline
  def apply(dashed: String, raw: js.Array[String | Double], spaced: String): Project = {
    val __obj = js.Dynamic.literal(dashed = dashed.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], spaced = spaced.asInstanceOf[js.Any])
    __obj.asInstanceOf[Project]
  }
  
  @scala.inline
  implicit class ProjectOps[Self <: Project] (val x: Self) extends AnyVal {
    
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
    def setDashed(value: String): Self = this.set("dashed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawVarargs(value: (String | Double)*): Self = this.set("raw", js.Array(value :_*))
    
    @scala.inline
    def setRaw(value: js.Array[String | Double]): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaced(value: String): Self = this.set("spaced", value.asInstanceOf[js.Any])
  }
}
