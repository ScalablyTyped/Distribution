package typings
package showdownLib.showdownMod.ShowdownNs

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
           * @returns The output markdown
           */
  def makeMarkdown(src: java.lang.String): java.lang.String = js.native
  /**
           * Remove an extension from THIS converter.
           *
           * Note: This is a costly operation. It's better to initialize a new converter
           * and specify the extensions you wish to use.
           *
           * @param extensions
           */
  def removeExtension(extensions: js.Array[ShowdownExtension]): scala.Unit = js.native
  /**
           * Remove an extension from THIS converter.
           *
           * Note: This is a costly operation. It's better to initialize a new converter
           * and specify the extensions you wish to use.
           *
           * @param extensions
           */
  def removeExtension(extensions: ShowdownExtension): scala.Unit = js.native
  /**
           * Set a "local" flavor for THIS Converter instance
           *
           * @param flavor name
           */
  def setFlavor(name: java.lang.String): scala.Unit = js.native
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

