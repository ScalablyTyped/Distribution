package typings.prettier

import typings.prettier.mod.CursorOptions
import typings.prettier.mod.CursorResult
import typings.prettier.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object standaloneMod {
  
  @JSImport("prettier/standalone", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def check(source: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(source.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def check(source: String, options: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def format(source: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(source.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def format(source: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def formatWithCursor(source: String, options: CursorOptions): CursorResult = (^.asInstanceOf[js.Dynamic].applyDynamic("formatWithCursor")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CursorResult]
}
