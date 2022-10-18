package typings.rockset.distCodegenMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PatchOperation {
  
  /**
    * @export
    * @enum {string}
    */
  @JSImport("rockset/dist/codegen", "PatchOperation.OpEnum")
  @js.native
  object OpEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.rockset.distCodegenApiMod.PatchOperation.OpEnum & Double] = js.native
    
    /* 0 */ val ADD: typings.rockset.distCodegenApiMod.PatchOperation.OpEnum.ADD & Double = js.native
    
    /* 3 */ val COPY: typings.rockset.distCodegenApiMod.PatchOperation.OpEnum.COPY & Double = js.native
    
    /* 4 */ val MOVE: typings.rockset.distCodegenApiMod.PatchOperation.OpEnum.MOVE & Double = js.native
    
    /* 2 */ val REMOVE: typings.rockset.distCodegenApiMod.PatchOperation.OpEnum.REMOVE & Double = js.native
    
    /* 1 */ val REPLACE: typings.rockset.distCodegenApiMod.PatchOperation.OpEnum.REPLACE & Double = js.native
    
    /* 5 */ val TEST: typings.rockset.distCodegenApiMod.PatchOperation.OpEnum.TEST & Double = js.native
  }
}
