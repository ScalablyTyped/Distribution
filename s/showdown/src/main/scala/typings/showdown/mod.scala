package typings.showdown

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.showdown.anon.Codeblock
import typings.showdown.anon.Format
import typings.showdown.anon.Height
import typings.showdown.showdownStrings.boolean
import typings.showdown.showdownStrings.integer
import typings.showdown.showdownStrings.string
import typings.std.HTMLDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("showdown", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Showdown Converter prototype.
    *
    * @see https://github.com/showdownjs/showdown/blob/master/src/converter.js
    */
  @js.native
  trait Converter extends StObject {
    
    def addExtension(`extension`: js.Array[ShowdownExtension]): Unit = js.native
    def addExtension(`extension`: js.Array[ShowdownExtension], name: String): Unit = js.native
    /**
      * Add extension to THIS converter.
      *
      * @param extension - The new extension to add.
      * @param name - The extension name.
      */
    def addExtension(`extension`: js.Function0[js.Array[ShowdownExtension] | ShowdownExtension]): Unit = js.native
    def addExtension(`extension`: js.Function0[js.Array[ShowdownExtension] | ShowdownExtension], name: String): Unit = js.native
    def addExtension(`extension`: ShowdownExtension): Unit = js.native
    def addExtension(`extension`: ShowdownExtension, name: String): Unit = js.native
    
    /**
      * Get all extensions.
      *
      * @return all extensions.
      */
    def getAllExtensions(): ConverterExtensions = js.native
    
    /**
      * Get the "local" currently set flavor of this converter.
      *
      * @returns Returns string flavor name.
      */
    def getFlavor(): Flavor = js.native
    
    /**
      * Get the metadata of the previously parsed document.
      * 
      * @param raw - If to returns Row or Metadata.
      * @returns Returns Row if `row` is `true`, otherwise Metadata.
      */
    def getMetadata(): String | Metadata = js.native
    def getMetadata(raw: Boolean): String | Metadata = js.native
    
    /**
      * Get the metadata format of the previously parsed document.
      * 
      * @returns Returns the metadata format.
      */
    def getMetadataFormat(): String = js.native
    
    /**
      * Get the option of this Converter instance.
      *
      * @param key - The key of the option.
      * @returns Returns the value of the given `key`.
      */
    def getOption(key: String): Any = js.native
    
    /**
      * Get the options of this Converter instance.
      * 
      * @returns Returns the current convertor options object.
      */
    def getOptions(): ShowdownOptions = js.native
    
    /**
      * Listen to an event.
      *
      * @param name - The event name.
      * @param callback - The function that will be called when the event occurs.
      * @throws Throws if the type of `name` is not string.
      * @throws Throws if the type of `callback` is not function.
      * @example
      * ```ts
      * let converter: Converter = new Converter();
      * converter
      *   .listen('hashBlock.before', (evtName, text, converter, options, globals) => {
      *     // ... do stuff to text ...
      *     return text;
      *   })
      *   .makeHtml('...');
      * ```
      */
    def listen(name: String, callback: EventListener): Converter = js.native
    
    /**
      * Converts a markdown string into HTML string.
      * 
      * @param text - The input text (markdown).
      * @return The output HTML.
      */
    def makeHtml(text: String): String = js.native
    
    /**
      * Converts an HTML string into a markdown string.
      *
      * @param src - The input text (HTML)
      * @param [HTMLParser] A WHATWG DOM and HTML parser, such as JSDOM. If none is supplied, window.document will be used.
      * @returns The output markdown.
      */
    def makeMarkdown(src: String): String = js.native
    def makeMarkdown(src: String, HTMLParser: HTMLDocument): String = js.native
    
    /**
      * Remove an extension from THIS converter.
      *
      * @remarks This is a costly operation. It's better to initialize a new converter.
      * and specify the extensions you wish to use.
      * @param extensions - The extensions to remove.
      */
    def removeExtension(extensions: js.Array[ShowdownExtension]): Unit = js.native
    def removeExtension(extensions: ShowdownExtension): Unit = js.native
    
    /**
      * Set a "local" flavor for THIS Converter instance.
      *
      * @param flavor - The flavor name.
      */
    def setFlavor(name: Flavor): Unit = js.native
    
    /**
      * Setting a "local" option only affects the specified Converter object.
      *
      * @param key - The key of the option.
      * @param value - The value of the option.
      */
    def setOption(key: String, value: Any): Unit = js.native
    
    /**
      * Use a global registered extension with THIS converter.
      *
      * @param extensionName - Name of the previously registered extension.
      */
    def useExtension(extensionName: String): Unit = js.native
  }
  /**
    * Constructor function for a Converter.
    */
  @JSImport("showdown", "Converter")
  @js.native
  def Converter: ConverterStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("showdown", "Converter")
  @js.native
  /**
    * @constructor
    * @param converterOptions - Configuration object, describes which extensions to apply.
    */
  open class ConverterCls ()
    extends StObject
       with Converter {
    def this(converterOptions: ConverterOptions) = this()
  }
  
  inline def Converter_=(x: ConverterStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Converter")(x.asInstanceOf[js.Any])
  
  /**
    * Get a registered extension.
    *
    * @param name - The extension name.
    * @returns Returns the extension of the given `name`.
    * @throws Throws if `name` is not of type string.
    * @throws Throws if the extension is not exists.
    */
  inline def `extension`(name: String): js.Array[ShowdownExtension] = ^.asInstanceOf[js.Dynamic].applyDynamic("extension")(name.asInstanceOf[js.Any]).asInstanceOf[js.Array[ShowdownExtension]]
  inline def `extension`(name: String, ext: js.Array[ShowdownExtension]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extension")(name.asInstanceOf[js.Any], ext.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Register a extension.
    *
    * @param name - The name of the new extension.
    * @param ext - The extension.
    * @throws Throws if `name` is not of type string.
    */
  inline def `extension`(name: String, ext: js.Function0[js.Array[ShowdownExtension] | ShowdownExtension]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extension")(name.asInstanceOf[js.Any], ext.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def `extension`(name: String, ext: ShowdownExtension): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extension")(name.asInstanceOf[js.Any], ext.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Showdown extensions.
    */
  @JSImport("showdown", "extensions")
  @js.native
  def extensions: ShowdownExtensions = js.native
  inline def extensions_=(x: ShowdownExtensions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  /**
    * Get the "global" extensions.
    *
    * @return Returns all extensions.
    */
  inline def getAllExtensions(): ShowdownExtensions = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllExtensions")().asInstanceOf[ShowdownExtensions]
  
  /**
    * Get the default options.
    *
    * @param [simple=true] - If to returns the default showdown options or the showdown options schema.
    * @returns Returns the options schema if `simple` is `false`, otherwise the default showdown options.
    */
  inline def getDefaultOptions(): ShowdownOptionsSchema | ShowdownOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[ShowdownOptionsSchema | ShowdownOptions]
  inline def getDefaultOptions(simple: Boolean): ShowdownOptionsSchema | ShowdownOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")(simple.asInstanceOf[js.Any]).asInstanceOf[ShowdownOptionsSchema | ShowdownOptions]
  
  /**
    * Get the "global" currently set flavor.
    *
    * @returns Returns string flavor name.
    */
  inline def getFlavor(): Flavor = ^.asInstanceOf[js.Dynamic].applyDynamic("getFlavor")().asInstanceOf[Flavor]
  
  /**
    * Get the options of a specified flavor. Returns undefined if the flavor was not found.
    *
    * @param name - Name of the flavor.
    * @returns Returns options object of the given flavor `name`.
    */
  inline def getFlavorOptions(name: Flavor): js.UndefOr[ShowdownOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFlavorOptions")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ShowdownOptions]]
  
  /**
    * Get a "global" option.
    *
    * @param key - the option key.
    * @returns Returns the value of the given `key`.
    */
  inline def getOption(key: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getOption")(key.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * Get the "global" options.
    *
    * @returns Returns a options object.
    */
  inline def getOptions(): ShowdownOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptions")().asInstanceOf[ShowdownOptions]
  
  /**
    * Showdown helper.
    */
  @JSImport("showdown", "helper")
  @js.native
  def helper: Helper_ = js.native
  inline def helper_=(x: Helper_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("helper")(x.asInstanceOf[js.Any])
  
  /**
    * Remove an extension.
    *
    * @param name - The extension name.
    */
  inline def removeExtension(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeExtension")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Removes all extensions.
    */
  inline def resetExtensions(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetExtensions")().asInstanceOf[Unit]
  
  /**
    * Reset "global" options to the default values.
    */
  inline def resetOptions(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetOptions")().asInstanceOf[Unit]
  
  /**
    * Setting a "global" flavor affects all instances of showdown.
    *
    * @param name - The flavor name.
    */
  inline def setFlavor(name: Flavor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFlavor")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Setting a "global" option affects all instances of showdown.
    * 
    * @param key - the option key.
    * @param value - the option value.
    */
  inline def setOption(key: String, value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setOption")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * Get a registered subParser.
    *
    * @param name - The parser name.
    * @returns Returns the parser of the given `name`.
    * @throws Throws if `name` is not of type string.
    * @throws Throws if the parser is not exists.
    */
  inline def subParser(name: String): SubParser_ = ^.asInstanceOf[js.Dynamic].applyDynamic("subParser")(name.asInstanceOf[js.Any]).asInstanceOf[SubParser_]
  /**
    * Register a subParser.
    *
    * @param name - The name of the new parser.
    * @param func - The handler function of the new parser.
    * @throws Throws if `name` is not of type string.
    */
  inline def subParser(name: String, func: SubParser_): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("subParser")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Checks if the given `ext` is a valid showdown extension.
    *
    * @param ext - The extension to checks.
    * @returns Returns `true` if the extension is valid showdown extension, otherwise `false`.
    */
  inline def validateExtension(ext: js.Array[ShowdownExtension]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateExtension")(ext.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def validateExtension(ext: ShowdownExtension): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateExtension")(ext.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Showdown converter extensions store object.
    */
  trait ConverterExtensions extends StObject {
    
    var language: js.Array[ShowdownExtension]
    
    var output: js.Array[ShowdownExtension]
  }
  object ConverterExtensions {
    
    inline def apply(language: js.Array[ShowdownExtension], output: js.Array[ShowdownExtension]): ConverterExtensions = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConverterExtensions]
    }
    
    extension [Self <: ConverterExtensions](x: Self) {
      
      inline def setLanguage(value: js.Array[ShowdownExtension]): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageVarargs(value: ShowdownExtension*): Self = StObject.set(x, "language", js.Array(value*))
      
      inline def setOutput(value: js.Array[ShowdownExtension]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputVarargs(value: ShowdownExtension*): Self = StObject.set(x, "output", js.Array(value*))
    }
  }
  
  trait ConverterGlobals extends StObject {
    
    var converter: js.UndefOr[Converter] = js.undefined
    
    var gDimensions: js.UndefOr[Height] = js.undefined
    
    var gHtmlBlocks: js.UndefOr[js.Array[String]] = js.undefined
    
    var gHtmlMdBlocks: js.UndefOr[js.Array[String]] = js.undefined
    
    var gHtmlSpans: js.UndefOr[js.Array[String]] = js.undefined
    
    var gListLevel: js.UndefOr[Double] = js.undefined
    
    var gTitles: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var gUrls: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var ghCodeBlocks: js.UndefOr[js.Array[Codeblock]] = js.undefined
    
    var hashLinkCounts: js.UndefOr[StringDictionary[Double]] = js.undefined
    
    var langExtensions: js.UndefOr[js.Array[ShowdownExtension]] = js.undefined
    
    var metadata: js.UndefOr[Format] = js.undefined
    
    var outputModifiers: js.UndefOr[js.Array[ShowdownExtension]] = js.undefined
  }
  object ConverterGlobals {
    
    inline def apply(): ConverterGlobals = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConverterGlobals]
    }
    
    extension [Self <: ConverterGlobals](x: Self) {
      
      inline def setConverter(value: Converter): Self = StObject.set(x, "converter", value.asInstanceOf[js.Any])
      
      inline def setConverterUndefined: Self = StObject.set(x, "converter", js.undefined)
      
      inline def setGDimensions(value: Height): Self = StObject.set(x, "gDimensions", value.asInstanceOf[js.Any])
      
      inline def setGDimensionsUndefined: Self = StObject.set(x, "gDimensions", js.undefined)
      
      inline def setGHtmlBlocks(value: js.Array[String]): Self = StObject.set(x, "gHtmlBlocks", value.asInstanceOf[js.Any])
      
      inline def setGHtmlBlocksUndefined: Self = StObject.set(x, "gHtmlBlocks", js.undefined)
      
      inline def setGHtmlBlocksVarargs(value: String*): Self = StObject.set(x, "gHtmlBlocks", js.Array(value*))
      
      inline def setGHtmlMdBlocks(value: js.Array[String]): Self = StObject.set(x, "gHtmlMdBlocks", value.asInstanceOf[js.Any])
      
      inline def setGHtmlMdBlocksUndefined: Self = StObject.set(x, "gHtmlMdBlocks", js.undefined)
      
      inline def setGHtmlMdBlocksVarargs(value: String*): Self = StObject.set(x, "gHtmlMdBlocks", js.Array(value*))
      
      inline def setGHtmlSpans(value: js.Array[String]): Self = StObject.set(x, "gHtmlSpans", value.asInstanceOf[js.Any])
      
      inline def setGHtmlSpansUndefined: Self = StObject.set(x, "gHtmlSpans", js.undefined)
      
      inline def setGHtmlSpansVarargs(value: String*): Self = StObject.set(x, "gHtmlSpans", js.Array(value*))
      
      inline def setGListLevel(value: Double): Self = StObject.set(x, "gListLevel", value.asInstanceOf[js.Any])
      
      inline def setGListLevelUndefined: Self = StObject.set(x, "gListLevel", js.undefined)
      
      inline def setGTitles(value: StringDictionary[String]): Self = StObject.set(x, "gTitles", value.asInstanceOf[js.Any])
      
      inline def setGTitlesUndefined: Self = StObject.set(x, "gTitles", js.undefined)
      
      inline def setGUrls(value: StringDictionary[String]): Self = StObject.set(x, "gUrls", value.asInstanceOf[js.Any])
      
      inline def setGUrlsUndefined: Self = StObject.set(x, "gUrls", js.undefined)
      
      inline def setGhCodeBlocks(value: js.Array[Codeblock]): Self = StObject.set(x, "ghCodeBlocks", value.asInstanceOf[js.Any])
      
      inline def setGhCodeBlocksUndefined: Self = StObject.set(x, "ghCodeBlocks", js.undefined)
      
      inline def setGhCodeBlocksVarargs(value: Codeblock*): Self = StObject.set(x, "ghCodeBlocks", js.Array(value*))
      
      inline def setHashLinkCounts(value: StringDictionary[Double]): Self = StObject.set(x, "hashLinkCounts", value.asInstanceOf[js.Any])
      
      inline def setHashLinkCountsUndefined: Self = StObject.set(x, "hashLinkCounts", js.undefined)
      
      inline def setLangExtensions(value: js.Array[ShowdownExtension]): Self = StObject.set(x, "langExtensions", value.asInstanceOf[js.Any])
      
      inline def setLangExtensionsUndefined: Self = StObject.set(x, "langExtensions", js.undefined)
      
      inline def setLangExtensionsVarargs(value: ShowdownExtension*): Self = StObject.set(x, "langExtensions", js.Array(value*))
      
      inline def setMetadata(value: Format): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setOutputModifiers(value: js.Array[ShowdownExtension]): Self = StObject.set(x, "outputModifiers", value.asInstanceOf[js.Any])
      
      inline def setOutputModifiersUndefined: Self = StObject.set(x, "outputModifiers", js.undefined)
      
      inline def setOutputModifiersVarargs(value: ShowdownExtension*): Self = StObject.set(x, "outputModifiers", js.Array(value*))
    }
  }
  
  trait ConverterOptions
    extends StObject
       with ShowdownOptions {
    
    /**
      * Add extensions to the new converter can be showdown extensions or "global" extensions name.
      */
    var extensions: js.UndefOr[
        js.Array[
          (js.Function0[js.Array[ShowdownExtension] | ShowdownExtension]) | js.Array[ShowdownExtension] | ShowdownExtension | String
        ]
      ] = js.undefined
  }
  object ConverterOptions {
    
    inline def apply(): ConverterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConverterOptions]
    }
    
    extension [Self <: ConverterOptions](x: Self) {
      
      inline def setExtensions(
        value: js.Array[
              (js.Function0[js.Array[ShowdownExtension] | ShowdownExtension]) | js.Array[ShowdownExtension] | ShowdownExtension | String
            ]
      ): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(
        value: ((js.Function0[js.Array[ShowdownExtension] | ShowdownExtension]) | js.Array[ShowdownExtension] | ShowdownExtension | String)*
      ): Self = StObject.set(x, "extensions", js.Array(value*))
    }
  }
  
  @js.native
  trait ConverterStatic
    extends StObject
       with /**
    * @constructor
    * @param converterOptions - Configuration object, describes which extensions to apply.
    */
  Instantiable0[Converter]
       with Instantiable1[/* converterOptions */ ConverterOptions, Converter]
  
  /**
    * Showdown event listener.
    */
  type EventListener = js.Function5[
    /* evtName */ String, 
    /* text */ String, 
    /* converter */ Converter, 
    /* options */ ShowdownOptions, 
    /* globals */ ConverterGlobals, 
    Unit | String
  ]
  
  trait Extension_ extends StObject {
    
    /**
      * Event listeners functions that called on the conversion, when the `event` occurs.
      */
    var listeners: js.UndefOr[StringDictionary[EventListener]] = js.undefined
    
    /**
      * Property defines the nature of said sub-extensions and can assume 2 values:
      *
      * * `lang`  - Language extensions add new markdown syntax to showdown.
      * * `output` - Output extensions (or modifiers) alter the HTML output generated by showdown.
      * * `listener` - Listener extensions for listening to a conversion event.
      */
    var `type`: String
  }
  object Extension_ {
    
    inline def apply(`type`: String): Extension_ = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Extension_]
    }
    
    extension [Self <: Extension_](x: Self) {
      
      inline def setListeners(value: StringDictionary[EventListener]): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
      
      inline def setListenersUndefined: Self = StObject.set(x, "listeners", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * If you'd just like to do everything yourself,you can specify a filter property.
    * The filter property should be a function that acts as a callback.
    * 
    * @example
    * ```ts
    * let myExt: ShowdownExtension = { 
    *   type: 'lang',
    *   filter: (text: string, converter: Converter) => text.replace('#', '*') 
    * };
    * ```
    */
  trait FilterExtension
    extends StObject
       with Extension_ {
    
    var filter: js.UndefOr[
        js.Function3[
          /* text */ String, 
          /* converter */ Converter, 
          /* options */ js.UndefOr[ConverterOptions], 
          String
        ]
      ] = js.undefined
  }
  object FilterExtension {
    
    inline def apply(`type`: String): FilterExtension = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterExtension]
    }
    
    extension [Self <: FilterExtension](x: Self) {
      
      inline def setFilter(
        value: (/* text */ String, /* converter */ Converter, /* options */ js.UndefOr[ConverterOptions]) => String
      ): Self = StObject.set(x, "filter", js.Any.fromFunction3(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    }
  }
  
  /**
    * Showdown Flavor names.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.showdown.showdownStrings.github
    - typings.showdown.showdownStrings.original
    - typings.showdown.showdownStrings.ghost
    - typings.showdown.showdownStrings.vanilla
    - typings.showdown.showdownStrings.allOn
  */
  trait Flavor extends StObject
  object Flavor {
    
    inline def allOn: typings.showdown.showdownStrings.allOn = "allOn".asInstanceOf[typings.showdown.showdownStrings.allOn]
    
    inline def ghost: typings.showdown.showdownStrings.ghost = "ghost".asInstanceOf[typings.showdown.showdownStrings.ghost]
    
    inline def github: typings.showdown.showdownStrings.github = "github".asInstanceOf[typings.showdown.showdownStrings.github]
    
    inline def original: typings.showdown.showdownStrings.original = "original".asInstanceOf[typings.showdown.showdownStrings.original]
    
    inline def vanilla: typings.showdown.showdownStrings.vanilla = "vanilla".asInstanceOf[typings.showdown.showdownStrings.vanilla]
  }
  
  /** 
    * Helper Interface 
    */
  trait Helper_
    extends StObject
       with /* key */ StringDictionary[js.Function1[/* repeated */ Any, Any]] {
    
    def replaceRecursiveRegExp(args: Any*): String
  }
  object Helper_ {
    
    inline def apply(replaceRecursiveRegExp: /* repeated */ Any => String): Helper_ = {
      val __obj = js.Dynamic.literal(replaceRecursiveRegExp = js.Any.fromFunction1(replaceRecursiveRegExp))
      __obj.asInstanceOf[Helper_]
    }
    
    extension [Self <: Helper_](x: Self) {
      
      inline def setReplaceRecursiveRegExp(value: /* repeated */ Any => String): Self = StObject.set(x, "replaceRecursiveRegExp", js.Any.fromFunction1(value))
    }
  }
  
  type Metadata = StringDictionary[String]
  
  /**
    * Regex/replace style extensions are very similar to javascript's string.replace function.
    * Two properties are given, `regex` and `replace`.
    * 
    * @example
    * ```ts
    * let myExt: RegexReplaceExtension = {
    *   type: 'lang',
    *   regex: /markdown/g,
    *   replace: 'showdown'
    * };
    * ```
    */
  trait RegexReplaceExtension
    extends StObject
       with Extension_ {
    
    /**
      * Should be either a string or a RegExp object.
      *
      * Keep in mind that, if a string is used, it will automatically be given a g modifier,
      * that is, it is assumed to be a global replacement.
      */
    var regex: js.UndefOr[String | js.RegExp] = js.undefined
    
    /**
      * Can be either a string or a function. If replace is a string,
      * it can use the $1 syntax for group substitution,
      * exactly as if it were making use of string.replace (internally it does this actually).
      */
    var replace: js.UndefOr[Any] = js.undefined
  }
  object RegexReplaceExtension {
    
    inline def apply(`type`: String): RegexReplaceExtension = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegexReplaceExtension]
    }
    
    extension [Self <: RegexReplaceExtension](x: Self) {
      
      inline def setRegex(value: String | js.RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
      
      inline def setReplace(value: Any): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    }
  }
  
  /**
    * Defines a plugin/extension
    * Each single extension can be one of two types:
    *
    * + Language Extension -- Language extensions are ones that that add new markdown syntax to showdown. For example, say you wanted ^^youtube http://www.youtube.com/watch?v=oHg5SJYRHA0 to automatically render as an embedded YouTube video, that would be a language extension.
    * + Output Modifiers -- After showdown has run, and generated HTML, an output modifier would change that HTML. For example, say you wanted to change <div class="header"> to be <header>, that would be an output modifier.
    * + Listener Extension -- Listener extensions for listen to conversion events.
    * 
    * Each extension can provide two combinations of interfaces for showdown.
    * 
    * @example
    * ```ts
    * let myext: ShowdownExtension = {
    *   type: 'output',
    *   filter(text, converter, options) {
    *      // ... do stuff to text ...
    *      return text;
    *   },
    *   listeners: {
    *      ['lists.after'](evtName, text, converter, options, globals){
    *          // ... do stuff to text ...
    *          return text;
    *      },
    *      // ... 
    *   }
    * };
    * ```
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.showdown.mod.Extension_ because Already inherited
  - typings.showdown.mod.FilterExtension because var conflicts: listeners, `type`. Inlined filter */ trait ShowdownExtension
    extends StObject
       with RegexReplaceExtension {
    
    var filter: js.UndefOr[
        js.Function3[
          /* text */ String, 
          /* converter */ Converter, 
          /* options */ js.UndefOr[ConverterOptions], 
          String
        ]
      ] = js.undefined
  }
  object ShowdownExtension {
    
    inline def apply(`type`: String): ShowdownExtension = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShowdownExtension]
    }
    
    extension [Self <: ShowdownExtension](x: Self) {
      
      inline def setFilter(
        value: (/* text */ String, /* converter */ Converter, /* options */ js.UndefOr[ConverterOptions]) => String
      ): Self = StObject.set(x, "filter", js.Any.fromFunction3(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    }
  }
  
  /**
    * Showdown extensions store object.
    */
  type ShowdownExtensions = StringDictionary[js.Array[ShowdownExtension]]
  
  /**
    * Showdown option description.
    */
  trait ShowdownOptionDescription extends StObject {
    
    /**
      * The default value of option.
      */
    var defaultValue: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The description of the option.
      */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * The type of the option value.
      */
    var `type`: js.UndefOr[boolean | string | integer] = js.undefined
  }
  object ShowdownOptionDescription {
    
    inline def apply(): ShowdownOptionDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShowdownOptionDescription]
    }
    
    extension [Self <: ShowdownOptionDescription](x: Self) {
      
      inline def setDefaultValue(value: Boolean): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setType(value: boolean | string | integer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /**
    * Showdown options.
    *
    * @see https://github.com/showdownjs/showdown#valid-options
    * @see https://github.com/showdownjs/showdown/wiki/Showdown-options
    * @see https://github.com/showdownjs/showdown/blob/master/src/options.js
    */
  trait ShowdownOptions
    extends StObject
       with /**
    * For custom options {extension, subParser} And also an out-of-date definitions
    */
  /* key */ StringDictionary[Any] {
    
    /**
      * Support for HTML Tag escaping.
      *
      * @example
      * **input**:
      *
      * ```md
      * \<div>foo\</div>.
      * ```
      *
      * **backslashEscapesHTMLTags** = false
      * ```html
      * <p>\<div>foo\</div></p>
      * ```
      * 
      * **backslashEscapesHTMLTags** = true
      * ```html
      * <p>&lt;div&gt;foo&lt;/div&gt;</p>
      * ```
      * @default false
      * @since 1.7.2
      */
    var backslashEscapesHTMLTags: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Outputs a complete html document, including <html>, <head> and <body> tags' instead of an HTML fragment.
      *
      * @example
      * **input**:
      *
      * ```md
      * # Showdown
      * ```
      *
      * **completeHTMLDocument** = false
      * ```html
      * <p><strong>Showdown</strong></p>
      * ```
      * 
      * **completeHTMLDocument** = true
      * ```html
      * <!DOCTYPE HTML>
      * <html>
      * <head>
      * <meta charset="utf-8">
      * </head>
      * <body>
      * <p><strong>Showdown</strong></p>
      * </body>
      * </html>
      * ```
      * @default false
      * @since 1.8.5
      */
    var completeHTMLDocument: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Use text in curly braces as header id.
      *
      * @example
      *  ```md
      *   ## Sample header {real-id}     will use real-id as id
      *  ```
      * @default false
      * @since 1.7.0
      */
    var customizedHeaderId: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disables the requirement of indenting sublists by 4 spaces for them to be nested,
      * effectively reverting to the old behavior where 2 or 3 spaces were enough.
      *
      * @example
      * **input**:
      *
      * ```md
      * - one
      *   - two
      *
      * ...
      *
      * - one
      *     - two
      * ```
      *
      * **disableForced4SpacesIndentedSublists** = false
      *
      * ```html
      * <ul>
      * <li>one</li>
      * <li>two</li>
      * </ul>
      * <p>...</p>
      * <ul>
      * <li>one
      *    <ul>
      *        <li>two</li>
      *    </ul>
      * </li>
      * </ul>
      * ```
      *
      * **disableForced4SpacesIndentedSublists** = true
      *
      * ```html
      * <ul>
      * <li>one
      *    <ul>
      *        <li>two</li>
      *    </ul>
      * </li>
      * </ul>
      * <p>...</p>
      * <ul>
      * <li>one
      *    <ul>
      *        <li>two</li>
      *    </ul>
      * </li>
      * </ul>
      * ```
      * @default false
      * @since 1.5.0
      */
    var disableForced4SpacesIndentedSublists: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Replaces three dots with the ellipsis unicode character.
      * @default true
      */
    var ellipsis: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable emoji support.
      * 
      * @example
      * ```md
      * this is a :smile: emoji
      * ```
      * @default false
      * @see https://github.com/showdownjs/showdown/wiki/Emojis
      * @since 1.8.0
      */
    var emoji: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enables e-mail addresses encoding through the use of Character Entities, transforming ASCII e-mail addresses into its equivalent decimal entities.
      *
      * @remarks Prior to version 1.6.1, emails would always be obfuscated through dec and hex encoding.
      * @example
      * **input**:
      *
      * ```
      * <myself@example.com>
      * ```
      *
      * **encodeEmails** = false
      *
      * ```html
      * <a href="mailto:myself@example.com">myself@example.com</a>
      * ```
      *
      * **encodeEmails** = true
      *
      * ```html
      * <a href="&#109;&#97;&#105;&#108;t&#x6f;&#x3a;&#109;&#x79;s&#x65;&#x6c;&#102;&#64;&#x65;xa&#109;&#112;&#108;&#101;&#x2e;c&#x6f;&#109;">&#x6d;&#121;s&#101;&#108;f&#x40;&#x65;&#120;a&#x6d;&#x70;&#108;&#x65;&#x2e;&#99;&#x6f;&#109;</a>
      * ```
      * @default true
      * @since 1.6.1
      */
    var encodeEmails: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @deprecated https://github.com/showdownjs/showdown/commit/d3ebff7ef0cde5abfc3874463946d5297fc82e78
      * 
      * This option excludes trailing punctuation from autolinking urls.
      * Punctuation excluded: . ! ? ( ).
      *
      * @remarks This option only applies to links generated by {@link Showdown.ShowdownOptions.simplifiedAutoLink}.
      * @example
      * **input**:
      *
      * ```md
      *    check this link www.google.com.
      * ```
      *
      * **excludeTrailingPunctuationFromURLs** = false
      *
      * ```html
      * <p>check this link <a href="www.google.com">www.google.com.</a></p>
      * ```
      *
      * **excludeTrailingPunctuationFromURLs** = true
      *
      * ```html
      * <p>check this link <a href="www.google.com">www.google.com</a>.</p>
      * ```
      * @default false
      * @since 1.5.1
      */
    var excludeTrailingPunctuationFromURLs: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable support for GFM code block style syntax (fenced codeblocks).
      *
      * @example
      * **syntax**:
      *
      *     ```md
      *        some code here
      *        ```
      * @default true
      * @since 1.2.0
      */
    var ghCodeBlocks: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Generate header ids compatible with github style (spaces are replaced
      * with dashes and a bunch of non alphanumeric chars are removed).
      *
      * @example
      * **input**:
      *
      * ```md
      * # This is a header with @#$%
      * ```
      *
      * **ghCompatibleHeaderId** = false
      *
      * ```html
      * <h1 id="thisisaheader">This is a header</h1>
      * ```
      *
      * **ghCompatibleHeaderId** = true
      *
      * ```html
      * <h1 id="this-is-a-header-with-">This is a header with @#$%</h1>
      * ```
      * @default false
      * @since 1.5.5
      */
    var ghCompatibleHeaderId: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enables support for github @mentions, which links to the github profile page of the username mentioned.
      *
      * @example
      * **input**:
      *
      * ```md
      * hello there @tivie
      * ```
      *
      * **ghMentions** = false
      *
      * ```html
      * <p>hello there @tivie</p>
      * ```
      *
      * **ghMentions** = true
      *
      * ```html
      * <p>hello there <a href="https://www.github.com/tivie>@tivie</a></p>
      * ```
      * @default false
      * @since 1.6.0
      */
    var ghMentions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Changes the link generated by @mentions. `{u}` is replaced by the text of the mentions. Only applies if **[ghMentions][]** is enabled.
      *
      * @example
      * **input**:
      *
      * ```md
      * hello there @tivie
      * ```
      *
      * **ghMentionsLink** = https://github.com/{u}
      *
      * ```html
      * <p>hello there <a href="https://www.github.com/tivie>@tivie</a></p>
      * ```
      *
      * **ghMentionsLink** = http://mysite.com/{u}/profile
      *
      * ```html
      * <p>hello there <a href="//mysite.com/tivie/profile">@tivie</a></p>
      * ```
      * @default https://github.com/{u}
      * @since 1.6.2
      */
    var ghMentionsLink: js.UndefOr[String] = js.undefined
    
    /**
      * Set the header starting level. For instance, setting this to 3 means that
      * 
      * @example
      *  **input**:
      *
      * ```md
      * # header
      * ```
      *
      * **headerLevelStart** = 1
      *
      * ```html
      * <h1>header</h1>
      * ```
      *
      * **headerLevelStart** = 3
      *
      * ```html
      * <h3>header</h3>
      * ```
      * @default 1
      * @since 1.1.0
      */
    var headerLevelStart: js.UndefOr[Double] = js.undefined
    
    /**
      * Turning this on will stop showdown from interpreting underscores in the middle of
      * words as <em> and <strong> and instead treat them as literal underscores.
      *
      * @example
      * **input**:
      *
      * ```md
      * some text with__underscores__in middle
      * ```
      *
      * **literalMidWordUnderscores** = false
      *
      * ```html
      * <p>some text with<strong>underscores</strong>in middle</p>
      * ```
      *
      * **literalMidWordUnderscores** = true
      *
      * ```html
      * <p>some text with__underscores__in middle</p>
      * ```
      * @default false
      * @since 1.2.0
      */
    var literalMidWordUnderscores: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable support for document metadata (defined at the top of the document
      * between `«««` and `»»»` or between `---` and `---`).
      * 
      * @example
      *  ```js
      *  var conv = new showdown.Converter({metadata: true});
      *  var html = conv.makeHtml(someMd);
      *  var metadata = conv.getMetadata(); // returns an object with the document metadata
      * ```
      * @default false
      * @since 1.8.5
      */
    var metadata: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disable the automatic generation of header ids.
      * Showdown generates an id for headings automatically. This is useful for linking to a specific header.
      * This behavior, however, can be disabled with this option.
      *
      * @example
      * **input**:
      *
      * ```md
      * # This is a header
      * ```
      *
      * **noHeaderId** = false
      *
      * ```html
      * <h1 id="thisisaheader">This is a header</h1>
      * ```
      *
      * **noHeaderId** = true
      *
      * ```html
      * <h1>This is a header</h1>
      * ```
      * @default false
      * @since 1.1.0
      */
    var noHeaderId: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Omit the trailing newline in a code block.
      * By default, showdown adds a newline before the closing tags in code blocks. By enabling this option, that newline is removed.
      * This option affects both indented and fenced (gfm style) code blocks.
      *
      * @example
      *
      * **input**:
      *
      * ```md
      * var foo = 'bar';
      * ```
      *
      * **omitExtraWLInCodeBlocks** = false:
      *
      * ```html
      * <code><pre>var foo = 'bar';
      * </pre></code>
      * ```
      * **omitExtraWLInCodeBlocks** = true:
      *
      * ```html
      * <code><pre>var foo = 'bar';</pre></code>
      * ```
      * @default false
      * @since 1.0.0
      */
    var omitExtraWLInCodeBlocks: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Open all links in new windows (by adding the attribute target="_blank" to <a> tags).
      *
      * @example
      * **input**:
      *
      * ```md
      * [Showdown](http://showdownjs.com)
      * ```
      *
      * **openLinksInNewWindow** = false
      * ```html
      * <p><a href="http://showdownjs.com">Showdown</a></p>
      * ```
      * 
      * **openLinksInNewWindow** = true
      * ```html
      * <p><a href="http://showdownjs.com" target="_blank">Showdown</a></p>
      * ```
      * @default false
      * @since 1.7.0
      */
    var openLinksInNewWindow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable support for setting image dimensions from within markdown syntax.
      * 
      * @example
      * ```md
      * ![foo](foo.jpg =100x80)   simple, assumes units are in px
      * ![bar](bar.jpg =100x*)    sets the height to "auto"
      * ![baz](baz.jpg =80%x5em)  Image with width of 80% and height of 5em
      * ```
      * @default false
      * @since 1.1.0
      */
    var parseImgDimensions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Add a prefix to the generated header ids.
      * Passing a string will prefix that string to the header id.
      * Setting to true will add a generic 'section' prefix.
      *
      * @default false
      * @since 1.0.0
      */
    var prefixHeaderId: js.UndefOr[String | Boolean] = js.undefined
    
    /**
      * Remove only spaces, ' and " from generated header ids (including prefixes),
      * replacing them with dashes (-).
      * WARNING: This might result in malformed ids.
      *
      * @default false
      * @since 1.7.3
      */
    var rawHeaderId: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Setting this option to true will prevent showdown from modifying the prefix.
      * This might result in malformed IDs (if, for instance, the " char is used in the prefix).
      * Has no effect if prefixHeaderId is set to false.
      *
      * @default false
      * @since 1.7.3
      */
    var rawPrefixHeaderId: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Makes adding a space between # and the header text mandatory.
      *
      * @example
      * **input**:
      *
      * ```md
      * #header
      * ```
      *
      * **requireSpaceBeforeHeadingText** = false
      *
      * ```html
      * <h1 id="header">header</h1>
      * ```
      *
      * **simpleLineBreaks** = true
      *
      * ```html
      * <p>#header</p>
      * ```
      *
      * @default false
      * @since 1.5.3
      */
    var requireSpaceBeforeHeadingText: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Parses line breaks as like GitHub does, without needing 2 spaces at the end of the line.
      *
      * @example
      * **input**:
      *
      * ```md
      * a line
      * wrapped in two
      * ```
      *
      * **simpleLineBreaks** = false
      *
      * ```html
      * <p>a line
      * wrapped in two</p>
      * ```
      *
      * **simpleLineBreaks** = true
      *
      * ```html
      * <p>a line<br>
      * wrapped in two</p>
      * ```
      * @default false
      * @since 1.5.1
      */
    var simpleLineBreaks: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Turning this option on will enable automatic linking to urls.
      *
      * @example
      * **input**:
      *
      * ```md
      * some text www.google.com
      * ```
      *
      * **simplifiedAutoLink** = false
      *
      * ```html
      * <p>some text www.google.com</p>
      * ```
      *
      * **simplifiedAutoLink** = true
      *
      * ```html
      * <p>some text <a href="www.google.com">www.google.com</a></p>
      * ```
      * @default false
      * @since 1.2.0
      */
    var simplifiedAutoLink: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Tries to smartly fix indentation problems related to es6 template
      * strings in the midst of indented code.
      *
      * @default false
      * @since 1.4.2
      */
    var smartIndentationFix: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Prevents weird effects in live previews due to incomplete input.
      * 
      * @example
      * ![awkward effect](http://i.imgur.com/YQ9iHTL.gif)
      * You can prevent this by enabling this option.
      * @default false
      */
    var smoothLivePreview: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Split adjacent blockquote blocks.
      *
      * @since 1.8.6
      */
    var splitAdjacentBlockquotes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable support for strikethrough syntax.
      *
      * @example
      *  **syntax**:
      *
      * ```md
      * ~~strikethrough~~
      * ```
      *
      * ```html
      * <del>strikethrough</del>
      * ```
      * @default false
      * @since 1.2.0
      */
    var strikethrough: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable support for tables syntax.
      *
      * @example
      *  **syntax**:
      *
      * ```md
      * | h1    |    h2   |      h3 |
      * |:------|:-------:|--------:|
      * | 100   | [a][1]  | ![b][2] |
      * | *foo* | **bar** | ~~baz~~ |
      * ```
      * @default false
      * @since 1.2.0
      */
    var tables: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If enabled adds an id property to table headers tags.
      *
      * @remarks This options only applies if **[tables][]** is enabled.
      * @default false
      * @since 1.2.0
      */
    var tablesHeaderId: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable support for GFM takslists.
      *
      * @example
      * **syntax**:
      *
      * ```md
      *  - [x] This task is done
      *  - [ ] This is still pending
      * ```
      * @default false
      * @since 1.2.0
      */
    var tasklists: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable support for underline. Syntax is double or triple underscores: `__underline word__`. With this option enabled,
      * underscores no longer parses into `<em>` and `<strong>`
      *
      * @example
      * **input**:
      *
      * ```md
      * __underline word__
      * ```
      *
      * **underline** = false
      * ```html
      * <p><strong>underlined word</strong></p>
      * ```
      * 
      * **underline** = true
      * ```html
      * <p><u>underlined word</u></p>
      * ```
      * @default false
      * @since 1.8.0
      */
    var underline: js.UndefOr[Boolean] = js.undefined
  }
  object ShowdownOptions {
    
    inline def apply(): ShowdownOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShowdownOptions]
    }
    
    extension [Self <: ShowdownOptions](x: Self) {
      
      inline def setBackslashEscapesHTMLTags(value: Boolean): Self = StObject.set(x, "backslashEscapesHTMLTags", value.asInstanceOf[js.Any])
      
      inline def setBackslashEscapesHTMLTagsUndefined: Self = StObject.set(x, "backslashEscapesHTMLTags", js.undefined)
      
      inline def setCompleteHTMLDocument(value: Boolean): Self = StObject.set(x, "completeHTMLDocument", value.asInstanceOf[js.Any])
      
      inline def setCompleteHTMLDocumentUndefined: Self = StObject.set(x, "completeHTMLDocument", js.undefined)
      
      inline def setCustomizedHeaderId(value: Boolean): Self = StObject.set(x, "customizedHeaderId", value.asInstanceOf[js.Any])
      
      inline def setCustomizedHeaderIdUndefined: Self = StObject.set(x, "customizedHeaderId", js.undefined)
      
      inline def setDisableForced4SpacesIndentedSublists(value: Boolean): Self = StObject.set(x, "disableForced4SpacesIndentedSublists", value.asInstanceOf[js.Any])
      
      inline def setDisableForced4SpacesIndentedSublistsUndefined: Self = StObject.set(x, "disableForced4SpacesIndentedSublists", js.undefined)
      
      inline def setEllipsis(value: Boolean): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      inline def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
      
      inline def setEmoji(value: Boolean): Self = StObject.set(x, "emoji", value.asInstanceOf[js.Any])
      
      inline def setEmojiUndefined: Self = StObject.set(x, "emoji", js.undefined)
      
      inline def setEncodeEmails(value: Boolean): Self = StObject.set(x, "encodeEmails", value.asInstanceOf[js.Any])
      
      inline def setEncodeEmailsUndefined: Self = StObject.set(x, "encodeEmails", js.undefined)
      
      inline def setExcludeTrailingPunctuationFromURLs(value: Boolean): Self = StObject.set(x, "excludeTrailingPunctuationFromURLs", value.asInstanceOf[js.Any])
      
      inline def setExcludeTrailingPunctuationFromURLsUndefined: Self = StObject.set(x, "excludeTrailingPunctuationFromURLs", js.undefined)
      
      inline def setGhCodeBlocks(value: Boolean): Self = StObject.set(x, "ghCodeBlocks", value.asInstanceOf[js.Any])
      
      inline def setGhCodeBlocksUndefined: Self = StObject.set(x, "ghCodeBlocks", js.undefined)
      
      inline def setGhCompatibleHeaderId(value: Boolean): Self = StObject.set(x, "ghCompatibleHeaderId", value.asInstanceOf[js.Any])
      
      inline def setGhCompatibleHeaderIdUndefined: Self = StObject.set(x, "ghCompatibleHeaderId", js.undefined)
      
      inline def setGhMentions(value: Boolean): Self = StObject.set(x, "ghMentions", value.asInstanceOf[js.Any])
      
      inline def setGhMentionsLink(value: String): Self = StObject.set(x, "ghMentionsLink", value.asInstanceOf[js.Any])
      
      inline def setGhMentionsLinkUndefined: Self = StObject.set(x, "ghMentionsLink", js.undefined)
      
      inline def setGhMentionsUndefined: Self = StObject.set(x, "ghMentions", js.undefined)
      
      inline def setHeaderLevelStart(value: Double): Self = StObject.set(x, "headerLevelStart", value.asInstanceOf[js.Any])
      
      inline def setHeaderLevelStartUndefined: Self = StObject.set(x, "headerLevelStart", js.undefined)
      
      inline def setLiteralMidWordUnderscores(value: Boolean): Self = StObject.set(x, "literalMidWordUnderscores", value.asInstanceOf[js.Any])
      
      inline def setLiteralMidWordUnderscoresUndefined: Self = StObject.set(x, "literalMidWordUnderscores", js.undefined)
      
      inline def setMetadata(value: Boolean): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setNoHeaderId(value: Boolean): Self = StObject.set(x, "noHeaderId", value.asInstanceOf[js.Any])
      
      inline def setNoHeaderIdUndefined: Self = StObject.set(x, "noHeaderId", js.undefined)
      
      inline def setOmitExtraWLInCodeBlocks(value: Boolean): Self = StObject.set(x, "omitExtraWLInCodeBlocks", value.asInstanceOf[js.Any])
      
      inline def setOmitExtraWLInCodeBlocksUndefined: Self = StObject.set(x, "omitExtraWLInCodeBlocks", js.undefined)
      
      inline def setOpenLinksInNewWindow(value: Boolean): Self = StObject.set(x, "openLinksInNewWindow", value.asInstanceOf[js.Any])
      
      inline def setOpenLinksInNewWindowUndefined: Self = StObject.set(x, "openLinksInNewWindow", js.undefined)
      
      inline def setParseImgDimensions(value: Boolean): Self = StObject.set(x, "parseImgDimensions", value.asInstanceOf[js.Any])
      
      inline def setParseImgDimensionsUndefined: Self = StObject.set(x, "parseImgDimensions", js.undefined)
      
      inline def setPrefixHeaderId(value: String | Boolean): Self = StObject.set(x, "prefixHeaderId", value.asInstanceOf[js.Any])
      
      inline def setPrefixHeaderIdUndefined: Self = StObject.set(x, "prefixHeaderId", js.undefined)
      
      inline def setRawHeaderId(value: Boolean): Self = StObject.set(x, "rawHeaderId", value.asInstanceOf[js.Any])
      
      inline def setRawHeaderIdUndefined: Self = StObject.set(x, "rawHeaderId", js.undefined)
      
      inline def setRawPrefixHeaderId(value: Boolean): Self = StObject.set(x, "rawPrefixHeaderId", value.asInstanceOf[js.Any])
      
      inline def setRawPrefixHeaderIdUndefined: Self = StObject.set(x, "rawPrefixHeaderId", js.undefined)
      
      inline def setRequireSpaceBeforeHeadingText(value: Boolean): Self = StObject.set(x, "requireSpaceBeforeHeadingText", value.asInstanceOf[js.Any])
      
      inline def setRequireSpaceBeforeHeadingTextUndefined: Self = StObject.set(x, "requireSpaceBeforeHeadingText", js.undefined)
      
      inline def setSimpleLineBreaks(value: Boolean): Self = StObject.set(x, "simpleLineBreaks", value.asInstanceOf[js.Any])
      
      inline def setSimpleLineBreaksUndefined: Self = StObject.set(x, "simpleLineBreaks", js.undefined)
      
      inline def setSimplifiedAutoLink(value: Boolean): Self = StObject.set(x, "simplifiedAutoLink", value.asInstanceOf[js.Any])
      
      inline def setSimplifiedAutoLinkUndefined: Self = StObject.set(x, "simplifiedAutoLink", js.undefined)
      
      inline def setSmartIndentationFix(value: Boolean): Self = StObject.set(x, "smartIndentationFix", value.asInstanceOf[js.Any])
      
      inline def setSmartIndentationFixUndefined: Self = StObject.set(x, "smartIndentationFix", js.undefined)
      
      inline def setSmoothLivePreview(value: Boolean): Self = StObject.set(x, "smoothLivePreview", value.asInstanceOf[js.Any])
      
      inline def setSmoothLivePreviewUndefined: Self = StObject.set(x, "smoothLivePreview", js.undefined)
      
      inline def setSplitAdjacentBlockquotes(value: Boolean): Self = StObject.set(x, "splitAdjacentBlockquotes", value.asInstanceOf[js.Any])
      
      inline def setSplitAdjacentBlockquotesUndefined: Self = StObject.set(x, "splitAdjacentBlockquotes", js.undefined)
      
      inline def setStrikethrough(value: Boolean): Self = StObject.set(x, "strikethrough", value.asInstanceOf[js.Any])
      
      inline def setStrikethroughUndefined: Self = StObject.set(x, "strikethrough", js.undefined)
      
      inline def setTables(value: Boolean): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
      
      inline def setTablesHeaderId(value: Boolean): Self = StObject.set(x, "tablesHeaderId", value.asInstanceOf[js.Any])
      
      inline def setTablesHeaderIdUndefined: Self = StObject.set(x, "tablesHeaderId", js.undefined)
      
      inline def setTablesUndefined: Self = StObject.set(x, "tables", js.undefined)
      
      inline def setTasklists(value: Boolean): Self = StObject.set(x, "tasklists", value.asInstanceOf[js.Any])
      
      inline def setTasklistsUndefined: Self = StObject.set(x, "tasklists", js.undefined)
      
      inline def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
      
      inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
    }
  }
  
  /**
    * Showdown options schema.
    */
  type ShowdownOptionsSchema = StringDictionary[ShowdownOptionDescription]
  
  /**
    * Showdown subParser.
    */
  @js.native
  trait SubParser_ extends StObject {
    
    def apply(args: Any*): String = js.native
  }
}
