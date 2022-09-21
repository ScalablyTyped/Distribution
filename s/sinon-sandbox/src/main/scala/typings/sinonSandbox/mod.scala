package typings.sinonSandbox

import org.scalablytyped.runtime.Shortcut
import typings.sinon.mod.SinonSandbox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("sinon-sandbox", JSImport.Namespace)
  @js.native
  val ^ : SinonSandbox = js.native
  
  type _To = SinonSandbox
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: SinonSandbox = ^
}
