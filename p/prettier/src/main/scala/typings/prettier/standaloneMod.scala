package typings.prettier

import typings.prettier.mod.CursorOptions
import typings.prettier.mod.CursorResult
import typings.prettier.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object standaloneMod {
  
  @JSImport("prettier/standalone", "check")
  @js.native
  def check(source: String): Boolean = js.native
  @JSImport("prettier/standalone", "check")
  @js.native
  def check(source: String, options: Options): Boolean = js.native
  
  @JSImport("prettier/standalone", "format")
  @js.native
  def format(source: String): String = js.native
  @JSImport("prettier/standalone", "format")
  @js.native
  def format(source: String, options: Options): String = js.native
  
  @JSImport("prettier/standalone", "formatWithCursor")
  @js.native
  def formatWithCursor(source: String, options: CursorOptions): CursorResult = js.native
}
