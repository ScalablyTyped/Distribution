package typings.relayRuntime.anon

import typings.relayRuntime.libUtilRelayReplaySubjectMod.Event
import typings.relayRuntime.relayRuntimeStrings.next
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataKind[T]
  extends StObject
     with Event[T] {
  
  var data: T
  
  var kind: next
}
object DataKind {
  
  inline def apply[T](data: T): DataKind[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], kind = "next")
    __obj.asInstanceOf[DataKind[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataKind[?], T] (val x: Self & DataKind[T]) extends AnyVal {
    
    inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setKind(value: next): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
