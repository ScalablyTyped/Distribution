package typings.scriptableIos

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Collection of contacts._
  * @see https://docs.scriptable.app/contactscontainer
  */
@js.native
trait ContactsContainer extends StObject {
  
  /**
    * _Identifier of the contacts container._
    * @see https://docs.scriptable.app/contactscontainer/#identifier
    */
  var identifier: String = js.native
  
  /**
    * _Name of the contacts container._
    * @see https://docs.scriptable.app/contactscontainer/#name
    */
  var name: String = js.native
}
object ContactsContainer {
  
  @scala.inline
  def apply(identifier: String, name: String): ContactsContainer = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactsContainer]
  }
  
  @scala.inline
  implicit class ContactsContainerMutableBuilder[Self <: ContactsContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
