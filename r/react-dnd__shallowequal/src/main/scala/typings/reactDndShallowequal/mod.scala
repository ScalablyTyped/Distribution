package typings.reactDndShallowequal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-dnd/shallowequal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def shallowEqual[T](objA: T, objB: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowEqual")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def shallowEqual[T](
    objA: T,
    objB: T,
    compare: js.Function3[/* a */ T, /* b */ T, /* key */ js.UndefOr[String], Boolean | Unit]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowEqual")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def shallowEqual[T](
    objA: T,
    objB: T,
    compare: js.Function3[/* a */ T, /* b */ T, /* key */ js.UndefOr[String], Boolean | Unit],
    compareContext: js.Any
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowEqual")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], compare.asInstanceOf[js.Any], compareContext.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def shallowEqual[T](objA: T, objB: T, compare: Unit, compareContext: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowEqual")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], compare.asInstanceOf[js.Any], compareContext.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
