package typings.sinclairTypebox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object equalMod {
  
  object ValueEqual {
    
    @JSImport("@sinclair/typebox/value/equal", "ValueEqual")
    @js.native
    val ^ : js.Any = js.native
    
    inline def Equal[T](left: T, right: Any): /* is T */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("Equal")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[/* is T */ Boolean]
  }
}
