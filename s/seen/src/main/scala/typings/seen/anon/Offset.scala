package typings.seen.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Offset extends StObject {
  
  var offset: js.Array[Double]
  
  var offsetRelative: js.Array[Double]
}
object Offset {
  
  @scala.inline
  def apply(offset: js.Array[Double], offsetRelative: js.Array[Double]): Offset = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], offsetRelative = offsetRelative.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offset]
  }
  
  @scala.inline
  implicit class OffsetMutableBuilder[Self <: Offset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOffset(value: js.Array[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetRelative(value: js.Array[Double]): Self = StObject.set(x, "offsetRelative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetRelativeVarargs(value: Double*): Self = StObject.set(x, "offsetRelative", js.Array(value :_*))
    
    @scala.inline
    def setOffsetVarargs(value: Double*): Self = StObject.set(x, "offset", js.Array(value :_*))
  }
}
