package typings.rehypeParse

import org.scalablytyped.runtime.Shortcut
import typings.hast.mod.Root
import typings.rehypeParse.libMod.Options
import typings.unified.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("rehype-parse", JSImport.Default)
  @js.native
  val default: Plugin[js.Array[js.UndefOr[Options | Unit]], String, Root] = js.native
  
  type _To = Plugin[js.Array[js.UndefOr[Options | Unit]], String, Root]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: Plugin[js.Array[js.UndefOr[Options | Unit]], String, Root] = default
}
