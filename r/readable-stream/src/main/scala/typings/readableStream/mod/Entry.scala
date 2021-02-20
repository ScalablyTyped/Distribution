package typings.readableStream.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ==== BufferList ====
@js.native
trait Entry[D] extends StObject {
  
  var data: D = js.native
  
  var next: Entry[D] | Null = js.native
}
object Entry {
  
  @scala.inline
  def apply[D](data: D): Entry[D] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entry[D]]
  }
  
  @scala.inline
  implicit class EntryMutableBuilder[Self <: Entry[_], D] (val x: Self with Entry[D]) extends AnyVal {
    
    @scala.inline
    def setData(value: D): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: Entry[D]): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextNull: Self = StObject.set(x, "next", null)
  }
}
