package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.SequenceNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BumpTo extends StObject {
  
  var bumpTo: SequenceNumber = js.native
}
object BumpTo {
  
  @scala.inline
  def apply(bumpTo: SequenceNumber): BumpTo = {
    val __obj = js.Dynamic.literal(bumpTo = bumpTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[BumpTo]
  }
  
  @scala.inline
  implicit class BumpToMutableBuilder[Self <: BumpTo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBumpTo(value: SequenceNumber): Self = StObject.set(x, "bumpTo", value.asInstanceOf[js.Any])
  }
}
