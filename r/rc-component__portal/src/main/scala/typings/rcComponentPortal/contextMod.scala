package typings.rcComponentPortal

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Context
import typings.std.VoidFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMod extends Shortcut {
  
  @JSImport("@rc-component/portal/es/Context", JSImport.Default)
  @js.native
  val default: Context[QueueCreate] = js.native
  
  type QueueCreate = js.Function1[/* appendFunc */ VoidFunction, Unit]
  
  type _To = Context[QueueCreate]
  
  /* This means you don't have to write `default`, but can instead just say `contextMod.foo` */
  override def _to: Context[QueueCreate] = default
}
