package typings.rockset.codegenMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InputField {
  
  /**
    * @export
    * @enum {string}
    */
  @JSImport("rockset/dist/codegen", "InputField.IfMissingEnum")
  @js.native
  object IfMissingEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.rockset.apiMod.InputField.IfMissingEnum & Double] = js.native
    
    /* 1 */ val PASS: typings.rockset.apiMod.InputField.IfMissingEnum.PASS & Double = js.native
    
    /* 0 */ val SKIP: typings.rockset.apiMod.InputField.IfMissingEnum.SKIP & Double = js.native
  }
}
