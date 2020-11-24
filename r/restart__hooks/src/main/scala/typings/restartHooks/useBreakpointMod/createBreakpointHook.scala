package typings.restartHooks.useBreakpointMod

import typings.restartHooks.anon.FnCall
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@restart/hooks/cjs/useBreakpoint", "createBreakpointHook")
@js.native
object createBreakpointHook extends js.Object {
  
  def apply[TKey /* <: String */](breakpointValues: Record[TKey, String | Double]): FnCall[TKey] = js.native
}
