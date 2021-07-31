package typings.sharepoint.SP

import typings.microsoftAjax.Sys.Net.WebRequestExecutor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWebRequestExecutorFactory extends StObject {
  
  def createWebRequestExecutor(): WebRequestExecutor
}
object IWebRequestExecutorFactory {
  
  @scala.inline
  def apply(createWebRequestExecutor: () => WebRequestExecutor): IWebRequestExecutorFactory = {
    val __obj = js.Dynamic.literal(createWebRequestExecutor = js.Any.fromFunction0(createWebRequestExecutor))
    __obj.asInstanceOf[IWebRequestExecutorFactory]
  }
  
  @scala.inline
  implicit class IWebRequestExecutorFactoryMutableBuilder[Self <: IWebRequestExecutorFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateWebRequestExecutor(value: () => WebRequestExecutor): Self = StObject.set(x, "createWebRequestExecutor", js.Any.fromFunction0(value))
  }
}
