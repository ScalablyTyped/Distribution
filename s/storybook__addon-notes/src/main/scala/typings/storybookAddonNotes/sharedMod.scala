package typings.storybookAddonNotes

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sharedMod {
  
  @JSImport("@storybook/addon-notes/dist/shared", "ADDON_ID")
  @js.native
  val ADDON_ID: /* "storybookjs/notes" */ String = js.native
  
  @JSImport("@storybook/addon-notes/dist/shared", "PANEL_ID")
  @js.native
  val PANEL_ID: String = js.native
  
  @JSImport("@storybook/addon-notes/dist/shared", "PARAM_KEY")
  @js.native
  val PARAM_KEY: /* "notes" */ String = js.native
  
  @js.native
  trait DisabledParameter extends _Parameters {
    
    var disable: Boolean = js.native
  }
  object DisabledParameter {
    
    @scala.inline
    def apply(disable: Boolean): DisabledParameter = {
      val __obj = js.Dynamic.literal(disable = disable.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisabledParameter]
    }
    
    @scala.inline
    implicit class DisabledParameterMutableBuilder[Self <: DisabledParameter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MarkdownParameter extends _Parameters {
    
    var markdown: String = js.native
  }
  object MarkdownParameter {
    
    @scala.inline
    def apply(markdown: String): MarkdownParameter = {
      val __obj = js.Dynamic.literal(markdown = markdown.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarkdownParameter]
    }
    
    @scala.inline
    implicit class MarkdownParameterMutableBuilder[Self <: MarkdownParameter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMarkdown(value: String): Self = StObject.set(x, "markdown", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.storybookAddonNotes.sharedMod.TextParameter
    - typings.storybookAddonNotes.sharedMod.MarkdownParameter
    - typings.storybookAddonNotes.sharedMod.DisabledParameter
    - typings.storybookAddonNotes.sharedMod.TabsParameter
  */
  type Parameters = _Parameters | String | TabsParameter
  
  type TabsParameter = Record[String, String]
  
  @js.native
  trait TextParameter extends _Parameters {
    
    var text: String = js.native
  }
  object TextParameter {
    
    @scala.inline
    def apply(text: String): TextParameter = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextParameter]
    }
    
    @scala.inline
    implicit class TextParameterMutableBuilder[Self <: TextParameter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait _Parameters extends StObject
  object _Parameters {
    
    @scala.inline
    def DisabledParameter(disable: Boolean): typings.storybookAddonNotes.sharedMod.DisabledParameter = {
      val __obj = js.Dynamic.literal(disable = disable.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.storybookAddonNotes.sharedMod.DisabledParameter]
    }
    
    @scala.inline
    def MarkdownParameter(markdown: String): typings.storybookAddonNotes.sharedMod.MarkdownParameter = {
      val __obj = js.Dynamic.literal(markdown = markdown.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.storybookAddonNotes.sharedMod.MarkdownParameter]
    }
    
    @scala.inline
    def TextParameter(text: String): typings.storybookAddonNotes.sharedMod.TextParameter = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.storybookAddonNotes.sharedMod.TextParameter]
    }
  }
}
