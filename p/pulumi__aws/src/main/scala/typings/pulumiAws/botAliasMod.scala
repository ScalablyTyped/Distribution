package typings.pulumiAws

import typings.pulumiAws.outputMod.lex.BotAliasConversationLogs
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object botAliasMod {
  
  @JSImport("@pulumi/aws/lex/botAlias", "BotAlias")
  @js.native
  class BotAlias protected () extends CustomResource {
    /**
      * Create a BotAlias resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: BotAliasArgs) = this()
    def this(name: String, args: BotAliasArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the bot alias.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The name of the bot.
      */
    val botName: Output_[String] = js.native
    
    /**
      * The name of the bot.
      */
    val botVersion: Output_[String] = js.native
    
    /**
      * Checksum of the bot alias.
      */
    val checksum: Output_[String] = js.native
    
    /**
      * The settings that determine how Amazon Lex uses conversation logs for the alias. Attributes are documented under conversation_logs.
      */
    val conversationLogs: Output_[js.UndefOr[BotAliasConversationLogs]] = js.native
    
    /**
      * The date that the bot alias was created.
      */
    val createdDate: Output_[String] = js.native
    
    /**
      * A description of the alias. Must be less than or equal to 200 characters in length.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The date that the bot alias was updated. When you create a resource, the creation date and the last updated date are the same.
      */
    val lastUpdatedDate: Output_[String] = js.native
    
    /**
      * The name of the alias. The name is not case sensitive. Must be less than or equal to 100 characters in length.
      */
    val name: Output_[String] = js.native
  }
  /* static members */
  object BotAlias {
    
    @JSImport("@pulumi/aws/lex/botAlias", "BotAlias")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing BotAlias resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): BotAlias = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[BotAlias]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): BotAlias = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[BotAlias]
    inline def get(name: String, id: Input[ID], state: BotAliasState): BotAlias = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[BotAlias]
    inline def get(name: String, id: Input[ID], state: BotAliasState, opts: CustomResourceOptions): BotAlias = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[BotAlias]
    
    /**
      * Returns true if the given object is an instance of BotAlias.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lex/botAlias.BotAlias */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/lex/botAlias.BotAlias */ Boolean]
  }
  
  trait BotAliasArgs extends StObject {
    
    /**
      * The name of the bot.
      */
    val botName: Input[String]
    
    /**
      * The name of the bot.
      */
    val botVersion: Input[String]
    
    /**
      * The settings that determine how Amazon Lex uses conversation logs for the alias. Attributes are documented under conversation_logs.
      */
    val conversationLogs: js.UndefOr[Input[typings.pulumiAws.inputMod.lex.BotAliasConversationLogs]] = js.undefined
    
    /**
      * A description of the alias. Must be less than or equal to 200 characters in length.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the alias. The name is not case sensitive. Must be less than or equal to 100 characters in length.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
  }
  object BotAliasArgs {
    
    inline def apply(botName: Input[String], botVersion: Input[String]): BotAliasArgs = {
      val __obj = js.Dynamic.literal(botName = botName.asInstanceOf[js.Any], botVersion = botVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[BotAliasArgs]
    }
    
    extension [Self <: BotAliasArgs](x: Self) {
      
      inline def setBotName(value: Input[String]): Self = StObject.set(x, "botName", value.asInstanceOf[js.Any])
      
      inline def setBotVersion(value: Input[String]): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
      
      inline def setConversationLogs(value: Input[typings.pulumiAws.inputMod.lex.BotAliasConversationLogs]): Self = StObject.set(x, "conversationLogs", value.asInstanceOf[js.Any])
      
      inline def setConversationLogsUndefined: Self = StObject.set(x, "conversationLogs", js.undefined)
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait BotAliasState extends StObject {
    
    /**
      * The ARN of the bot alias.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the bot.
      */
    val botName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the bot.
      */
    val botVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Checksum of the bot alias.
      */
    val checksum: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The settings that determine how Amazon Lex uses conversation logs for the alias. Attributes are documented under conversation_logs.
      */
    val conversationLogs: js.UndefOr[Input[typings.pulumiAws.inputMod.lex.BotAliasConversationLogs]] = js.undefined
    
    /**
      * The date that the bot alias was created.
      */
    val createdDate: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A description of the alias. Must be less than or equal to 200 characters in length.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The date that the bot alias was updated. When you create a resource, the creation date and the last updated date are the same.
      */
    val lastUpdatedDate: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the alias. The name is not case sensitive. Must be less than or equal to 100 characters in length.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
  }
  object BotAliasState {
    
    inline def apply(): BotAliasState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BotAliasState]
    }
    
    extension [Self <: BotAliasState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setBotName(value: Input[String]): Self = StObject.set(x, "botName", value.asInstanceOf[js.Any])
      
      inline def setBotNameUndefined: Self = StObject.set(x, "botName", js.undefined)
      
      inline def setBotVersion(value: Input[String]): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
      
      inline def setBotVersionUndefined: Self = StObject.set(x, "botVersion", js.undefined)
      
      inline def setChecksum(value: Input[String]): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
      
      inline def setChecksumUndefined: Self = StObject.set(x, "checksum", js.undefined)
      
      inline def setConversationLogs(value: Input[typings.pulumiAws.inputMod.lex.BotAliasConversationLogs]): Self = StObject.set(x, "conversationLogs", value.asInstanceOf[js.Any])
      
      inline def setConversationLogsUndefined: Self = StObject.set(x, "conversationLogs", js.undefined)
      
      inline def setCreatedDate(value: Input[String]): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
      
      inline def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setLastUpdatedDate(value: Input[String]): Self = StObject.set(x, "lastUpdatedDate", value.asInstanceOf[js.Any])
      
      inline def setLastUpdatedDateUndefined: Self = StObject.set(x, "lastUpdatedDate", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
