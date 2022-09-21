package typings.scriptableIos.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Collection of contacts._
  * @see https://docs.scriptable.app/contactscontainer
  */
@JSGlobal("ContactsContainer")
@js.native
open class ContactsContainer ()
  extends StObject
     with typings.scriptableIos.ContactsContainer {
  
  /**
    * _Identifier of the contacts container._
    * @see https://docs.scriptable.app/contactscontainer/#identifier
    */
  /* CompleteClass */
  var identifier: String = js.native
  
  /**
    * _Name of the contacts container._
    * @see https://docs.scriptable.app/contactscontainer/#name
    */
  /* CompleteClass */
  var name: String = js.native
}
object ContactsContainer {
  
  @JSGlobal("ContactsContainer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * _Fetches default contacts container._
    * @see https://docs.scriptable.app/contactscontainer/#default
    */
  /* static member */
  inline def default(): js.Promise[typings.scriptableIos.ContactsContainer] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[typings.scriptableIos.ContactsContainer]]
  
  /**
    * _Fetches all contacts containers._
    * @see https://docs.scriptable.app/contactscontainer/#all
    */
  /* static member */
  inline def all(): js.Promise[js.Array[typings.scriptableIos.ContactsContainer]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")().asInstanceOf[js.Promise[js.Array[typings.scriptableIos.ContactsContainer]]]
  
  /**
    * _Fetches a contacts container._
    * @param identifier - Identifier of the contacts container to fetch.
    * @see https://docs.scriptable.app/contactscontainer/#withidentifier
    */
  /* static member */
  inline def withIdentifier(identifier: String): js.Promise[typings.scriptableIos.ContactsContainer] = ^.asInstanceOf[js.Dynamic].applyDynamic("withIdentifier")(identifier.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.scriptableIos.ContactsContainer]]
}
