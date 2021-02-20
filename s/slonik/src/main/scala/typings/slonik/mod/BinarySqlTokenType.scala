package typings.slonik.mod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BinarySqlTokenType extends _SqlTokenType {
  
  var data: Buffer = js.native
  
  var `type`: js.Symbol = js.native
}
object BinarySqlTokenType {
  
  @scala.inline
  def apply(data: Buffer, `type`: js.Symbol): BinarySqlTokenType = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinarySqlTokenType]
  }
  
  @scala.inline
  implicit class BinarySqlTokenTypeMutableBuilder[Self <: BinarySqlTokenType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: js.Symbol): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
