package typings.storybookAddonJsx

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.storybookAddonJsx.mod.AddWithJSXFunc
import typings.storybookAddonJsx.mod.AddonParameters
import typings.storybookAddonJsx.storybookAddonJsxStrings.centered
import typings.storybookAddonJsx.storybookAddonJsxStrings.fullscreen
import typings.storybookAddonJsx.storybookAddonJsxStrings.none
import typings.storybookAddonJsx.storybookAddonJsxStrings.padded
import typings.storybookAddons.typesMod.OptionsParameter
import typings.storybookAddons.typesMod.StoryApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AddWithJSX[StoryFnReturnType] extends StObject {
    
    var addWithJSX: AddWithJSXFunc[StoryFnReturnType]
  }
  object AddWithJSX {
    
    @scala.inline
    def apply[StoryFnReturnType](
      addWithJSX: (/* kind */ String, /* fn */ js.Function0[ReactNode], /* options */ js.UndefOr[AddonParameters]) => StoryApi[StoryFnReturnType]
    ): AddWithJSX[StoryFnReturnType] = {
      val __obj = js.Dynamic.literal(addWithJSX = js.Any.fromFunction3(addWithJSX))
      __obj.asInstanceOf[AddWithJSX[StoryFnReturnType]]
    }
    
    @scala.inline
    implicit class AddWithJSXMutableBuilder[Self <: AddWithJSX[?], StoryFnReturnType] (val x: Self & AddWithJSX[StoryFnReturnType]) extends AnyVal {
      
      @scala.inline
      def setAddWithJSX(
        value: (/* kind */ String, /* fn */ js.Function0[ReactNode], /* options */ js.UndefOr[AddonParameters]) => StoryApi[StoryFnReturnType]
      ): Self = StObject.set(x, "addWithJSX", js.Any.fromFunction3(value))
    }
  }
  
  /* Inlined @storybook/addons.@storybook/addons.Parameters & {  jsx :storybook-addon-jsx.storybook-addon-jsx.AddonParameters} */
  trait ParametersjsxAddonParamet
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var docsOnly: js.UndefOr[Boolean] = js.undefined
    
    var fileName: js.UndefOr[String] = js.undefined
    
    var jsx: AddonParameters
    
    /** The layout property defines basic styles added to the preview body where the story is rendered. If you pass 'none', no styles are applied. */
    var layout: js.UndefOr[centered | fullscreen | padded | none] = js.undefined
    
    var options: js.UndefOr[OptionsParameter] = js.undefined
  }
  object ParametersjsxAddonParamet {
    
    @scala.inline
    def apply(jsx: AddonParameters): ParametersjsxAddonParamet = {
      val __obj = js.Dynamic.literal(jsx = jsx.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParametersjsxAddonParamet]
    }
    
    @scala.inline
    implicit class ParametersjsxAddonParametMutableBuilder[Self <: ParametersjsxAddonParamet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDocsOnly(value: Boolean): Self = StObject.set(x, "docsOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocsOnlyUndefined: Self = StObject.set(x, "docsOnly", js.undefined)
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      @scala.inline
      def setJsx(value: AddonParameters): Self = StObject.set(x, "jsx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayout(value: centered | fullscreen | padded | none): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      @scala.inline
      def setOptions(value: OptionsParameter): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
}
