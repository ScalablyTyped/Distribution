package typings.std.global

import typings.std.anon.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Enumerator")
@js.native
class Enumerator[T] protected ()
  extends typings.std.Enumerator[T] {
  def this(collection: js.Any) = this()
  def this(collection: Item[T]) = this()
  def this(safearray: typings.std.SafeArray[T]) = this()
}
