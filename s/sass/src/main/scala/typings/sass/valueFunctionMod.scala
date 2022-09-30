package typings.sass

import typings.sass.valueMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valueFunctionMod {
  
  @JSImport("sass/types/value/function", "SassFunction")
  @js.native
  open class SassFunction protected () extends Value {
    /**
      * Creates a new first-class function that can be invoked using
      * [`meta.call()`](https://sass-lang.com/documentation/modules/meta#call).
      *
      * @param signature - The function signature, like you'd write for the
      * [`@function rule`](https://sass-lang.com/documentation/at-rules/function).
      * @param callback - The callback that's invoked when this function is called,
      * just like for a [[CustomFunction]].
      */
    def this(signature: String, callback: js.Function1[/* args */ js.Array[Value], Value]) = this()
  }
}
