package typings.pulumiAws.botMod

import typings.pulumiAws.inputMod.lex.BotAbortStatement
import typings.pulumiAws.inputMod.lex.BotClarificationPrompt
import typings.pulumiAws.inputMod.lex.BotIntent
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BotArgs extends js.Object {
  
  /**
    * The message that Amazon Lex uses to abort a conversation. Attributes are documented under statement.
    */
  val abortStatement: Input[BotAbortStatement] = js.native
  
  /**
    * By specifying true, you confirm that your use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA. For more information see the [Amazon Lex FAQ](https://aws.amazon.com/lex/faqs#data-security) and the [Amazon Lex PutBot API Docs](https://docs.aws.amazon.com/lex/latest/dg/API_PutBot.html#lex-PutBot-request-childDirected).
    */
  val childDirected: Input[Boolean] = js.native
  
  /**
    * The message that Amazon Lex uses when it doesn't understand the user's request. Attributes are documented under prompt.
    */
  val clarificationPrompt: js.UndefOr[Input[BotClarificationPrompt]] = js.native
  
  /**
    * Determines if a new bot version is created when the initial resource is created and on each update. Defaults to `false`.
    */
  val createVersion: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * A description of the bot. Must be less than or equal to 200 characters in length.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * When set to true user utterances are sent to Amazon Comprehend for sentiment analysis. If you don't specify detectSentiment, the default is `false`.
    */
  val detectSentiment: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Set to `true` to enable access to natural language understanding improvements. When you set the `enableModelImprovements` parameter to true you can use the `nluIntentConfidenceThreshold` parameter to configure confidence scores. For more information, see [Confidence Scores](https://docs.aws.amazon.com/lex/latest/dg/confidence-scores.html). You can only set the `enableModelImprovements` parameter in certain Regions. If you set the parameter to true, your bot has access to accuracy improvements. For more information see the [Amazon Lex Bot PutBot API Docs](https://docs.aws.amazon.com/lex/latest/dg/API_PutBot.html#lex-PutBot-request-enableModelImprovements).
    */
  val enableModelImprovements: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The maximum time in seconds that Amazon Lex retains the data gathered in a conversation. Default is `300`. Must be a number between 60 and 86400 (inclusive).
    */
  val idleSessionTtlInSeconds: js.UndefOr[Input[Double]] = js.native
  
  /**
    * A set of Intent objects. Each intent represents a command that a user can express. Attributes are documented under intent. Can have up to 100 Intent objects.
    */
  val intents: Input[js.Array[Input[BotIntent]]] = js.native
  
  /**
    * Specifies the target locale for the bot. Any intent used in the bot must be compatible with the locale of the bot. For available locales, see [Amazon Lex Bot PutBot API Docs](https://docs.aws.amazon.com/lex/latest/dg/API_PutBot.html#lex-PutBot-request-locale). Default is `en-US`.
    */
  val locale: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the bot that you want to create, case sensitive. Must be between 2 and 50 characters in length.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Determines the threshold where Amazon Lex will insert the AMAZON.FallbackIntent, AMAZON.KendraSearchIntent, or both when returning alternative intents in a PostContent or PostText response. AMAZON.FallbackIntent and AMAZON.KendraSearchIntent are only inserted if they are configured for the bot. For more information see [Amazon Lex Bot PutBot API Docs](https://docs.aws.amazon.com/lex/latest/dg/API_PutBot.html#lex-PutBot-request-nluIntentConfidenceThreshold) This value requires `enableModelImprovements` to be set to `true` and the default is `0`. Must be a float between 0 and 1.
    */
  val nluIntentConfidenceThreshold: js.UndefOr[Input[Double]] = js.native
  
  /**
    * If you set the `processBehavior` element to `BUILD`, Amazon Lex builds the bot so that it can be run. If you set the element to `SAVE` Amazon Lex saves the bot, but doesn't build it. Default is `SAVE`.
    */
  val processBehavior: js.UndefOr[Input[String]] = js.native
  
  /**
    * The Amazon Polly voice ID that you want Amazon Lex to use for voice interactions with the user. The locale configured for the voice must match the locale of the bot. For more information, see [Available Voices](http://docs.aws.amazon.com/polly/latest/dg/voicelist.html) in the Amazon Polly Developer Guide.
    */
  val voiceId: js.UndefOr[Input[String]] = js.native
}
object BotArgs {
  
  @scala.inline
  def apply(
    abortStatement: Input[BotAbortStatement],
    childDirected: Input[Boolean],
    intents: Input[js.Array[Input[BotIntent]]]
  ): BotArgs = {
    val __obj = js.Dynamic.literal(abortStatement = abortStatement.asInstanceOf[js.Any], childDirected = childDirected.asInstanceOf[js.Any], intents = intents.asInstanceOf[js.Any])
    __obj.asInstanceOf[BotArgs]
  }
  
  @scala.inline
  implicit class BotArgsOps[Self <: BotArgs] (val x: Self) extends AnyVal {
    
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
    def setAbortStatement(value: Input[BotAbortStatement]): Self = this.set("abortStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildDirected(value: Input[Boolean]): Self = this.set("childDirected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentsVarargs(value: Input[BotIntent]*): Self = this.set("intents", js.Array(value :_*))
    
    @scala.inline
    def setIntents(value: Input[js.Array[Input[BotIntent]]]): Self = this.set("intents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClarificationPrompt(value: Input[BotClarificationPrompt]): Self = this.set("clarificationPrompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClarificationPrompt: Self = this.set("clarificationPrompt", js.undefined)
    
    @scala.inline
    def setCreateVersion(value: Input[Boolean]): Self = this.set("createVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateVersion: Self = this.set("createVersion", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDetectSentiment(value: Input[Boolean]): Self = this.set("detectSentiment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectSentiment: Self = this.set("detectSentiment", js.undefined)
    
    @scala.inline
    def setEnableModelImprovements(value: Input[Boolean]): Self = this.set("enableModelImprovements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableModelImprovements: Self = this.set("enableModelImprovements", js.undefined)
    
    @scala.inline
    def setIdleSessionTtlInSeconds(value: Input[Double]): Self = this.set("idleSessionTtlInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdleSessionTtlInSeconds: Self = this.set("idleSessionTtlInSeconds", js.undefined)
    
    @scala.inline
    def setLocale(value: Input[String]): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNluIntentConfidenceThreshold(value: Input[Double]): Self = this.set("nluIntentConfidenceThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNluIntentConfidenceThreshold: Self = this.set("nluIntentConfidenceThreshold", js.undefined)
    
    @scala.inline
    def setProcessBehavior(value: Input[String]): Self = this.set("processBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessBehavior: Self = this.set("processBehavior", js.undefined)
    
    @scala.inline
    def setVoiceId(value: Input[String]): Self = this.set("voiceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVoiceId: Self = this.set("voiceId", js.undefined)
  }
}
