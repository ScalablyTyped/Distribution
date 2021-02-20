package typings.reactDndShallowequal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-dnd/shallowequal", "shallowEqual")
  @js.native
  def shallowEqual[T](objA: T, objB: T): Boolean = js.native
  @JSImport("@react-dnd/shallowequal", "shallowEqual")
  @js.native
  def shallowEqual[T](objA: T, objB: T, compare: js.UndefOr[scala.Nothing], compareContext: js.Any): Boolean = js.native
  @JSImport("@react-dnd/shallowequal", "shallowEqual")
  @js.native
  def shallowEqual[T](
    objA: T,
    objB: T,
    compare: js.Function3[/* a */ T, /* b */ T, /* key */ js.UndefOr[String], Boolean | Unit]
  ): Boolean = js.native
  @JSImport("@react-dnd/shallowequal", "shallowEqual")
  @js.native
  def shallowEqual[T](
    objA: T,
    objB: T,
    compare: js.Function3[/* a */ T, /* b */ T, /* key */ js.UndefOr[String], Boolean | Unit],
    compareContext: js.Any
  ): Boolean = js.native
}
