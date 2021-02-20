package typings.reactNativeChartsWrapper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BarSpace extends StObject {
  
  var barSpace: Double = js.native
  
  var fromX: Double = js.native
  
  var groupSpace: Double = js.native
}
object BarSpace {
  
  @scala.inline
  def apply(barSpace: Double, fromX: Double, groupSpace: Double): BarSpace = {
    val __obj = js.Dynamic.literal(barSpace = barSpace.asInstanceOf[js.Any], fromX = fromX.asInstanceOf[js.Any], groupSpace = groupSpace.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarSpace]
  }
  
  @scala.inline
  implicit class BarSpaceMutableBuilder[Self <: BarSpace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBarSpace(value: Double): Self = StObject.set(x, "barSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromX(value: Double): Self = StObject.set(x, "fromX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupSpace(value: Double): Self = StObject.set(x, "groupSpace", value.asInstanceOf[js.Any])
  }
}
