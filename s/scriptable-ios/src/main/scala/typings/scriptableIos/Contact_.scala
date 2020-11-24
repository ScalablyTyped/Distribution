package typings.scriptableIos

import org.scalablytyped.runtime.StringDictionary
import typings.scriptableIos.Contact.EmailAddresses
import typings.scriptableIos.Contact.PhoneNumbers
import typings.scriptableIos.Contact.PostalAddresses
import typings.scriptableIos.Contact.SocialProfiles
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Contact in the address book._
  *
  * In order to add the contact to your address book, you must queue it for insertion using `Contact.add()`. When you're done making changes to the address book you should call
  * `Contact.persistChanges()` to persist the changes.
  * @see https://docs.scriptable.app/contact/#-new-contact
  */
@js.native
trait Contact_ extends js.Object {
  
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
    * _The contacts job title._
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
    * For security reasons, a contacts notes cannot be accessed in Siri, the Shortcuts app and in a notification.
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
    * The identifier uniquely identifies the postal address on this device. The label is a description of the postal address.
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
object Contact_ {
  
  @scala.inline
  def apply(
    birthday: Date,
    dates: js.Array[StringDictionary[_]],
    departmentName: String,
    emailAddresses: js.Array[EmailAddresses],
    familyName: String,
    givenName: String,
    identifier: String,
    image: Image,
    isBirthdayAvailable: Boolean,
    isDatesAvailable: Boolean,
    isDepartmentNameAvailable: Boolean,
    isEmailAddressesAvailable: Boolean,
    isFamilyNameAvailable: Boolean,
    isGiveNameAvailable: Boolean,
    isImageAvailable: Boolean,
    isJobTitleAvailable: Boolean,
    isMiddleNameAvailable: Boolean,
    isNamePrefixAvailable: Boolean,
    isNicknameAvailable: Boolean,
    isNoteAvailable: Boolean,
    isOrganizationNameAvailable: Boolean,
    isPhoneNumbersAvailable: Boolean,
    isPostalAddressesAvailable: Boolean,
    isSocialProfilesAvailable: Boolean,
    isURLAddressesAvailable: Boolean,
    jobTitle: String,
    middleName: String,
    namePrefix: String,
    nickname: String,
    note: String,
    organizationName: String,
    phoneNumbers: js.Array[PhoneNumbers],
    postalAddresses: js.Array[PostalAddresses],
    socialProfiles: js.Array[SocialProfiles],
    urlAddresses: js.Array[StringDictionary[String]]
  ): Contact_ = {
    val __obj = js.Dynamic.literal(birthday = birthday.asInstanceOf[js.Any], dates = dates.asInstanceOf[js.Any], departmentName = departmentName.asInstanceOf[js.Any], emailAddresses = emailAddresses.asInstanceOf[js.Any], familyName = familyName.asInstanceOf[js.Any], givenName = givenName.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], isBirthdayAvailable = isBirthdayAvailable.asInstanceOf[js.Any], isDatesAvailable = isDatesAvailable.asInstanceOf[js.Any], isDepartmentNameAvailable = isDepartmentNameAvailable.asInstanceOf[js.Any], isEmailAddressesAvailable = isEmailAddressesAvailable.asInstanceOf[js.Any], isFamilyNameAvailable = isFamilyNameAvailable.asInstanceOf[js.Any], isGiveNameAvailable = isGiveNameAvailable.asInstanceOf[js.Any], isImageAvailable = isImageAvailable.asInstanceOf[js.Any], isJobTitleAvailable = isJobTitleAvailable.asInstanceOf[js.Any], isMiddleNameAvailable = isMiddleNameAvailable.asInstanceOf[js.Any], isNamePrefixAvailable = isNamePrefixAvailable.asInstanceOf[js.Any], isNicknameAvailable = isNicknameAvailable.asInstanceOf[js.Any], isNoteAvailable = isNoteAvailable.asInstanceOf[js.Any], isOrganizationNameAvailable = isOrganizationNameAvailable.asInstanceOf[js.Any], isPhoneNumbersAvailable = isPhoneNumbersAvailable.asInstanceOf[js.Any], isPostalAddressesAvailable = isPostalAddressesAvailable.asInstanceOf[js.Any], isSocialProfilesAvailable = isSocialProfilesAvailable.asInstanceOf[js.Any], isURLAddressesAvailable = isURLAddressesAvailable.asInstanceOf[js.Any], jobTitle = jobTitle.asInstanceOf[js.Any], middleName = middleName.asInstanceOf[js.Any], namePrefix = namePrefix.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], organizationName = organizationName.asInstanceOf[js.Any], phoneNumbers = phoneNumbers.asInstanceOf[js.Any], postalAddresses = postalAddresses.asInstanceOf[js.Any], socialProfiles = socialProfiles.asInstanceOf[js.Any], urlAddresses = urlAddresses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contact_]
  }
  
  @scala.inline
  implicit class Contact_Ops[Self <: Contact_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBirthday(value: Date): Self = this.set("birthday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatesVarargs(value: StringDictionary[js.Any]*): Self = this.set("dates", js.Array(value :_*))
    
    @scala.inline
    def setDates(value: js.Array[StringDictionary[_]]): Self = this.set("dates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepartmentName(value: String): Self = this.set("departmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddressesVarargs(value: EmailAddresses*): Self = this.set("emailAddresses", js.Array(value :_*))
    
    @scala.inline
    def setEmailAddresses(value: js.Array[EmailAddresses]): Self = this.set("emailAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamilyName(value: String): Self = this.set("familyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGivenName(value: String): Self = this.set("givenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifier(value: String): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: Image): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBirthdayAvailable(value: Boolean): Self = this.set("isBirthdayAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDatesAvailable(value: Boolean): Self = this.set("isDatesAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDepartmentNameAvailable(value: Boolean): Self = this.set("isDepartmentNameAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEmailAddressesAvailable(value: Boolean): Self = this.set("isEmailAddressesAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFamilyNameAvailable(value: Boolean): Self = this.set("isFamilyNameAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsGiveNameAvailable(value: Boolean): Self = this.set("isGiveNameAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsImageAvailable(value: Boolean): Self = this.set("isImageAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsJobTitleAvailable(value: Boolean): Self = this.set("isJobTitleAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMiddleNameAvailable(value: Boolean): Self = this.set("isMiddleNameAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNamePrefixAvailable(value: Boolean): Self = this.set("isNamePrefixAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNicknameAvailable(value: Boolean): Self = this.set("isNicknameAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNoteAvailable(value: Boolean): Self = this.set("isNoteAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOrganizationNameAvailable(value: Boolean): Self = this.set("isOrganizationNameAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPhoneNumbersAvailable(value: Boolean): Self = this.set("isPhoneNumbersAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPostalAddressesAvailable(value: Boolean): Self = this.set("isPostalAddressesAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSocialProfilesAvailable(value: Boolean): Self = this.set("isSocialProfilesAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsURLAddressesAvailable(value: Boolean): Self = this.set("isURLAddressesAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobTitle(value: String): Self = this.set("jobTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiddleName(value: String): Self = this.set("middleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamePrefix(value: String): Self = this.set("namePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNickname(value: String): Self = this.set("nickname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNote(value: String): Self = this.set("note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationName(value: String): Self = this.set("organizationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumbersVarargs(value: PhoneNumbers*): Self = this.set("phoneNumbers", js.Array(value :_*))
    
    @scala.inline
    def setPhoneNumbers(value: js.Array[PhoneNumbers]): Self = this.set("phoneNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalAddressesVarargs(value: PostalAddresses*): Self = this.set("postalAddresses", js.Array(value :_*))
    
    @scala.inline
    def setPostalAddresses(value: js.Array[PostalAddresses]): Self = this.set("postalAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocialProfilesVarargs(value: SocialProfiles*): Self = this.set("socialProfiles", js.Array(value :_*))
    
    @scala.inline
    def setSocialProfiles(value: js.Array[SocialProfiles]): Self = this.set("socialProfiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlAddressesVarargs(value: StringDictionary[String]*): Self = this.set("urlAddresses", js.Array(value :_*))
    
    @scala.inline
    def setUrlAddresses(value: js.Array[StringDictionary[String]]): Self = this.set("urlAddresses", value.asInstanceOf[js.Any])
  }
}
