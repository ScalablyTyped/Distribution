package typings.prettyFormat

import typings.prettyFormat.anon.Close
import typings.prettyFormat.anon.RequiredPartialreadonlyco
import typings.prettyFormat.prettyFormatBooleans.`false`
import typings.prettyFormat.prettyFormatBooleans.`true`
import typings.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pretty-format", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns a presentation string of your `val` object
    * @param val any potential JavaScript object
    * @param options Custom settings
    */
  inline def default(`val`: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(`val`: Any, options: OptionsReceived): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(`val`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  object DEFAULT_OPTIONS {
    
    @JSImport("pretty-format", "DEFAULT_OPTIONS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("pretty-format", "DEFAULT_OPTIONS.callToJSON")
    @js.native
    def callToJSON: `true` = js.native
    inline def callToJSON_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("callToJSON")(x.asInstanceOf[js.Any])
    
    @JSImport("pretty-format", "DEFAULT_OPTIONS.compareKeys")
    @js.native
    def compareKeys: Unit = js.native
    inline def compareKeys_=(x: Unit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compareKeys")(x.asInstanceOf[js.Any])
    
    @JSImport("pretty-format", "DEFAULT_OPTIONS.escapeRegex")
    @js.native
    def escapeRegex: `false` = js.native
    inline def escapeRegex_=(x: `false`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("escapeRegex")(x.asInstanceOf[js.Any])
    
    @JSImport("pretty-format", "DEFAULT_OPTIONS.escapeString")
    @js.native
    def escapeString: `true` = js.native
    inline def escapeString_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("escapeString")(x.asInstanceOf[js.Any])
    
    @JSImport("pretty-format", "DEFAULT_OPTIONS.highlight")
    @js.native
    def highlight: `false` = js.native
    inline def highlight_=(x: `false`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("highlight")(x.asInstanceOf[js.Any])
    
    @JSImport("pretty-format", "DEFAULT_OPTIONS.indent")
    @js.native
    def indent: Double = js.native
    inline def indent_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("indent")(x.asInstanceOf[js.Any])
    
    @JSImport("pretty-format", "DEFAULT_OPTIONS.maxDepth")
    @js.native
    def maxDepth: Double = js.native
    inline def maxDepth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxDepth")(x.asInstanceOf[js.Any])
    
    @JSImport("pretty-format", "DEFAULT_OPTIONS.maxWidth")
    @js.native
    def maxWidth: Double = js.native
    inline def maxWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("pretty-format", "DEFAULT_OPTIONS.min")
    @js.native
    def min: `false` = js.native
    inline def min_=(x: `false`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("min")(x.asInstanceOf[js.Any])
    
    @JSImport("pretty-format", "DEFAULT_OPTIONS.plugins")
    @js.native
    def plugins: js.Array[scala.Nothing] = js.native
    inline def plugins_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("plugins")(x.asInstanceOf[js.Any])
    
    @JSImport("pretty-format", "DEFAULT_OPTIONS.printBasicPrototype")
    @js.native
    def printBasicPrototype: `true` = js.native
    inline def printBasicPrototype_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("printBasicPrototype")(x.asInstanceOf[js.Any])
    
    @JSImport("pretty-format", "DEFAULT_OPTIONS.printFunctionName")
    @js.native
    def printFunctionName: `true` = js.native
    inline def printFunctionName_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("printFunctionName")(x.asInstanceOf[js.Any])
    
    @JSImport("pretty-format", "DEFAULT_OPTIONS.theme")
    @js.native
    def theme: RequiredPartialreadonlyco = js.native
    inline def theme_=(x: RequiredPartialreadonlyco): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("theme")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Returns a presentation string of your `val` object
    * @param val any potential JavaScript object
    * @param options Custom settings
    */
  inline def format(`val`: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def format(`val`: Any, options: OptionsReceived): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(`val`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  object plugins {
    
    @JSImport("pretty-format", "plugins")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("pretty-format", "plugins.AsymmetricMatcher")
    @js.native
    def AsymmetricMatcher: NewPlugin = js.native
    inline def AsymmetricMatcher_=(x: NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AsymmetricMatcher")(x.asInstanceOf[js.Any])
    
    @JSImport("pretty-format", "plugins.DOMCollection")
    @js.native
    def DOMCollection: NewPlugin = js.native
    inline def DOMCollection_=(x: NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOMCollection")(x.asInstanceOf[js.Any])
    
    @JSImport("pretty-format", "plugins.DOMElement")
    @js.native
    def DOMElement: NewPlugin = js.native
    inline def DOMElement_=(x: NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOMElement")(x.asInstanceOf[js.Any])
    
    @JSImport("pretty-format", "plugins.Immutable")
    @js.native
    def Immutable: NewPlugin = js.native
    inline def Immutable_=(x: NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Immutable")(x.asInstanceOf[js.Any])
    
    @JSImport("pretty-format", "plugins.ReactElement")
    @js.native
    def ReactElement: NewPlugin = js.native
    inline def ReactElement_=(x: NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReactElement")(x.asInstanceOf[js.Any])
    
    @JSImport("pretty-format", "plugins.ReactTestComponent")
    @js.native
    def ReactTestComponent: NewPlugin = js.native
    inline def ReactTestComponent_=(x: NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReactTestComponent")(x.asInstanceOf[js.Any])
  }
  
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
  
  type CompareKeys = js.UndefOr[(js.Function2[/* a */ String, /* b */ String, Double]) | Null]
  
  trait Config extends StObject {
    
    var callToJSON: Boolean
    
    var colors: Colors
    
    var compareKeys: CompareKeys
    
    var escapeRegex: Boolean
    
    var escapeString: Boolean
    
    var indent: String
    
    var maxDepth: Double
    
    var maxWidth: Double
    
    var min: Boolean
    
    var plugins: Plugins_
    
    var printBasicPrototype: Boolean
    
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
      maxWidth: Double,
      min: Boolean,
      plugins: Plugins_,
      printBasicPrototype: Boolean,
      printFunctionName: Boolean,
      spacingInner: String,
      spacingOuter: String
    ): Config = {
      val __obj = js.Dynamic.literal(callToJSON = callToJSON.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], escapeRegex = escapeRegex.asInstanceOf[js.Any], escapeString = escapeString.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], maxDepth = maxDepth.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], printBasicPrototype = printBasicPrototype.asInstanceOf[js.Any], printFunctionName = printFunctionName.asInstanceOf[js.Any], spacingInner = spacingInner.asInstanceOf[js.Any], spacingOuter = spacingOuter.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setCallToJSON(value: Boolean): Self = StObject.set(x, "callToJSON", value.asInstanceOf[js.Any])
      
      inline def setColors(value: Colors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setCompareKeys(value: (/* a */ String, /* b */ String) => Double): Self = StObject.set(x, "compareKeys", js.Any.fromFunction2(value))
      
      inline def setCompareKeysNull: Self = StObject.set(x, "compareKeys", null)
      
      inline def setCompareKeysUndefined: Self = StObject.set(x, "compareKeys", js.undefined)
      
      inline def setEscapeRegex(value: Boolean): Self = StObject.set(x, "escapeRegex", value.asInstanceOf[js.Any])
      
      inline def setEscapeString(value: Boolean): Self = StObject.set(x, "escapeString", value.asInstanceOf[js.Any])
      
      inline def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Boolean): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setPlugins(value: Plugins_): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsVarargs(value: Plugin2*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setPrintBasicPrototype(value: Boolean): Self = StObject.set(x, "printBasicPrototype", value.asInstanceOf[js.Any])
      
      inline def setPrintFunctionName(value: Boolean): Self = StObject.set(x, "printFunctionName", value.asInstanceOf[js.Any])
      
      inline def setSpacingInner(value: String): Self = StObject.set(x, "spacingInner", value.asInstanceOf[js.Any])
      
      inline def setSpacingOuter(value: String): Self = StObject.set(x, "spacingOuter", value.asInstanceOf[js.Any])
    }
  }
  
  type Indent = js.Function1[/* arg0 */ String, String]
  
  trait NewPlugin
    extends StObject
       with Plugin2 {
    
    def serialize(`val`: Any, config: Config, indentation: String, depth: Double, refs: Refs, printer: Printer): String
    
    var test: Test
  }
  object NewPlugin {
    
    inline def apply(serialize: (Any, Config, String, Double, Refs, Printer) => String, test: /* arg0 */ Any => Boolean): NewPlugin = {
      val __obj = js.Dynamic.literal(serialize = js.Any.fromFunction6(serialize), test = js.Any.fromFunction1(test))
      __obj.asInstanceOf[NewPlugin]
    }
    
    extension [Self <: NewPlugin](x: Self) {
      
      inline def setSerialize(value: (Any, Config, String, Double, Refs, Printer) => String): Self = StObject.set(x, "serialize", js.Any.fromFunction6(value))
      
      inline def setTest(value: /* arg0 */ Any => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
    }
  }
  
  trait OldPlugin
    extends StObject
       with Plugin2 {
    
    def print(`val`: Any, print: Print, indent: Indent, options: PluginOptions, colors: Colors): String
    
    var test: Test
  }
  object OldPlugin {
    
    inline def apply(print: (Any, Print, Indent, PluginOptions, Colors) => String, test: /* arg0 */ Any => Boolean): OldPlugin = {
      val __obj = js.Dynamic.literal(print = js.Any.fromFunction5(print), test = js.Any.fromFunction1(test))
      __obj.asInstanceOf[OldPlugin]
    }
    
    extension [Self <: OldPlugin](x: Self) {
      
      inline def setPrint(value: (Any, Print, Indent, PluginOptions, Colors) => String): Self = StObject.set(x, "print", js.Any.fromFunction5(value))
      
      inline def setTest(value: /* arg0 */ Any => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof pretty-format.pretty-format.RequiredOptions, 'compareKeys' | 'theme'> ]: pretty-format.pretty-format.RequiredOptions[P]} */ trait Options extends StObject {
    
    var compareKeys: CompareKeys
    
    var theme: Required[
        /* import warning: importer.ImportType#apply Failed type conversion: pretty-format.pretty-format.RequiredOptions['theme'] */ js.Any
      ]
  }
  object Options {
    
    inline def apply(
      theme: Required[
          /* import warning: importer.ImportType#apply Failed type conversion: pretty-format.pretty-format.RequiredOptions['theme'] */ js.Any
        ]
    ): Options = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCompareKeys(value: (/* a */ String, /* b */ String) => Double): Self = StObject.set(x, "compareKeys", js.Any.fromFunction2(value))
      
      inline def setCompareKeysNull: Self = StObject.set(x, "compareKeys", null)
      
      inline def setCompareKeysUndefined: Self = StObject.set(x, "compareKeys", js.undefined)
      
      inline def setTheme(
        value: Required[
              /* import warning: importer.ImportType#apply Failed type conversion: pretty-format.pretty-format.RequiredOptions['theme'] */ js.Any
            ]
      ): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  type OptionsReceived = PrettyFormatOptions
  
  /* Rewritten from type alias, can be one of: 
    - typings.prettyFormat.mod.NewPlugin
    - typings.prettyFormat.mod.OldPlugin
  */
  trait Plugin2 extends StObject
  object Plugin2 {
    
    inline def NewPlugin(serialize: (Any, Config, String, Double, Refs, Printer) => String, test: /* arg0 */ Any => Boolean): typings.prettyFormat.mod.NewPlugin = {
      val __obj = js.Dynamic.literal(serialize = js.Any.fromFunction6(serialize), test = js.Any.fromFunction1(test))
      __obj.asInstanceOf[typings.prettyFormat.mod.NewPlugin]
    }
    
    inline def OldPlugin(print: (Any, Print, Indent, PluginOptions, Colors) => String, test: /* arg0 */ Any => Boolean): typings.prettyFormat.mod.OldPlugin = {
      val __obj = js.Dynamic.literal(print = js.Any.fromFunction5(print), test = js.Any.fromFunction1(test))
      __obj.asInstanceOf[typings.prettyFormat.mod.OldPlugin]
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
  
  type Plugins_ = js.Array[Plugin2]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof @jest/schemas.@jest/schemas.SnapshotFormat, 'compareKeys'> ]: @jest/schemas.@jest/schemas.SnapshotFormat[P]} */ trait PrettyFormatOptions extends StObject {
    
    var compareKeys: js.UndefOr[CompareKeys] = js.undefined
    
    var plugins: js.UndefOr[Plugins_] = js.undefined
  }
  object PrettyFormatOptions {
    
    inline def apply(): PrettyFormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrettyFormatOptions]
    }
    
    extension [Self <: PrettyFormatOptions](x: Self) {
      
      inline def setCompareKeys(value: (/* a */ String, /* b */ String) => Double): Self = StObject.set(x, "compareKeys", js.Any.fromFunction2(value))
      
      inline def setCompareKeysNull: Self = StObject.set(x, "compareKeys", null)
      
      inline def setCompareKeysUndefined: Self = StObject.set(x, "compareKeys", js.undefined)
      
      inline def setPlugins(value: Plugins_): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: Plugin2*): Self = StObject.set(x, "plugins", js.Array(value*))
    }
  }
  
  type Print = js.Function1[/* arg0 */ Any, String]
  
  type Printer = js.Function6[
    /* val */ Any, 
    /* config */ Config, 
    /* indentation */ String, 
    /* depth */ Double, 
    /* refs */ Refs, 
    /* hasCalledToJSON */ js.UndefOr[Boolean], 
    String
  ]
  
  type Refs = js.Array[Any]
  
  type RequiredOptions = Required[PrettyFormatOptions]
  
  type Test = js.Function1[/* arg0 */ Any, Boolean]
  
  /* Inlined pretty-format.pretty-format.Options['theme'] */
  type Theme = scala.Nothing
}
