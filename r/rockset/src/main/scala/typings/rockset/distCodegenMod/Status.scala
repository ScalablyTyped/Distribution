package typings.rockset.distCodegenMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Status {
  
  /**
    * @export
    * @enum {string}
    */
  @JSImport("rockset/dist/codegen", "Status.StateEnum")
  @js.native
  object StateEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.rockset.distCodegenApiMod.Status.StateEnum & Double] = js.native
    
    /* 3 */ val COMPLETED: typings.rockset.distCodegenApiMod.Status.StateEnum.COMPLETED & Double = js.native
    
    /* 4 */ val ERROR: typings.rockset.distCodegenApiMod.Status.StateEnum.ERROR & Double = js.native
    
    /* 0 */ val INITIALIZING: typings.rockset.distCodegenApiMod.Status.StateEnum.INITIALIZING & Double = js.native
    
    /* 2 */ val PROCESSING: typings.rockset.distCodegenApiMod.Status.StateEnum.PROCESSING & Double = js.native
    
    /* 1 */ val WATCHING: typings.rockset.distCodegenApiMod.Status.StateEnum.WATCHING & Double = js.native
  }
}
