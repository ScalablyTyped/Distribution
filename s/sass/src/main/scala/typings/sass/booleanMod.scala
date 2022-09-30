package typings.sass

import typings.sass.valueMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object booleanMod {
  
  @JSImport("sass/types/value/boolean", "SassBoolean")
  @js.native
  /* private */ open class SassBoolean () extends Value {
    
    /**
      * Whether this value is `true` or `false`.
      */
    def value: Boolean = js.native
  }
  
  @JSImport("sass/types/value/boolean", "sassFalse")
  @js.native
  val sassFalse: SassBoolean = js.native
  
  @JSImport("sass/types/value/boolean", "sassTrue")
  @js.native
  val sassTrue: SassBoolean = js.native
}
