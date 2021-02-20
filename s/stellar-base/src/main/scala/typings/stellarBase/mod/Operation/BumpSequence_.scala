package typings.stellarBase.mod.Operation

import typings.stellarBase.mod.OperationType.BumpSequence
import typings.stellarBase.mod._Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BumpSequence_
  extends BaseOperation[BumpSequence]
     with _Operation {
  
  var bumpTo: String = js.native
}
object BumpSequence_ {
  
  @scala.inline
  def apply(bumpTo: String, `type`: BumpSequence): BumpSequence_ = {
    val __obj = js.Dynamic.literal(bumpTo = bumpTo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BumpSequence_]
  }
  
  @scala.inline
  implicit class BumpSequence_MutableBuilder[Self <: BumpSequence_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBumpTo(value: String): Self = StObject.set(x, "bumpTo", value.asInstanceOf[js.Any])
  }
}
