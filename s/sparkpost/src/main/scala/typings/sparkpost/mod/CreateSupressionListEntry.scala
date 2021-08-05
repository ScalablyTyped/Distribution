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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSupressionListEntry extends StObject {
  
  /** Short explanation of the suppression */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the recipient requested to not receive any non-transactional messages
    * Not required if a valid type is passed
    *
    * @deprecated Available, but deprecated in favor of type
    */
  var non_transactional: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Email address to be suppressed
    *
    */
  var recipient: String
  
  /**
    * Source responsible for inserting the list entry
    * no - entries created by the user are marked as Manually Added
    *
    */
  val source: js.UndefOr[
    (`Spam Complaint`) | (`List Unsubscribe`) | (`Bounce Rule`) | (`Unsubscribe Link`) | (`Manually Added`) | Compliance
  ] = js.undefined
  
  /**
    * Whether the recipient requested to not receive any non-transactional messages
    * Not required if a valid type is passed
    *
    * @deprecated Available, but deprecated in favor of type
    */
  var transactional: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Type of suppression record
    *
    */
  var `type`: js.UndefOr[transactional | non_transactional] = js.undefined
}
object CreateSupressionListEntry {
  
  inline def apply(recipient: String): CreateSupressionListEntry = {
    val __obj = js.Dynamic.literal(recipient = recipient.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSupressionListEntry]
  }
  
  extension [Self <: CreateSupressionListEntry](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setNon_transactional(value: Boolean): Self = StObject.set(x, "non_transactional", value.asInstanceOf[js.Any])
    
    inline def setNon_transactionalUndefined: Self = StObject.set(x, "non_transactional", js.undefined)
    
    inline def setRecipient(value: String): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    inline def setSource(
      value: (`Spam Complaint`) | (`List Unsubscribe`) | (`Bounce Rule`) | (`Unsubscribe Link`) | (`Manually Added`) | Compliance
    ): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTransactional(value: Boolean): Self = StObject.set(x, "transactional", value.asInstanceOf[js.Any])
    
    inline def setTransactionalUndefined: Self = StObject.set(x, "transactional", js.undefined)
    
    inline def setType(value: transactional | non_transactional): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
