package typings.showdown

import typings.showdown.mod.Converter
import typings.showdown.mod.ConverterOptions
import typings.showdown.mod.ConverterStatic
import typings.showdown.mod.Flavor
import typings.showdown.mod.Helper_
import typings.showdown.mod.ShowdownExtension
import typings.showdown.mod.ShowdownExtensions
import typings.showdown.mod.ShowdownOptions
import typings.showdown.mod.ShowdownOptionsSchema
import typings.showdown.mod.SubParser_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object showdown {
    
    @JSGlobal("showdown")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Constructor function for a Converter.
      */
    @JSGlobal("showdown.Converter")
    @js.native
    def Converter: ConverterStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("showdown.Converter")
    @js.native
    /**
      * @constructor
      * @param converterOptions - Configuration object, describes which extensions to apply.
      */
    class ConverterCls ()
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
    @JSGlobal("showdown.extensions")
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
    inline def getOption(key: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getOption")(key.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /**
      * Get the "global" options.
      *
      * @returns Returns a options object.
      */
    inline def getOptions(): ShowdownOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptions")().asInstanceOf[ShowdownOptions]
    
    /**
      * Showdown helper.
      */
    @JSGlobal("showdown.helper")
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
    inline def setOption(key: String, value: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setOption")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
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
  }
}
