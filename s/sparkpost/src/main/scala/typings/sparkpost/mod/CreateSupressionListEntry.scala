package typings.sparkpost.mod

import typings.sparkpost.sparkpostStrings.Compliance
import typings.sparkpost.sparkpostStrings.`Bounce Rule`
import typings.sparkpost.sparkpostStrings.`List Unsubscribe`
import typings.sparkpost.sparkpostStrings.`Manually Added`
import typings.sparkpost.sparkpostStrings.`Spam Complaint`
import typings.sparkpost.sparkpostStrings.`Unsubscribe Link`
import typings.sparkpost.sparkpostStrings.non_transactional
import typings.sparkpost.sparkpostStrings.transactional
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSupressionListEntry extends StObject {
  
  /** Short explanation of the suppression */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Whether the recipient requested to not receive any non-transactional messages
    * Not required if a valid type is passed
    *
    * @deprecated Available, but deprecated in favor of type
    */
  var non_transactional: js.UndefOr[Boolean] = js.native
  
  /**
    * Email address to be suppressed
    *
    */
  var recipient: String = js.native
  
  /**
    * Source responsible for inserting the list entry
    * no - entries created by the user are marked as Manually Added
    *
    */
  val source: js.UndefOr[
    (`Spam Complaint`) | (`List Unsubscribe`) | (`Bounce Rule`) | (`Unsubscribe Link`) | (`Manually Added`) | Compliance
  ] = js.native
  
  /**
    * Whether the recipient requested to not receive any non-transactional messages
    * Not required if a valid type is passed
    *
    * @deprecated Available, but deprecated in favor of type
    */
  var transactional: js.UndefOr[Boolean] = js.native
  
  /**
    * Type of suppression record
    *
    */
  var `type`: js.UndefOr[transactional | non_transactional] = js.native
}
object CreateSupressionListEntry {
  
  @scala.inline
  def apply(recipient: String): CreateSupressionListEntry = {
    val __obj = js.Dynamic.literal(recipient = recipient.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSupressionListEntry]
  }
  
  @scala.inline
  implicit class CreateSupressionListEntryMutableBuilder[Self <: CreateSupressionListEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setNon_transactional(value: Boolean): Self = StObject.set(x, "non_transactional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNon_transactionalUndefined: Self = StObject.set(x, "non_transactional", js.undefined)
    
    @scala.inline
    def setRecipient(value: String): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(
      value: (`Spam Complaint`) | (`List Unsubscribe`) | (`Bounce Rule`) | (`Unsubscribe Link`) | (`Manually Added`) | Compliance
    ): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setTransactional(value: Boolean): Self = StObject.set(x, "transactional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionalUndefined: Self = StObject.set(x, "transactional", js.undefined)
    
    @scala.inline
    def setType(value: transactional | non_transactional): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
