package typings.rockset.distCodegenMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object QueryLambdaVersion {
  
  /**
    * @export
    * @enum {string}
    */
  @JSImport("rockset/dist/codegen", "QueryLambdaVersion.StateEnum")
  @js.native
  object StateEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.rockset.distCodegenApiMod.QueryLambdaVersion.StateEnum & Double] = js.native
    
    /* 0 */ val ACTIVE: typings.rockset.distCodegenApiMod.QueryLambdaVersion.StateEnum.ACTIVE & Double = js.native
    
    /* 1 */ val INVALIDSQL: typings.rockset.distCodegenApiMod.QueryLambdaVersion.StateEnum.INVALIDSQL & Double = js.native
  }
}
