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
@js.native
trait ContactsGroup extends js.Object {
  /**
    * _Identifier of the contacts group._
    * @see https://docs.scriptable.app/contactsgroup/#identifier
    */
  var identifier: String = js.native
  /**
    * _Name of the contacts group._
    * @see https://docs.scriptable.app/contactsgroup/#name
    */
  var name: String = js.native
  /**
    * _Adds a contact to the group._
    *
    * In order to persist the change, you should call `Contact.persistChanges()`. It is important that the contact is added to the address book. To add the contact to the address book,
    * you should queue it for insertion using `Contact.add()` before persisting the changes.
    * @param contact - Contact to add to the group.
    * @see https://docs.scriptable.app/contactsgroup/#-addmember
    */
  def addMember(contact: Contact): Unit = js.native
  /**
    * _Removes a contact from the group._
    *
    * In order to persist the change, you should call `Contact.persistChanges()`. It is important that the contact is added to the address book. To add the contact to the address book,
    * you should queue it for insertion using `Contact.add()` before persisting the changes.
    * @param contact - Contact to add to the group.
    * @see https://docs.scriptable.app/contactsgroup/#-removemember
    */
  def removeMember(contact: Contact): Unit = js.native
}

object ContactsGroup {
  @scala.inline
  def apply(addMember: Contact => Unit, identifier: String, name: String, removeMember: Contact => Unit): ContactsGroup = {
    val __obj = js.Dynamic.literal(addMember = js.Any.fromFunction1(addMember), identifier = identifier.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], removeMember = js.Any.fromFunction1(removeMember))
    __obj.asInstanceOf[ContactsGroup]
  }
  @scala.inline
  implicit class ContactsGroupOps[Self <: ContactsGroup] (val x: Self) extends AnyVal {
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
    def setAddMember(value: Contact => Unit): Self = this.set("addMember", js.Any.fromFunction1(value))
    @scala.inline
    def setIdentifier(value: String): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveMember(value: Contact => Unit): Self = this.set("removeMember", js.Any.fromFunction1(value))
  }
  
}

