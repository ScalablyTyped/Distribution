package typings.scriptableIos.global

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
class Contact ()
  extends typings.scriptableIos.Contact {
  /**
    * _Birthday._
    * @see https://docs.scriptable.app/contact/#birthday
    */
  /* CompleteClass */
  override var birthday: Date = js.native
  /**
    * _Dates._
    *
    * When updating this property, you must set the entire array of dates that you would like to store on the contact. The "identifier" key is optional.
    * @see https://docs.scriptable.app/contact/#dates
    */
  /* CompleteClass */
  override var dates: js.Array[StringDictionary[_]] = js.native
  /**
    * _Name of the department associated with the contact._
    * @see https://docs.scriptable.app/contact/#departmentname
    */
  /* CompleteClass */
  override var departmentName: String = js.native
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
  override var emailAddresses: js.Array[EmailAddresses] = js.native
  /**
    * _Family name._
    * @see https://docs.scriptable.app/contact/#familyname
    */
  /* CompleteClass */
  override var familyName: String = js.native
  /**
    * _Given name._
    * @see https://docs.scriptable.app/contact/#givenname
    */
  /* CompleteClass */
  override var givenName: String = js.native
  /**
    * _Uniquely identifies the contact on the device._
    * @see https://docs.scriptable.app/contact/#identifier
    */
  /* CompleteClass */
  override var identifier: String = js.native
  /**
    * _Profile picture._
    * @see https://docs.scriptable.app/contact/#image
    */
  /* CompleteClass */
  override var image: typings.scriptableIos.Image = js.native
  /**
    * _Whether or not birthday is available._
    *
    * The `birthday` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isbirthdayavailable
    */
  /* CompleteClass */
  override var isBirthdayAvailable: Boolean = js.native
  /**
    * _Whether or not dates are available._
    *
    * The `date` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isdatesavailable
    */
  /* CompleteClass */
  override var isDatesAvailable: Boolean = js.native
  /**
    * _Whether or not department name is available._
    *
    * The `departmentName` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isdepartmentnameavailable
    */
  /* CompleteClass */
  override var isDepartmentNameAvailable: Boolean = js.native
  /**
    * _Whether or not email addresses are available._
    *
    * The `emailAddresses` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isemailaddressesavailable
    */
  /* CompleteClass */
  override var isEmailAddressesAvailable: Boolean = js.native
  /**
    * _Whether or not family name is available._
    *
    * The `familyName` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isfamilynameavailable
    */
  /* CompleteClass */
  override var isFamilyNameAvailable: Boolean = js.native
  /**
    * _Whether or not given name is available._
    *
    * The `givenName` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isgivenameavailable
    */
  /* CompleteClass */
  override var isGiveNameAvailable: Boolean = js.native
  /**
    * _Whether or not image is available._
    *
    * The `image` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isimageavailable
    */
  /* CompleteClass */
  override var isImageAvailable: Boolean = js.native
  /**
    * _Whether or not job title is available._
    *
    * The `jobTitle` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isjobtitleavailable
    */
  /* CompleteClass */
  override var isJobTitleAvailable: Boolean = js.native
  /**
    * _Whether or not middle name is available._
    *
    * The `middleName` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#ismiddlenameavailable
    */
  /* CompleteClass */
  override var isMiddleNameAvailable: Boolean = js.native
  /**
    * _Whether or not name prefix is available._
    *
    * The `namePrefix` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isnameprefixavailable
    */
  /* CompleteClass */
  override var isNamePrefixAvailable: Boolean = js.native
  /**
    * _Whether or not nickname is available._
    *
    * The `nickname` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isnicknameavailable
    */
  /* CompleteClass */
  override var isNicknameAvailable: Boolean = js.native
  /**
    * _Whether or not note is available._
    *
    * The `note` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isnoteavailable
    */
  /* CompleteClass */
  override var isNoteAvailable: Boolean = js.native
  /**
    * _Whether or not organization name is available._
    *
    * The `organizationName` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isorganizationnameavailable
    */
  /* CompleteClass */
  override var isOrganizationNameAvailable: Boolean = js.native
  /**
    * _Whether or not phone numbers are available._
    *
    * The `phoneNumbers` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isphonenumbersavailable
    */
  /* CompleteClass */
  override var isPhoneNumbersAvailable: Boolean = js.native
  /**
    * _Whether or not postal addresses are available._
    *
    * The `postalAddresses` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#ispostaladdressesavailable
    */
  /* CompleteClass */
  override var isPostalAddressesAvailable: Boolean = js.native
  /**
    * _Whether or not social profiles are available._
    *
    * The `socialProfiles` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#issocialprofilesavailable
    */
  /* CompleteClass */
  override var isSocialProfilesAvailable: Boolean = js.native
  /**
    * _Whether or not URL addresses are available._
    *
    * The `urlAddresses` property may not be available if the container does not support it. In that case any value set on the property will be ignored.
    * @see https://docs.scriptable.app/contact/#isurladdressesavailable
    */
  /* CompleteClass */
  override var isURLAddressesAvailable: Boolean = js.native
  /**
    * _The contact's job title._
    * @see https://docs.scriptable.app/contact/#jobtitle
    */
  /* CompleteClass */
  override var jobTitle: String = js.native
  /**
    * _Middle name._
    * @see https://docs.scriptable.app/contact/#middlename
    */
  /* CompleteClass */
  override var middleName: String = js.native
  /**
    * _Name prefix._
    * @see https://docs.scriptable.app/contact/#nameprefix
    */
  /* CompleteClass */
  override var namePrefix: String = js.native
  /**
    * _Nickname._
    * @see https://docs.scriptable.app/contact/#nickname
    */
  /* CompleteClass */
  override var nickname: String = js.native
  /**
    * _Note for the contact._
    *
    * For security reasons, a contact's notes cannot be accessed in Siri, the Shortcuts app and in a notification.
    * @see https://docs.scriptable.app/contact/#note
    */
  /* CompleteClass */
  override var note: String = js.native
  /**
    * _Name of the organization associated with the contact._
    * @see https://docs.scriptable.app/contact/#organizationname
    */
  /* CompleteClass */
  override var organizationName: String = js.native
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
  override var phoneNumbers: js.Array[PhoneNumbers] = js.native
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
  /* CompleteClass */
  override var postalAddresses: js.Array[PostalAddresses] = js.native
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
  override var socialProfiles: js.Array[SocialProfiles] = js.native
  /**
    * _URL addresses._
    *
    * When updating this property, you must set the entire array of URL addresses that you would like to store on the contact. The "identifier" key is optional.
    * @see https://docs.scriptable.app/contact/#urladdresses
    */
  /* CompleteClass */
  override var urlAddresses: js.Array[StringDictionary[String]] = js.native
}

/* static members */
@JSGlobal("Contact")
@js.native
object Contact extends js.Object {
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
  def add(contact: typings.scriptableIos.Contact): Unit = js.native
  def add(contact: typings.scriptableIos.Contact, containerIdentifier: String): Unit = js.native
  /**
    * _Fetches contacts._
    *
    * Fetches the contacts in the specified containers. A contact can be in only one container.
    * @param containers - Containers to fetch contacts from.
    * @see https://docs.scriptable.app/contact/#all
    */
  def all(containers: js.Array[typings.scriptableIos.ContactsContainer]): js.Promise[js.Array[typings.scriptableIos.Contact]] = js.native
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
  def delete(contact: typings.scriptableIos.Contact): Unit = js.native
  /**
    * _Fetches contacts in groups._
    *
    * Fetches the contacts in the specified contacts groups. A contact may belong to many groups.
    * @param groups - Groups to fetch contacts from.
    * @see https://docs.scriptable.app/contact/#ingroups
    */
  def inGroups(groups: js.Array[typings.scriptableIos.ContactsGroup]): js.Promise[js.Array[typings.scriptableIos.Contact]] = js.native
  /**
    * _Persist queued changes to the address book._
    *
    * Call this function to persist changes queued with `Contact.add()`, `Contact.update()` and `Contact.delete()`.
    *
    * For performance reasons, it is best to batch changes to the address book. Therefore you should queue all updates, insertions and removals of contacts and contacts groups to as
    * large batches as possible and then call `Contact.persistChanges()` when you want to persist the changes to the address book.
    * @see https://docs.scriptable.app/contact/#persistchanges
    */
  def persistChanges(): js.Promise[Unit] = js.native
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
  def update(contact: typings.scriptableIos.Contact): Unit = js.native
}

