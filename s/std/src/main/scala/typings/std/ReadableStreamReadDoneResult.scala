package typings.std

import typings.std.stdBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadableStreamReadDoneResult
  extends StObject
     with ReadableStreamReadResult[Any] {
  
  /* standard dom */
  var done: `true`
  
  /* standard dom */
  var value: Unit
}
object ReadableStreamReadDoneResult {
  
  inline def apply(value: Unit): ReadableStreamReadDoneResult = {
    val __obj = js.Dynamic.literal(done = true, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadableStreamReadDoneResult]
  }
  
  extension [Self <: ReadableStreamReadDoneResult](x: Self) {
    
    inline def setDone(value: `true`): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Unit): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
