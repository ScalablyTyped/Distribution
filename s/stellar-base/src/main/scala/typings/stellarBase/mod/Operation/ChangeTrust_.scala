package typings.stellarBase.mod.Operation

import typings.stellarBase.mod.Asset
import typings.stellarBase.mod.OperationType.ChangeTrust
import typings.stellarBase.mod._Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeTrust_
  extends BaseOperation[ChangeTrust]
     with _Operation {
  
  var limit: String = js.native
  
  var line: Asset = js.native
}
object ChangeTrust_ {
  
  @scala.inline
  def apply(limit: String, line: Asset, `type`: ChangeTrust): ChangeTrust_ = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeTrust_]
  }
  
  @scala.inline
  implicit class ChangeTrust_MutableBuilder[Self <: ChangeTrust_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: String): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: Asset): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
  }
}
