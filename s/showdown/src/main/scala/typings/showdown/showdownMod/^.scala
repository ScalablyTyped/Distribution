package typings.showdown.showdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("showdown", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Constructor function for a Converter.
    */
  var Converter: ConverterStatic = js.native
  /**
    * Showdown extensions.
    */
  var extensions: ShowdownExtensions = js.native
  /**
    * Showdown helper.
    */
  var helper: Helper = js.native
  /**
    * Get a registered extension.
    *
    * @param name - The extension name.
    * @returns Returns the extension of the given `name`.
    * @throws Throws if `name` is not of type string.
    * @throws Throws if the extension is not exists.
    */
  def extension(name: String): js.Array[ShowdownExtension] = js.native
  def extension(name: String, ext: js.Array[ShowdownExtension]): Unit = js.native
  /**
    * Register a extension.
    *
    * @param name - The name of the new extension.
    * @param ext - The extension.
    * @throws Throws if `name` is not of type string.
    */
  def extension(name: String, ext: js.Function0[js.Array[ShowdownExtension] | ShowdownExtension]): Unit = js.native
  def extension(name: String, ext: ShowdownExtension): Unit = js.native
  /**
    * Get the "global" extensions.
    *
    * @return Returns all extensions.
    */
  def getAllExtensions(): ShowdownExtensions = js.native
  /**
    * Get the default options.
    *
    * @param [simple=true] - If to returns the default showdown options or the showdown options schema.
    * @returns Returns the options schema if `simple` is `false`, otherwise the default showdown options.
    */
  def getDefaultOptions(): ShowdownOptionsSchema | ShowdownOptions = js.native
  def getDefaultOptions(simple: Boolean): ShowdownOptionsSchema | ShowdownOptions = js.native
  /**
    * Get the "global" currently set flavor.
    *
    * @returns Returns string flavor name.
    */
  def getFlavor(): Flavor = js.native
  /**
    * Get the options of a specified flavor. Returns undefined if the flavor was not found.
    *
    * @param name - Name of the flavor.
    * @returns Returns options object of the given flavor `name`.
    */
  def getFlavorOptions(name: Flavor): js.UndefOr[ShowdownOptions] = js.native
  /**
    * Get a "global" option.
    *
    * @param key - the option key.
    * @returns Returns the value of the given `key`.
    */
  def getOption(key: String): js.Any = js.native
  /**
    * Get the "global" options.
    *
    * @returns Returns a options object.
    */
  def getOptions(): ShowdownOptions = js.native
  /**
    * Remove an extension.
    *
    * @param name - The extension name.
    */
  def removeExtension(name: String): Unit = js.native
  /**
    * Removes all extensions.
    */
  def resetExtensions(): Unit = js.native
  /**
    * Reset "global" options to the default values.
    */
  def resetOptions(): Unit = js.native
  /**
    * Setting a "global" flavor affects all instances of showdown.
    *
    * @param name - The flavor name.
    */
  def setFlavor(name: Flavor): Unit = js.native
  /**
    * Setting a "global" option affects all instances of showdown.
    * 
    * @param key - the option key.
    * @param value - the option value.
    */
  def setOption(key: String, value: js.Any): js.Any = js.native
  /**
    * Get a registered subParser.
    *
    * @param name - The parser name.
    * @returns Returns the parser of the given `name`.
    * @throws Throws if `name` is not of type string.
    * @throws Throws if the parser is not exists.
    */
  def subParser(name: String): SubParser = js.native
  /**
    * Register a subParser.
    *
    * @param name - The name of the new parser.
    * @param func - The handler function of the new parser.
    * @throws Throws if `name` is not of type string.
    */
  def subParser(name: String, func: SubParser): Unit = js.native
  /**
    * Checks if the given `ext` is a valid showdown extension.
    *
    * @param ext - The extension to checks.
    * @returns Returns `true` if the extension is valid showdown extension, otherwise `false`.
    */
  def validateExtension(ext: js.Array[ShowdownExtension]): Boolean = js.native
  def validateExtension(ext: ShowdownExtension): Boolean = js.native
}

