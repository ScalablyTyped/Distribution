package typings.reactNavigationCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataReadonly[Data] extends StObject {
  
  val data: Data = js.native
}
object DataReadonly {
  
  @scala.inline
  def apply[Data](data: Data): DataReadonly[Data] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataReadonly[Data]]
  }
  
  @scala.inline
  implicit class DataReadonlyMutableBuilder[Self <: DataReadonly[_], Data] (val x: Self with DataReadonly[Data]) extends AnyVal {
    
    @scala.inline
    def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
