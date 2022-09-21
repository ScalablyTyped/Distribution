package typings.rockset.codegenMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OutputField {
  
  /**
    * @export
    * @enum {string}
    */
  @JSImport("rockset/dist/codegen", "OutputField.OnErrorEnum")
  @js.native
  object OnErrorEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.rockset.apiMod.OutputField.OnErrorEnum & Double] = js.native
    
    /* 1 */ val FAIL: typings.rockset.apiMod.OutputField.OnErrorEnum.FAIL & Double = js.native
    
    /* 0 */ val SKIP: typings.rockset.apiMod.OutputField.OnErrorEnum.SKIP & Double = js.native
  }
}
