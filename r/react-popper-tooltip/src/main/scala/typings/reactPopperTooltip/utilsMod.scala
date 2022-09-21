package typings.reactPopperTooltip

import typings.react.mod.Context
import typings.reactPopperTooltip.typesMod.Ref
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("react-popper-tooltip/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-popper-tooltip/dist/utils", "TooltipContext")
  @js.native
  val TooltipContext: Context[js.Object] = js.native
  
  inline def callAll(fns: Fn*): js.Function1[/* repeated */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("callAll")(fns.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function1[/* repeated */ Any, Unit]]
  
  inline def canUseDOM(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canUseDOM")().asInstanceOf[Boolean]
  
  inline def noop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Unit]
  
  inline def setRef(ref: Ref): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setRef")(ref.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setRef(ref: Ref, node: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRef")(ref.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Fn = js.UndefOr[js.Function1[/* repeated */ Any, Unit]]
}
