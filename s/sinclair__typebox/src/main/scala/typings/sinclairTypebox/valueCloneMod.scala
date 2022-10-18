package typings.sinclairTypebox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valueCloneMod {
  
  object ValueClone {
    
    @JSImport("@sinclair/typebox/value/clone", "ValueClone")
    @js.native
    val ^ : js.Any = js.native
    
    inline def Clone[T /* <: Any */](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("Clone")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  }
}
