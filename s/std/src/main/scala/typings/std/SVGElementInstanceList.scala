package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGElementInstanceList extends StObject {
  
  /** @deprecated */
  def item(index: Double): SVGElementInstance
  
  /** @deprecated */
  val length: Double
}
object SVGElementInstanceList {
  
  @scala.inline
  def apply(item: Double => SVGElementInstance, length: Double): SVGElementInstanceList = {
    val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGElementInstanceList]
  }
  
  @scala.inline
  implicit class SVGElementInstanceListMutableBuilder[Self <: SVGElementInstanceList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: Double => SVGElementInstance): Self = StObject.set(x, "item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
