package typings.storybookReact

import typings.std.Parameters
import typings.std.Partial
import typings.storybookDocsTools.argTypesTypesMod.Component
import typings.storybookDocsTools.docgenTypesMod.ArgTypesExtractor
import typings.storybookDocsTools.propDefMod.PropDef
import typings.storybookDocsTools.propDefMod.PropDefaultValue
import typings.storybookReact.createFromRawDefaultPropMod.TypeResolver
import typings.storybookReact.previewTypesMod.StoryFnReactReturnType
import typings.storybookStore.typesMod.ComposedStoryPlayFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call[TArgs] extends StObject {
    
    def apply(extraArgs: Partial[TArgs]): StoryFnReactReturnType = js.native
    
    var args: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any = js.native
    
    var parameters: Parameters[js.Function1[/* args */ Any, Any]] = js.native
    
    var play: ComposedStoryPlayFn = js.native
    
    var storyName: String = js.native
  }
  
  trait ExtractArgTypes extends StObject {
    
    var extractArgTypes: ArgTypesExtractor
    
    var extractComponentDescription: FnCall
    
    var inlineStories: Boolean
    
    def prepareForInline(
      storyFn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PartialStoryFn<ReactFramework> */ Any
    ): StoryFnReactReturnType
  }
  object ExtractArgTypes {
    
    inline def apply(
      extractArgTypes: /* component */ Component => (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StrictArgTypes */ Any) | Null,
      extractComponentDescription: FnCall,
      inlineStories: Boolean,
      prepareForInline: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PartialStoryFn<ReactFramework> */ Any => StoryFnReactReturnType
    ): ExtractArgTypes = {
      val __obj = js.Dynamic.literal(extractArgTypes = js.Any.fromFunction1(extractArgTypes), extractComponentDescription = extractComponentDescription.asInstanceOf[js.Any], inlineStories = inlineStories.asInstanceOf[js.Any], prepareForInline = js.Any.fromFunction1(prepareForInline))
      __obj.asInstanceOf[ExtractArgTypes]
    }
    
    extension [Self <: ExtractArgTypes](x: Self) {
      
      inline def setExtractArgTypes(
        value: /* component */ Component => (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StrictArgTypes */ Any) | Null
      ): Self = StObject.set(x, "extractArgTypes", js.Any.fromFunction1(value))
      
      inline def setExtractComponentDescription(value: FnCall): Self = StObject.set(x, "extractComponentDescription", value.asInstanceOf[js.Any])
      
      inline def setInlineStories(value: Boolean): Self = StObject.set(x, "inlineStories", value.asInstanceOf[js.Any])
      
      inline def setPrepareForInline(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PartialStoryFn<ReactFramework> */ Any => StoryFnReactReturnType
      ): Self = StObject.set(x, "prepareForInline", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(): String = js.native
    def apply(component: Component): String = js.native
  }
  
  /* Inlined std.Partial<@storybook/react.@storybook/react/dist/ts3.9/client/docs/lib/defaultValues/createFromRawDefaultProp.TypeResolvers> */
  trait PartialTypeResolvers extends StObject {
    
    var default: js.UndefOr[TypeResolver] = js.undefined
    
    var function: js.UndefOr[TypeResolver] = js.undefined
    
    var `object`: js.UndefOr[TypeResolver] = js.undefined
    
    var string: js.UndefOr[TypeResolver] = js.undefined
  }
  object PartialTypeResolvers {
    
    inline def apply(): PartialTypeResolvers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialTypeResolvers]
    }
    
    extension [Self <: PartialTypeResolvers](x: Self) {
      
      inline def setDefault(value: (/* rawDefaultProp */ Any, /* propDef */ PropDef) => PropDefaultValue): Self = StObject.set(x, "default", js.Any.fromFunction2(value))
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setFunction(value: (/* rawDefaultProp */ Any, /* propDef */ PropDef) => PropDefaultValue): Self = StObject.set(x, "function", js.Any.fromFunction2(value))
      
      inline def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
      
      inline def setObject(value: (/* rawDefaultProp */ Any, /* propDef */ PropDef) => PropDefaultValue): Self = StObject.set(x, "object", js.Any.fromFunction2(value))
      
      inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      inline def setString(value: (/* rawDefaultProp */ Any, /* propDef */ PropDef) => PropDefaultValue): Self = StObject.set(x, "string", js.Any.fromFunction2(value))
      
      inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
    }
  }
}
