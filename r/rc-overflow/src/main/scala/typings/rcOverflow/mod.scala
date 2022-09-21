package typings.rcOverflow

import org.scalablytyped.runtime.Shortcut
import typings.rcOverflow.overflowMod.FilledOverflowType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("rc-overflow", JSImport.Default)
  @js.native
  val default: FilledOverflowType = js.native
  
  type _To = FilledOverflowType
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: FilledOverflowType = default
}
