package typings.stellarBase.anon

import typings.node.Buffer
import typings.stellarBase.xdrMod.xdr.MessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReqHash extends StObject {
  
  var reqHash: Buffer = js.native
  
  var `type`: MessageType = js.native
}
object ReqHash {
  
  @scala.inline
  def apply(reqHash: Buffer, `type`: MessageType): ReqHash = {
    val __obj = js.Dynamic.literal(reqHash = reqHash.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReqHash]
  }
  
  @scala.inline
  implicit class ReqHashMutableBuilder[Self <: ReqHash] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReqHash(value: Buffer): Self = StObject.set(x, "reqHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MessageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
