package typings.ramlTypesystem.distSrcTypesystemInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHasExtra extends StObject {
  
  def getExtra(name: String): Any
  
  def putExtra(name: String, value: Any): Unit
}
object IHasExtra {
  
  inline def apply(getExtra: String => Any, putExtra: (String, Any) => Unit): IHasExtra = {
    val __obj = js.Dynamic.literal(getExtra = js.Any.fromFunction1(getExtra), putExtra = js.Any.fromFunction2(putExtra))
    __obj.asInstanceOf[IHasExtra]
  }
  
  extension [Self <: IHasExtra](x: Self) {
    
    inline def setGetExtra(value: String => Any): Self = StObject.set(x, "getExtra", js.Any.fromFunction1(value))
    
    inline def setPutExtra(value: (String, Any) => Unit): Self = StObject.set(x, "putExtra", js.Any.fromFunction2(value))
  }
}
