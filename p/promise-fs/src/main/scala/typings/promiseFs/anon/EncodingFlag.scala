package typings.promiseFs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncodingFlag extends StObject {
  
  var encoding: js.UndefOr[String | Null] = js.native
  
  var flag: js.UndefOr[String] = js.native
}
object EncodingFlag {
  
  @scala.inline
  def apply(): EncodingFlag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncodingFlag]
  }
  
  @scala.inline
  implicit class EncodingFlagMutableBuilder[Self <: EncodingFlag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
  }
}
