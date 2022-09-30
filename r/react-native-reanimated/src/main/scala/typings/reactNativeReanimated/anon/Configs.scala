package typings.reactNativeReanimated.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Configs extends StObject {
  
  var configs: Record[String, Any]
  
  def registerConfig(tag: Double, config: Record[String, Any]): Unit
  
  def removeConfig(tag: Double): Unit
  
  def startAnimationForTag(tag: Double, `type`: String, yogaValues: Any): Unit
}
object Configs {
  
  inline def apply(
    configs: Record[String, Any],
    registerConfig: (Double, Record[String, Any]) => Unit,
    removeConfig: Double => Unit,
    startAnimationForTag: (Double, String, Any) => Unit
  ): Configs = {
    val __obj = js.Dynamic.literal(configs = configs.asInstanceOf[js.Any], registerConfig = js.Any.fromFunction2(registerConfig), removeConfig = js.Any.fromFunction1(removeConfig), startAnimationForTag = js.Any.fromFunction3(startAnimationForTag))
    __obj.asInstanceOf[Configs]
  }
  
  extension [Self <: Configs](x: Self) {
    
    inline def setConfigs(value: Record[String, Any]): Self = StObject.set(x, "configs", value.asInstanceOf[js.Any])
    
    inline def setRegisterConfig(value: (Double, Record[String, Any]) => Unit): Self = StObject.set(x, "registerConfig", js.Any.fromFunction2(value))
    
    inline def setRemoveConfig(value: Double => Unit): Self = StObject.set(x, "removeConfig", js.Any.fromFunction1(value))
    
    inline def setStartAnimationForTag(value: (Double, String, Any) => Unit): Self = StObject.set(x, "startAnimationForTag", js.Any.fromFunction3(value))
  }
}
