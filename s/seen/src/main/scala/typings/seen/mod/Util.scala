package typings.seen.mod

import typings.std.HTMLElement
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Util {
  
  @JSImport("seen", "Util.arraysEqual")
  @js.native
  def arraysEqual[T](a: js.Array[T], b: js.Array[T]): Boolean = js.native
  
  @JSImport("seen", "Util.defaults")
  @js.native
  def defaults[T](obj: T, opts: Partial[T], defaults: Partial[T]): Unit = js.native
  
  @JSImport("seen", "Util.element")
  @js.native
  def element(elementOrId: String): HTMLElement = js.native
  @JSImport("seen", "Util.element")
  @js.native
  def element(elementOrId: HTMLElement): HTMLElement = js.native
  
  @JSImport("seen", "Util.uniqueId")
  @js.native
  def uniqueId(): String = js.native
  @JSImport("seen", "Util.uniqueId")
  @js.native
  def uniqueId(prefix: String): String = js.native
}
