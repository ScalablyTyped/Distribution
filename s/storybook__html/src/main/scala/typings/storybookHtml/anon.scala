package typings.storybookHtml

import typings.react.mod.global.JSX.Element
import typings.storybookDocsTools.distTs3Dot9SharedMod.SourceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait InlineStories extends StObject {
    
    var inlineStories: Boolean
    
    var prepareForInline: js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PartialStoryFn<any> */ /* storyFn */ Any, 
        Element
      ]
    
    var source: Language
  }
  object InlineStories {
    
    inline def apply(
      inlineStories: Boolean,
      prepareForInline: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PartialStoryFn<any> */ /* storyFn */ Any => Element,
      source: Language
    ): InlineStories = {
      val __obj = js.Dynamic.literal(inlineStories = inlineStories.asInstanceOf[js.Any], prepareForInline = js.Any.fromFunction1(prepareForInline), source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[InlineStories]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InlineStories] (val x: Self) extends AnyVal {
      
      inline def setInlineStories(value: Boolean): Self = StObject.set(x, "inlineStories", value.asInstanceOf[js.Any])
      
      inline def setPrepareForInline(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PartialStoryFn<any> */ /* storyFn */ Any => Element
      ): Self = StObject.set(x, "prepareForInline", js.Any.fromFunction1(value))
      
      inline def setSource(value: Language): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait Language extends StObject {
    
    var language: String
    
    var `type`: SourceType
  }
  object Language {
    
    inline def apply(language: String, `type`: SourceType): Language = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Language]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Language] (val x: Self) extends AnyVal {
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setType(value: SourceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
