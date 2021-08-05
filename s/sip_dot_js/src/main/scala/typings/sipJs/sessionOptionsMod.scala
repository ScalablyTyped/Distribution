package typings.sipJs

import typings.sipJs.sessionDelegateMod.SessionDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sessionOptionsMod {
  
  trait SessionOptions extends StObject {
    
    var delegate: js.UndefOr[SessionDelegate] = js.undefined
  }
  object SessionOptions {
    
    inline def apply(): SessionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SessionOptions]
    }
    
    extension [Self <: SessionOptions](x: Self) {
      
      inline def setDelegate(value: SessionDelegate): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
      
      inline def setDelegateUndefined: Self = StObject.set(x, "delegate", js.undefined)
    }
  }
}
