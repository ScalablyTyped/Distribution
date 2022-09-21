package typings.serverless.anon

import typings.serverless.pluginMod.Progress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Create extends StObject {
  
  def create(args: Message): Progress
  
  def get(name: String): Progress
}
object Create {
  
  inline def apply(create: Message => Progress, get: String => Progress): Create = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[Create]
  }
  
  extension [Self <: Create](x: Self) {
    
    inline def setCreate(value: Message => Progress): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    inline def setGet(value: String => Progress): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
  }
}
