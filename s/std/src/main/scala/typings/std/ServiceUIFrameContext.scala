package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceUIFrameContext extends StObject {
  
  def getCachedFrameMessage(key: java.lang.String): java.lang.String = js.native
  
  def postFrameMessage(key: java.lang.String, data: java.lang.String): Unit = js.native
}
object ServiceUIFrameContext {
  
  @scala.inline
  def apply(
    getCachedFrameMessage: java.lang.String => java.lang.String,
    postFrameMessage: (java.lang.String, java.lang.String) => Unit
  ): ServiceUIFrameContext = {
    val __obj = js.Dynamic.literal(getCachedFrameMessage = js.Any.fromFunction1(getCachedFrameMessage), postFrameMessage = js.Any.fromFunction2(postFrameMessage))
    __obj.asInstanceOf[ServiceUIFrameContext]
  }
  
  @scala.inline
  implicit class ServiceUIFrameContextMutableBuilder[Self <: ServiceUIFrameContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetCachedFrameMessage(value: java.lang.String => java.lang.String): Self = StObject.set(x, "getCachedFrameMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPostFrameMessage(value: (java.lang.String, java.lang.String) => Unit): Self = StObject.set(x, "postFrameMessage", js.Any.fromFunction2(value))
  }
}
