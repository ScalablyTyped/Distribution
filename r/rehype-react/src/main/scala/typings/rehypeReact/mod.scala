package typings.rehypeReact

import org.scalablytyped.runtime.Shortcut
import typings.hast.mod.Root
import typings.react.mod.ReactElement
import typings.rehypeReact.libMod.Options
import typings.unified.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * Plugin to compile to React
    *
    * @param options
    *   Configuration.
    */
  // Note: defining all react nodes as result value seems to trip TS up.
  @JSImport("rehype-react", JSImport.Default)
  @js.native
  val default: Plugin[js.Array[Options], Root, ReactElement] = js.native
  
  type _To = Plugin[js.Array[Options], Root, ReactElement]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: Plugin[js.Array[Options], Root, ReactElement] = default
}
