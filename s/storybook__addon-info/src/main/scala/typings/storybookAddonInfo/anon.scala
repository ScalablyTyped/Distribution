package typings.storybookAddonInfo

import org.scalablytyped.runtime.StringDictionary
import typings.storybookAddonInfo.mod.Options
import typings.storybookAddonInfo.storybookAddonInfoStrings.centered
import typings.storybookAddonInfo.storybookAddonInfoStrings.fullscreen
import typings.storybookAddonInfo.storybookAddonInfoStrings.none
import typings.storybookAddonInfo.storybookAddonInfoStrings.padded
import typings.storybookAddons.typesMod.OptionsParameter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait DefaultValue extends StObject {
    
    var defaultValue: js.Any = js.native
    
    var description: String = js.native
    
    var propType: js.Object | String = js.native
    
    var property: String = js.native
    
    // TODO: info about what this object is...
    var required: Boolean = js.native
  }
  object DefaultValue {
    
    @scala.inline
    def apply(
      defaultValue: js.Any,
      description: String,
      propType: js.Object | String,
      property: String,
      required: Boolean
    ): DefaultValue = {
      val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], propType = propType.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultValue]
    }
    
    @scala.inline
    implicit class DefaultValueMutableBuilder[Self <: DefaultValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropType(value: js.Object | String): Self = StObject.set(x, "propType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @storybook/addons.@storybook/addons.Parameters & {  info :@storybook/addon-info.@storybook/addon-info.Options} */
  @js.native
  trait ParametersinfoOptions
    extends /* key */ StringDictionary[js.Any] {
    
    var docsOnly: js.UndefOr[Boolean] = js.native
    
    var fileName: js.UndefOr[String] = js.native
    
    var info: Options = js.native
    
    /** The layout property defines basic styles added to the preview body where the story is rendered. If you pass 'none', no styles are applied. */
    var layout: js.UndefOr[centered | fullscreen | padded | none] = js.native
    
    var options: js.UndefOr[OptionsParameter] = js.native
  }
  object ParametersinfoOptions {
    
    @scala.inline
    def apply(info: Options): ParametersinfoOptions = {
      val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParametersinfoOptions]
    }
    
    @scala.inline
    implicit class ParametersinfoOptionsMutableBuilder[Self <: ParametersinfoOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDocsOnly(value: Boolean): Self = StObject.set(x, "docsOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocsOnlyUndefined: Self = StObject.set(x, "docsOnly", js.undefined)
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      @scala.inline
      def setInfo(value: Options): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
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
