package typings.reactNativeFbsdk.mod

import typings.reactNativeFbsdk.reactNativeFbsdkStrings.f
import typings.reactNativeFbsdk.reactNativeFbsdkStrings.m
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserData extends js.Object {
  var city: js.UndefOr[String] = js.undefined
  var country: js.UndefOr[String] = js.undefined
  var dateOfBirth: js.UndefOr[String] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var firstName: js.UndefOr[String] = js.undefined
  var gender: js.UndefOr[m | f] = js.undefined
  var lastName: js.UndefOr[String] = js.undefined
  var phone: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
  var zip: js.UndefOr[String] = js.undefined
}

object UserData {
  @scala.inline
  def apply(
    city: String = null,
    country: String = null,
    dateOfBirth: String = null,
    email: String = null,
    firstName: String = null,
    gender: m | f = null,
    lastName: String = null,
    phone: String = null,
    state: String = null,
    zip: String = null
  ): UserData = {
    val __obj = js.Dynamic.literal()
    if (city != null) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (dateOfBirth != null) __obj.updateDynamic("dateOfBirth")(dateOfBirth.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (firstName != null) __obj.updateDynamic("firstName")(firstName.asInstanceOf[js.Any])
    if (gender != null) __obj.updateDynamic("gender")(gender.asInstanceOf[js.Any])
    if (lastName != null) __obj.updateDynamic("lastName")(lastName.asInstanceOf[js.Any])
    if (phone != null) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (zip != null) __obj.updateDynamic("zip")(zip.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserData]
  }
}

