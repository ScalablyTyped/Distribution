package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Worker
  extends StObject
     with JSEvalable[js.Any] {
  
  def executionContext(): js.Promise[ExecutionContext] = js.native
  
  def url(): String = js.native
}
