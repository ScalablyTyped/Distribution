package typings.reactBootstrapTableNext.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSize extends StObject {
  
  var dataSize: Double
}
object DataSize {
  
  @scala.inline
  def apply(dataSize: Double): DataSize = {
    val __obj = js.Dynamic.literal(dataSize = dataSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSize]
  }
  
  @scala.inline
  implicit class DataSizeMutableBuilder[Self <: DataSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSize(value: Double): Self = StObject.set(x, "dataSize", value.asInstanceOf[js.Any])
  }
}
