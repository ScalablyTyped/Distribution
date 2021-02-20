package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetaBase[D /* <: js.Object */] extends StObject {
  
  var instance: TableInstance[D] = js.native
  
  var userProps: js.Any = js.native
}
object MetaBase {
  
  @scala.inline
  def apply[D /* <: js.Object */](instance: TableInstance[D], userProps: js.Any): MetaBase[D] = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], userProps = userProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaBase[D]]
  }
  
  @scala.inline
  implicit class MetaBaseMutableBuilder[Self <: MetaBase[_], D /* <: js.Object */] (val x: Self with MetaBase[D]) extends AnyVal {
    
    @scala.inline
    def setInstance(value: TableInstance[D]): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProps(value: js.Any): Self = StObject.set(x, "userProps", value.asInstanceOf[js.Any])
  }
}
