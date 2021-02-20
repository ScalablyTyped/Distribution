package typings.stellarBase.mod.OperationOptions

import typings.stellarBase.mod._OperationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BumpSequence
  extends BaseOptions
     with _OperationOptions {
  
  var bumpTo: String = js.native
}
object BumpSequence {
  
  @scala.inline
  def apply(bumpTo: String): BumpSequence = {
    val __obj = js.Dynamic.literal(bumpTo = bumpTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[BumpSequence]
  }
  
  @scala.inline
  implicit class BumpSequenceMutableBuilder[Self <: BumpSequence] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBumpTo(value: String): Self = StObject.set(x, "bumpTo", value.asInstanceOf[js.Any])
  }
}
