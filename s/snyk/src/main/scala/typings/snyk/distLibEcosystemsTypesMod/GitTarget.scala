package typings.snyk.distLibEcosystemsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitTarget extends StObject {
  
  var branch: js.UndefOr[String] = js.undefined
  
  var remoteUrl: js.UndefOr[String] = js.undefined
}
object GitTarget {
  
  inline def apply(): GitTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GitTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GitTarget] (val x: Self) extends AnyVal {
    
    inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    inline def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
    
    inline def setRemoteUrl(value: String): Self = StObject.set(x, "remoteUrl", value.asInstanceOf[js.Any])
    
    inline def setRemoteUrlUndefined: Self = StObject.set(x, "remoteUrl", js.undefined)
  }
}
