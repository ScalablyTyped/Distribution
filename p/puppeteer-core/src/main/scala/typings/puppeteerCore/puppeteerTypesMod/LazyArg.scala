package typings.puppeteerCore.puppeteerTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/types", "LazyArg")
@js.native
open class LazyArg[T] protected ()
  extends typings.puppeteerCore.lazyArgMod.LazyArg[T] {
  def this(get: js.Function0[js.Promise[T]]) = this()
}
