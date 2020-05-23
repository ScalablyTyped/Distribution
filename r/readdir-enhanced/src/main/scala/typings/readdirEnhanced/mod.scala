package typings.readdirEnhanced

import typings.jsdevtoolsReaddirEnhanced.anon.Optionsstatsfalse
import typings.jsdevtoolsReaddirEnhanced.anon.Optionsstatstrue
import typings.jsdevtoolsReaddirEnhanced.mod.Readdir_
import typings.jsdevtoolsReaddirEnhanced.typesPublicMod.Callback
import typings.jsdevtoolsReaddirEnhanced.typesPublicMod.Stats
import typings.node.streamMod.Readable
import typings.std.AsyncIterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("readdir-enhanced", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val default: Readdir_ = js.native
  val readdir: Readdir_ = js.native
  def readdirAsync(dir: String): js.Promise[js.Array[String]] = js.native
  def readdirAsync(dir: String, callback: Callback[js.Array[String]]): Unit = js.native
  def readdirAsync(dir: String, options: js.UndefOr[scala.Nothing], callback: Callback[js.Array[String]]): Unit = js.native
  def readdirAsync(dir: String, options: Optionsstatsfalse): js.Promise[js.Array[String]] = js.native
  def readdirAsync(dir: String, options: Optionsstatsfalse, callback: Callback[js.Array[String]]): Unit = js.native
  def readdirAsync(dir: String, options: Optionsstatstrue): js.Promise[js.Array[Stats]] = js.native
  def readdirAsync(dir: String, options: Optionsstatstrue, callback: Callback[js.Array[Stats]]): Unit = js.native
  def readdirIterator(dir: String): AsyncIterableIterator[String] = js.native
  def readdirIterator(dir: String, options: Optionsstatsfalse): AsyncIterableIterator[String] = js.native
  def readdirIterator(dir: String, options: Optionsstatstrue): AsyncIterableIterator[Stats] = js.native
  def readdirStream(dir: String): Readable = js.native
  def readdirStream(dir: String, options: Optionsstatsfalse): Readable = js.native
  def readdirStream(dir: String, options: Optionsstatstrue): Readable = js.native
  def readdirSync(dir: String): js.Array[String] = js.native
  def readdirSync(dir: String, options: Optionsstatsfalse): js.Array[String] = js.native
  def readdirSync(dir: String, options: Optionsstatstrue): js.Array[Stats] = js.native
}

