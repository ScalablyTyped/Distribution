package typings.reactNavigationCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataReadonly[Data] extends StObject {
  
  val data: Data
}
object DataReadonly {
  
  inline def apply[Data](data: Data): DataReadonly[Data] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataReadonly[Data]]
  }
  
  extension [Self <: DataReadonly[?], Data](x: Self & DataReadonly[Data]) {
    
    inline def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
