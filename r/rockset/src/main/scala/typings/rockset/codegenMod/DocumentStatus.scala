package typings.rockset.codegenMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentStatus {
  
  /**
    * @export
    * @enum {string}
    */
  @JSImport("rockset/dist/codegen", "DocumentStatus.StatusEnum")
  @js.native
  object StatusEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.rockset.apiMod.DocumentStatus.StatusEnum & Double] = js.native
    
    /* 0 */ val ADDED: typings.rockset.apiMod.DocumentStatus.StatusEnum.ADDED & Double = js.native
    
    /* 2 */ val DELETED: typings.rockset.apiMod.DocumentStatus.StatusEnum.DELETED & Double = js.native
    
    /* 4 */ val ERROR: typings.rockset.apiMod.DocumentStatus.StatusEnum.ERROR & Double = js.native
    
    /* 3 */ val PATCHED: typings.rockset.apiMod.DocumentStatus.StatusEnum.PATCHED & Double = js.native
    
    /* 1 */ val REPLACED: typings.rockset.apiMod.DocumentStatus.StatusEnum.REPLACED & Double = js.native
  }
}
