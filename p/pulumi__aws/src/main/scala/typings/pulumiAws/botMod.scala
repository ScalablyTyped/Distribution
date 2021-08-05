package typings.pulumiAws

import typings.pulumiAws.outputMod.lex.BotAbortStatement
import typings.pulumiAws.outputMod.lex.BotClarificationPrompt
import typings.pulumiAws.outputMod.lex.BotIntent
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object botMod {
  
  @JSImport("@pulumi/aws/lex/bot", "Bot")
  @js.native
  class Bot protected () extends CustomResource {
    /**
      * Create a Bot resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: BotArgs) = this()
    def this(name: String, args: BotArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The message that Amazon Lex uses to abort a conversation. Attributes are documented under statement.
      */
    val abortStatement: Output_[BotAbortStatement] = js.native
    
    val arn: Output_[String] = js.native
    
    /**
      * Checksum identifying the version of the bot that was created. The checksum is not
      * included as an argument because the resource will add it automatically when updating the bot.
      */
    val checksum: Output_[String] = js.native
    
    /**
      * By specifying true, you confirm that your use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA. For more information see the [Amazon Lex FAQ](https://aws.amazon.com/lex/faqs#data-security) and the [Amazon Lex PutBot API Docs](https://docs.aws.amazon.com/lex/latest/dg/API_PutBot.html#lex-PutBot-request-childDirected).
      */
    val childDirected: Output_[Boolean] = js.native
    
    /**
      * The message that Amazon Lex uses when it doesn't understand the user's request. Attributes are documented under prompt.
      */
    val clarificationPrompt: Output_[js.UndefOr[BotClarificationPrompt]] = js.native
    
    /**
      * Determines if a new bot version is created when the initial resource is created and on each update. Defaults to `false`.
      */
    val createVersion: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The date when the bot version was created.
      */
    val createdDate: Output_[String] = js.native
    
    /**
      * A description of the bot. Must be less than or equal to 200 characters in length.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * When set to true user utterances are sent to Amazon Comprehend for sentiment analysis. If you don't specify detectSentiment, the default is `false`.
      */
    val detectSentiment: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Set to `true` to enable access to natural language understanding improvements. When you set the `enableModelImprovements` parameter to true you can use the `nluIntentConfidenceThreshold` parameter to configure confidence scores. For more information, see [Confidence Scores](https://docs.aws.amazon.com/lex/latest/dg/confidence-scores.html). You can only set the `enableModelImprovements` parameter in certain Regions. If you set the parameter to true, your bot has access to accuracy improvements. For more information see the [Amazon Lex Bot PutBot API Docs](https://docs.aws.amazon.com/lex/latest/dg/API_PutBot.html#lex-PutBot-request-enableModelImprovements).
      */
    val enableModelImprovements: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * If status is FAILED, Amazon Lex provides the reason that it failed to build the bot.
      */
    val failureReason: Output_[String] = js.native
    
    /**
      * The maximum time in seconds that Amazon Lex retains the data gathered in a conversation. Default is `300`. Must be a number between 60 and 86400 (inclusive).
      */
    val idleSessionTtlInSeconds: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * A set of Intent objects. Each intent represents a command that a user can express. Attributes are documented under intent. Can have up to 100 Intent objects.
      */
    val intents: Output_[js.Array[BotIntent]] = js.native
    
    /**
      * The date when the $LATEST version of this bot was updated.
      */
    val lastUpdatedDate: Output_[String] = js.native
    
    /**
      * Specifies the target locale for the bot. Any intent used in the bot must be compatible with the locale of the bot. For available locales, see [Amazon Lex Bot PutBot API Docs](https://docs.aws.amazon.com/lex/latest/dg/API_PutBot.html#lex-PutBot-request-locale). Default is `en-US`.
      */
    val locale: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The name of the bot that you want to create, case sensitive. Must be between 2 and 50 characters in length.
      */
    val name: Output_[String] = js.native
    
    /**
      * Determines the threshold where Amazon Lex will insert the AMAZON.FallbackIntent, AMAZON.KendraSearchIntent, or both when returning alternative intents in a PostContent or PostText response. AMAZON.FallbackIntent and AMAZON.KendraSearchIntent are only inserted if they are configured for the bot. For more information see [Amazon Lex Bot PutBot API Docs](https://docs.aws.amazon.com/lex/latest/dg/API_PutBot.html#lex-PutBot-request-nluIntentConfidenceThreshold) This value requires `enableModelImprovements` to be set to `true` and the default is `0`. Must be a float between 0 and 1.
      */
    val nluIntentConfidenceThreshold: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * If you set the `processBehavior` element to `BUILD`, Amazon Lex builds the bot so that it can be run. If you set the element to `SAVE` Amazon Lex saves the bot, but doesn't build it. Default is `SAVE`.
      */
    val processBehavior: Output_[js.UndefOr[String]] = js.native
    
    /**
      * When you send a request to create or update a bot, Amazon Lex sets the status response
      * element to BUILDING. After Amazon Lex builds the bot, it sets status to READY. If Amazon Lex can't
      * build the bot, it sets status to FAILED. Amazon Lex returns the reason for the failure in the
      * failureReason response element.
      */
    val status: Output_[String] = js.native
    
    /**
      * The version of the bot.
      */
    val version: Output_[String] = js.native
    
    /**
      * The Amazon Polly voice ID that you want Amazon Lex to use for voice interactions with the user. The locale configured for the voice must match the locale of the bot. For more information, see [Available Voices](http://docs.aws.amazon.com/polly/latest/dg/voicelist.html) in the Amazon Polly Developer Guide.
      */
    val voiceId: Output_[String] = js.native
  }
  /* static members */
  object Bot {
    
    @JSImport("@pulumi/aws/lex/bot", "Bot")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Bot resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Bot = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Bot]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Bot = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Bot]
    inline def get(name: String, id: Input[ID], state: BotState): Bot = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Bot]
    inline def get(name: String, id: Input[ID], state: BotState, opts: CustomResourceOptions): Bot = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Bot]
    
    /**
      * Returns true if the given object is an instance of Bot.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lex/bot.Bot */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/lex/bot.Bot */ Boolean]
  }
  
  trait BotArgs extends StObject {
    
    /**
      * The message that Amazon Lex uses to abort a conversation. Attributes are documented under statement.
      */
    val abortStatement: Input[typings.pulumiAws.inputMod.lex.BotAbortStatement]
    
    /**
      * By specifying true, you confirm that your use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA. For more information see the [Amazon Lex FAQ](https://aws.amazon.com/lex/faqs#data-security) and the [Amazon Lex PutBot API Docs](https://docs.aws.amazon.com/lex/latest/dg/API_PutBot.html#lex-PutBot-request-childDirected).
      */
    val childDirected: Input[Boolean]
    
    /**
      * The message that Amazon Lex uses when it doesn't understand the user's request. Attributes are documented under prompt.
      */
    val clarificationPrompt: js.UndefOr[Input[typings.pulumiAws.inputMod.lex.BotClarificationPrompt]] = js.undefined
    
    /**
      * Determines if a new bot version is created when the initial resource is created and on each update. Defaults to `false`.
      */
    val createVersion: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * A description of the bot. Must be less than or equal to 200 characters in length.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * When set to true user utterances are sent to Amazon Comprehend for sentiment analysis. If you don't specify detectSentiment, the default is `false`.
      */
    val detectSentiment: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Set to `true` to enable access to natural language understanding improvements. When you set the `enableModelImprovements` parameter to true you can use the `nluIntentConfidenceThreshold` parameter to configure confidence scores. For more information, see [Confidence Scores](https://docs.aws.amazon.com/lex/latest/dg/confidence-scores.html). You can only set the `enableModelImprovements` parameter in certain Regions. If you set the parameter to true, your bot has access to accuracy improvements. For more information see the [Amazon Lex Bot PutBot API Docs](https://docs.aws.amazon.com/lex/latest/dg/API_PutBot.html#lex-PutBot-request-enableModelImprovements).
      */
    val enableModelImprovements: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The maximum time in seconds that Amazon Lex retains the data gathered in a conversation. Default is `300`. Must be a number between 60 and 86400 (inclusive).
      */
    val idleSessionTtlInSeconds: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * A set of Intent objects. Each intent represents a command that a user can express. Attributes are documented under intent. Can have up to 100 Intent objects.
      */
    val intents: Input[js.Array[Input[typings.pulumiAws.inputMod.lex.BotIntent]]]
    
    /**
      * Specifies the target locale for the bot. Any intent used in the bot must be compatible with the locale of the bot. For available locales, see [Amazon Lex Bot PutBot API Docs](https://docs.aws.amazon.com/lex/latest/dg/API_PutBot.html#lex-PutBot-request-locale). Default is `en-US`.
      */
    val locale: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the bot that you want to create, case sensitive. Must be between 2 and 50 characters in length.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Determines the threshold where Amazon Lex will insert the AMAZON.FallbackIntent, AMAZON.KendraSearchIntent, or both when returning alternative intents in a PostContent or PostText response. AMAZON.FallbackIntent and AMAZON.KendraSearchIntent are only inserted if they are configured for the bot. For more information see [Amazon Lex Bot PutBot API Docs](https://docs.aws.amazon.com/lex/latest/dg/API_PutBot.html#lex-PutBot-request-nluIntentConfidenceThreshold) This value requires `enableModelImprovements` to be set to `true` and the default is `0`. Must be a float between 0 and 1.
      */
    val nluIntentConfidenceThreshold: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * If you set the `processBehavior` element to `BUILD`, Amazon Lex builds the bot so that it can be run. If you set the element to `SAVE` Amazon Lex saves the bot, but doesn't build it. Default is `SAVE`.
      */
    val processBehavior: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Amazon Polly voice ID that you want Amazon Lex to use for voice interactions with the user. The locale configured for the voice must match the locale of the bot. For more information, see [Available Voices](http://docs.aws.amazon.com/polly/latest/dg/voicelist.html) in the Amazon Polly Developer Guide.
      */
    val voiceId: js.UndefOr[Input[String]] = js.undefined
  }
  object BotArgs {
    
    inline def apply(
      abortStatement: Input[typings.pulumiAws.inputMod.lex.BotAbortStatement],
      childDirected: Input[Boolean],
      intents: Input[js.Array[Input[typings.pulumiAws.inputMod.lex.BotIntent]]]
    ): BotArgs = {
      val __obj = js.Dynamic.literal(abortStatement = abortStatement.asInstanceOf[js.Any], childDirected = childDirected.asInstanceOf[js.Any], intents = intents.asInstanceOf[js.Any])
      __obj.asInstanceOf[BotArgs]
    }
    
    extension [Self <: BotArgs](x: Self) {
      
      inline def setAbortStatement(value: Input[typings.pulumiAws.inputMod.lex.BotAbortStatement]): Self = StObject.set(x, "abortStatement", value.asInstanceOf[js.Any])
      
      inline def setChildDirected(value: Input[Boolean]): Self = StObject.set(x, "childDirected", value.asInstanceOf[js.Any])
      
      inline def setClarificationPrompt(value: Input[typings.pulumiAws.inputMod.lex.BotClarificationPrompt]): Self = StObject.set(x, "clarificationPrompt", value.asInstanceOf[js.Any])
      
      inline def setClarificationPromptUndefined: Self = StObject.set(x, "clarificationPrompt", js.undefined)
      
      inline def setCreateVersion(value: Input[Boolean]): Self = StObject.set(x, "createVersion", value.asInstanceOf[js.Any])
      
      inline def setCreateVersionUndefined: Self = StObject.set(x, "createVersion", js.undefined)
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDetectSentiment(value: Input[Boolean]): Self = StObject.set(x, "detectSentiment", value.asInstanceOf[js.Any])
      
      inline def setDetectSentimentUndefined: Self = StObject.set(x, "detectSentiment", js.undefined)
      
      inline def setEnableModelImprovements(value: Input[Boolean]): Self = StObject.set(x, "enableModelImprovements", value.asInstanceOf[js.Any])
      
      inline def setEnableModelImprovementsUndefined: Self = StObject.set(x, "enableModelImprovements", js.undefined)
      
      inline def setIdleSessionTtlInSeconds(value: Input[Double]): Self = StObject.set(x, "idleSessionTtlInSeconds", value.asInstanceOf[js.Any])
      
      inline def setIdleSessionTtlInSecondsUndefined: Self = StObject.set(x, "idleSessionTtlInSeconds", js.undefined)
      
      inline def setIntents(value: Input[js.Array[Input[typings.pulumiAws.inputMod.lex.BotIntent]]]): Self = StObject.set(x, "intents", value.asInstanceOf[js.Any])
      
      inline def setIntentsVarargs(value: Input[typings.pulumiAws.inputMod.lex.BotIntent]*): Self = StObject.set(x, "intents", js.Array(value :_*))
      
      inline def setLocale(value: Input[String]): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNluIntentConfidenceThreshold(value: Input[Double]): Self = StObject.set(x, "nluIntentConfidenceThreshold", value.asInstanceOf[js.Any])
      
      inline def setNluIntentConfidenceThresholdUndefined: Self = StObject.set(x, "nluIntentConfidenceThreshold", js.undefined)
      
      inline def setProcessBehavior(value: Input[String]): Self = StObject.set(x, "processBehavior", value.asInstanceOf[js.Any])
      
      inline def setProcessBehaviorUndefined: Self = StObject.set(x, "processBehavior", js.undefined)
      
      inline def setVoiceId(value: Input[String]): Self = StObject.set(x, "voiceId", value.asInstanceOf[js.Any])
      
      inline def setVoiceIdUndefined: Self = StObject.set(x, "voiceId", js.undefined)
    }
  }
  
  trait BotState extends StObject {
    
    /**
      * The message that Amazon Lex uses to abort a conversation. Attributes are documented under statement.
      */
    val abortStatement: js.UndefOr[Input[typings.pulumiAws.inputMod.lex.BotAbortStatement]] = js.undefined
    
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Checksum identifying the version of the bot that was created. The checksum is not
      * included as an argument because the resource will add it automatically when updating the bot.
      */
    val checksum: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * By specifying true, you confirm that your use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA. For more information see the [Amazon Lex FAQ](https://aws.amazon.com/lex/faqs#data-security) and the [Amazon Lex PutBot API Docs](https://docs.aws.amazon.com/lex/latest/dg/API_PutBot.html#lex-PutBot-request-childDirected).
      */
    val childDirected: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The message that Amazon Lex uses when it doesn't understand the user's request. Attributes are documented under prompt.
      */
    val clarificationPrompt: js.UndefOr[Input[typings.pulumiAws.inputMod.lex.BotClarificationPrompt]] = js.undefined
    
    /**
      * Determines if a new bot version is created when the initial resource is created and on each update. Defaults to `false`.
      */
    val createVersion: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The date when the bot version was created.
      */
    val createdDate: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A description of the bot. Must be less than or equal to 200 characters in length.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * When set to true user utterances are sent to Amazon Comprehend for sentiment analysis. If you don't specify detectSentiment, the default is `false`.
      */
    val detectSentiment: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Set to `true` to enable access to natural language understanding improvements. When you set the `enableModelImprovements` parameter to true you can use the `nluIntentConfidenceThreshold` parameter to configure confidence scores. For more information, see [Confidence Scores](https://docs.aws.amazon.com/lex/latest/dg/confidence-scores.html). You can only set the `enableModelImprovements` parameter in certain Regions. If you set the parameter to true, your bot has access to accuracy improvements. For more information see the [Amazon Lex Bot PutBot API Docs](https://docs.aws.amazon.com/lex/latest/dg/API_PutBot.html#lex-PutBot-request-enableModelImprovements).
      */
    val enableModelImprovements: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * If status is FAILED, Amazon Lex provides the reason that it failed to build the bot.
      */
    val failureReason: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The maximum time in seconds that Amazon Lex retains the data gathered in a conversation. Default is `300`. Must be a number between 60 and 86400 (inclusive).
      */
    val idleSessionTtlInSeconds: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * A set of Intent objects. Each intent represents a command that a user can express. Attributes are documented under intent. Can have up to 100 Intent objects.
      */
    val intents: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.lex.BotIntent]]]] = js.undefined
    
    /**
      * The date when the $LATEST version of this bot was updated.
      */
    val lastUpdatedDate: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies the target locale for the bot. Any intent used in the bot must be compatible with the locale of the bot. For available locales, see [Amazon Lex Bot PutBot API Docs](https://docs.aws.amazon.com/lex/latest/dg/API_PutBot.html#lex-PutBot-request-locale). Default is `en-US`.
      */
    val locale: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the bot that you want to create, case sensitive. Must be between 2 and 50 characters in length.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Determines the threshold where Amazon Lex will insert the AMAZON.FallbackIntent, AMAZON.KendraSearchIntent, or both when returning alternative intents in a PostContent or PostText response. AMAZON.FallbackIntent and AMAZON.KendraSearchIntent are only inserted if they are configured for the bot. For more information see [Amazon Lex Bot PutBot API Docs](https://docs.aws.amazon.com/lex/latest/dg/API_PutBot.html#lex-PutBot-request-nluIntentConfidenceThreshold) This value requires `enableModelImprovements` to be set to `true` and the default is `0`. Must be a float between 0 and 1.
      */
    val nluIntentConfidenceThreshold: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * If you set the `processBehavior` element to `BUILD`, Amazon Lex builds the bot so that it can be run. If you set the element to `SAVE` Amazon Lex saves the bot, but doesn't build it. Default is `SAVE`.
      */
    val processBehavior: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * When you send a request to create or update a bot, Amazon Lex sets the status response
      * element to BUILDING. After Amazon Lex builds the bot, it sets status to READY. If Amazon Lex can't
      * build the bot, it sets status to FAILED. Amazon Lex returns the reason for the failure in the
      * failureReason response element.
      */
    val status: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The version of the bot.
      */
    val version: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Amazon Polly voice ID that you want Amazon Lex to use for voice interactions with the user. The locale configured for the voice must match the locale of the bot. For more information, see [Available Voices](http://docs.aws.amazon.com/polly/latest/dg/voicelist.html) in the Amazon Polly Developer Guide.
      */
    val voiceId: js.UndefOr[Input[String]] = js.undefined
  }
  object BotState {
    
    inline def apply(): BotState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BotState]
    }
    
    extension [Self <: BotState](x: Self) {
      
      inline def setAbortStatement(value: Input[typings.pulumiAws.inputMod.lex.BotAbortStatement]): Self = StObject.set(x, "abortStatement", value.asInstanceOf[js.Any])
      
      inline def setAbortStatementUndefined: Self = StObject.set(x, "abortStatement", js.undefined)
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setChecksum(value: Input[String]): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
      
      inline def setChecksumUndefined: Self = StObject.set(x, "checksum", js.undefined)
      
      inline def setChildDirected(value: Input[Boolean]): Self = StObject.set(x, "childDirected", value.asInstanceOf[js.Any])
      
      inline def setChildDirectedUndefined: Self = StObject.set(x, "childDirected", js.undefined)
      
      inline def setClarificationPrompt(value: Input[typings.pulumiAws.inputMod.lex.BotClarificationPrompt]): Self = StObject.set(x, "clarificationPrompt", value.asInstanceOf[js.Any])
      
      inline def setClarificationPromptUndefined: Self = StObject.set(x, "clarificationPrompt", js.undefined)
      
      inline def setCreateVersion(value: Input[Boolean]): Self = StObject.set(x, "createVersion", value.asInstanceOf[js.Any])
      
      inline def setCreateVersionUndefined: Self = StObject.set(x, "createVersion", js.undefined)
      
      inline def setCreatedDate(value: Input[String]): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
      
      inline def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDetectSentiment(value: Input[Boolean]): Self = StObject.set(x, "detectSentiment", value.asInstanceOf[js.Any])
      
      inline def setDetectSentimentUndefined: Self = StObject.set(x, "detectSentiment", js.undefined)
      
      inline def setEnableModelImprovements(value: Input[Boolean]): Self = StObject.set(x, "enableModelImprovements", value.asInstanceOf[js.Any])
      
      inline def setEnableModelImprovementsUndefined: Self = StObject.set(x, "enableModelImprovements", js.undefined)
      
      inline def setFailureReason(value: Input[String]): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
      
      inline def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
      
      inline def setIdleSessionTtlInSeconds(value: Input[Double]): Self = StObject.set(x, "idleSessionTtlInSeconds", value.asInstanceOf[js.Any])
      
      inline def setIdleSessionTtlInSecondsUndefined: Self = StObject.set(x, "idleSessionTtlInSeconds", js.undefined)
      
      inline def setIntents(value: Input[js.Array[Input[typings.pulumiAws.inputMod.lex.BotIntent]]]): Self = StObject.set(x, "intents", value.asInstanceOf[js.Any])
      
      inline def setIntentsUndefined: Self = StObject.set(x, "intents", js.undefined)
      
      inline def setIntentsVarargs(value: Input[typings.pulumiAws.inputMod.lex.BotIntent]*): Self = StObject.set(x, "intents", js.Array(value :_*))
      
      inline def setLastUpdatedDate(value: Input[String]): Self = StObject.set(x, "lastUpdatedDate", value.asInstanceOf[js.Any])
      
      inline def setLastUpdatedDateUndefined: Self = StObject.set(x, "lastUpdatedDate", js.undefined)
      
      inline def setLocale(value: Input[String]): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNluIntentConfidenceThreshold(value: Input[Double]): Self = StObject.set(x, "nluIntentConfidenceThreshold", value.asInstanceOf[js.Any])
      
      inline def setNluIntentConfidenceThresholdUndefined: Self = StObject.set(x, "nluIntentConfidenceThreshold", js.undefined)
      
      inline def setProcessBehavior(value: Input[String]): Self = StObject.set(x, "processBehavior", value.asInstanceOf[js.Any])
      
      inline def setProcessBehaviorUndefined: Self = StObject.set(x, "processBehavior", js.undefined)
      
      inline def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setVersion(value: Input[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      inline def setVoiceId(value: Input[String]): Self = StObject.set(x, "voiceId", value.asInstanceOf[js.Any])
      
      inline def setVoiceIdUndefined: Self = StObject.set(x, "voiceId", js.undefined)
    }
  }
}
