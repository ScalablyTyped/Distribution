package typings.rockset.distCodegenMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StatusDynamoDb {
  
  /**
    * @export
    * @enum {string}
    */
  @JSImport("rockset/dist/codegen", "StatusDynamoDb.StateEnum")
  @js.native
  object StateEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.rockset.distCodegenApiMod.StatusDynamoDb.StateEnum & Double] = js.native
    
    /* 0 */ val INITIALIZING: typings.rockset.distCodegenApiMod.StatusDynamoDb.StateEnum.INITIALIZING & Double = js.native
    
    /* 2 */ val PROCESSINGSTREAM: typings.rockset.distCodegenApiMod.StatusDynamoDb.StateEnum.PROCESSINGSTREAM & Double = js.native
    
    /* 1 */ val SCANNINGTABLE: typings.rockset.distCodegenApiMod.StatusDynamoDb.StateEnum.SCANNINGTABLE & Double = js.native
  }
}
