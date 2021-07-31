package typings.scriptableIos.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  extends StObject
     with typings.scriptableIos.ContactsGroup {
  
  /**
    * _Adds a contact to the group._
    *
    * In order to persist the change, you should call `Contact.persistChanges()`. It is important that the contact is added to the address book. To add the contact to the address book,
    * you should queue it for insertion using `Contact.add()` before persisting the changes.
    * @param contact - Contact to add to the group.
    * @see https://docs.scriptable.app/contactsgroup/#-addmember
    */
  /* CompleteClass */
  override def addMember(contact: typings.scriptableIos.Contact): Unit = js.native
  
  /**
    * _Identifier of the contacts group._
    * @see https://docs.scriptable.app/contactsgroup/#identifier
    */
  /* CompleteClass */
  var identifier: String = js.native
  
  /**
    * _Name of the contacts group._
    * @see https://docs.scriptable.app/contactsgroup/#name
    */
  /* CompleteClass */
  var name: String = js.native
  
  /**
    * _Removes a contact from the group._
    *
    * In order to persist the change, you should call `Contact.persistChanges()`. It is important that the contact is added to the address book. To add the contact to the address book,
    * you should queue it for insertion using `Contact.add()` before persisting the changes.
    * @param contact - Contact to add to the group.
    * @see https://docs.scriptable.app/contactsgroup/#-removemember
    */
  /* CompleteClass */
  override def removeMember(contact: typings.scriptableIos.Contact): Unit = js.native
}
object ContactsGroup {
  
  @JSGlobal("ContactsGroup")
  @js.native
  val ^ : js.Any = js.native
  
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
  /* static member */
  @scala.inline
  def add(group: typings.scriptableIos.ContactsGroup): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(group.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def add(group: typings.scriptableIos.ContactsGroup, containerIdentifier: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(group.asInstanceOf[js.Any], containerIdentifier.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * _Fetches contacts groups._
    *
    * Fetches the contacts groups in the specified containers. A group can be in only one container.
    * @param containers - Container to fetch contacts groups from.
    * @see https://docs.scriptable.app/contactsgroup/#all
    */
  /* static member */
  @scala.inline
  def all(containers: js.Array[typings.scriptableIos.ContactsContainer]): js.Promise[js.Array[typings.scriptableIos.ContactsGroup]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(containers.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.scriptableIos.ContactsGroup]]]
  
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
  /* static member */
  @scala.inline
  def delete(group: typings.scriptableIos.ContactsGroup): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")(group.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
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
  /* static member */
  @scala.inline
  def update(group: typings.scriptableIos.ContactsGroup): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(group.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
