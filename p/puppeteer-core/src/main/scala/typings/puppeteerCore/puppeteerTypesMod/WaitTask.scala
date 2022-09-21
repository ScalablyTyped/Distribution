package typings.puppeteerCore.puppeteerTypesMod

import typings.puppeteerCore.waitTaskMod.WaitTaskOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/types", "WaitTask")
@js.native
open class WaitTask[T] protected ()
  extends typings.puppeteerCore.waitTaskMod.WaitTask[T] {
  def this(
    world: typings.puppeteerCore.isolatedWorldMod.IsolatedWorld,
    options: WaitTaskOptions,
    fn: String,
    args: Any*
  ) = this()
  def this(
    world: typings.puppeteerCore.isolatedWorldMod.IsolatedWorld,
    options: WaitTaskOptions,
    fn: js.Function1[/* repeated */ Any, js.Promise[T]],
    args: Any*
  ) = this()
}
