package typings.react.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchList extends /* index */ NumberDictionary[Touch] {
  
  def identifiedTouch(identifier: Double): Touch = js.native
  
  def item(index: Double): Touch = js.native
  
  var length: Double = js.native
}
object TouchList {
  
  @scala.inline
  def apply(identifiedTouch: Double => Touch, item: Double => Touch, length: Double): TouchList = {
    val __obj = js.Dynamic.literal(identifiedTouch = js.Any.fromFunction1(identifiedTouch), item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchList]
  }
  
  @scala.inline
  implicit class TouchListMutableBuilder[Self <: TouchList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentifiedTouch(value: Double => Touch): Self = StObject.set(x, "identifiedTouch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItem(value: Double => Touch): Self = StObject.set(x, "item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
