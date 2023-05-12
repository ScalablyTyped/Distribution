package typings.rcTable

import org.scalablytyped.runtime.Shortcut
import typings.rcTable.anon.FnCallPropsDebug
import typings.react.mod.MemoExoticComponent
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHooksUseRenderTimesMod extends Shortcut {
  
  @JSImport("rc-table/lib/hooks/useRenderTimes", JSImport.Default)
  @js.native
  val default: FnCallPropsDebug | js.Function0[Unit] = js.native
  
  @JSImport("rc-table/lib/hooks/useRenderTimes", "RenderBlock")
  @js.native
  val RenderBlock: MemoExoticComponent[js.Function0[Element]] = js.native
  
  type _To = FnCallPropsDebug | js.Function0[Unit]
  
  /* This means you don't have to write `default`, but can instead just say `libHooksUseRenderTimesMod.foo` */
  override def _to: FnCallPropsDebug | js.Function0[Unit] = default
}
