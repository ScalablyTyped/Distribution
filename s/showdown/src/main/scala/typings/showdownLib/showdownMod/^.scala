package typings
package showdownLib.showdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("showdown", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /** Constructor function for a Converter */
  var Converter: ConverterStatic = js.native
  /**
    * Showdown helper
    */
  var helper: Helper = js.native
  /** 
    * Registered extensions
    *
    * @prarm name
    * @param extenstion
    */
  def extension(name: java.lang.String, extension: js.Function0[js.Array[ShowdownExtension] | ShowdownExtension]): scala.Unit = js.native
  def extension(name: java.lang.String, extension: ShowdownExtension): scala.Unit = js.native
  /**
    * @return all extensions.
    */
  def getAllExtensions(): org.scalablytyped.runtime.StringDictionary[js.Array[ShowdownExtension]] = js.native
  /**
    * Retrieve the default options.
    */
  def getDefaultOptions(): ShowdownOptions = js.native
  /**
    * Retrieve previous set global option.
    * @param optionKey
    */
  def getOption(optionKey: java.lang.String): js.Any = js.native
  /**
    * Retrieve previous set global options.
    */
  def getOptions(): ShowdownOptions = js.native
  /**
    * Remove an extension.
    *
    * @param name
    */
  def removeExtension(name: java.lang.String): scala.Unit = js.native
  /**
    * Get an extension.
    *
    * @param name
    * @return The extensions array.
    */
  def resetExtensions(): scala.Unit = js.native
  /**
    * Reset options.
    */
  def resetOptions(): scala.Unit = js.native
  @JSName("setFlavor")
  def setFlavor_allOn(name: showdownLib.showdownLibStrings.allOn): scala.Unit = js.native
  @JSName("setFlavor")
  def setFlavor_ghost(name: showdownLib.showdownLibStrings.ghost): scala.Unit = js.native
  /**
    * Setting a "global" flavor affects all instances of showdown
    *
    * @param name
    */
  @JSName("setFlavor")
  def setFlavor_github(name: showdownLib.showdownLibStrings.github): scala.Unit = js.native
  @JSName("setFlavor")
  def setFlavor_original(name: showdownLib.showdownLibStrings.original): scala.Unit = js.native
  @JSName("setFlavor")
  def setFlavor_vanilla(name: showdownLib.showdownLibStrings.vanilla): scala.Unit = js.native
  /**
    * Setting a "global" option affects all instances of showdown
    * 
    * @param optionKey
    * @param value
    */
  def setOption(optionKey: java.lang.String, value: js.Any): scala.Unit = js.native
}

