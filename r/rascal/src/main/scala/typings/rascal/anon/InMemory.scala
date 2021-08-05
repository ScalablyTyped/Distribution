package typings.rascal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InMemory extends StObject {
  
  var inMemory: SizeNumber
}
object InMemory {
  
  inline def apply(inMemory: SizeNumber): InMemory = {
    val __obj = js.Dynamic.literal(inMemory = inMemory.asInstanceOf[js.Any])
    __obj.asInstanceOf[InMemory]
  }
  
  extension [Self <: InMemory](x: Self) {
    
    inline def setInMemory(value: SizeNumber): Self = StObject.set(x, "inMemory", value.asInstanceOf[js.Any])
  }
}
