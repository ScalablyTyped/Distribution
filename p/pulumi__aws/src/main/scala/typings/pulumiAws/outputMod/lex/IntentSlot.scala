package typings.pulumiAws.outputMod.lex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntentSlot extends js.Object {
  
  /**
    * A description of the bot. Must be less than or equal to 200 characters in length.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The name of the intent slot that you want to create. The name is case sensitive. Must be less than or equal to 100 characters in length.
    */
  var name: String = js.native
  
  /**
    * Directs Lex the order in which to elicit this slot value from the user.
    * For example, if the intent has two slots with priorities 1 and 2, AWS Lex first elicits a value for
    * the slot with priority 1. If multiple slots share the same priority, the order in which Lex elicits
    * values is arbitrary. Must be between 1 and 100.
    */
  var priority: js.UndefOr[Double] = js.native
  
  /**
    * The response card. Amazon Lex will substitute session attributes and
    * slot values into the response card. For more information, see
    * [Example: Using a Response Card](https://docs.aws.amazon.com/lex/latest/dg/ex-resp-card.html). Must be less than or equal to 50000 characters in length.
    */
  var responseCard: js.UndefOr[String] = js.native
  
  /**
    * If you know a specific pattern with which users might respond to
    * an Amazon Lex request for a slot value, you can provide those utterances to improve accuracy. This
    * is optional. In most cases, Amazon Lex is capable of understanding user utterances. Must have between 1 and 10 items in the list, and each item must be less than or equal to 200 characters in length.
    */
  var sampleUtterances: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Specifies whether the slot is required or optional.
    */
  var slotConstraint: String = js.native
  
  /**
    * The type of the slot, either a custom slot type that you defined or one of
    * the built-in slot types. Must be less than or equal to 100 characters in length.
    */
  var slotType: String = js.native
  
  /**
    * The version of the slot type. Must be less than or equal to 64 characters in length.
    */
  var slotTypeVersion: js.UndefOr[String] = js.native
  
  /**
    * The prompt that Amazon Lex uses to elicit the slot value
    * from the user. Attributes are documented under prompt.
    */
  var valueElicitationPrompt: js.UndefOr[IntentSlotValueElicitationPrompt] = js.native
}
object IntentSlot {
  
  @scala.inline
  def apply(name: String, slotConstraint: String, slotType: String): IntentSlot = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], slotConstraint = slotConstraint.asInstanceOf[js.Any], slotType = slotType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntentSlot]
  }
  
  @scala.inline
  implicit class IntentSlotOps[Self <: IntentSlot] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotConstraint(value: String): Self = this.set("slotConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotType(value: String): Self = this.set("slotType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setResponseCard(value: String): Self = this.set("responseCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseCard: Self = this.set("responseCard", js.undefined)
    
    @scala.inline
    def setSampleUtterancesVarargs(value: String*): Self = this.set("sampleUtterances", js.Array(value :_*))
    
    @scala.inline
    def setSampleUtterances(value: js.Array[String]): Self = this.set("sampleUtterances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampleUtterances: Self = this.set("sampleUtterances", js.undefined)
    
    @scala.inline
    def setSlotTypeVersion(value: String): Self = this.set("slotTypeVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlotTypeVersion: Self = this.set("slotTypeVersion", js.undefined)
    
    @scala.inline
    def setValueElicitationPrompt(value: IntentSlotValueElicitationPrompt): Self = this.set("valueElicitationPrompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueElicitationPrompt: Self = this.set("valueElicitationPrompt", js.undefined)
  }
}
