package typings.rbx

import typings.react.mod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("rbx/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def canUseDOM(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canUseDOM")().asInstanceOf[Boolean]
  
  @scala.inline
  def combineRefs[T](refs: (js.UndefOr[(js.Function1[/* instance */ T | Null, Unit]) | RefObject[T] | Null])*): js.Function1[/* instance */ T | Null, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineRefs")(refs.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* instance */ T | Null, Unit]]
  
  @scala.inline
  def noop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Unit]
}
