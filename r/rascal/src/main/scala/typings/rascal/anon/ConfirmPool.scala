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
  
  @scala.inline
  def apply(): ConfirmPool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmPool]
  }
  
  @scala.inline
  implicit class ConfirmPoolMutableBuilder[Self <: ConfirmPool] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfirmPool(value: ChannelPoolConfig): Self = StObject.set(x, "confirmPool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmPoolUndefined: Self = StObject.set(x, "confirmPool", js.undefined)
    
    @scala.inline
    def setRegularPool(value: ChannelPoolConfig): Self = StObject.set(x, "regularPool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegularPoolUndefined: Self = StObject.set(x, "regularPool", js.undefined)
  }
}
