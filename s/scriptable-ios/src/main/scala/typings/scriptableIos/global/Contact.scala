package typings.scriptableIos.global

import org.scalablytyped.runtime.StObject
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
  extends typings.scriptableIos.Contact
object Contact {
  
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
  @JSGlobal("Contact.add")
  @js.native
  def add(contact: typings.scriptableIos.Contact): Unit = js.native
  @JSGlobal("Contact.add")
  @js.native
  def add(contact: typings.scriptableIos.Contact, containerIdentifier: String): Unit = js.native
  
  /**
    * _Fetches contacts._
    *
    * Fetches the contacts in the specified containers. A contact can be in only one container.
    * @param containers - Containers to fetch contacts from.
    * @see https://docs.scriptable.app/contact/#all
    */
  /* static member */
  @JSGlobal("Contact.all")
  @js.native
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
  /* static member */
  @JSGlobal("Contact.delete")
  @js.native
  def delete(contact: typings.scriptableIos.Contact): Unit = js.native
  
  /**
    * _Fetches contacts in groups._
    *
    * Fetches the contacts in the specified contacts groups. A contact may belong to many groups.
    * @param groups - Groups to fetch contacts from.
    * @see https://docs.scriptable.app/contact/#ingroups
    */
  /* static member */
  @JSGlobal("Contact.inGroups")
  @js.native
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
  /* static member */
  @JSGlobal("Contact.persistChanges")
  @js.native
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
  /* static member */
  @JSGlobal("Contact.update")
  @js.native
  def update(contact: typings.scriptableIos.Contact): Unit = js.native
}
