package typings.scriptableIos.global

import org.scalablytyped.runtime.StringDictionary
import typings.scriptableIos.Contact.EmailAddresses
import typings.scriptableIos.Contact.PhoneNumbers
import typings.scriptableIos.Contact.PostalAddresses
import typings.scriptableIos.Contact.SocialProfiles
import typings.std.Date
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
@JSGlobal("Contact")
@js.native
/**
  * _Contact in the address book._
  *
  * In order to add the contact to your address book, you must queue it for insertion using `Contact.add()`. When you're done making changes to the address book you should call
  * `Contact.persistChanges()` to persist the changes.
  * @see https://docs.scriptable.app/contact/#-new-contact
  */
class Contact ()
  extends StObject
     with typings.scriptableIos.Contact {
  
  /**
    * _Birthday._
    * @see https://docs.scriptable.app/contact/#birthday
    */
  /* CompleteClass */
  var birthday: Date = js.native
  
  /**
    * _Dates._
    *
    * When updating this property, you must set the entire array of dates that you would like to store on the contact. The "identifier" key is optional.
    * @see https://docs.scriptable.app/contact/#dates
    */
  /* CompleteClass */
  var dates: js.Array[StringDictionary[js.Any]] = js.native
  
  /**
    * _Name of the department associated with the contact._
    * @see https://docs.scriptable.app/contact/#departmentname
    */
  /* CompleteClass */
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
  /* CompleteClass */
  var emailAddresses: js.Array[EmailAddresses] = js.native
  
  /**
    * _Family name._
    * @see https://docs.scriptable.app/contact/#familyname
    */
  /* CompleteClass */
  var familyName: String = js.native
  
  /**
    * _Given name._
    * @see https://docs.scriptable.app/contact/#givenname
    */
  /* CompleteClass */
  var givenName: String = js.native
  
  /**
    * _Uniquely identifies the contact on the device._
    * @see https://docs.scriptable.app/contact/#identifier
    */
  /* CompleteClass */
  var identifier: String = js.native
  
  /**
    * _Profile picture._
    * @see https://docs.scriptable.app/contact/#image
    */
  /* CompleteClass */
  var image: typings.scriptableIos.Image = js.native
  
  /**
    * _Whether or not birthday is available._
    *
    * The `birthday` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isbirthdayavailable
    */
  /* CompleteClass */
  var isBirthdayAvailable: Boolean = js.native
  
  /**
    * _Whether or not dates are available._
    *
    * The `date` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isdatesavailable
    */
  /* CompleteClass */
  var isDatesAvailable: Boolean = js.native
  
  /**
    * _Whether or not department name is available._
    *
    * The `departmentName` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isdepartmentnameavailable
    */
  /* CompleteClass */
  var isDepartmentNameAvailable: Boolean = js.native
  
  /**
    * _Whether or not email addresses are available._
    *
    * The `emailAddresses` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isemailaddressesavailable
    */
  /* CompleteClass */
  var isEmailAddressesAvailable: Boolean = js.native
  
  /**
    * _Whether or not family name is available._
    *
    * The `familyName` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isfamilynameavailable
    */
  /* CompleteClass */
  var isFamilyNameAvailable: Boolean = js.native
  
  /**
    * _Whether or not given name is available._
    *
    * The `givenName` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isgivenameavailable
    */
  /* CompleteClass */
  var isGiveNameAvailable: Boolean = js.native
  
  /**
    * _Whether or not image is available._
    *
    * The `image` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isimageavailable
    */
  /* CompleteClass */
  var isImageAvailable: Boolean = js.native
  
  /**
    * _Whether or not job title is available._
    *
    * The `jobTitle` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isjobtitleavailable
    */
  /* CompleteClass */
  var isJobTitleAvailable: Boolean = js.native
  
  /**
    * _Whether or not middle name is available._
    *
    * The `middleName` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#ismiddlenameavailable
    */
  /* CompleteClass */
  var isMiddleNameAvailable: Boolean = js.native
  
  /**
    * _Whether or not name prefix is available._
    *
    * The `namePrefix` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isnameprefixavailable
    */
  /* CompleteClass */
  var isNamePrefixAvailable: Boolean = js.native
  
  /**
    * _Whether or not nickname is available._
    *
    * The `nickname` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isnicknameavailable
    */
  /* CompleteClass */
  var isNicknameAvailable: Boolean = js.native
  
  /**
    * _Whether or not note is available._
    *
    * The `note` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isnoteavailable
    */
  /* CompleteClass */
  var isNoteAvailable: Boolean = js.native
  
  /**
    * _Whether or not organization name is available._
    *
    * The `organizationName` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isorganizationnameavailable
    */
  /* CompleteClass */
  var isOrganizationNameAvailable: Boolean = js.native
  
  /**
    * _Whether or not phone numbers are available._
    *
    * The `phoneNumbers` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isphonenumbersavailable
    */
  /* CompleteClass */
  var isPhoneNumbersAvailable: Boolean = js.native
  
  /**
    * _Whether or not postal addresses are available._
    *
    * The `postalAddresses` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#ispostaladdressesavailable
    */
  /* CompleteClass */
  var isPostalAddressesAvailable: Boolean = js.native
  
  /**
    * _Whether or not social profiles are available._
    *
    * The `socialProfiles` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#issocialprofilesavailable
    */
  /* CompleteClass */
  var isSocialProfilesAvailable: Boolean = js.native
  
  /**
    * _Whether or not URL addresses are available._
    *
    * The `urlAddresses` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isurladdressesavailable
    */
  /* CompleteClass */
  var isURLAddressesAvailable: Boolean = js.native
  
  /**
    * _The contacts job title._
    * @see https://docs.scriptable.app/contact/#jobtitle
    */
  /* CompleteClass */
  var jobTitle: String = js.native
  
  /**
    * _Middle name._
    * @see https://docs.scriptable.app/contact/#middlename
    */
  /* CompleteClass */
  var middleName: String = js.native
  
  /**
    * _Name prefix._
    * @see https://docs.scriptable.app/contact/#nameprefix
    */
  /* CompleteClass */
  var namePrefix: String = js.native
  
  /**
    * _Nickname._
    * @see https://docs.scriptable.app/contact/#nickname
    */
  /* CompleteClass */
  var nickname: String = js.native
  
  /**
    * _Note for the contact._
    *
    * For security reasons, a contacts notes cannot be accessed in Siri, the Shortcuts app and in a notification.
    * @see https://docs.scriptable.app/contact/#note
    */
  /* CompleteClass */
  var note: String = js.native
  
  /**
    * _Name of the organization associated with the contact._
    * @see https://docs.scriptable.app/contact/#organizationname
    */
  /* CompleteClass */
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
  /* CompleteClass */
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
  /* CompleteClass */
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
  /* CompleteClass */
  var socialProfiles: js.Array[SocialProfiles] = js.native
  
  /**
    * _URL addresses._
    *
    * When updating this property, you must set the entire array of URL addresses that you would like to store on the contact. The "identifier" key is optional.
    * @see https://docs.scriptable.app/contact/#urladdresses
    */
  /* CompleteClass */
  var urlAddresses: js.Array[StringDictionary[String]] = js.native
}
object Contact {
  
  @JSGlobal("Contact")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * _Queues a contact to be added._
    *
    * After you have created a contact, you must queue the contact to be added to the address book and invoke `Contact.persistChanges()` to persist the changes to the address book.
    *
    * For performance reasons, it is best to batch changes to the address book. Therefore you should queue all updates, insertions and removals of contacts and contacts groups to as
    * large batches as possible and then call `Contact.persistChanges()` when you want to persist the changes to the address book.
    * @param contact - Contact to queue to be added.
    * @param containerIdentifier - Optional. Identifier of container to add the contact to. If null is specified, the contact will be added to the default container.
    * @see https://docs.scriptable.app/contact/#add
    */
  /* static member */
  inline def add(contact: typings.scriptableIos.Contact): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(contact.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def add(contact: typings.scriptableIos.Contact, containerIdentifier: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(contact.asInstanceOf[js.Any], containerIdentifier.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * _Fetches contacts._
    *
    * Fetches the contacts in the specified containers. A contact can be in only one container.
    * @param containers - Containers to fetch contacts from.
    * @see https://docs.scriptable.app/contact/#all
    */
  /* static member */
  inline def all(containers: js.Array[typings.scriptableIos.ContactsContainer]): js.Promise[js.Array[typings.scriptableIos.Contact]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(containers.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Contact]]]
  
  /**
    * _Queues a contact to be deleted._
    *
    * To delete a contact, you must queue the contact for deletion and invoke `Contact.persistChanges()` to persist the changes to the address book.
    *
    * For performance reasons, it is best to batch changes to the address book. Therefore you should queue all updates, insertions and removals of contacts and contacts groups to as
    * large batches as possible and then call `Contact.persistChanges()` when you want to persist the changes to the address book.
    * @param contact - Contact to queue to be deleted.
    * @see https://docs.scriptable.app/contact/#delete
    */
  /* static member */
  inline def delete(contact: typings.scriptableIos.Contact): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")(contact.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * _Fetches contacts in groups._
    *
    * Fetches the contacts in the specified contacts groups. A contact may belong to many groups.
    * @param groups - Groups to fetch contacts from.
    * @see https://docs.scriptable.app/contact/#ingroups
    */
  /* static member */
  inline def inGroups(groups: js.Array[typings.scriptableIos.ContactsGroup]): js.Promise[js.Array[typings.scriptableIos.Contact]] = ^.asInstanceOf[js.Dynamic].applyDynamic("inGroups")(groups.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Contact]]]
  
  /**
    * _Persist queued changes to the address book._
    *
    * Call this function to persist changes queued with `Contact.add()`, `Contact.update()` and `Contact.delete()`.
    *
    * For performance reasons, it is best to batch changes to the address book. Therefore you should queue all updates, insertions and removals of contacts and contacts groups to as
    * large batches as possible and then call `Contact.persistChanges()` when you want to persist the changes to the address book.
    * @see https://docs.scriptable.app/contact/#persistchanges
    */
  /* static member */
  inline def persistChanges(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("persistChanges")().asInstanceOf[js.Promise[Unit]]
  
  /**
    * _Queues an update to a contact._
    *
    * After you have updated one or more properties on a contact, you must queue the contact to be updated and invoke `Contact.persistChanges()` to persist the changes to the address
    * book.
    *
    * For performance reasons, it is best to batch changes to the address book. Therefore you should queue all updates, insertions and removals of contacts and contacts groups to as
    * large batches as possible and then call `Contact.persistChanges()` when you want to persist the changes to the address book.
    * @param contact - Contact to queue to be updated.
    * @see https://docs.scriptable.app/contact/#update
    */
  /* static member */
  inline def update(contact: typings.scriptableIos.Contact): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(contact.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
