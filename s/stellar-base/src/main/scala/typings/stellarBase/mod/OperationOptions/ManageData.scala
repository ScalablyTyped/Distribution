package typings.stellarBase.mod.OperationOptions

import typings.node.Buffer
import typings.stellarBase.mod._OperationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManageData
  extends BaseOptions
     with _OperationOptions {
  
  var name: String = js.native
  
  var value: String | Buffer | Null = js.native
}
object ManageData {
  
  @scala.inline
  def apply(name: String): ManageData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManageData]
  }
  
  @scala.inline
  implicit class ManageDataMutableBuilder[Self <: ManageData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String | Buffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
  }
}
