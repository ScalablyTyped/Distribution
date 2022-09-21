package typings.stencilCore

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("*.css", JSImport.Default)
  @js.native
  val default: String = js.native
  
  type _To = String
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: String = default
}
