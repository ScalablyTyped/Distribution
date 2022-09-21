package typings.puppeteer.puppeteerTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer/lib/cjs/puppeteer/types", "LazyArg")
@js.native
open class LazyArg[T] protected ()
  extends typings.puppeteer.lazyArgMod.LazyArg[T] {
  def this(get: js.Function0[js.Promise[T]]) = this()
}
