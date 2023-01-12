package typings.reactBootstrapTableNext.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSize extends StObject {
  
  var dataSize: Double
}
object DataSize {
  
  inline def apply(dataSize: Double): DataSize = {
    val __obj = js.Dynamic.literal(dataSize = dataSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataSize] (val x: Self) extends AnyVal {
    
    inline def setDataSize(value: Double): Self = StObject.set(x, "dataSize", value.asInstanceOf[js.Any])
  }
}
