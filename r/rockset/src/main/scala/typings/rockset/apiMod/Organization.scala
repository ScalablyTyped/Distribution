package typings.rockset.apiMod

import typings.rockset.apiMod.Organization.StateEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Organization extends StObject {
  
  /**
    * name of the company
    * @type {string}
    * @memberof Organization
    */
  var company_name: js.UndefOr[String] = js.undefined
  
  /**
    * ISO-8601 date
    * @type {string}
    * @memberof Organization
    */
  var created_at: js.UndefOr[String] = js.undefined
  
  /**
    * name of the organization
    * @type {string}
    * @memberof Organization
    */
  var display_name: js.UndefOr[String] = js.undefined
  
  /**
    * organization's unique external ID within Rockset
    * @type {string}
    * @memberof Organization
    */
  var external_id: js.UndefOr[String] = js.undefined
  
  /**
    * unique identifier for the organization
    * @type {string}
    * @memberof Organization
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    *
    * @type {string}
    * @memberof Organization
    */
  var rockset_user: js.UndefOr[String] = js.undefined
  
  /**
    * org state
    * @type {string}
    * @memberof Organization
    */
  var state: js.UndefOr[StateEnum] = js.undefined
}
object Organization {
  
  inline def apply(): Organization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Organization]
  }
  
  @js.native
  sealed trait StateEnum extends StObject
  /**
    * @export
    * @enum {string}
    */
  @JSImport("rockset/dist/codegen/api", "Organization.StateEnum")
  @js.native
  object StateEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[StateEnum & Double] = js.native
    
    @js.native
    sealed trait DELETED
      extends StObject
         with StateEnum
    /* 5 */ val DELETED: typings.rockset.apiMod.Organization.StateEnum.DELETED & Double = js.native
    
    @js.native
    sealed trait FREE
      extends StObject
         with StateEnum
    /* 0 */ val FREE: typings.rockset.apiMod.Organization.StateEnum.FREE & Double = js.native
    
    @js.native
    sealed trait PAID
      extends StObject
         with StateEnum
    /* 1 */ val PAID: typings.rockset.apiMod.Organization.StateEnum.PAID & Double = js.native
    
    @js.native
    sealed trait TRIAL
      extends StObject
         with StateEnum
    /* 2 */ val TRIAL: typings.rockset.apiMod.Organization.StateEnum.TRIAL & Double = js.native
    
    @js.native
    sealed trait TRIALDEPLETED
      extends StObject
         with StateEnum
    /* 4 */ val TRIALDEPLETED: typings.rockset.apiMod.Organization.StateEnum.TRIALDEPLETED & Double = js.native
    
    @js.native
    sealed trait TRIALEXPIRED
      extends StObject
         with StateEnum
    /* 3 */ val TRIALEXPIRED: typings.rockset.apiMod.Organization.StateEnum.TRIALEXPIRED & Double = js.native
  }
  
  extension [Self <: Organization](x: Self) {
    
    inline def setCompany_name(value: String): Self = StObject.set(x, "company_name", value.asInstanceOf[js.Any])
    
    inline def setCompany_nameUndefined: Self = StObject.set(x, "company_name", js.undefined)
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
    
    inline def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
    
    inline def setDisplay_nameUndefined: Self = StObject.set(x, "display_name", js.undefined)
    
    inline def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
    
    inline def setExternal_idUndefined: Self = StObject.set(x, "external_id", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setRockset_user(value: String): Self = StObject.set(x, "rockset_user", value.asInstanceOf[js.Any])
    
    inline def setRockset_userUndefined: Self = StObject.set(x, "rockset_user", js.undefined)
    
    inline def setState(value: StateEnum): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
