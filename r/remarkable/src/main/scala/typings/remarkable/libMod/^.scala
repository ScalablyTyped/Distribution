package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.commonmark
import typings.remarkable.remarkableStrings.default
import typings.remarkable.remarkableStrings.full
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("remarkable/lib", JSImport.Namespace)
@js.native
/**
  * Markdown parser, done right.
  */
open class ^ ()
  extends StObject
     with Remarkable {
  def this(options: Options) = this()
  /**
    * Remarkable offers some "presets" as a convenience to quickly enable/disable
    * active syntax rules and options for common use cases.
    */
  def this(preset: commonmark | full | default) = this()
  def this(preset: commonmark | full | default, options: Options) = this()
}
