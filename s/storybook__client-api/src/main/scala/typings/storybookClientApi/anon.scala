package typings.storybookClientApi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Pick
import typings.storybookAddons.typesMod.Args
import typings.storybookAddons.typesMod.DecoratorFunction
import typings.storybookAddons.typesMod.LegacyStoryFn
import typings.storybookAddons.typesMod.Parameters
import typings.storybookAddons.typesMod.StoryKind
import typings.storybookAddons.typesMod.StoryName
import typings.storybookClientApi.storyStoreMod.default
import typings.storybookClientApi.typesMod.ErrorLike
import typings.storybookClientApi.typesMod._StorySpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Channel extends StObject {
    
    var channel: typings.storybookChannels.mod.Channel = js.native
  }
  object Channel {
    
    @scala.inline
    def apply(channel: typings.storybookChannels.mod.Channel): Channel = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
      __obj.asInstanceOf[Channel]
    }
    
    @scala.inline
    implicit class ChannelMutableBuilder[Self <: Channel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannel(value: typings.storybookChannels.mod.Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Description extends StObject {
    
    var description: String = js.native
    
    var title: String = js.native
  }
  object Description {
    
    @scala.inline
    def apply(description: String, title: String): Description = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Description]
    }
    
    @scala.inline
    implicit class DescriptionMutableBuilder[Self <: Description] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Error extends StObject {
    
    var error: ErrorLike = js.native
    
    var globalParameters: Parameters = js.native
    
    var globals: Args = js.native
    
    var kindParameters: StringDictionary[Parameters] = js.native
    
    var v: Double = js.native
  }
  object Error {
    
    @scala.inline
    def apply(
      error: ErrorLike,
      globalParameters: Parameters,
      globals: Args,
      kindParameters: StringDictionary[Parameters],
      v: Double
    ): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], globalParameters = globalParameters.asInstanceOf[js.Any], globals = globals.asInstanceOf[js.Any], kindParameters = kindParameters.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: ErrorLike): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalParameters(value: Parameters): Self = StObject.set(x, "globalParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobals(value: Args): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindParameters(value: StringDictionary[Parameters]): Self = StObject.set(x, "kindParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GlobalParameters extends StObject {
    
    var globalParameters: Pick[Parameters, String] = js.native
    
    var kindParameters: StringDictionary[Pick[Parameters, String]] = js.native
    
    var v: Double = js.native
  }
  object GlobalParameters {
    
    @scala.inline
    def apply(
      globalParameters: Pick[Parameters, String],
      kindParameters: StringDictionary[Pick[Parameters, String]],
      v: Double
    ): GlobalParameters = {
      val __obj = js.Dynamic.literal(globalParameters = globalParameters.asInstanceOf[js.Any], kindParameters = kindParameters.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalParameters]
    }
    
    @scala.inline
    implicit class GlobalParametersMutableBuilder[Self <: GlobalParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlobalParameters(value: Pick[Parameters, String]): Self = StObject.set(x, "globalParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindParameters(value: StringDictionary[Pick[Parameters, String]]): Self = StObject.set(x, "kindParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Kind extends _StorySpecifier {
    
    var kind: StoryKind = js.native
    
    var name: StoryName = js.native
  }
  object Kind {
    
    @scala.inline
    def apply(kind: StoryKind, name: StoryName): Kind = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Kind]
    }
    
    @scala.inline
    implicit class KindMutableBuilder[Self <: Kind] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKind(value: StoryKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: StoryName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @storybook/client-api.@storybook/client-api/dist/story_store.StoryOptions & {  normalizeParameters :boolean | undefined} */
  @js.native
  trait StoryOptionsnormalizePara extends StObject {
    
    var includeDocsOnly: js.UndefOr[Boolean] = js.native
    
    var normalizeParameters: js.UndefOr[Boolean] = js.native
  }
  object StoryOptionsnormalizePara {
    
    @scala.inline
    def apply(): StoryOptionsnormalizePara = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StoryOptionsnormalizePara]
    }
    
    @scala.inline
    implicit class StoryOptionsnormalizeParaMutableBuilder[Self <: StoryOptionsnormalizePara] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncludeDocsOnly(value: Boolean): Self = StObject.set(x, "includeDocsOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeDocsOnlyUndefined: Self = StObject.set(x, "includeDocsOnly", js.undefined)
      
      @scala.inline
      def setNormalizeParameters(value: Boolean): Self = StObject.set(x, "normalizeParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalizeParametersUndefined: Self = StObject.set(x, "normalizeParameters", js.undefined)
    }
  }
  
  @js.native
  trait StoryStore extends StObject {
    
    var storyStore: default = js.native
  }
  object StoryStore {
    
    @scala.inline
    def apply(storyStore: default): StoryStore = {
      val __obj = js.Dynamic.literal(storyStore = storyStore.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoryStore]
    }
    
    @scala.inline
    implicit class StoryStoreMutableBuilder[Self <: StoryStore] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStoryStore(value: default): Self = StObject.set(x, "storyStore", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {applyDecorators (fn : @storybook/addons.@storybook/addons.LegacyStoryFn<unknown>, decorators : std.Array<@storybook/client-api.@storybook/client-api/dist/types.DecoratorFunction<unknown>>): any} & @storybook/client-api.@storybook/client-api/dist/story_store.AllowUnsafeOption */
  @js.native
  trait applyDecoratorsfnLegacySt extends StObject {
    
    var allowUnsafe: js.UndefOr[Boolean] = js.native
    
    def applyDecorators(fn: LegacyStoryFn[_], decorators: js.Array[DecoratorFunction[_]]): js.Any = js.native
  }
  object applyDecoratorsfnLegacySt {
    
    @scala.inline
    def apply(applyDecorators: (LegacyStoryFn[_], js.Array[DecoratorFunction[_]]) => js.Any): applyDecoratorsfnLegacySt = {
      val __obj = js.Dynamic.literal(applyDecorators = js.Any.fromFunction2(applyDecorators))
      __obj.asInstanceOf[applyDecoratorsfnLegacySt]
    }
    
    @scala.inline
    implicit class applyDecoratorsfnLegacyStMutableBuilder[Self <: applyDecoratorsfnLegacySt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowUnsafe(value: Boolean): Self = StObject.set(x, "allowUnsafe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowUnsafeUndefined: Self = StObject.set(x, "allowUnsafe", js.undefined)
      
      @scala.inline
      def setApplyDecorators(value: (LegacyStoryFn[_], js.Array[DecoratorFunction[_]]) => js.Any): Self = StObject.set(x, "applyDecorators", js.Any.fromFunction2(value))
    }
  }
}
