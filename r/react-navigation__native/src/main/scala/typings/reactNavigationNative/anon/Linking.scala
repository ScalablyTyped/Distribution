package typings.reactNavigationNative.anon

import typings.reactNavigationNative.typesMod.LinkingOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Linking extends StObject {
  
  val linking: LinkingOptions[Any]
}
object Linking {
  
  inline def apply(linking: LinkingOptions[Any]): Linking = {
    val __obj = js.Dynamic.literal(linking = linking.asInstanceOf[js.Any])
    __obj.asInstanceOf[Linking]
  }
  
  extension [Self <: Linking](x: Self) {
    
    inline def setLinking(value: LinkingOptions[Any]): Self = StObject.set(x, "linking", value.asInstanceOf[js.Any])
  }
}
