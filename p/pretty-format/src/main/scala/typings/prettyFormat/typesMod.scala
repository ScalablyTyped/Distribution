package typings.prettyFormat

import typings.prettyFormat.anon.Close
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait Colors extends StObject {
    
    var comment: Close = js.native
    
    var content: Close = js.native
    
    var prop: Close = js.native
    
    var tag: Close = js.native
    
    var value: Close = js.native
  }
  object Colors {
    
    @scala.inline
    def apply(comment: Close, content: Close, prop: Close, tag: Close, value: Close): Colors = {
      val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], prop = prop.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Colors]
    }
    
    @scala.inline
    implicit class ColorsMutableBuilder[Self <: Colors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComment(value: Close): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent(value: Close): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProp(value: Close): Self = StObject.set(x, "prop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag(value: Close): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Close): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Config extends StObject {
    
    var callToJSON: Boolean = js.native
    
    var colors: Colors = js.native
    
    var escapeRegex: Boolean = js.native
    
    var escapeString: Boolean = js.native
    
    var indent: String = js.native
    
    var maxDepth: Double = js.native
    
    var min: Boolean = js.native
    
    var plugins: Plugins = js.native
    
    var printFunctionName: Boolean = js.native
    
    var spacingInner: String = js.native
    
    var spacingOuter: String = js.native
  }
  object Config {
    
    @scala.inline
    def apply(
      callToJSON: Boolean,
      colors: Colors,
      escapeRegex: Boolean,
      escapeString: Boolean,
      indent: String,
      maxDepth: Double,
      min: Boolean,
      plugins: Plugins,
      printFunctionName: Boolean,
      spacingInner: String,
      spacingOuter: String
    ): Config = {
      val __obj = js.Dynamic.literal(callToJSON = callToJSON.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], escapeRegex = escapeRegex.asInstanceOf[js.Any], escapeString = escapeString.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], maxDepth = maxDepth.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], printFunctionName = printFunctionName.asInstanceOf[js.Any], spacingInner = spacingInner.asInstanceOf[js.Any], spacingOuter = spacingOuter.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallToJSON(value: Boolean): Self = StObject.set(x, "callToJSON", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColors(value: Colors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeRegex(value: Boolean): Self = StObject.set(x, "escapeRegex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeString(value: Boolean): Self = StObject.set(x, "escapeString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin(value: Boolean): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlugins(value: Plugins): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrintFunctionName(value: Boolean): Self = StObject.set(x, "printFunctionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacingInner(value: String): Self = StObject.set(x, "spacingInner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacingOuter(value: String): Self = StObject.set(x, "spacingOuter", value.asInstanceOf[js.Any])
    }
  }
  
  type Indent = js.Function1[/* arg0 */ String, String]
  
  @js.native
  trait NewPlugin extends Plugin {
    
    def serialize(`val`: js.Any, config: Config, indentation: String, depth: Double, refs: Refs, printer: Printer): String = js.native
    
    var test: Test = js.native
  }
  object NewPlugin {
    
    @scala.inline
    def apply(
      serialize: (js.Any, Config, String, Double, Refs, Printer) => String,
      test: /* arg0 */ js.Any => Boolean
    ): NewPlugin = {
      val __obj = js.Dynamic.literal(serialize = js.Any.fromFunction6(serialize), test = js.Any.fromFunction1(test))
      __obj.asInstanceOf[NewPlugin]
    }
    
    @scala.inline
    implicit class NewPluginMutableBuilder[Self <: NewPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSerialize(value: (js.Any, Config, String, Double, Refs, Printer) => String): Self = StObject.set(x, "serialize", js.Any.fromFunction6(value))
      
      @scala.inline
      def setTest(value: /* arg0 */ js.Any => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait OldPlugin extends Plugin {
    
    def print(`val`: js.Any, print: Print, indent: Indent, options: PluginOptions, colors: Colors): String = js.native
    
    var test: Test = js.native
  }
  object OldPlugin {
    
    @scala.inline
    def apply(
      print: (js.Any, Print, Indent, PluginOptions, Colors) => String,
      test: /* arg0 */ js.Any => Boolean
    ): OldPlugin = {
      val __obj = js.Dynamic.literal(print = js.Any.fromFunction5(print), test = js.Any.fromFunction1(test))
      __obj.asInstanceOf[OldPlugin]
    }
    
    @scala.inline
    implicit class OldPluginMutableBuilder[Self <: OldPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrint(value: (js.Any, Print, Indent, PluginOptions, Colors) => String): Self = StObject.set(x, "print", js.Any.fromFunction5(value))
      
      @scala.inline
      def setTest(value: /* arg0 */ js.Any => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var callToJSON: Boolean = js.native
    
    var escapeRegex: Boolean = js.native
    
    var escapeString: Boolean = js.native
    
    var highlight: Boolean = js.native
    
    var indent: Double = js.native
    
    var maxDepth: Double = js.native
    
    var min: Boolean = js.native
    
    var plugins: Plugins = js.native
    
    var printFunctionName: Boolean = js.native
    
    var theme: Theme = js.native
  }
  object Options {
    
    @scala.inline
    def apply(
      callToJSON: Boolean,
      escapeRegex: Boolean,
      escapeString: Boolean,
      highlight: Boolean,
      indent: Double,
      maxDepth: Double,
      min: Boolean,
      plugins: Plugins,
      printFunctionName: Boolean,
      theme: Theme
    ): Options = {
      val __obj = js.Dynamic.literal(callToJSON = callToJSON.asInstanceOf[js.Any], escapeRegex = escapeRegex.asInstanceOf[js.Any], escapeString = escapeString.asInstanceOf[js.Any], highlight = highlight.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], maxDepth = maxDepth.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], printFunctionName = printFunctionName.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallToJSON(value: Boolean): Self = StObject.set(x, "callToJSON", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeRegex(value: Boolean): Self = StObject.set(x, "escapeRegex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeString(value: Boolean): Self = StObject.set(x, "escapeString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlight(value: Boolean): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin(value: Boolean): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlugins(value: Plugins): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrintFunctionName(value: Boolean): Self = StObject.set(x, "printFunctionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OptionsReceived extends StObject {
    
    var callToJSON: js.UndefOr[Boolean] = js.native
    
    var escapeRegex: js.UndefOr[Boolean] = js.native
    
    var escapeString: js.UndefOr[Boolean] = js.native
    
    var highlight: js.UndefOr[Boolean] = js.native
    
    var indent: js.UndefOr[Double] = js.native
    
    var maxDepth: js.UndefOr[Double] = js.native
    
    var min: js.UndefOr[Boolean] = js.native
    
    var plugins: js.UndefOr[Plugins] = js.native
    
    var printFunctionName: js.UndefOr[Boolean] = js.native
    
    var theme: js.UndefOr[ThemeReceived] = js.native
  }
  object OptionsReceived {
    
    @scala.inline
    def apply(): OptionsReceived = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsReceived]
    }
    
    @scala.inline
    implicit class OptionsReceivedMutableBuilder[Self <: OptionsReceived] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallToJSON(value: Boolean): Self = StObject.set(x, "callToJSON", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallToJSONUndefined: Self = StObject.set(x, "callToJSON", js.undefined)
      
      @scala.inline
      def setEscapeRegex(value: Boolean): Self = StObject.set(x, "escapeRegex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeRegexUndefined: Self = StObject.set(x, "escapeRegex", js.undefined)
      
      @scala.inline
      def setEscapeString(value: Boolean): Self = StObject.set(x, "escapeString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeStringUndefined: Self = StObject.set(x, "escapeString", js.undefined)
      
      @scala.inline
      def setHighlight(value: Boolean): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
      
      @scala.inline
      def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      @scala.inline
      def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDepthUndefined: Self = StObject.set(x, "maxDepth", js.undefined)
      
      @scala.inline
      def setMin(value: Boolean): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setPlugins(value: Plugins): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setPrintFunctionName(value: Boolean): Self = StObject.set(x, "printFunctionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrintFunctionNameUndefined: Self = StObject.set(x, "printFunctionName", js.undefined)
      
      @scala.inline
      def setTheme(value: ThemeReceived): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.prettyFormat.typesMod.NewPlugin
    - typings.prettyFormat.typesMod.OldPlugin
  */
  trait Plugin extends StObject
  object Plugin {
    
    @scala.inline
    def NewPlugin(
      serialize: (js.Any, Config, String, Double, Refs, Printer) => String,
      test: /* arg0 */ js.Any => Boolean
    ): typings.prettyFormat.typesMod.NewPlugin = {
      val __obj = js.Dynamic.literal(serialize = js.Any.fromFunction6(serialize), test = js.Any.fromFunction1(test))
      __obj.asInstanceOf[typings.prettyFormat.typesMod.NewPlugin]
    }
    
    @scala.inline
    def OldPlugin(
      print: (js.Any, Print, Indent, PluginOptions, Colors) => String,
      test: /* arg0 */ js.Any => Boolean
    ): typings.prettyFormat.typesMod.OldPlugin = {
      val __obj = js.Dynamic.literal(print = js.Any.fromFunction5(print), test = js.Any.fromFunction1(test))
      __obj.asInstanceOf[typings.prettyFormat.typesMod.OldPlugin]
    }
  }
  
  @js.native
  trait PluginOptions extends StObject {
    
    var edgeSpacing: String = js.native
    
    var min: Boolean = js.native
    
    var spacing: String = js.native
  }
  object PluginOptions {
    
    @scala.inline
    def apply(edgeSpacing: String, min: Boolean, spacing: String): PluginOptions = {
      val __obj = js.Dynamic.literal(edgeSpacing = edgeSpacing.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluginOptions]
    }
    
    @scala.inline
    implicit class PluginOptionsMutableBuilder[Self <: PluginOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEdgeSpacing(value: String): Self = StObject.set(x, "edgeSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin(value: Boolean): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacing(value: String): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Plugins extends Array[Plugin]
  
  type Print = js.Function1[/* arg0 */ js.Any, String]
  
  type Printer = js.Function6[
    /* val */ js.Any, 
    /* config */ Config, 
    /* indentation */ String, 
    /* depth */ Double, 
    /* refs */ Refs, 
    /* hasCalledToJSON */ js.UndefOr[Boolean], 
    String
  ]
  
  type Refs = js.Array[js.Any]
  
  type Test = js.Function1[/* arg0 */ js.Any, Boolean]
  
  @js.native
  trait Theme extends StObject {
    
    var comment: String = js.native
    
    var content: String = js.native
    
    var prop: String = js.native
    
    var tag: String = js.native
    
    var value: String = js.native
  }
  object Theme {
    
    @scala.inline
    def apply(comment: String, content: String, prop: String, tag: String, value: String): Theme = {
      val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], prop = prop.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Theme]
    }
    
    @scala.inline
    implicit class ThemeMutableBuilder[Self <: Theme] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProp(value: String): Self = StObject.set(x, "prop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ThemeReceived extends StObject {
    
    var comment: js.UndefOr[String] = js.native
    
    var content: js.UndefOr[String] = js.native
    
    var prop: js.UndefOr[String] = js.native
    
    var tag: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[String] = js.native
  }
  object ThemeReceived {
    
    @scala.inline
    def apply(): ThemeReceived = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThemeReceived]
    }
    
    @scala.inline
    implicit class ThemeReceivedMutableBuilder[Self <: ThemeReceived] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setProp(value: String): Self = StObject.set(x, "prop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropUndefined: Self = StObject.set(x, "prop", js.undefined)
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
