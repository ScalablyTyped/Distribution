package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.Int64
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Limit extends StObject {
  
  var limit: Int64 = js.native
  
  var line: typings.stellarBase.xdrMod.xdr.Asset = js.native
}
object Limit {
  
  @scala.inline
  def apply(limit: Int64, line: typings.stellarBase.xdrMod.xdr.Asset): Limit = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[Limit]
  }
  
  @scala.inline
  implicit class LimitMutableBuilder[Self <: Limit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: Int64): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: typings.stellarBase.xdrMod.xdr.Asset): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
  }
}
