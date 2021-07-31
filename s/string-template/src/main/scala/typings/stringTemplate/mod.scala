package typings.stringTemplate

import org.scalablytyped.runtime.Shortcut
import typings.stringTemplate.StringTemplate.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * MODULES
  */
object mod extends Shortcut {
  
  @JSImport("string-template", JSImport.Namespace)
  @js.native
  val ^ : Format = js.native
  
  type _To = Format
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Format = ^
}
