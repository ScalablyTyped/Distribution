package typings.snyk.distLibEcosystemsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamedTarget
  extends StObject
     with GitTarget {
  
  var name: String
}
object NamedTarget {
  
  inline def apply(name: String): NamedTarget = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedTarget]
  }
  
  extension [Self <: NamedTarget](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
