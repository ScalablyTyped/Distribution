package typings.remarkable.remarkableMod

import typings.remarkable.TypeofUtils
import typings.remarkable.libMod.Options
import typings.remarkable.remarkableStrings.commonmark
import typings.remarkable.remarkableStrings.full
import typings.remarkable.remarkableStrings.remarkable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("remarkable", JSImport.Namespace)
@js.native
/**
  * Markdown parser, done right.
  */
class ^ ()
  extends typings.remarkable.libMod.^ {
  def this(options: Options) = this()
  /**
    * Remarkable offers some "presets" as a convenience to quickly enable/disable
    * active syntax rules and options for common use cases.
    */
  def this(preset: commonmark) = this()
  def this(preset: full) = this()
  def this(preset: remarkable) = this()
  def this(preset: commonmark, options: Options) = this()
  def this(preset: full, options: Options) = this()
  def this(preset: remarkable, options: Options) = this()
}

@JSImport("remarkable", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Useful helper functions for custom rendering.
    */
  var utils: TypeofUtils = js.native
}

