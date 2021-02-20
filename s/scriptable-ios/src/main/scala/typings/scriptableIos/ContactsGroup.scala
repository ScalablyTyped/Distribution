package typings.scriptableIos

import org.scalablytyped.runtime.StObject
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
@js.native
trait ContactsGroup extends StObject {
  
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
  implicit class ContactsGroupMutableBuilder[Self <: ContactsGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddMember(value: Contact => Unit): Self = StObject.set(x, "addMember", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveMember(value: Contact => Unit): Self = StObject.set(x, "removeMember", js.Any.fromFunction1(value))
  }
}
