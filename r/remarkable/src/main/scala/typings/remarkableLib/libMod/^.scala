package typings
package remarkableLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("remarkable/lib", JSImport.Namespace)
@js.native
/**
  * Markdown parser, done right.
  */
class ^ () extends Remarkable {
  def this(options: Options) = this()
  /**
    * Remarkable offers some "presets" as a convenience to quickly enable/disable
    * active syntax rules and options for common use cases.
    */
  def this(preset: remarkableLib.remarkableLibStrings.commonmark) = this()
  def this(preset: remarkableLib.remarkableLibStrings.full) = this()
  def this(preset: remarkableLib.remarkableLibStrings.remarkable) = this()
  def this(preset: remarkableLib.remarkableLibStrings.commonmark, options: Options) = this()
  def this(preset: remarkableLib.remarkableLibStrings.full, options: Options) = this()
  def this(preset: remarkableLib.remarkableLibStrings.remarkable, options: Options) = this()
}

@JSImport("remarkable/lib", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Useful helper functions for custom rendering.
    */
  var utils: remarkableLib.Anon_Assign = js.native
}

