package typings.scriptableIos

import org.scalablytyped.runtime.StringDictionary
import typings.scriptableIos.Contact.EmailAddresses
import typings.scriptableIos.Contact.PhoneNumbers
import typings.scriptableIos.Contact.PostalAddresses
import typings.scriptableIos.Contact.SocialProfiles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Contact in the address book._
  *
  * In order to add the contact to your address book, you must queue it for insertion using `Contact.add()`. When you're done making changes to the address book you should call
  * `Contact.persistChanges()` to persist the changes.
  * @see https://docs.scriptable.app/contact/#-new-contact
  */
trait Contact extends StObject {
  
  /**
    * _Birthday._
    * @see https://docs.scriptable.app/contact/#birthday
    */
  var birthday: js.Date
  
  /**
    * _Dates._
    *
    * When updating this property, you must set the entire array of dates that you would like to store on the contact. The "identifier" key is optional.
    * @see https://docs.scriptable.app/contact/#dates
    */
  var dates: js.Array[StringDictionary[Any]]
  
  /**
    * _Name of the department associated with the contact._
    * @see https://docs.scriptable.app/contact/#departmentname
    */
  var departmentName: String
  
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
  var emailAddresses: js.Array[EmailAddresses]
  
  /**
    * _Family name._
    * @see https://docs.scriptable.app/contact/#familyname
    */
  var familyName: String
  
  /**
    * _Given name._
    * @see https://docs.scriptable.app/contact/#givenname
    */
  var givenName: String
  
  /**
    * _Uniquely identifies the contact on the device._
    * @see https://docs.scriptable.app/contact/#identifier
    */
  var identifier: String
  
  /**
    * _Profile picture._
    * @see https://docs.scriptable.app/contact/#image
    */
  var image: Image
  
  /**
    * _Whether or not birthday is available._
    *
    * The `birthday` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isbirthdayavailable
    */
  var isBirthdayAvailable: Boolean
  
  /**
    * _Whether or not dates are available._
    *
    * The `date` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isdatesavailable
    */
  var isDatesAvailable: Boolean
  
  /**
    * _Whether or not department name is available._
    *
    * The `departmentName` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isdepartmentnameavailable
    */
  var isDepartmentNameAvailable: Boolean
  
  /**
    * _Whether or not email addresses are available._
    *
    * The `emailAddresses` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isemailaddressesavailable
    */
  var isEmailAddressesAvailable: Boolean
  
  /**
    * _Whether or not family name is available._
    *
    * The `familyName` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isfamilynameavailable
    */
  var isFamilyNameAvailable: Boolean
  
  /**
    * _Whether or not given name is available._
    *
    * The `givenName` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isgivenameavailable
    */
  var isGiveNameAvailable: Boolean
  
  /**
    * _Whether or not image is available._
    *
    * The `image` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isimageavailable
    */
  var isImageAvailable: Boolean
  
  /**
    * _Whether or not job title is available._
    *
    * The `jobTitle` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isjobtitleavailable
    */
  var isJobTitleAvailable: Boolean
  
  /**
    * _Whether or not middle name is available._
    *
    * The `middleName` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#ismiddlenameavailable
    */
  var isMiddleNameAvailable: Boolean
  
  /**
    * _Whether or not name prefix is available._
    *
    * The `namePrefix` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isnameprefixavailable
    */
  var isNamePrefixAvailable: Boolean
  
  /**
    * _Whether or not nickname is available._
    *
    * The `nickname` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isnicknameavailable
    */
  var isNicknameAvailable: Boolean
  
  /**
    * _Whether or not note is available._
    *
    * The `note` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isnoteavailable
    */
  var isNoteAvailable: Boolean
  
  /**
    * _Whether or not organization name is available._
    *
    * The `organizationName` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isorganizationnameavailable
    */
  var isOrganizationNameAvailable: Boolean
  
  /**
    * _Whether or not phone numbers are available._
    *
    * The `phoneNumbers` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isphonenumbersavailable
    */
  var isPhoneNumbersAvailable: Boolean
  
  /**
    * _Whether or not postal addresses are available._
    *
    * The `postalAddresses` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#ispostaladdressesavailable
    */
  var isPostalAddressesAvailable: Boolean
  
  /**
    * _Whether or not social profiles are available._
    *
    * The `socialProfiles` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#issocialprofilesavailable
    */
  var isSocialProfilesAvailable: Boolean
  
  /**
    * _Whether or not URL addresses are available._
    *
    * The `urlAddresses` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isurladdressesavailable
    */
  var isURLAddressesAvailable: Boolean
  
  /**
    * _The contact's job title._
    * @see https://docs.scriptable.app/contact/#jobtitle
    */
  var jobTitle: String
  
  /**
    * _Middle name._
    * @see https://docs.scriptable.app/contact/#middlename
    */
  var middleName: String
  
  /**
    * _Name prefix._
    * @see https://docs.scriptable.app/contact/#nameprefix
    */
  var namePrefix: String
  
  /**
    * _Nickname._
    * @see https://docs.scriptable.app/contact/#nickname
    */
  var nickname: String
  
  /**
    * _Note for the contact._
    *
    * For security reasons, a contact's notes cannot be accessed in Siri, the Shortcuts app and in a notification.
    * @see https://docs.scriptable.app/contact/#note
    */
  var note: String
  
  /**
    * _Name of the organization associated with the contact._
    * @see https://docs.scriptable.app/contact/#organizationname
    */
  var organizationName: String
  
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
  var phoneNumbers: js.Array[PhoneNumbers]
  
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
  var postalAddresses: js.Array[PostalAddresses]
  
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
  var socialProfiles: js.Array[SocialProfiles]
  
  /**
    * _URL addresses._
    *
    * When updating this property, you must set the entire array of URL addresses that you would like to store on the contact. The "identifier" key is optional.
    * @see https://docs.scriptable.app/contact/#urladdresses
    */
  var urlAddresses: js.Array[StringDictionary[String]]
}
object Contact {
  
  inline def apply(
    birthday: js.Date,
    dates: js.Array[StringDictionary[Any]],
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
  ): Contact = {
    val __obj = js.Dynamic.literal(birthday = birthday.asInstanceOf[js.Any], dates = dates.asInstanceOf[js.Any], departmentName = departmentName.asInstanceOf[js.Any], emailAddresses = emailAddresses.asInstanceOf[js.Any], familyName = familyName.asInstanceOf[js.Any], givenName = givenName.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], isBirthdayAvailable = isBirthdayAvailable.asInstanceOf[js.Any], isDatesAvailable = isDatesAvailable.asInstanceOf[js.Any], isDepartmentNameAvailable = isDepartmentNameAvailable.asInstanceOf[js.Any], isEmailAddressesAvailable = isEmailAddressesAvailable.asInstanceOf[js.Any], isFamilyNameAvailable = isFamilyNameAvailable.asInstanceOf[js.Any], isGiveNameAvailable = isGiveNameAvailable.asInstanceOf[js.Any], isImageAvailable = isImageAvailable.asInstanceOf[js.Any], isJobTitleAvailable = isJobTitleAvailable.asInstanceOf[js.Any], isMiddleNameAvailable = isMiddleNameAvailable.asInstanceOf[js.Any], isNamePrefixAvailable = isNamePrefixAvailable.asInstanceOf[js.Any], isNicknameAvailable = isNicknameAvailable.asInstanceOf[js.Any], isNoteAvailable = isNoteAvailable.asInstanceOf[js.Any], isOrganizationNameAvailable = isOrganizationNameAvailable.asInstanceOf[js.Any], isPhoneNumbersAvailable = isPhoneNumbersAvailable.asInstanceOf[js.Any], isPostalAddressesAvailable = isPostalAddressesAvailable.asInstanceOf[js.Any], isSocialProfilesAvailable = isSocialProfilesAvailable.asInstanceOf[js.Any], isURLAddressesAvailable = isURLAddressesAvailable.asInstanceOf[js.Any], jobTitle = jobTitle.asInstanceOf[js.Any], middleName = middleName.asInstanceOf[js.Any], namePrefix = namePrefix.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], organizationName = organizationName.asInstanceOf[js.Any], phoneNumbers = phoneNumbers.asInstanceOf[js.Any], postalAddresses = postalAddresses.asInstanceOf[js.Any], socialProfiles = socialProfiles.asInstanceOf[js.Any], urlAddresses = urlAddresses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contact]
  }
  
  extension [Self <: Contact](x: Self) {
    
    inline def setBirthday(value: js.Date): Self = StObject.set(x, "birthday", value.asInstanceOf[js.Any])
    
    inline def setDates(value: js.Array[StringDictionary[Any]]): Self = StObject.set(x, "dates", value.asInstanceOf[js.Any])
    
    inline def setDatesVarargs(value: StringDictionary[Any]*): Self = StObject.set(x, "dates", js.Array(value*))
    
    inline def setDepartmentName(value: String): Self = StObject.set(x, "departmentName", value.asInstanceOf[js.Any])
    
    inline def setEmailAddresses(value: js.Array[EmailAddresses]): Self = StObject.set(x, "emailAddresses", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressesVarargs(value: EmailAddresses*): Self = StObject.set(x, "emailAddresses", js.Array(value*))
    
    inline def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
    
    inline def setGivenName(value: String): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setImage(value: Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setIsBirthdayAvailable(value: Boolean): Self = StObject.set(x, "isBirthdayAvailable", value.asInstanceOf[js.Any])
    
    inline def setIsDatesAvailable(value: Boolean): Self = StObject.set(x, "isDatesAvailable", value.asInstanceOf[js.Any])
    
    inline def setIsDepartmentNameAvailable(value: Boolean): Self = StObject.set(x, "isDepartmentNameAvailable", value.asInstanceOf[js.Any])
    
    inline def setIsEmailAddressesAvailable(value: Boolean): Self = StObject.set(x, "isEmailAddressesAvailable", value.asInstanceOf[js.Any])
    
    inline def setIsFamilyNameAvailable(value: Boolean): Self = StObject.set(x, "isFamilyNameAvailable", value.asInstanceOf[js.Any])
    
    inline def setIsGiveNameAvailable(value: Boolean): Self = StObject.set(x, "isGiveNameAvailable", value.asInstanceOf[js.Any])
    
    inline def setIsImageAvailable(value: Boolean): Self = StObject.set(x, "isImageAvailable", value.asInstanceOf[js.Any])
    
    inline def setIsJobTitleAvailable(value: Boolean): Self = StObject.set(x, "isJobTitleAvailable", value.asInstanceOf[js.Any])
    
    inline def setIsMiddleNameAvailable(value: Boolean): Self = StObject.set(x, "isMiddleNameAvailable", value.asInstanceOf[js.Any])
    
    inline def setIsNamePrefixAvailable(value: Boolean): Self = StObject.set(x, "isNamePrefixAvailable", value.asInstanceOf[js.Any])
    
    inline def setIsNicknameAvailable(value: Boolean): Self = StObject.set(x, "isNicknameAvailable", value.asInstanceOf[js.Any])
    
    inline def setIsNoteAvailable(value: Boolean): Self = StObject.set(x, "isNoteAvailable", value.asInstanceOf[js.Any])
    
    inline def setIsOrganizationNameAvailable(value: Boolean): Self = StObject.set(x, "isOrganizationNameAvailable", value.asInstanceOf[js.Any])
    
    inline def setIsPhoneNumbersAvailable(value: Boolean): Self = StObject.set(x, "isPhoneNumbersAvailable", value.asInstanceOf[js.Any])
    
    inline def setIsPostalAddressesAvailable(value: Boolean): Self = StObject.set(x, "isPostalAddressesAvailable", value.asInstanceOf[js.Any])
    
    inline def setIsSocialProfilesAvailable(value: Boolean): Self = StObject.set(x, "isSocialProfilesAvailable", value.asInstanceOf[js.Any])
    
    inline def setIsURLAddressesAvailable(value: Boolean): Self = StObject.set(x, "isURLAddressesAvailable", value.asInstanceOf[js.Any])
    
    inline def setJobTitle(value: String): Self = StObject.set(x, "jobTitle", value.asInstanceOf[js.Any])
    
    inline def setMiddleName(value: String): Self = StObject.set(x, "middleName", value.asInstanceOf[js.Any])
    
    inline def setNamePrefix(value: String): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
    
    inline def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
    
    inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setOrganizationName(value: String): Self = StObject.set(x, "organizationName", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumbers(value: js.Array[PhoneNumbers]): Self = StObject.set(x, "phoneNumbers", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumbersVarargs(value: PhoneNumbers*): Self = StObject.set(x, "phoneNumbers", js.Array(value*))
    
    inline def setPostalAddresses(value: js.Array[PostalAddresses]): Self = StObject.set(x, "postalAddresses", value.asInstanceOf[js.Any])
    
    inline def setPostalAddressesVarargs(value: PostalAddresses*): Self = StObject.set(x, "postalAddresses", js.Array(value*))
    
    inline def setSocialProfiles(value: js.Array[SocialProfiles]): Self = StObject.set(x, "socialProfiles", value.asInstanceOf[js.Any])
    
    inline def setSocialProfilesVarargs(value: SocialProfiles*): Self = StObject.set(x, "socialProfiles", js.Array(value*))
    
    inline def setUrlAddresses(value: js.Array[StringDictionary[String]]): Self = StObject.set(x, "urlAddresses", value.asInstanceOf[js.Any])
    
    inline def setUrlAddressesVarargs(value: StringDictionary[String]*): Self = StObject.set(x, "urlAddresses", js.Array(value*))
  }
  
  trait EmailAddresses extends StObject {
    
    var identifier: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var localizedLabel: js.UndefOr[String] = js.undefined
    
    var value: String
  }
  object EmailAddresses {
    
    inline def apply(value: String): EmailAddresses = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmailAddresses]
    }
    
    extension [Self <: EmailAddresses](x: Self) {
      
      inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLocalizedLabel(value: String): Self = StObject.set(x, "localizedLabel", value.asInstanceOf[js.Any])
      
      inline def setLocalizedLabelUndefined: Self = StObject.set(x, "localizedLabel", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait PhoneNumbers extends StObject {
    
    var identifier: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var localizedLabel: js.UndefOr[String] = js.undefined
    
    var value: String
  }
  object PhoneNumbers {
    
    inline def apply(value: String): PhoneNumbers = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhoneNumbers]
    }
    
    extension [Self <: PhoneNumbers](x: Self) {
      
      inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLocalizedLabel(value: String): Self = StObject.set(x, "localizedLabel", value.asInstanceOf[js.Any])
      
      inline def setLocalizedLabelUndefined: Self = StObject.set(x, "localizedLabel", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait PostalAddresses extends StObject {
    
    var city: String
    
    var country: String
    
    var identifier: js.UndefOr[String] = js.undefined
    
    var label: String
    
    var localizedLabel: String
    
    var postalCode: String
    
    var state: String
    
    var street: String
  }
  object PostalAddresses {
    
    inline def apply(
      city: String,
      country: String,
      label: String,
      localizedLabel: String,
      postalCode: String,
      state: String,
      street: String
    ): PostalAddresses = {
      val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], localizedLabel = localizedLabel.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostalAddresses]
    }
    
    extension [Self <: PostalAddresses](x: Self) {
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLocalizedLabel(value: String): Self = StObject.set(x, "localizedLabel", value.asInstanceOf[js.Any])
      
      inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStreet(value: String): Self = StObject.set(x, "street", value.asInstanceOf[js.Any])
    }
  }
  
  trait SocialProfiles extends StObject {
    
    var identifier: js.UndefOr[String] = js.undefined
    
    var label: String
    
    var localizedLabel: String
    
    var service: String
    
    var url: String
    
    var userIdentifier: String
    
    var username: String
  }
  object SocialProfiles {
    
    inline def apply(
      label: String,
      localizedLabel: String,
      service: String,
      url: String,
      userIdentifier: String,
      username: String
    ): SocialProfiles = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], localizedLabel = localizedLabel.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], userIdentifier = userIdentifier.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocialProfiles]
    }
    
    extension [Self <: SocialProfiles](x: Self) {
      
      inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLocalizedLabel(value: String): Self = StObject.set(x, "localizedLabel", value.asInstanceOf[js.Any])
      
      inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUserIdentifier(value: String): Self = StObject.set(x, "userIdentifier", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
