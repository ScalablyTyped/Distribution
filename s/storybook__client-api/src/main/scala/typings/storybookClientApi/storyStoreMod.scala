package typings.storybookClientApi

import typings.std.Record
import typings.storybookAddons.typesMod.Args
import typings.storybookAddons.typesMod.Parameters
import typings.storybookAddons.typesMod.StoryKind
import typings.storybookClientApi.anon.Channel
import typings.storybookClientApi.anon.Error
import typings.storybookClientApi.anon.GlobalParameters
import typings.storybookClientApi.anon.StoryOptionsnormalizePara
import typings.storybookClientApi.anon.applyDecoratorsfnLegacySt
import typings.storybookClientApi.typesMod.AddStoryArgs
import typings.storybookClientApi.typesMod.ArgTypesEnhancer
import typings.storybookClientApi.typesMod.ErrorLike
import typings.storybookClientApi.typesMod.GetStorybookKind
import typings.storybookClientApi.typesMod.PublishedStoreItem
import typings.storybookClientApi.typesMod.StoreData
import typings.storybookClientApi.typesMod.StoreItem
import typings.storybookClientApi.typesMod.StoreSelection
import typings.storybookClientApi.typesMod.StoreSelectionSpecifier
import typings.storybookClientApi.typesMod.StoryMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storyStoreMod {
  
  @JSImport("@storybook/client-api/dist/story_store", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with StoryStore {
    def this(params: Channel) = this()
  }
  
  trait AllowUnsafeOption extends StObject {
    
    var allowUnsafe: js.UndefOr[Boolean] = js.undefined
  }
  object AllowUnsafeOption {
    
    @scala.inline
    def apply(): AllowUnsafeOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AllowUnsafeOption]
    }
    
    @scala.inline
    implicit class AllowUnsafeOptionMutableBuilder[Self <: AllowUnsafeOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowUnsafe(value: Boolean): Self = StObject.set(x, "allowUnsafe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowUnsafeUndefined: Self = StObject.set(x, "allowUnsafe", js.undefined)
    }
  }
  
  trait KindMetadata
    extends StObject
       with StoryMetadata {
    
    var order: Double
  }
  object KindMetadata {
    
    @scala.inline
    def apply(order: Double): KindMetadata = {
      val __obj = js.Dynamic.literal(order = order.asInstanceOf[js.Any])
      __obj.asInstanceOf[KindMetadata]
    }
    
    @scala.inline
    implicit class KindMetadataMutableBuilder[Self <: KindMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    }
  }
  
  trait StoryOptions extends StObject {
    
    var includeDocsOnly: js.UndefOr[Boolean] = js.undefined
  }
  object StoryOptions {
    
    @scala.inline
    def apply(): StoryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StoryOptions]
    }
    
    @scala.inline
    implicit class StoryOptionsMutableBuilder[Self <: StoryOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncludeDocsOnly(value: Boolean): Self = StObject.set(x, "includeDocsOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeDocsOnlyUndefined: Self = StObject.set(x, "includeDocsOnly", js.undefined)
    }
  }
  
  @js.native
  trait StoryStore extends StObject {
    
    var _argTypesEnhancers: js.Array[ArgTypesEnhancer] = js.native
    
    var _channel: typings.storybookChannels.mod.Channel = js.native
    
    var _configuring: Boolean = js.native
    
    var _error: js.UndefOr[ErrorLike] = js.native
    
    var _globalMetadata: StoryMetadata = js.native
    
    var _globals: Args = js.native
    
    var _kinds: Record[String, KindMetadata] = js.native
    
    var _selection: js.UndefOr[StoreSelection] = js.native
    
    var _selectionSpecifier: js.UndefOr[StoreSelectionSpecifier] = js.native
    
    var _stories: StoreData = js.native
    
    def addArgTypesEnhancer(argTypesEnhancer: ArgTypesEnhancer): Unit = js.native
    
    def addGlobalMetadata(hasParametersDecoratorsLoaders: StoryMetadata): Unit = js.native
    
    def addKindMetadata(kind: String, hasParametersDecoratorsLoaders: StoryMetadata): Unit = js.native
    
    def addStory(
      hasIdKindNameOriginalStoryParametersStoryDecoratorsStoryLoaders: AddStoryArgs,
      hasApplyDecoratorsAllowUnsafe: applyDecoratorsfnLegacySt
    ): Unit = js.native
    
    def cleanHooks(id: String): Unit = js.native
    
    def cleanHooksForKind(kind: String): Unit = js.native
    
    def clearError(): Unit = js.native
    
    def clearGlobalDecorators(): Unit = js.native
    
    def combineStoryParameters(parameters: Parameters, kind: StoryKind): Parameters = js.native
    
    def ensureKind(kind: String): Unit = js.native
    
    def extract(): js.Object = js.native
    def extract(options: StoryOptionsnormalizePara): js.Object = js.native
    
    def finishConfiguring(): Unit = js.native
    
    def fromId(id: String): PublishedStoreItem | Null = js.native
    
    def getDataForManager(): Error = js.native
    
    def getError(): js.UndefOr[ErrorLike] = js.native
    
    def getRawStory(kind: String, name: String): PublishedStoreItem = js.native
    
    def getSelection(): StoreSelection = js.native
    
    def getStoriesForKind(kind: String): js.Array[PublishedStoreItem] = js.native
    
    def getStoriesJsonData(): GlobalParameters = js.native
    
    def getStoryKinds(): js.Array[String] = js.native
    
    def getStorybook(): js.Array[GetStorybookKind] = js.native
    
    var mergeAdditionalDataToStory: js.Any = js.native
    
    def pushToManager(): Unit = js.native
    
    def raw(): js.Array[PublishedStoreItem] = js.native
    def raw(options: StoryOptions): js.Array[PublishedStoreItem] = js.native
    
    def remove(id: String): Unit = js.native
    def remove(id: String, hasAllowUnsafe: AllowUnsafeOption): Unit = js.native
    
    def removeStoryKind(kind: String): Unit = js.native
    def removeStoryKind(kind: String, hasAllowUnsafe: AllowUnsafeOption): Unit = js.native
    
    def resetStoryArgs(id: String): Unit = js.native
    def resetStoryArgs(id: String, argNames: js.Array[String]): Unit = js.native
    
    def setError(err: ErrorLike): Unit = js.native
    
    def setSelection(selection: StoreSelection): Unit = js.native
    
    def setSelectionSpecifier(selectionSpecifier: StoreSelectionSpecifier): Unit = js.native
    
    def setupListeners(): Unit = js.native
    
    def sortedStories(): js.Array[StoreItem] = js.native
    
    def startConfiguring(): Unit = js.native
    
    def storeGlobals(): Unit = js.native
    
    def updateGlobals(newGlobals: Args): Unit = js.native
    
    def updateStoryArgs(id: String, newArgs: Args): Unit = js.native
  }
}
