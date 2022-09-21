package typings.rcTable

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stickyContextMod extends Shortcut {
  
  @JSImport("rc-table/lib/context/StickyContext", JSImport.Default)
  @js.native
  val default: Context[Boolean] = js.native
  
  type _To = Context[Boolean]
  
  /* This means you don't have to write `default`, but can instead just say `stickyContextMod.foo` */
  override def _to: Context[Boolean] = default
}
