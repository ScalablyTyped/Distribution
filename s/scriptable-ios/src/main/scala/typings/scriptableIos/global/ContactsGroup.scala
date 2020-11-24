package typings.scriptableIos.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Group of contacts._
  *
  * In order to add the group to your address book, you must queue it for insertion using `ContactsGroup.add()`. When you're done making changes to the address book you should call
  * `Contact.persistChanges()` to persist the changes.
  * @see https://docs.scriptable.app/contactsgroup/#-new-contactsgroup
  */
@JSGlobal("ContactsGroup")
@js.native
/**
  * _Group of contacts._
  *
  * In order to add the group to your address book, you must queue it for insertion using `ContactsGroup.add()`. When you're done making changes to the address book you should call
  * `Contact.persistChanges()` to persist the changes.
  * @see https://docs.scriptable.app/contactsgroup/#-new-contactsgroup
  */
class ContactsGroup ()
  extends typings.scriptableIos.ContactsGroup
/* static members */
@JSGlobal("ContactsGroup")
@js.native
object ContactsGroup extends js.Object {
  
  /**
    * _Queues a contacts group to be added._
    *
    * After you have created a group, you must queue the group to be added to the address book and invoke `Contact.persistChanges()` to persist the changes to the address book.
    *
    * For performance reasons, it is best to batch changes to the address book. Therefore you should queue all updates, insertions and removals of contacts and contacts groups to as
    * large batches as possible and then call `Contact.persistChanges()` when you want to persist the changes to the address book.
    * @param group - Contacts group to queue to be added.
    * @param containerIdentifier - Optional. Identifier of container to add the contacts group to. If null is specified, the group will be added to the default container.
    * @see https://docs.scriptable.app/contactsgroup/#add
    */
  def add(group: typings.scriptableIos.ContactsGroup): Unit = js.native
  def add(group: typings.scriptableIos.ContactsGroup, containerIdentifier: String): Unit = js.native
  
  /**
    * _Fetches contacts groups._
    *
    * Fetches the contacts groups in the specified containers. A group can be in only one container.
    * @param containers - Container to fetch contacts groups from.
    * @see https://docs.scriptable.app/contactsgroup/#all
    */
  def all(containers: js.Array[typings.scriptableIos.ContactsContainer]): js.Promise[js.Array[typings.scriptableIos.ContactsGroup]] = js.native
  
  /**
    * _Queues a contacts group to be deleted._
    *
    * To delete a contacts group, you must queue the group for deletion and invoke `Contact.persistChanges()` to persist the changes to the address book.
    *
    * For performance reasons, it is best to batch changes to the address book. Therefore you should queue all updates, insertions and removals of contacts and contacts groups to as
    * large batches as possible and then call `Contact.persistChanges()` when you want to persist the changes to the address book.
    * @param group - Contacts group to queue to be deleted.
    * @see https://docs.scriptable.app/contactsgroup/#delete
    */
  def delete(group: typings.scriptableIos.ContactsGroup): Unit = js.native
  
  /**
    * _Queues an update to a contacts group._
    *
    * After you have updated one or more properties on a contacts group, you must queue the group to be updated and invoke `Contact.persistChanges()` to persist the changes to the
    * address book.
    *
    * For performance reasons, it is best to batch changes to the address book. Therefore you should queue all updates, insertions and removals of contacts and contacts groups to as
    * large batches as possible and then call `Contact.persistChanges()` when you want to persist the changes to the address book.
    * @param group - Contacts group to queue to be updated.
    * @see https://docs.scriptable.app/contactsgroup/#update
    */
  def update(group: typings.scriptableIos.ContactsGroup): Unit = js.native
}
