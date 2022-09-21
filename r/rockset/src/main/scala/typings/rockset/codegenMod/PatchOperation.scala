package typings.rockset.codegenMod

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
    def apply(value: Double): js.UndefOr[typings.rockset.apiMod.PatchOperation.OpEnum & Double] = js.native
    
    /* 0 */ val ADD: typings.rockset.apiMod.PatchOperation.OpEnum.ADD & Double = js.native
    
    /* 3 */ val COPY: typings.rockset.apiMod.PatchOperation.OpEnum.COPY & Double = js.native
    
    /* 4 */ val MOVE: typings.rockset.apiMod.PatchOperation.OpEnum.MOVE & Double = js.native
    
    /* 2 */ val REMOVE: typings.rockset.apiMod.PatchOperation.OpEnum.REMOVE & Double = js.native
    
    /* 1 */ val REPLACE: typings.rockset.apiMod.PatchOperation.OpEnum.REPLACE & Double = js.native
    
    /* 5 */ val TEST: typings.rockset.apiMod.PatchOperation.OpEnum.TEST & Double = js.native
  }
}
