package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getIntentMod {
  
  @JSImport("@pulumi/aws/lex/getIntent", "getIntent")
  @js.native
  def getIntent(args: GetIntentArgs): js.Promise[GetIntentResult] = js.native
  @JSImport("@pulumi/aws/lex/getIntent", "getIntent")
  @js.native
  def getIntent(args: GetIntentArgs, opts: InvokeOptions): js.Promise[GetIntentResult] = js.native
  
  @js.native
  trait GetIntentArgs extends StObject {
    
    /**
      * The name of the intent. The name is case sensitive.
      */
    val name: String = js.native
    
    /**
      * The version of the intent.
      */
    val version: js.UndefOr[String] = js.native
  }
  object GetIntentArgs {
    
    @scala.inline
    def apply(name: String): GetIntentArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetIntentArgs]
    }
    
    @scala.inline
    implicit class GetIntentArgsMutableBuilder[Self <: GetIntentArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait GetIntentResult extends StObject {
    
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
    implicit class GetIntentResultMutableBuilder[Self <: GetIntentResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChecksum(value: String): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedDate(value: String): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastUpdatedDate(value: String): Self = StObject.set(x, "lastUpdatedDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentIntentSignature(value: String): Self = StObject.set(x, "parentIntentSignature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
