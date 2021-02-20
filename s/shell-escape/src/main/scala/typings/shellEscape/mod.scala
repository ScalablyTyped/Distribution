package typings.shellEscape

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("shell-escape", JSImport.Namespace)
  @js.native
  val ^ : ShellEscape = js.native
  
  type ShellEscape = js.Function1[/* a */ js.Array[String], String]
  
  type _To = ShellEscape
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ShellEscape = ^
}
