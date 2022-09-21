package typings.rcTable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Indent[T] extends StObject {
  
  var indent: Double
  
  var index: Double
  
  var record: T
}
object Indent {
  
  inline def apply[T](indent: Double, index: Double, record: T): Indent[T] = {
    val __obj = js.Dynamic.literal(indent = indent.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], record = record.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indent[T]]
  }
  
  extension [Self <: Indent[?], T](x: Self & Indent[T]) {
    
    inline def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setRecord(value: T): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
  }
}
