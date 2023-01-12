package typings.reactNavigationNative.anon

import typings.reactNavigationNative.libTypescriptSrcTypesMod.LinkingOptions
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Linking] (val x: Self) extends AnyVal {
    
    inline def setLinking(value: LinkingOptions[Any]): Self = StObject.set(x, "linking", value.asInstanceOf[js.Any])
  }
}
