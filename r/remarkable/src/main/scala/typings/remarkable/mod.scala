package typings.remarkable

import typings.remarkable.libMod.Options
import typings.remarkable.libMod.^
import typings.remarkable.remarkableStrings.commonmark
import typings.remarkable.remarkableStrings.full
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("remarkable", "Remarkable")
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
  object Remarkable {
    
    /**
      * Useful helper functions for custom rendering.
      */
    /* static member */
    object utils {
      
      @JSImport("remarkable", "Remarkable.utils.assign")
      @js.native
      def assign(target: js.Any, sources: js.Any*): js.Any = js.native
      
      @JSImport("remarkable", "Remarkable.utils.escapeHtml")
      @js.native
      def escapeHtml(str: String): String = js.native
      
      @JSImport("remarkable", "Remarkable.utils.fromCodePoint")
      @js.native
      def fromCodePoint(c: Double): String = js.native
      
      @JSImport("remarkable", "Remarkable.utils.has")
      @js.native
      def has(`object`: js.Any, key: String): Boolean = js.native
      
      @JSImport("remarkable", "Remarkable.utils.isString")
      @js.native
      def isString(): Boolean = js.native
      @JSImport("remarkable", "Remarkable.utils.isString")
      @js.native
      def isString(obj: js.Any): Boolean = js.native
      
      @JSImport("remarkable", "Remarkable.utils.isValidEntityCode")
      @js.native
      def isValidEntityCode(c: Double): Boolean = js.native
      
      @JSImport("remarkable", "Remarkable.utils.replaceEntities")
      @js.native
      def replaceEntities(str: String): String = js.native
      
      @JSImport("remarkable", "Remarkable.utils.unescapeMd")
      @js.native
      def unescapeMd(str: String): String = js.native
    }
  }
}
