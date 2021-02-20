package typings.scriptableIos.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Collection of contacts._
  * @see https://docs.scriptable.app/contactscontainer
  */
@JSGlobal("ContactsContainer")
@js.native
class ContactsContainer ()
  extends typings.scriptableIos.ContactsContainer
object ContactsContainer {
  
  /**
    * _Fetches default contacts container._
    * @see https://docs.scriptable.app/contactscontainer/#default
    */
  /* static member */
  @JSGlobal("ContactsContainer.default")
  @js.native
  def default(): js.Promise[typings.scriptableIos.ContactsContainer] = js.native
  
  /**
    * _Fetches all contacts containers._
    * @see https://docs.scriptable.app/contactscontainer/#all
    */
  /* static member */
  @JSGlobal("ContactsContainer.all")
  @js.native
  def all(): js.Promise[js.Array[typings.scriptableIos.ContactsContainer]] = js.native
  
  /**
    * _Fetches a contacts container._
    * @param identifier - Identifier of the contacts container to fetch.
    * @see https://docs.scriptable.app/contactscontainer/#withidentifier
    */
  /* static member */
  @JSGlobal("ContactsContainer.withIdentifier")
  @js.native
  def withIdentifier(identifier: String): js.Promise[typings.scriptableIos.ContactsContainer] = js.native
}
