package typings.pulumiAws

import typings.pulumiAws.botAliasMod.BotAliasArgs
import typings.pulumiAws.botAliasMod.BotAliasState
import typings.pulumiAws.botMod.BotArgs
import typings.pulumiAws.botMod.BotState
import typings.pulumiAws.getBotAliasMod.GetBotAliasArgs
import typings.pulumiAws.getBotAliasMod.GetBotAliasResult
import typings.pulumiAws.getBotMod.GetBotArgs
import typings.pulumiAws.getBotMod.GetBotResult
import typings.pulumiAws.getIntentMod.GetIntentArgs
import typings.pulumiAws.getIntentMod.GetIntentResult
import typings.pulumiAws.getSlotTypeMod.GetSlotTypeArgs
import typings.pulumiAws.getSlotTypeMod.GetSlotTypeResult
import typings.pulumiAws.intentMod.IntentArgs
import typings.pulumiAws.intentMod.IntentState
import typings.pulumiAws.slotTypeMod.SlotTypeArgs
import typings.pulumiAws.slotTypeMod.SlotTypeState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lexMod {
  
  @JSImport("@pulumi/aws/lex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws/lex", "Bot")
  @js.native
  class Bot protected ()
    extends typings.pulumiAws.botMod.Bot {
    /**
      * Create a Bot resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: BotArgs) = this()
    def this(name: String, args: BotArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Bot {
    
    @JSImport("@pulumi/aws/lex", "Bot")
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
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.botMod.Bot = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.botMod.Bot]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.botMod.Bot = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.botMod.Bot]
    @scala.inline
    def get(name: String, id: Input[ID], state: BotState): typings.pulumiAws.botMod.Bot = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.botMod.Bot]
    @scala.inline
    def get(name: String, id: Input[ID], state: BotState, opts: CustomResourceOptions): typings.pulumiAws.botMod.Bot = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.botMod.Bot]
    
    /**
      * Returns true if the given object is an instance of Bot.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lex/bot.Bot */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/lex/bot.Bot */ Boolean]
  }
  
  @JSImport("@pulumi/aws/lex", "BotAlias")
  @js.native
  class BotAlias protected ()
    extends typings.pulumiAws.botAliasMod.BotAlias {
    /**
      * Create a BotAlias resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: BotAliasArgs) = this()
    def this(name: String, args: BotAliasArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object BotAlias {
    
    @JSImport("@pulumi/aws/lex", "BotAlias")
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
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.botAliasMod.BotAlias = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.botAliasMod.BotAlias]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.botAliasMod.BotAlias = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.botAliasMod.BotAlias]
    @scala.inline
    def get(name: String, id: Input[ID], state: BotAliasState): typings.pulumiAws.botAliasMod.BotAlias = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.botAliasMod.BotAlias]
    @scala.inline
    def get(name: String, id: Input[ID], state: BotAliasState, opts: CustomResourceOptions): typings.pulumiAws.botAliasMod.BotAlias = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.botAliasMod.BotAlias]
    
    /**
      * Returns true if the given object is an instance of BotAlias.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lex/botAlias.BotAlias */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/lex/botAlias.BotAlias */ Boolean]
  }
  
  @JSImport("@pulumi/aws/lex", "Intent")
  @js.native
  class Intent protected ()
    extends typings.pulumiAws.intentMod.Intent {
    /**
      * Create a Intent resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: IntentArgs) = this()
    def this(name: String, args: IntentArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Intent {
    
    @JSImport("@pulumi/aws/lex", "Intent")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Intent resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.intentMod.Intent = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.intentMod.Intent]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.intentMod.Intent = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.intentMod.Intent]
    @scala.inline
    def get(name: String, id: Input[ID], state: IntentState): typings.pulumiAws.intentMod.Intent = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.intentMod.Intent]
    @scala.inline
    def get(name: String, id: Input[ID], state: IntentState, opts: CustomResourceOptions): typings.pulumiAws.intentMod.Intent = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.intentMod.Intent]
    
    /**
      * Returns true if the given object is an instance of Intent.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lex/intent.Intent */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/lex/intent.Intent */ Boolean]
  }
  
  @JSImport("@pulumi/aws/lex", "SlotType")
  @js.native
  class SlotType protected ()
    extends typings.pulumiAws.slotTypeMod.SlotType {
    /**
      * Create a SlotType resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SlotTypeArgs) = this()
    def this(name: String, args: SlotTypeArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object SlotType {
    
    @JSImport("@pulumi/aws/lex", "SlotType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing SlotType resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.slotTypeMod.SlotType = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.slotTypeMod.SlotType]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.slotTypeMod.SlotType = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.slotTypeMod.SlotType]
    @scala.inline
    def get(name: String, id: Input[ID], state: SlotTypeState): typings.pulumiAws.slotTypeMod.SlotType = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.slotTypeMod.SlotType]
    @scala.inline
    def get(name: String, id: Input[ID], state: SlotTypeState, opts: CustomResourceOptions): typings.pulumiAws.slotTypeMod.SlotType = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.slotTypeMod.SlotType]
    
    /**
      * Returns true if the given object is an instance of SlotType.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lex/slotType.SlotType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/lex/slotType.SlotType */ Boolean]
  }
  
  @scala.inline
  def getBot(args: GetBotArgs): js.Promise[GetBotResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBot")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetBotResult]]
  @scala.inline
  def getBot(args: GetBotArgs, opts: InvokeOptions): js.Promise[GetBotResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBot")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetBotResult]]
  
  @scala.inline
  def getBotAlias(args: GetBotAliasArgs): js.Promise[GetBotAliasResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBotAlias")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetBotAliasResult]]
  @scala.inline
  def getBotAlias(args: GetBotAliasArgs, opts: InvokeOptions): js.Promise[GetBotAliasResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBotAlias")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetBotAliasResult]]
  
  @scala.inline
  def getIntent(args: GetIntentArgs): js.Promise[GetIntentResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIntent")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetIntentResult]]
  @scala.inline
  def getIntent(args: GetIntentArgs, opts: InvokeOptions): js.Promise[GetIntentResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getIntent")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetIntentResult]]
  
  @scala.inline
  def getSlotType(args: GetSlotTypeArgs): js.Promise[GetSlotTypeResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSlotType")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetSlotTypeResult]]
  @scala.inline
  def getSlotType(args: GetSlotTypeArgs, opts: InvokeOptions): js.Promise[GetSlotTypeResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSlotType")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetSlotTypeResult]]
}
