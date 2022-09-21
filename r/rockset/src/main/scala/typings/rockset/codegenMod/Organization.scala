package typings.rockset.codegenMod

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
    def apply(value: Double): js.UndefOr[typings.rockset.apiMod.Organization.StateEnum & Double] = js.native
    
    /* 5 */ val DELETED: typings.rockset.apiMod.Organization.StateEnum.DELETED & Double = js.native
    
    /* 0 */ val FREE: typings.rockset.apiMod.Organization.StateEnum.FREE & Double = js.native
    
    /* 1 */ val PAID: typings.rockset.apiMod.Organization.StateEnum.PAID & Double = js.native
    
    /* 2 */ val TRIAL: typings.rockset.apiMod.Organization.StateEnum.TRIAL & Double = js.native
    
    /* 4 */ val TRIALDEPLETED: typings.rockset.apiMod.Organization.StateEnum.TRIALDEPLETED & Double = js.native
    
    /* 3 */ val TRIALEXPIRED: typings.rockset.apiMod.Organization.StateEnum.TRIALEXPIRED & Double = js.native
  }
}
