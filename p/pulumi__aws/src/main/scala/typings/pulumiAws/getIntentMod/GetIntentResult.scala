package typings.pulumiAws.getIntentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetIntentResult extends js.Object {
  
  /**
    * The ARN of the Lex intent.
    */
  val arn: String = js.native
  
  /**
    * Checksum identifying the version of the intent that was created. The checksum is not
    * included as an argument because the resource will add it automatically when updating the intent.
    */
  val checksum: String = js.native
  
  /**
    * The date when the intent version was created.
    */
  val createdDate: String = js.native
  
  /**
    * A description of the intent.
    */
  val description: String = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  /**
    * The date when the $LATEST version of this intent was updated.
    */
  val lastUpdatedDate: String = js.native
  
  /**
    * The name of the intent, not case sensitive.
    */
  val name: String = js.native
  
  /**
    * A unique identifier for the built-in intent to base this
    * intent on. To find the signature for an intent, see
    * [Standard Built-in Intents](https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents)
    * in the Alexa Skills Kit.
    */
  val parentIntentSignature: String = js.native
  
  /**
    * The version of the bot.
    */
  val version: js.UndefOr[String] = js.native
}
object GetIntentResult {
  
  @scala.inline
  def apply(
    arn: String,
    checksum: String,
    createdDate: String,
    description: String,
    id: String,
    lastUpdatedDate: String,
    name: String,
    parentIntentSignature: String
  ): GetIntentResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], checksum = checksum.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastUpdatedDate = lastUpdatedDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentIntentSignature = parentIntentSignature.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIntentResult]
  }
  
  @scala.inline
  implicit class GetIntentResultOps[Self <: GetIntentResult] (val x: Self) extends AnyVal {
    
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChecksum(value: String): Self = this.set("checksum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDate(value: String): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedDate(value: String): Self = this.set("lastUpdatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentIntentSignature(value: String): Self = this.set("parentIntentSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
