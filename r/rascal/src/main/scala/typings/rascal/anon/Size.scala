package typings.rascal.anon

import typings.rascal.rascalStrings.inMemory
import typings.rascal.rascalStrings.inMemoryCluster
import typings.rascal.rascalStrings.stub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Size extends StObject {
  
  var size: js.UndefOr[Double] = js.undefined
  
  var `type`: stub | inMemory | inMemoryCluster
}
object Size {
  
  inline def apply(`type`: stub | inMemory | inMemoryCluster): Size = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setType(value: stub | inMemory | inMemoryCluster): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
