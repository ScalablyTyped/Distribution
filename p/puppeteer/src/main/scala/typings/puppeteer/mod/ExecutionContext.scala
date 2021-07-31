package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecutionContext
  extends StObject
     with JSEvalable[js.Any] {
  
  def queryObjects(prototypeHandle: JSHandle[js.Any]): js.Promise[JSHandle[js.Any]] = js.native
}
