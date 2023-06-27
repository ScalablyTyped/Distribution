package typings.reactIs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object canaryMod {
  
  /* augmented module */
  object reactIsAugmentingMod {
    
    @JSImport("react-is", JSImport.Namespace)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-is", "SuspenseList")
    @js.native
    val SuspenseList: js.Symbol = js.native
    
    inline def isSuspenseList(value: Any): /* is react.react.ReactElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSuspenseList")(value.asInstanceOf[js.Any]).asInstanceOf[/* is react.react.ReactElement */ Boolean]
  }
}
