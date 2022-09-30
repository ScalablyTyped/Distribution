package typings.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  trait Window extends StObject {
    
    var __REACT_DEVTOOLS_GLOBAL_HOOK__ : DevToolsHook
  }
  object Window {
    
    inline def apply(__REACT_DEVTOOLS_GLOBAL_HOOK__ : DevToolsHook): Window = {
      val __obj = js.Dynamic.literal(__REACT_DEVTOOLS_GLOBAL_HOOK__ = __REACT_DEVTOOLS_GLOBAL_HOOK__.asInstanceOf[js.Any])
      __obj.asInstanceOf[Window]
    }
    
    extension [Self <: Window](x: Self) {
      
      inline def set__REACT_DEVTOOLS_GLOBAL_HOOK__(value: DevToolsHook): Self = StObject.set(x, "__REACT_DEVTOOLS_GLOBAL_HOOK__", value.asInstanceOf[js.Any])
    }
  }
}
