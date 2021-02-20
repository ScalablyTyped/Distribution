package typings.readdirEnhanced

import org.scalablytyped.runtime.Shortcut
import typings.jsdevtoolsReaddirEnhanced.anon.Optionsstatsfalseundefine
import typings.jsdevtoolsReaddirEnhanced.anon.Optionsstatstrue
import typings.jsdevtoolsReaddirEnhanced.mod.Readdir_
import typings.jsdevtoolsReaddirEnhanced.typesPublicMod.Callback
import typings.jsdevtoolsReaddirEnhanced.typesPublicMod.Stats
import typings.node.streamMod.Readable
import typings.std.AsyncIterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("readdir-enhanced", JSImport.Default)
  @js.native
  val default: Readdir_ = js.native
  
  @JSImport("readdir-enhanced", "readdir")
  @js.native
  val readdir: Readdir_ = js.native
  
  @JSImport("readdir-enhanced", "readdirAsync")
  @js.native
  def readdirAsync(dir: String): js.Promise[js.Array[String]] = js.native
  @JSImport("readdir-enhanced", "readdirAsync")
  @js.native
  def readdirAsync(dir: String, callback: Callback[js.Array[String]]): Unit = js.native
  @JSImport("readdir-enhanced", "readdirAsync")
  @js.native
  def readdirAsync(dir: String, options: js.UndefOr[scala.Nothing], callback: Callback[js.Array[String]]): Unit = js.native
  @JSImport("readdir-enhanced", "readdirAsync")
  @js.native
  def readdirAsync(dir: String, options: Optionsstatsfalseundefine): js.Promise[js.Array[String]] = js.native
  @JSImport("readdir-enhanced", "readdirAsync")
  @js.native
  def readdirAsync(dir: String, options: Optionsstatsfalseundefine, callback: Callback[js.Array[String]]): Unit = js.native
  @JSImport("readdir-enhanced", "readdirAsync")
  @js.native
  def readdirAsync(dir: String, options: Optionsstatstrue): js.Promise[js.Array[Stats]] = js.native
  @JSImport("readdir-enhanced", "readdirAsync")
  @js.native
  def readdirAsync(dir: String, options: Optionsstatstrue, callback: Callback[js.Array[Stats]]): Unit = js.native
  
  @JSImport("readdir-enhanced", "readdirIterator")
  @js.native
  def readdirIterator(dir: String): AsyncIterableIterator[String] = js.native
  @JSImport("readdir-enhanced", "readdirIterator")
  @js.native
  def readdirIterator(dir: String, options: Optionsstatsfalseundefine): AsyncIterableIterator[String] = js.native
  @JSImport("readdir-enhanced", "readdirIterator")
  @js.native
  def readdirIterator(dir: String, options: Optionsstatstrue): AsyncIterableIterator[Stats] = js.native
  
  @JSImport("readdir-enhanced", "readdirStream")
  @js.native
  def readdirStream(dir: String): Readable = js.native
  @JSImport("readdir-enhanced", "readdirStream")
  @js.native
  def readdirStream(dir: String, options: Optionsstatsfalseundefine): Readable = js.native
  @JSImport("readdir-enhanced", "readdirStream")
  @js.native
  def readdirStream(dir: String, options: Optionsstatstrue): Readable = js.native
  
  @JSImport("readdir-enhanced", "readdirSync")
  @js.native
  def readdirSync(dir: String): js.Array[String] = js.native
  @JSImport("readdir-enhanced", "readdirSync")
  @js.native
  def readdirSync(dir: String, options: Optionsstatsfalseundefine): js.Array[String] = js.native
  @JSImport("readdir-enhanced", "readdirSync")
  @js.native
  def readdirSync(dir: String, options: Optionsstatstrue): js.Array[Stats] = js.native
  
  type _To = Readdir_
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: Readdir_ = default
}
