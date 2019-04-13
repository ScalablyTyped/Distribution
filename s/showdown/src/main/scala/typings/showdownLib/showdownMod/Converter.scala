package typings
package showdownLib.showdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Converter extends js.Object {
  def addExtension(extension: js.Array[ShowdownExtension], name: java.lang.String): scala.Unit = js.native
  /**
    * Add extension to THIS converter.
    *
    * @param extension
    * @param name
    */
  def addExtension(extension: ShowdownExtension, name: java.lang.String): scala.Unit = js.native
  /**
    * Get all extensions.
    *
    * @return all extensions.
    */
  def getAllExtensions(): ConverterExtensions = js.native
  /**
    * Get the metadata of the previously parsed document
    * @param raw
    * @returns {string|{}}
    */
  def getMetadata(): java.lang.String | Metadata = js.native
  def getMetadata(raw: scala.Boolean): java.lang.String | Metadata = js.native
  /**
    * Get the metadata format of the previously parsed document
    * @returns {string}
    */
  def getMetadataFormat(): java.lang.String = js.native
  /**
    * Get the option of this Converter instance.
    *
    * @param optionKey
    */
  def getOption(optionKey: java.lang.String): js.Any = js.native
  /**
    * Get the options of this Converter instance.
    */
  def getOptions(): ShowdownOptions = js.native
  /**
    * @param text The input text (markdown)
    * @return The output HTML
    */
  def makeHtml(text: java.lang.String): java.lang.String = js.native
  /**
    * Converts an HTML string into a markdown string
    *
    * @param src The input text (HTML)
    * @param [HTMLParser] A WHATWG DOM and HTML parser, such as JSDOM. If none is supplied, window.document will be used.
    * @returns The output markdown
    */
  def makeMarkdown(src: java.lang.String): java.lang.String = js.native
  def makeMarkdown(src: java.lang.String, HTMLParser: stdLib.HTMLDocument): java.lang.String = js.native
  /**
    * Remove an extension from THIS converter.
    *
    * Note: This is a costly operation. It's better to initialize a new converter
    * and specify the extensions you wish to use.
    *
    * @param extensions
    */
  def removeExtension(extensions: js.Array[ShowdownExtension]): scala.Unit = js.native
  def removeExtension(extensions: ShowdownExtension): scala.Unit = js.native
  @JSName("setFlavor")
  def setFlavor_allOn(name: showdownLib.showdownLibStrings.allOn): scala.Unit = js.native
  @JSName("setFlavor")
  def setFlavor_ghost(name: showdownLib.showdownLibStrings.ghost): scala.Unit = js.native
  /**
    * Set a "local" flavor for THIS Converter instance
    *
    * @param flavor name
    */
  @JSName("setFlavor")
  def setFlavor_github(name: showdownLib.showdownLibStrings.github): scala.Unit = js.native
  @JSName("setFlavor")
  def setFlavor_original(name: showdownLib.showdownLibStrings.original): scala.Unit = js.native
  @JSName("setFlavor")
  def setFlavor_vanilla(name: showdownLib.showdownLibStrings.vanilla): scala.Unit = js.native
  /**
    * Setting a "local" option only affects the specified Converter object.
    *
    * @param optionKey
    * @param value
    */
  def setOption(optionKey: java.lang.String, value: js.Any): scala.Unit = js.native
  /**
    * Use a global registered extension with THIS converter
    *
    * @param extensionName Name of the previously registered extension.
    */
  def useExtension(extensionName: java.lang.String): scala.Unit = js.native
}

@JSImport("showdown", "Converter")
@js.native
/**
  * @constructor
  * @param converterOptions Configuration object, describes which extensions to apply
  */
class ConverterCls () extends Converter {
  def this(converterOptions: ConverterOptions) = this()
}

