package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "TeamMember")
@js.native
class TeamMember () extends StObject {
  
  /**
    * Describes the team member's assigned locations.
    */
  var assigned_locations: js.UndefOr[TeamMemberAssignedLocations] = js.native
  
  /**
    * The timestamp in RFC 3339 format describing when the team member was created.
    * Ex: \"2018-10-04T04:00:00-07:00\" or \"2019-02-05T12:00:00Z\"
    */
  var created_at: js.UndefOr[String] = js.native
  
  /**
    * The email address associated with the team member.
    */
  var email_address: js.UndefOr[String] = js.native
  
  /**
    * The family (i.e., last) name associated with the team member.
    */
  var family_name: js.UndefOr[String] = js.native
  
  /**
    * The given (i.e., first) name associated with the team member.
    */
  var given_name: js.UndefOr[String] = js.native
  
  /**
    * The unique ID for the team member.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Whether the team member is the owner of the Square account.
    */
  var is_owner: js.UndefOr[Boolean] = js.native
  
  /**
    * The team member's phone number in E.164 format.
    * Examples: +14155552671 - the country code is 1 for US +551155256325 - the country code is 55 for BR.
    */
  var phone_number: js.UndefOr[String] = js.native
  
  /**
    * A second ID used to associate the team member with an entity in another system.
    */
  var reference_id: js.UndefOr[String] = js.native
  
  /**
    * Describes the status of the team member. See [TeamMemberStatus](#type-teammemberstatus) for possible values.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * The timestamp in RFC 3339 format describing when the team member was last updated.
    * Ex: \"2018-10-04T04:00:00-07:00\" or \"2019-02-05T12:00:00Z\"
    */
  var updated_at: js.UndefOr[String] = js.native
}
