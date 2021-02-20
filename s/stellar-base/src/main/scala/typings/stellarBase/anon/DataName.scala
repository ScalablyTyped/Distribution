package typings.stellarBase.anon

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataName extends StObject {
  
  var dataName: String | Buffer = js.native
  
  var dataValue: Null | Buffer = js.native
}
object DataName {
  
  @scala.inline
  def apply(dataName: String | Buffer): DataName = {
    val __obj = js.Dynamic.literal(dataName = dataName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataName]
  }
  
  @scala.inline
  implicit class DataNameMutableBuilder[Self <: DataName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataName(value: String | Buffer): Self = StObject.set(x, "dataName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataValue(value: Buffer): Self = StObject.set(x, "dataValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataValueNull: Self = StObject.set(x, "dataValue", null)
  }
}
