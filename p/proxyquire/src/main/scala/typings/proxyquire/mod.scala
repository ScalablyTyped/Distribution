package typings.proxyquire

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("proxyquire", JSImport.Namespace)
  @js.native
  val ^ : Proxyquire = js.native
  
  @js.native
  trait Proxyquire extends StObject {
    
    def apply(request: String, stubs: js.Any): js.Any = js.native
    
    def callThru(): Proxyquire = js.native
    
    def load(request: String, stubs: js.Any): js.Any = js.native
    @JSName("load")
    def load_T_T[T](request: String, stubs: js.Any): T = js.native
    
    def noCallThru(): Proxyquire = js.native
    
    def noPreserveCache(): Proxyquire = js.native
    
    def preserveCache(): Proxyquire = js.native
  }
  
  type _To = Proxyquire
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Proxyquire = ^
}
