package typings.remarkable

import typings.remarkable.anon.TypeofUtils
import typings.remarkable.libMod.Options
import typings.remarkable.libMod.^
import typings.remarkable.remarkableStrings.commonmark
import typings.remarkable.remarkableStrings.full
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("remarkable", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  /**
    * Markdown parser, done right.
    */
  class Remarkable () extends ^ {
    def this(options: Options) = this()
    /**
      * Remarkable offers some "presets" as a convenience to quickly enable/disable
      * active syntax rules and options for common use cases.
      */
    def this(preset: commonmark) = this()
    def this(preset: full) = this()
    def this(preset: typings.remarkable.remarkableStrings.remarkable) = this()
    def this(preset: commonmark, options: Options) = this()
    def this(preset: full, options: Options) = this()
    def this(preset: typings.remarkable.remarkableStrings.remarkable, options: Options) = this()
  }
  /* static members */
  @js.native
  object Remarkable extends js.Object {
    
    /**
      * Useful helper functions for custom rendering.
      */
    var utils: TypeofUtils = js.native
  }
}
