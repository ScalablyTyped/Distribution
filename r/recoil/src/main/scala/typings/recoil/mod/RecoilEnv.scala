package typings.recoil.mod

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecoilEnv extends StObject {
  
  var RECOIL_DUPLICATE_ATOM_KEY_CHECKING_ENABLED: Boolean
  
  var RECOIL_GKS_ENABLED: Set[String]
}
object RecoilEnv {
  
  @JSImport("recoil", "RecoilEnv")
  @js.native
  val ^ : RecoilEnv = js.native
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecoilEnv] (val x: Self) extends AnyVal {
    
    inline def setRECOIL_DUPLICATE_ATOM_KEY_CHECKING_ENABLED(value: Boolean): Self = StObject.set(x, "RECOIL_DUPLICATE_ATOM_KEY_CHECKING_ENABLED", value.asInstanceOf[js.Any])
    
    inline def setRECOIL_GKS_ENABLED(value: Set[String]): Self = StObject.set(x, "RECOIL_GKS_ENABLED", value.asInstanceOf[js.Any])
  }
}
