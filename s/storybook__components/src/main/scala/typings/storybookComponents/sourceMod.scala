package typings.storybookComponents

import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceMod {
  
  /**
    * Syntax-highlighted source code for a component (or anything!)
    */
  @JSImport("@storybook/components/dist/blocks/Source", "Source")
  @js.native
  val Source: FunctionComponent[SourceProps] = js.native
  
  @js.native
  sealed trait SourceError extends StObject
  @JSImport("@storybook/components/dist/blocks/Source", "SourceError")
  @js.native
  object SourceError extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SourceError & String] = js.native
    
    @js.native
    sealed trait NO_STORY
      extends StObject
         with SourceError
    /* "There\\u2019s no story here." */ val NO_STORY: typings.storybookComponents.sourceMod.SourceError.NO_STORY & String = js.native
    
    @js.native
    sealed trait SOURCE_UNAVAILABLE
      extends StObject
         with SourceError
    /* "Oh no! The source is not available." */ val SOURCE_UNAVAILABLE: typings.storybookComponents.sourceMod.SourceError.SOURCE_UNAVAILABLE & String = js.native
  }
  
  trait SourceCodeProps extends StObject {
    
    var code: js.UndefOr[String] = js.undefined
    
    var dark: js.UndefOr[Boolean] = js.undefined
    
    var format: js.UndefOr[Boolean] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
  }
  object SourceCodeProps {
    
    inline def apply(): SourceCodeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SourceCodeProps]
    }
    
    extension [Self <: SourceCodeProps](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setDark(value: Boolean): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
      
      inline def setDarkUndefined: Self = StObject.set(x, "dark", js.undefined)
      
      inline def setFormat(value: Boolean): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    }
  }
  
  trait SourceErrorProps extends StObject {
    
    var error: js.UndefOr[SourceError] = js.undefined
  }
  object SourceErrorProps {
    
    inline def apply(): SourceErrorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SourceErrorProps]
    }
    
    extension [Self <: SourceErrorProps](x: Self) {
      
      inline def setError(value: SourceError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    }
  }
  
  trait SourceProps
    extends StObject
       with SourceErrorProps
       with SourceCodeProps
  object SourceProps {
    
    inline def apply(): SourceProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SourceProps]
    }
  }
}
