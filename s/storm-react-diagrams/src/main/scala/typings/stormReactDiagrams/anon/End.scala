package typings.stormReactDiagrams.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait End extends StObject {
  
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
  implicit class EndMutableBuilder[Self <: End] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: X): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathToEnd(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "pathToEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathToEndVarargs(value: js.Array[Double]*): Self = StObject.set(x, "pathToEnd", js.Array(value :_*))
    
    @scala.inline
    def setPathToStart(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "pathToStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathToStartVarargs(value: js.Array[Double]*): Self = StObject.set(x, "pathToStart", js.Array(value :_*))
    
    @scala.inline
    def setStart(value: X): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
