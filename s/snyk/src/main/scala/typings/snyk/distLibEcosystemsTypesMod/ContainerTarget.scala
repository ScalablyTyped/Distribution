package typings.snyk.distLibEcosystemsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerTarget extends StObject {
  
  var image: String
}
object ContainerTarget {
  
  inline def apply(image: String): ContainerTarget = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerTarget]
  }
  
  extension [Self <: ContainerTarget](x: Self) {
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
  }
}
