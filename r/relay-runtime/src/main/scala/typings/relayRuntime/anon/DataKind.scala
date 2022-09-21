package typings.relayRuntime.anon

import typings.relayRuntime.relayReplaySubjectMod.Event
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
  
  extension [Self <: DataKind[?], T](x: Self & DataKind[T]) {
    
    inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setKind(value: next): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
