package typings.seen.mod

import typings.std.HTMLElement
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Util {
  
  @JSImport("seen", "Util")
  @js.native
  val ^ : js.Any = js.native
  
  inline def arraysEqual[T](a: js.Array[T], b: js.Array[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arraysEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def defaults[T](obj: T, opts: Partial[T], defaults: Partial[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(obj.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def element(elementOrId: String): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("element")(elementOrId.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  inline def element(elementOrId: HTMLElement): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("element")(elementOrId.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  
  inline def uniqueId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uniqueId")().asInstanceOf[String]
  inline def uniqueId(prefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uniqueId")(prefix.asInstanceOf[js.Any]).asInstanceOf[String]
}
