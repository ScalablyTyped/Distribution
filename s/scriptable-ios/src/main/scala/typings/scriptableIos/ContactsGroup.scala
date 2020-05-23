package typings.scriptableIos

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _Group of contacts._
  *
  * In order to add the group to your address book, you must queue it for insertion using `Contact.add()`. When you're done making changes to the address book you should call
  * `Contact.persistChanges()` to persist the changes.
  * @see https://docs.scriptable.app/contactsgroup/#-new-contactsgroup
  */
trait ContactsGroup extends js.Object {
  /**
    * _Identifier of the contacts group._
    * @see https://docs.scriptable.app/contactsgroup/#identifier
    */
  var identifier: String
  /**
    * _Name of the contacts group._
    * @see https://docs.scriptable.app/contactsgroup/#name
    */
  var name: String
  /**
    * _Adds a contact to the group._
    *
    * In order to persist the change, you should call `Contact.persistChanges()`. It is important that the contact is added to the address book. To add the contact to the address book,
    * you should queue it for insertion using `Contact.add()` before persisting the changes.
    * @param contact - Contact to add to the group.
    * @see https://docs.scriptable.app/contactsgroup/#-addmember
    */
  def addMember(contact: Contact): Unit
  /**
    * _Removes a contact from the group._
    *
    * In order to persist the change, you should call `Contact.persistChanges()`. It is important that the contact is added to the address book. To add the contact to the address book,
    * you should queue it for insertion using `Contact.add()` before persisting the changes.
    * @param contact - Contact to add to the group.
    * @see https://docs.scriptable.app/contactsgroup/#-removemember
    */
  def removeMember(contact: Contact): Unit
}

object ContactsGroup {
  @scala.inline
  def apply(addMember: Contact => Unit, identifier: String, name: String, removeMember: Contact => Unit): ContactsGroup = {
    val __obj = js.Dynamic.literal(addMember = js.Any.fromFunction1(addMember), identifier = identifier.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], removeMember = js.Any.fromFunction1(removeMember))
    __obj.asInstanceOf[ContactsGroup]
  }
}

