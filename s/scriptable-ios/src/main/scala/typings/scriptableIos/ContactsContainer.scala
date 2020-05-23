package typings.scriptableIos

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _Collection of contacts._
  * @see https://docs.scriptable.app/contactscontainer
  */
trait ContactsContainer extends js.Object {
  /**
    * _Identifier of the contacts container._
    * @see https://docs.scriptable.app/contactscontainer/#identifier
    */
  var identifier: String
  /**
    * _Name of the contacts container._
    * @see https://docs.scriptable.app/contactscontainer/#name
    */
  var name: String
}

object ContactsContainer {
  @scala.inline
  def apply(identifier: String, name: String): ContactsContainer = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactsContainer]
  }
}

