package typings.reactNavigationCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataNoop extends StObject {
  
  var data: Noop
}
object DataNoop {
  
  @scala.inline
  def apply(data: Noop): DataNoop = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataNoop]
  }
  
  @scala.inline
  implicit class DataNoopMutableBuilder[Self <: DataNoop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Noop): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
