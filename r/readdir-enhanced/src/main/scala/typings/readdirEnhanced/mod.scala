package typings.readdirEnhanced

import typings.jsdevtoolsReaddirEnhanced.anon.Optionsstatsfalseundefine
import typings.jsdevtoolsReaddirEnhanced.anon.Optionsstatstrue
import typings.jsdevtoolsReaddirEnhanced.libTypesPublicMod.Callback
import typings.jsdevtoolsReaddirEnhanced.libTypesPublicMod.Stats
import typings.jsdevtoolsReaddirEnhanced.mod.Readdir_
import typings.node.streamMod.Readable
import typings.std.AsyncIterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("readdir-enhanced", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("readdir-enhanced", JSImport.Default)
  @js.native
  val default: Readdir_ = js.native
  
  @JSImport("readdir-enhanced", "readdir")
  @js.native
  val readdir: Readdir_ = js.native
  
  inline def readdirAsync(dir: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readdirAsync")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  inline def readdirAsync(dir: String, callback: Callback[js.Array[String]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirAsync")(dir.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readdirAsync(dir: String, options: Unit, callback: Callback[js.Array[String]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirAsync")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readdirAsync(dir: String, options: Optionsstatsfalseundefine): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirAsync")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  inline def readdirAsync(dir: String, options: Optionsstatsfalseundefine, callback: Callback[js.Array[String]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirAsync")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readdirAsync(dir: String, options: Optionsstatstrue): js.Promise[js.Array[Stats]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirAsync")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Stats]]]
  inline def readdirAsync(dir: String, options: Optionsstatstrue, callback: Callback[js.Array[Stats]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirAsync")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def readdirIterator(dir: String): AsyncIterableIterator[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readdirIterator")(dir.asInstanceOf[js.Any]).asInstanceOf[AsyncIterableIterator[String]]
  inline def readdirIterator(dir: String, options: Optionsstatsfalseundefine): AsyncIterableIterator[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirIterator")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterableIterator[String]]
  inline def readdirIterator(dir: String, options: Optionsstatstrue): AsyncIterableIterator[Stats] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirIterator")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterableIterator[Stats]]
  
  inline def readdirStream(dir: String): Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("readdirStream")(dir.asInstanceOf[js.Any]).asInstanceOf[Readable]
  inline def readdirStream(dir: String, options: Optionsstatsfalseundefine): Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirStream")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Readable]
  inline def readdirStream(dir: String, options: Optionsstatstrue): Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirStream")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Readable]
  
  inline def readdirSync(dir: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def readdirSync(dir: String, options: Optionsstatsfalseundefine): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def readdirSync(dir: String, options: Optionsstatstrue): js.Array[Stats] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Stats]]
}
