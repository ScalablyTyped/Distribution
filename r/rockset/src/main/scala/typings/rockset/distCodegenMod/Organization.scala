package typings.rockset.distCodegenMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Organization {
  
  /**
    * @export
    * @enum {string}
    */
  @JSImport("rockset/dist/codegen", "Organization.StateEnum")
  @js.native
  object StateEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.rockset.distCodegenApiMod.Organization.StateEnum & Double] = js.native
    
    /* 5 */ val DELETED: typings.rockset.distCodegenApiMod.Organization.StateEnum.DELETED & Double = js.native
    
    /* 0 */ val FREE: typings.rockset.distCodegenApiMod.Organization.StateEnum.FREE & Double = js.native
    
    /* 1 */ val PAID: typings.rockset.distCodegenApiMod.Organization.StateEnum.PAID & Double = js.native
    
    /* 2 */ val TRIAL: typings.rockset.distCodegenApiMod.Organization.StateEnum.TRIAL & Double = js.native
    
    /* 4 */ val TRIALDEPLETED: typings.rockset.distCodegenApiMod.Organization.StateEnum.TRIALDEPLETED & Double = js.native
    
    /* 3 */ val TRIALEXPIRED: typings.rockset.distCodegenApiMod.Organization.StateEnum.TRIALEXPIRED & Double = js.native
  }
}
