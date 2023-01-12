package typings.reactNativeCommunityCliPluginMetro.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetModulesRunBeforeMainModule extends StObject {
  
  def getModulesRunBeforeMainModule(): js.Array[String]
  
  def getPolyfills(): Any
}
object GetModulesRunBeforeMainModule {
  
  inline def apply(getModulesRunBeforeMainModule: () => js.Array[String], getPolyfills: () => Any): GetModulesRunBeforeMainModule = {
    val __obj = js.Dynamic.literal(getModulesRunBeforeMainModule = js.Any.fromFunction0(getModulesRunBeforeMainModule), getPolyfills = js.Any.fromFunction0(getPolyfills))
    __obj.asInstanceOf[GetModulesRunBeforeMainModule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetModulesRunBeforeMainModule] (val x: Self) extends AnyVal {
    
    inline def setGetModulesRunBeforeMainModule(value: () => js.Array[String]): Self = StObject.set(x, "getModulesRunBeforeMainModule", js.Any.fromFunction0(value))
    
    inline def setGetPolyfills(value: () => Any): Self = StObject.set(x, "getPolyfills", js.Any.fromFunction0(value))
  }
}
