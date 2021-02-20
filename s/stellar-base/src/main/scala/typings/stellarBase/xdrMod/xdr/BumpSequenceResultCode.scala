package typings.stellarBase.xdrMod.xdr

import typings.stellarBase.stellarBaseNumbers.`-1`
import typings.stellarBase.stellarBaseNumbers.`0`
import typings.stellarBase.stellarBaseStrings.bumpSequenceBadSeq
import typings.stellarBase.stellarBaseStrings.bumpSequenceSuccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BumpSequenceResultCode extends StObject {
  
  val name: bumpSequenceSuccess | bumpSequenceBadSeq = js.native
  
  val value: `0` | `-1` = js.native
}
object BumpSequenceResultCode {
  
  @scala.inline
  def apply(name: bumpSequenceSuccess | bumpSequenceBadSeq, value: `0` | `-1`): BumpSequenceResultCode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BumpSequenceResultCode]
  }
  
  @scala.inline
  implicit class BumpSequenceResultCodeMutableBuilder[Self <: BumpSequenceResultCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: bumpSequenceSuccess | bumpSequenceBadSeq): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `-1`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
