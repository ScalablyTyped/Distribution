package typings
package showdownLib.showdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("showdown", JSImport.Namespace)
@js.native
object showdownModMembers extends js.Object {
  /** Constructor function for a Converter */
  var Converter: showdownLib.showdownMod.ShowdownNs.ConverterStatic = js.native
  /**
       * Showdown helper
       */
  var helper: showdownLib.showdownMod.ShowdownNs.Helper = js.native
  /** 
       * Registered extensions
       *
       * @prarm name
       * @param extenstion
       */
  def extension(
    name: java.lang.String,
    extension: js.Function0[
      js.Array[showdownLib.showdownMod.ShowdownNs.ShowdownExtension] | showdownLib.showdownMod.ShowdownNs.ShowdownExtension
    ]
  ): scala.Unit = js.native
  /** 
       * Registered extensions
       *
       * @prarm name
       * @param extenstion
       */
  def extension(name: java.lang.String, extension: showdownLib.showdownMod.ShowdownNs.ShowdownExtension): scala.Unit = js.native
  /**
       * @return all extensions.
       */
  def getAllExtensions(): org.scalablytyped.runtime.StringDictionary[js.Array[showdownLib.showdownMod.ShowdownNs.ShowdownExtension]] = js.native
  /**
       * Retrieve the default options.
       */
  def getDefaultOptions(): showdownLib.showdownMod.ShowdownNs.ShowdownOptions = js.native
  /**
       * Retrieve previous set global option.
       * @param optionKey
       */
  def getOption(optionKey: java.lang.String): js.Any = js.native
  /**
       * Retrieve previous set global options.
       */
  def getOptions(): showdownLib.showdownMod.ShowdownNs.ShowdownOptions = js.native
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
  /**
       * Setting a "global" flavor affects all instances of showdown
       *
       * @param name
       */
  def setFlavor(name: java.lang.String): scala.Unit = js.native
  /**
       * Setting a "global" option affects all instances of showdown
       * 
       * @param optionKey
       * @param value
       */
  def setOption(optionKey: java.lang.String, value: js.Any): scala.Unit = js.native
}

