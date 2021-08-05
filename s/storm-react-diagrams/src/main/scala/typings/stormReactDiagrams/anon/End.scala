package typings.stormReactDiagrams.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait End extends StObject {
  
  var end: X
  
  var pathToEnd: js.Array[js.Array[Double]]
  
  var pathToStart: js.Array[js.Array[Double]]
  
  var start: X
}
object End {
  
  inline def apply(end: X, pathToEnd: js.Array[js.Array[Double]], pathToStart: js.Array[js.Array[Double]], start: X): End = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], pathToEnd = pathToEnd.asInstanceOf[js.Any], pathToStart = pathToStart.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[End]
  }
  
  extension [Self <: End](x: Self) {
    
    inline def setEnd(value: X): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setPathToEnd(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "pathToEnd", value.asInstanceOf[js.Any])
    
    inline def setPathToEndVarargs(value: js.Array[Double]*): Self = StObject.set(x, "pathToEnd", js.Array(value :_*))
    
    inline def setPathToStart(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "pathToStart", value.asInstanceOf[js.Any])
    
    inline def setPathToStartVarargs(value: js.Array[Double]*): Self = StObject.set(x, "pathToStart", js.Array(value :_*))
    
    inline def setStart(value: X): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
