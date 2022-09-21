package typings.rockset.codegenMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Collection {
  
  /**
    * @export
    * @enum {string}
    */
  @JSImport("rockset/dist/codegen", "Collection.StatusEnum")
  @js.native
  object StatusEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.rockset.apiMod.Collection.StatusEnum & Double] = js.native
    
    /* 7 */ val BULKINGESTMODE: typings.rockset.apiMod.Collection.StatusEnum.BULKINGESTMODE & Double = js.native
    
    /* 1 */ val CREATED: typings.rockset.apiMod.Collection.StatusEnum.CREATED & Double = js.native
    
    /* 4 */ val DELETED: typings.rockset.apiMod.Collection.StatusEnum.DELETED & Double = js.native
    
    /* 8 */ val EXITINGBULKINGESTMODE: typings.rockset.apiMod.Collection.StatusEnum.EXITINGBULKINGESTMODE & Double = js.native
    
    /* 0 */ val INITIALIZED: typings.rockset.apiMod.Collection.StatusEnum.INITIALIZED & Double = js.native
    
    /* 3 */ val PAUSED: typings.rockset.apiMod.Collection.StatusEnum.PAUSED & Double = js.native
    
    /* 5 */ val PAUSING: typings.rockset.apiMod.Collection.StatusEnum.PAUSING & Double = js.native
    
    /* 2 */ val READY: typings.rockset.apiMod.Collection.StatusEnum.READY & Double = js.native
    
    /* 6 */ val RESUMING: typings.rockset.apiMod.Collection.StatusEnum.RESUMING & Double = js.native
    
    /* 9 */ val UNKNOWN: typings.rockset.apiMod.Collection.StatusEnum.UNKNOWN & Double = js.native
  }
}
