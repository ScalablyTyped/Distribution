package typings.stormReactDiagrams.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait End extends js.Object {
  
  var end: X = js.native
  
  var pathToEnd: js.Array[js.Array[Double]] = js.native
  
  var pathToStart: js.Array[js.Array[Double]] = js.native
  
  var start: X = js.native
}
object End {
  
  @scala.inline
  def apply(end: X, pathToEnd: js.Array[js.Array[Double]], pathToStart: js.Array[js.Array[Double]], start: X): End = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], pathToEnd = pathToEnd.asInstanceOf[js.Any], pathToStart = pathToStart.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[End]
  }
  
  @scala.inline
  implicit class EndOps[Self <: End] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: X): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathToEndVarargs(value: js.Array[Double]*): Self = this.set("pathToEnd", js.Array(value :_*))
    
    @scala.inline
    def setPathToEnd(value: js.Array[js.Array[Double]]): Self = this.set("pathToEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathToStartVarargs(value: js.Array[Double]*): Self = this.set("pathToStart", js.Array(value :_*))
    
    @scala.inline
    def setPathToStart(value: js.Array[js.Array[Double]]): Self = this.set("pathToStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: X): Self = this.set("start", value.asInstanceOf[js.Any])
  }
}
