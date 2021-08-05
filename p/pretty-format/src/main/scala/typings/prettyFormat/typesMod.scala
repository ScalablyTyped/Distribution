package typings.prettyFormat

import typings.prettyFormat.anon.Close
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait Colors extends StObject {
    
    var comment: Close
    
    var content: Close
    
    var prop: Close
    
    var tag: Close
    
    var value: Close
  }
  object Colors {
    
    inline def apply(comment: Close, content: Close, prop: Close, tag: Close, value: Close): Colors = {
      val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], prop = prop.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Colors]
    }
    
    extension [Self <: Colors](x: Self) {
      
      inline def setComment(value: Close): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setContent(value: Close): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setProp(value: Close): Self = StObject.set(x, "prop", value.asInstanceOf[js.Any])
      
      inline def setTag(value: Close): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Close): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Config extends StObject {
    
    var callToJSON: Boolean
    
    var colors: Colors
    
    var escapeRegex: Boolean
    
    var escapeString: Boolean
    
    var indent: String
    
    var maxDepth: Double
    
    var min: Boolean
    
    var plugins: Plugins
    
    var printFunctionName: Boolean
    
    var spacingInner: String
    
    var spacingOuter: String
  }
  object Config {
    
    inline def apply(
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
    
    extension [Self <: Config](x: Self) {
      
      inline def setCallToJSON(value: Boolean): Self = StObject.set(x, "callToJSON", value.asInstanceOf[js.Any])
      
      inline def setColors(value: Colors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setEscapeRegex(value: Boolean): Self = StObject.set(x, "escapeRegex", value.asInstanceOf[js.Any])
      
      inline def setEscapeString(value: Boolean): Self = StObject.set(x, "escapeString", value.asInstanceOf[js.Any])
      
      inline def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Boolean): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setPlugins(value: Plugins): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPrintFunctionName(value: Boolean): Self = StObject.set(x, "printFunctionName", value.asInstanceOf[js.Any])
      
      inline def setSpacingInner(value: String): Self = StObject.set(x, "spacingInner", value.asInstanceOf[js.Any])
      
      inline def setSpacingOuter(value: String): Self = StObject.set(x, "spacingOuter", value.asInstanceOf[js.Any])
    }
  }
  
  type Indent = js.Function1[/* arg0 */ String, String]
  
  trait NewPlugin
    extends StObject
       with Plugin {
    
    def serialize(`val`: js.Any, config: Config, indentation: String, depth: Double, refs: Refs, printer: Printer): String
    
    var test: Test
  }
  object NewPlugin {
    
    inline def apply(
      serialize: (js.Any, Config, String, Double, Refs, Printer) => String,
      test: /* arg0 */ js.Any => Boolean
    ): NewPlugin = {
      val __obj = js.Dynamic.literal(serialize = js.Any.fromFunction6(serialize), test = js.Any.fromFunction1(test))
      __obj.asInstanceOf[NewPlugin]
    }
    
    extension [Self <: NewPlugin](x: Self) {
      
      inline def setSerialize(value: (js.Any, Config, String, Double, Refs, Printer) => String): Self = StObject.set(x, "serialize", js.Any.fromFunction6(value))
      
      inline def setTest(value: /* arg0 */ js.Any => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
    }
  }
  
  trait OldPlugin
    extends StObject
       with Plugin {
    
    def print(`val`: js.Any, print: Print, indent: Indent, options: PluginOptions, colors: Colors): String
    
    var test: Test
  }
  object OldPlugin {
    
    inline def apply(
      print: (js.Any, Print, Indent, PluginOptions, Colors) => String,
      test: /* arg0 */ js.Any => Boolean
    ): OldPlugin = {
      val __obj = js.Dynamic.literal(print = js.Any.fromFunction5(print), test = js.Any.fromFunction1(test))
      __obj.asInstanceOf[OldPlugin]
    }
    
    extension [Self <: OldPlugin](x: Self) {
      
      inline def setPrint(value: (js.Any, Print, Indent, PluginOptions, Colors) => String): Self = StObject.set(x, "print", js.Any.fromFunction5(value))
      
      inline def setTest(value: /* arg0 */ js.Any => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
    }
  }
  
  trait Options extends StObject {
    
    var callToJSON: Boolean
    
    var escapeRegex: Boolean
    
    var escapeString: Boolean
    
    var highlight: Boolean
    
    var indent: Double
    
    var maxDepth: Double
    
    var min: Boolean
    
    var plugins: Plugins
    
    var printFunctionName: Boolean
    
    var theme: Theme
  }
  object Options {
    
    inline def apply(
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
    
    extension [Self <: Options](x: Self) {
      
      inline def setCallToJSON(value: Boolean): Self = StObject.set(x, "callToJSON", value.asInstanceOf[js.Any])
      
      inline def setEscapeRegex(value: Boolean): Self = StObject.set(x, "escapeRegex", value.asInstanceOf[js.Any])
      
      inline def setEscapeString(value: Boolean): Self = StObject.set(x, "escapeString", value.asInstanceOf[js.Any])
      
      inline def setHighlight(value: Boolean): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
      
      inline def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Boolean): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setPlugins(value: Plugins): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPrintFunctionName(value: Boolean): Self = StObject.set(x, "printFunctionName", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptionsReceived extends StObject {
    
    var callToJSON: js.UndefOr[Boolean] = js.undefined
    
    var escapeRegex: js.UndefOr[Boolean] = js.undefined
    
    var escapeString: js.UndefOr[Boolean] = js.undefined
    
    var highlight: js.UndefOr[Boolean] = js.undefined
    
    var indent: js.UndefOr[Double] = js.undefined
    
    var maxDepth: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Boolean] = js.undefined
    
    var plugins: js.UndefOr[Plugins] = js.undefined
    
    var printFunctionName: js.UndefOr[Boolean] = js.undefined
    
    var theme: js.UndefOr[ThemeReceived] = js.undefined
  }
  object OptionsReceived {
    
    inline def apply(): OptionsReceived = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsReceived]
    }
    
    extension [Self <: OptionsReceived](x: Self) {
      
      inline def setCallToJSON(value: Boolean): Self = StObject.set(x, "callToJSON", value.asInstanceOf[js.Any])
      
      inline def setCallToJSONUndefined: Self = StObject.set(x, "callToJSON", js.undefined)
      
      inline def setEscapeRegex(value: Boolean): Self = StObject.set(x, "escapeRegex", value.asInstanceOf[js.Any])
      
      inline def setEscapeRegexUndefined: Self = StObject.set(x, "escapeRegex", js.undefined)
      
      inline def setEscapeString(value: Boolean): Self = StObject.set(x, "escapeString", value.asInstanceOf[js.Any])
      
      inline def setEscapeStringUndefined: Self = StObject.set(x, "escapeString", js.undefined)
      
      inline def setHighlight(value: Boolean): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
      
      inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
      
      inline def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
      
      inline def setMaxDepthUndefined: Self = StObject.set(x, "maxDepth", js.undefined)
      
      inline def setMin(value: Boolean): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setPlugins(value: Plugins): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPrintFunctionName(value: Boolean): Self = StObject.set(x, "printFunctionName", value.asInstanceOf[js.Any])
      
      inline def setPrintFunctionNameUndefined: Self = StObject.set(x, "printFunctionName", js.undefined)
      
      inline def setTheme(value: ThemeReceived): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.prettyFormat.typesMod.NewPlugin
    - typings.prettyFormat.typesMod.OldPlugin
  */
  trait Plugin extends StObject
  object Plugin {
    
    inline def NewPlugin(
      serialize: (js.Any, Config, String, Double, Refs, Printer) => String,
      test: /* arg0 */ js.Any => Boolean
    ): typings.prettyFormat.typesMod.NewPlugin = {
      val __obj = js.Dynamic.literal(serialize = js.Any.fromFunction6(serialize), test = js.Any.fromFunction1(test))
      __obj.asInstanceOf[typings.prettyFormat.typesMod.NewPlugin]
    }
    
    inline def OldPlugin(
      print: (js.Any, Print, Indent, PluginOptions, Colors) => String,
      test: /* arg0 */ js.Any => Boolean
    ): typings.prettyFormat.typesMod.OldPlugin = {
      val __obj = js.Dynamic.literal(print = js.Any.fromFunction5(print), test = js.Any.fromFunction1(test))
      __obj.asInstanceOf[typings.prettyFormat.typesMod.OldPlugin]
    }
  }
  
  trait PluginOptions extends StObject {
    
    var edgeSpacing: String
    
    var min: Boolean
    
    var spacing: String
  }
  object PluginOptions {
    
    inline def apply(edgeSpacing: String, min: Boolean, spacing: String): PluginOptions = {
      val __obj = js.Dynamic.literal(edgeSpacing = edgeSpacing.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluginOptions]
    }
    
    extension [Self <: PluginOptions](x: Self) {
      
      inline def setEdgeSpacing(value: String): Self = StObject.set(x, "edgeSpacing", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Boolean): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setSpacing(value: String): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Plugins
    extends StObject
       with Array[Plugin]
  
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
  
  trait Theme extends StObject {
    
    var comment: String
    
    var content: String
    
    var prop: String
    
    var tag: String
    
    var value: String
  }
  object Theme {
    
    inline def apply(comment: String, content: String, prop: String, tag: String, value: String): Theme = {
      val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], prop = prop.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Theme]
    }
    
    extension [Self <: Theme](x: Self) {
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setProp(value: String): Self = StObject.set(x, "prop", value.asInstanceOf[js.Any])
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ThemeReceived extends StObject {
    
    var comment: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
    
    var prop: js.UndefOr[String] = js.undefined
    
    var tag: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object ThemeReceived {
    
    inline def apply(): ThemeReceived = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThemeReceived]
    }
    
    extension [Self <: ThemeReceived](x: Self) {
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setProp(value: String): Self = StObject.set(x, "prop", value.asInstanceOf[js.Any])
      
      inline def setPropUndefined: Self = StObject.set(x, "prop", js.undefined)
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
