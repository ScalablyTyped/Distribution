package typings.readableStream.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ==== BufferList ====
trait Entry[D] extends StObject {
  
  var data: D
  
  var next: Entry[D] | Null
}
object Entry {
  
  @scala.inline
  def apply[D](data: D): Entry[D] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], next = null)
    __obj.asInstanceOf[Entry[D]]
  }
  
  @scala.inline
  implicit class EntryMutableBuilder[Self <: Entry[?], D] (val x: Self & Entry[D]) extends AnyVal {
    
    @scala.inline
    def setData(value: D): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: Entry[D]): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextNull: Self = StObject.set(x, "next", null)
  }
}
