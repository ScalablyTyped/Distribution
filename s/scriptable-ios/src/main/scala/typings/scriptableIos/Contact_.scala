package typings.scriptableIos

import org.scalablytyped.runtime.StringDictionary
import typings.scriptableIos.Contact.EmailAddresses
import typings.scriptableIos.Contact.PhoneNumbers
import typings.scriptableIos.Contact.PostalAddresses
import typings.scriptableIos.Contact.SocialProfiles
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _Contact in the address book._
  *
  * In order to add the contact to your address book, you must queue it for insertion using `Contact.add()`. When you're done making changes to the address book you should call
  * `Contact.persistChanges()` to persist the changes.
  * @see https://docs.scriptable.app/contact/#-new-contact
  */
@JSGlobal("Contact")
@js.native
/**
  * _Contact in the address book._
  *
  * In order to add the contact to your address book, you must queue it for insertion using `Contact.add()`. When you're done making changes to the address book you should call
  * `Contact.persistChanges()` to persist the changes.
  * @see https://docs.scriptable.app/contact/#-new-contact
  */
class Contact_ () extends js.Object {
  /**
    * _Birthday._
    * @see https://docs.scriptable.app/contact/#birthday
    */
  var birthday: Date = js.native
  /**
    * _Dates._
    *
    * When updating this property, you must set the entire array of dates that you would like to store on the contact. The "identifier" key is optional.
    * @see https://docs.scriptable.app/contact/#dates
    */
  var dates: js.Array[StringDictionary[_]] = js.native
  /**
    * _Name of the department associated with the contact._
    * @see https://docs.scriptable.app/contact/#departmentname
    */
  var departmentName: String = js.native
  /**
    * _Email addresses._
    *
    * An array of objects on the following form:
    *
    *     {
    *       "identifier": "UUID-ABC-123",
    *       "label": "Home",
    *       "localizedLabel": "Home",
    *       "value": "my@example.com"
    *     }
    *
    * The identifier uniquely identifies the email address on this device. The label is a description of the email address and the value holds the email address itself.
    *
    * When updating this property, you must set the entire array of email addresses that you would like to store on the contact. Each value in the array must have the "value" key. The
    * other keys are optional.
    * @see https://docs.scriptable.app/contact/#emailaddresses
    */
  var emailAddresses: js.Array[EmailAddresses] = js.native
  /**
    * _Family name._
    * @see https://docs.scriptable.app/contact/#familyname
    */
  var familyName: String = js.native
  /**
    * _Given name._
    * @see https://docs.scriptable.app/contact/#givenname
    */
  var givenName: String = js.native
  /**
    * _Uniquely identifies the contact on the device._
    * @see https://docs.scriptable.app/contact/#identifier
    */
  var identifier: String = js.native
  /**
    * _Profile picture._
    * @see https://docs.scriptable.app/contact/#image
    */
  var image: Image = js.native
  /**
    * _Whether or not birthday is available._
    *
    * The `birthday` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isbirthdayavailable
    */
  var isBirthdayAvailable: Boolean = js.native
  /**
    * _Whether or not dates are available._
    *
    * The `date` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isdatesavailable
    */
  var isDatesAvailable: Boolean = js.native
  /**
    * _Whether or not department name is available._
    *
    * The `departmentName` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isdepartmentnameavailable
    */
  var isDepartmentNameAvailable: Boolean = js.native
  /**
    * _Whether or not email addresses are available._
    *
    * The `emailAddresses` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isemailaddressesavailable
    */
  var isEmailAddressesAvailable: Boolean = js.native
  /**
    * _Whether or not family name is available._
    *
    * The `familyName` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isfamilynameavailable
    */
  var isFamilyNameAvailable: Boolean = js.native
  /**
    * _Whether or not given name is available._
    *
    * The `givenName` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isgivenameavailable
    */
  var isGiveNameAvailable: Boolean = js.native
  /**
    * _Whether or not image is available._
    *
    * The `image` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isimageavailable
    */
  var isImageAvailable: Boolean = js.native
  /**
    * _Whether or not job title is available._
    *
    * The `jobTitle` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isjobtitleavailable
    */
  var isJobTitleAvailable: Boolean = js.native
  /**
    * _Whether or not middle name is available._
    *
    * The `middleName` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#ismiddlenameavailable
    */
  var isMiddleNameAvailable: Boolean = js.native
  /**
    * _Whether or not name prefix is available._
    *
    * The `namePrefix` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isnameprefixavailable
    */
  var isNamePrefixAvailable: Boolean = js.native
  /**
    * _Whether or not nickname is available._
    *
    * The `nickname` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isnicknameavailable
    */
  var isNicknameAvailable: Boolean = js.native
  /**
    * _Whether or not note is available._
    *
    * The `note` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isnoteavailable
    */
  var isNoteAvailable: Boolean = js.native
  /**
    * _Whether or not organization name is available._
    *
    * The `organizationName` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isorganizationnameavailable
    */
  var isOrganizationNameAvailable: Boolean = js.native
  /**
    * _Whether or not phone numbers are available._
    *
    * The `phoneNumbers` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isphonenumbersavailable
    */
  var isPhoneNumbersAvailable: Boolean = js.native
  /**
    * _Whether or not postal addresses are available._
    *
    * The `postalAddresses` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#ispostaladdressesavailable
    */
  var isPostalAddressesAvailable: Boolean = js.native
  /**
    * _Whether or not social profiles are available._
    *
    * The `socialProfiles` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#issocialprofilesavailable
    */
  var isSocialProfilesAvailable: Boolean = js.native
  /**
    * _Whether or not URL addresses are available._
    *
    * The `urlAddresses` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isurladdressesavailable
    */
  var isURLAddressesAvailable: Boolean = js.native
  /**
    * _The contact's job title._
    * @see https://docs.scriptable.app/contact/#jobtitle
    */
  var jobTitle: String = js.native
  /**
    * _Middle name._
    * @see https://docs.scriptable.app/contact/#middlename
    */
  var middleName: String = js.native
  /**
    * _Name prefix._
    * @see https://docs.scriptable.app/contact/#nameprefix
    */
  var namePrefix: String = js.native
  /**
    * _Nickname._
    * @see https://docs.scriptable.app/contact/#nickname
    */
  var nickname: String = js.native
  /**
    * _Note for the contact._
    *
    * For security reasons, a contact's notes cannot be accessed in Siri, the Shortcuts app and in a notification.
    * @see https://docs.scriptable.app/contact/#note
    */
  var note: String = js.native
  /**
    * _Name of the organization associated with the contact._
    * @see https://docs.scriptable.app/contact/#organizationname
    */
  var organizationName: String = js.native
  /**
    * _Phone numbers._
    *
    * An array of objects on the following form:
    *
    *     {
    *       "identifier": "UUID-ABC-123",
    *       "label": "Home",
    *       "localizedLabel": "Home",
    *       "value": "(111)234-5678"
    *     }
    *
    * The identifier uniquely identifies the phone number on this device. The label is a description of the phone number and the value holds the phone number itself.
    *
    * When updating this property, you must set the entire array of phone numbers that you would like to store on the contact. Each value in the array must have the "value" key. The
    * other keys are optional.
    * @see https://docs.scriptable.app/contact/#phonenumbers
    */
  var phoneNumbers: js.Array[PhoneNumbers] = js.native
  /**
    * _Postal addresses._
    *
    * An array of objects on the following form:
    *
    *     {
    *       "identifier": "UUID-ABC-123",
    *       "label": "Home",
    *       "localizedLabel": "Home",
    *       "street": "240  Terry Lane",
    *       "city": "New York",
    *       "state": "New York",
    *       "postalCode": "10001",
    *       "country": "United States of America"
    *     }
    *
    * The identifier uniquely identifies the phone number on this device. The label is a description of the phone number and the value holds the phone number itself.
    *
    * When updating this property, you must set the entire array of postal addresses that you would like to store on the contact. The "identifier" key is optional.
    * @see https://docs.scriptable.app/contact/#postaladdresses
    */
  var postalAddresses: js.Array[PostalAddresses] = js.native
  /**
    * _Social profiles._
    *
    * An array of objects on the following form:
    *
    *     {
    *       "identifier": "UUID-ABC-123",
    *       "label": "Twitter",
    *       "localizedLabel": "Twitter",
    *       "service": "Twitter",
    *       "url": "https://twitter.com/scriptableapp",
    *       "userIdentifier": null,
    *       "username": "scriptableapp"
    *     }
    *
    * The identifier uniquely identifies the social profile on this device. The label is a description of the social profile, the service is the social profile's service name, the URL
    * contains a link to the social profile, the userIdentifier is the identifier of the social profile and the username is the name for the social profile.
    *
    * When updating this property, you must set the entire array of social profiles that you would like to store on the contact. The "identifier" key is optional.
    * @see https://docs.scriptable.app/contact/#socialprofiles
    */
  var socialProfiles: js.Array[SocialProfiles] = js.native
  /**
    * _URL addresses._
    *
    * When updating this property, you must set the entire array of URL addresses that you would like to store on the contact. The "identifier" key is optional.
    * @see https://docs.scriptable.app/contact/#urladdresses
    */
  var urlAddresses: js.Array[StringDictionary[String]] = js.native
}

