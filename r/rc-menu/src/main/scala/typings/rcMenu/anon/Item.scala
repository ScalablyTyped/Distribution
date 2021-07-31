package typings.rcMenu.anon

import typings.react.mod.ReactInstance
import typings.std.HTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Item extends StObject {
  
  var domEvent: typings.react.mod.MouseEvent[HTMLElement, MouseEvent]
  
  var item: ReactInstance
  
  var key: String | Double
  
  var keyPath: js.Array[String | Double]
}
object Item {
  
  @scala.inline
  def apply(
    domEvent: typings.react.mod.MouseEvent[HTMLElement, MouseEvent],
    item: ReactInstance,
    key: String | Double,
    keyPath: js.Array[String | Double]
  ): Item = {
    val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyPath = keyPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
  
  @scala.inline
  implicit class ItemMutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomEvent(value: typings.react.mod.MouseEvent[HTMLElement, MouseEvent]): Self = StObject.set(x, "domEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: ReactInstance): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPath(value: js.Array[String | Double]): Self = StObject.set(x, "keyPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPathVarargs(value: (String | Double)*): Self = StObject.set(x, "keyPath", js.Array(value :_*))
  }
}
