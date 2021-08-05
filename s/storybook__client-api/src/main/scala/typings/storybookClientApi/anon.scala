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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Channel extends StObject {
    
    var channel: typings.storybookChannels.mod.Channel
  }
  object Channel {
    
    inline def apply(channel: typings.storybookChannels.mod.Channel): Channel = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
      __obj.asInstanceOf[Channel]
    }
    
    extension [Self <: Channel](x: Self) {
      
      inline def setChannel(value: typings.storybookChannels.mod.Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    }
  }
  
  trait Description extends StObject {
    
    var description: String
    
    var title: String
  }
  object Description {
    
    inline def apply(description: String, title: String): Description = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Description]
    }
    
    extension [Self <: Description](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait Error extends StObject {
    
    var error: ErrorLike
    
    var globalParameters: Parameters
    
    var globals: Args
    
    var kindParameters: StringDictionary[Parameters]
    
    var v: Double
  }
  object Error {
    
    inline def apply(
      error: ErrorLike,
      globalParameters: Parameters,
      globals: Args,
      kindParameters: StringDictionary[Parameters],
      v: Double
    ): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], globalParameters = globalParameters.asInstanceOf[js.Any], globals = globals.asInstanceOf[js.Any], kindParameters = kindParameters.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setError(value: ErrorLike): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setGlobalParameters(value: Parameters): Self = StObject.set(x, "globalParameters", value.asInstanceOf[js.Any])
      
      inline def setGlobals(value: Args): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
      
      inline def setKindParameters(value: StringDictionary[Parameters]): Self = StObject.set(x, "kindParameters", value.asInstanceOf[js.Any])
      
      inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  trait GlobalParameters extends StObject {
    
    var globalParameters: Pick[Parameters, String]
    
    var kindParameters: StringDictionary[Pick[Parameters, String]]
    
    var v: Double
  }
  object GlobalParameters {
    
    inline def apply(
      globalParameters: Pick[Parameters, String],
      kindParameters: StringDictionary[Pick[Parameters, String]],
      v: Double
    ): GlobalParameters = {
      val __obj = js.Dynamic.literal(globalParameters = globalParameters.asInstanceOf[js.Any], kindParameters = kindParameters.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalParameters]
    }
    
    extension [Self <: GlobalParameters](x: Self) {
      
      inline def setGlobalParameters(value: Pick[Parameters, String]): Self = StObject.set(x, "globalParameters", value.asInstanceOf[js.Any])
      
      inline def setKindParameters(value: StringDictionary[Pick[Parameters, String]]): Self = StObject.set(x, "kindParameters", value.asInstanceOf[js.Any])
      
      inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  trait Kind
    extends StObject
       with _StorySpecifier {
    
    var kind: StoryKind
    
    var name: StoryName
  }
  object Kind {
    
    inline def apply(kind: StoryKind, name: StoryName): Kind = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Kind]
    }
    
    extension [Self <: Kind](x: Self) {
      
      inline def setKind(value: StoryKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: StoryName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @storybook/client-api.@storybook/client-api/dist/story_store.StoryOptions & {  normalizeParameters :boolean | undefined} */
  trait StoryOptionsnormalizePara extends StObject {
    
    var includeDocsOnly: js.UndefOr[Boolean] = js.undefined
    
    var normalizeParameters: js.UndefOr[Boolean] = js.undefined
  }
  object StoryOptionsnormalizePara {
    
    inline def apply(): StoryOptionsnormalizePara = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StoryOptionsnormalizePara]
    }
    
    extension [Self <: StoryOptionsnormalizePara](x: Self) {
      
      inline def setIncludeDocsOnly(value: Boolean): Self = StObject.set(x, "includeDocsOnly", value.asInstanceOf[js.Any])
      
      inline def setIncludeDocsOnlyUndefined: Self = StObject.set(x, "includeDocsOnly", js.undefined)
      
      inline def setNormalizeParameters(value: Boolean): Self = StObject.set(x, "normalizeParameters", value.asInstanceOf[js.Any])
      
      inline def setNormalizeParametersUndefined: Self = StObject.set(x, "normalizeParameters", js.undefined)
    }
  }
  
  trait StoryStore extends StObject {
    
    var storyStore: default
  }
  object StoryStore {
    
    inline def apply(storyStore: default): StoryStore = {
      val __obj = js.Dynamic.literal(storyStore = storyStore.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoryStore]
    }
    
    extension [Self <: StoryStore](x: Self) {
      
      inline def setStoryStore(value: default): Self = StObject.set(x, "storyStore", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {applyDecorators (fn : @storybook/addons.@storybook/addons.LegacyStoryFn<unknown>, decorators : std.Array<@storybook/client-api.@storybook/client-api/dist/types.DecoratorFunction<unknown>>): any} & @storybook/client-api.@storybook/client-api/dist/story_store.AllowUnsafeOption */
  trait applyDecoratorsfnLegacySt extends StObject {
    
    var allowUnsafe: js.UndefOr[Boolean] = js.undefined
    
    def applyDecorators(fn: LegacyStoryFn[js.Any], decorators: js.Array[DecoratorFunction[js.Any]]): js.Any
  }
  object applyDecoratorsfnLegacySt {
    
    inline def apply(applyDecorators: (LegacyStoryFn[js.Any], js.Array[DecoratorFunction[js.Any]]) => js.Any): applyDecoratorsfnLegacySt = {
      val __obj = js.Dynamic.literal(applyDecorators = js.Any.fromFunction2(applyDecorators))
      __obj.asInstanceOf[applyDecoratorsfnLegacySt]
    }
    
    extension [Self <: applyDecoratorsfnLegacySt](x: Self) {
      
      inline def setAllowUnsafe(value: Boolean): Self = StObject.set(x, "allowUnsafe", value.asInstanceOf[js.Any])
      
      inline def setAllowUnsafeUndefined: Self = StObject.set(x, "allowUnsafe", js.undefined)
      
      inline def setApplyDecorators(value: (LegacyStoryFn[js.Any], js.Array[DecoratorFunction[js.Any]]) => js.Any): Self = StObject.set(x, "applyDecorators", js.Any.fromFunction2(value))
    }
  }
}
