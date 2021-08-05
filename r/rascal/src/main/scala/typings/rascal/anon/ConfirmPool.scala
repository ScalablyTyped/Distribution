package typings.rascal.anon

import typings.rascal.mod.ChannelPoolConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfirmPool extends StObject {
  
  var confirmPool: js.UndefOr[ChannelPoolConfig] = js.undefined
  
  var regularPool: js.UndefOr[ChannelPoolConfig] = js.undefined
}
object ConfirmPool {
  
  inline def apply(): ConfirmPool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmPool]
  }
  
  extension [Self <: ConfirmPool](x: Self) {
    
    inline def setConfirmPool(value: ChannelPoolConfig): Self = StObject.set(x, "confirmPool", value.asInstanceOf[js.Any])
    
    inline def setConfirmPoolUndefined: Self = StObject.set(x, "confirmPool", js.undefined)
    
    inline def setRegularPool(value: ChannelPoolConfig): Self = StObject.set(x, "regularPool", value.asInstanceOf[js.Any])
    
    inline def setRegularPoolUndefined: Self = StObject.set(x, "regularPool", js.undefined)
  }
}
