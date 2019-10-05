package typings.showdown.showdownMod

import org.scalablytyped.runtime.TopLevel
import typings.std.HTMLDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Showdown Converter prototype.
  *
  * @see https://github.com/showdownjs/showdown/blob/master/src/converter.js
  */
@js.native
trait Converter extends js.Object {
  def addExtension(extension: js.Array[ShowdownExtension]): Unit = js.native
  def addExtension(extension: js.Array[ShowdownExtension], name: String): Unit = js.native
  /**
    * Add extension to THIS converter.
    *
    * @param extension - The new extension to add.
    * @param name - The extension name.
    */
  def addExtension(extension: js.Function0[js.Array[ShowdownExtension] | ShowdownExtension]): Unit = js.native
  def addExtension(extension: js.Function0[js.Array[ShowdownExtension] | ShowdownExtension], name: String): Unit = js.native
  def addExtension(extension: ShowdownExtension): Unit = js.native
  def addExtension(extension: ShowdownExtension, name: String): Unit = js.native
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
  def getOption(key: String): js.Any = js.native
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
  def setOption(key: String, value: js.Any): Unit = js.native
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
object Converter extends TopLevel[ConverterStatic]

