package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "Customer")
@js.native
class Customer () extends js.Object {
  /**
    * The physical address associated with the customer profile.
    */
  var address: js.UndefOr[Address] = js.native
  /**
    * The birthday associated with the customer profile, in RFC-3339 format. Year is optional, timezone and times are not allowed.
    * For example: `0000-09-01T00:00:00-00:00` indicates a birthday on September 1st. `1998-09-01T00:00:00-00:00`
    * indications a birthday on September 1st 1998.
    */
  var birthday: js.UndefOr[String] = js.native
  /**
    * Payment details of cards stored on file for the customer profile.
    */
  var cards: js.UndefOr[js.Array[Card]] = js.native
  /**
    * A business name associated with the customer profile.
    */
  var company_name: js.UndefOr[String] = js.native
  /**
    * The time when the customer profile was created, in RFC 3339 format.
    */
  var created_at: String = js.native
  /**
    * A creation source represents the method used to create the customer profile.
    * See [CustomerCreationSource](#type-customercreationsource) for possible values.
    */
  var creation_source: js.UndefOr[CustomerSourceType] = js.native
  /**
    * The email address associated with the customer profile.
    */
  var email_address: js.UndefOr[String] = js.native
  /**
    * The family (i.e., last) name associated with the customer profile.
    */
  var family_name: js.UndefOr[String] = js.native
  /**
    * The given (i.e., first) name associated with the customer profile.
    */
  var given_name: js.UndefOr[String] = js.native
  /**
    * The groups the customer belongs to.
    */
  var groups: js.UndefOr[js.Array[CustomerGroupInfo]] = js.native
  /**
    * A unique, Square-assigned object ID.
    */
  var id: String = js.native
  /**
    * A nickname for the customer profile.
    */
  var nickname: js.UndefOr[String] = js.native
  /**
    * A custom note associated with the customer profile.
    */
  var note: js.UndefOr[String] = js.native
  /**
    * The 11-digit phone number associated with the customer profile.
    */
  var phone_number: js.UndefOr[String] = js.native
  /**
    * Represents general customer preferences.
    */
  var preferences: js.UndefOr[CustomerPreferences] = js.native
  /**
    * An optional, second ID used to associate the customer profile with an entity in another system.
    */
  var reference_id: js.UndefOr[String] = js.native
  /**
    * The time when the customer profile was last updated, in RFC 3339 format.
    */
  var updated_at: String = js.native
}

