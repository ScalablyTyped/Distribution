package typings.puppeteerCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assertMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/assert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def assert(value: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assert")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def assert(value: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
