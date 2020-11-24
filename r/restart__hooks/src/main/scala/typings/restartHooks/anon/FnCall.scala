package typings.restartHooks.anon

import typings.restartHooks.restartHooksBooleans.`true`
import typings.restartHooks.restartHooksStrings.down
import typings.restartHooks.restartHooksStrings.up
import typings.restartHooks.useBreakpointMod.BreakpointDirection
import typings.std.Partial
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall[TKey /* <: String */] extends js.Object {
  
  def apply(breakpointMap: Partial[Record[TKey, BreakpointDirection]]): Boolean = js.native
  def apply(breakpoint: TKey): Boolean = js.native
  def apply(breakpoint: TKey, direction: `true`): Boolean = js.native
  def apply(breakpoint: TKey, direction: down): Boolean = js.native
  def apply(breakpoint: TKey, direction: up): Boolean = js.native
}
