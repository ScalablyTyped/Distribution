package typings.reactDndShallowequal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-dnd/shallowequal", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def shallowEqual[T](objA: T, objB: T): Boolean = js.native
  def shallowEqual[T](objA: T, objB: T, compare: js.UndefOr[scala.Nothing], compareContext: js.Any): Boolean = js.native
  def shallowEqual[T](
    objA: T,
    objB: T,
    compare: js.Function3[/* a */ T, /* b */ T, /* key */ js.UndefOr[String], Boolean | Unit]
  ): Boolean = js.native
  def shallowEqual[T](
    objA: T,
    objB: T,
    compare: js.Function3[/* a */ T, /* b */ T, /* key */ js.UndefOr[String], Boolean | Unit],
    compareContext: js.Any
  ): Boolean = js.native
}
