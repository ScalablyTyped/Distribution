package typings.rascal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InMemory extends StObject {
  
  var inMemory: SizeNumber = js.native
}
object InMemory {
  
  @scala.inline
  def apply(inMemory: SizeNumber): InMemory = {
    val __obj = js.Dynamic.literal(inMemory = inMemory.asInstanceOf[js.Any])
    __obj.asInstanceOf[InMemory]
  }
  
  @scala.inline
  implicit class InMemoryMutableBuilder[Self <: InMemory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInMemory(value: SizeNumber): Self = StObject.set(x, "inMemory", value.asInstanceOf[js.Any])
  }
}
