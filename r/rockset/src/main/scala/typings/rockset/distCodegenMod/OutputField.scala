package typings.rockset.distCodegenMod

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
    def apply(value: Double): js.UndefOr[typings.rockset.distCodegenApiMod.OutputField.OnErrorEnum & Double] = js.native
    
    /* 1 */ val FAIL: typings.rockset.distCodegenApiMod.OutputField.OnErrorEnum.FAIL & Double = js.native
    
    /* 0 */ val SKIP: typings.rockset.distCodegenApiMod.OutputField.OnErrorEnum.SKIP & Double = js.native
  }
}
