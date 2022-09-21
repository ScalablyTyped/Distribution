package typings.remarkHint

import org.scalablytyped.runtime.Shortcut
import typings.mdast.mod.Root
import typings.unified.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("remark-hint", JSImport.Namespace)
  @js.native
  val ^ : Plugin[js.Array[Any], Root, Root] = js.native
  
  type _To = Plugin[js.Array[Any], Root, Root]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Plugin[js.Array[Any], Root, Root] = ^
}
