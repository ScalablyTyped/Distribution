package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getBotMod {
  
  @JSImport("@pulumi/aws/lex/getBot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getBot(args: GetBotArgs): js.Promise[GetBotResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBot")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetBotResult]]
  @scala.inline
  def getBot(args: GetBotArgs, opts: InvokeOptions): js.Promise[GetBotResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBot")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetBotResult]]
  
  trait GetBotArgs extends StObject {
    
    /**
      * The name of the bot. The name is case sensitive.
      */
    val name: String
    
    /**
      * The version or alias of the bot.
      */
    val version: js.UndefOr[String] = js.undefined
  }
  object GetBotArgs {
    
    @scala.inline
    def apply(name: String): GetBotArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBotArgs]
    }
    
    @scala.inline
    implicit class GetBotArgsMutableBuilder[Self <: GetBotArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait GetBotResult extends StObject {
    
    val arn: String
    
    val checksum: String
    
    /**
      * Specifies if this Amazon Lex Bot is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA.
      */
    val childDirected: Boolean
    
    val createdDate: String
    
    /**
      * A description of the bot.
      */
    val description: String
    
    /**
      * When set to true user utterances are sent to Amazon Comprehend for sentiment analysis.
      */
    val detectSentiment: Boolean
    
    /**
      * Set to true if natural language understanding improvements are enabled.
      */
    val enableModelImprovements: Boolean
    
    val failureReason: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * The maximum time in seconds that Amazon Lex retains the data gathered in a conversation.
      */
    val idleSessionTtlInSeconds: Double
    
    val lastUpdatedDate: String
    
    /**
      * Specifies the target locale for the bot. Any intent used in the bot must be compatible with the locale of the bot.
      */
    val locale: String
    
    /**
      * The name of the bot, case sensitive.
      */
    val name: String
    
    /**
      * The threshold where Amazon Lex will insert the AMAZON.FallbackIntent, AMAZON.KendraSearchIntent, or both when returning alternative intents in a PostContent or PostText response. AMAZON.FallbackIntent and AMAZON.KendraSearchIntent are only inserted if they are configured for the bot.
      */
    val nluIntentConfidenceThreshold: Double
    
    val status: String
    
    val version: js.UndefOr[String] = js.undefined
    
    /**
      * The Amazon Polly voice ID that the Amazon Lex Bot uses for voice interactions with the user.
      */
    val voiceId: String
  }
  object GetBotResult {
    
    @scala.inline
    def apply(
      arn: String,
      checksum: String,
      childDirected: Boolean,
      createdDate: String,
      description: String,
      detectSentiment: Boolean,
      enableModelImprovements: Boolean,
      failureReason: String,
      id: String,
      idleSessionTtlInSeconds: Double,
      lastUpdatedDate: String,
      locale: String,
      name: String,
      nluIntentConfidenceThreshold: Double,
      status: String,
      voiceId: String
    ): GetBotResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], checksum = checksum.asInstanceOf[js.Any], childDirected = childDirected.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], detectSentiment = detectSentiment.asInstanceOf[js.Any], enableModelImprovements = enableModelImprovements.asInstanceOf[js.Any], failureReason = failureReason.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], idleSessionTtlInSeconds = idleSessionTtlInSeconds.asInstanceOf[js.Any], lastUpdatedDate = lastUpdatedDate.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nluIntentConfidenceThreshold = nluIntentConfidenceThreshold.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], voiceId = voiceId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBotResult]
    }
    
    @scala.inline
    implicit class GetBotResultMutableBuilder[Self <: GetBotResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChecksum(value: String): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildDirected(value: Boolean): Self = StObject.set(x, "childDirected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedDate(value: String): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetectSentiment(value: Boolean): Self = StObject.set(x, "detectSentiment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableModelImprovements(value: Boolean): Self = StObject.set(x, "enableModelImprovements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailureReason(value: String): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdleSessionTtlInSeconds(value: Double): Self = StObject.set(x, "idleSessionTtlInSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastUpdatedDate(value: String): Self = StObject.set(x, "lastUpdatedDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNluIntentConfidenceThreshold(value: Double): Self = StObject.set(x, "nluIntentConfidenceThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      @scala.inline
      def setVoiceId(value: String): Self = StObject.set(x, "voiceId", value.asInstanceOf[js.Any])
    }
  }
}
