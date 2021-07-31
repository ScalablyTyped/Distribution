package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait External extends StObject {
  
  /** @deprecated */
  def AddSearchProvider(): Unit
  
  /** @deprecated */
  def IsSearchProviderInstalled(): Unit
}
object External {
  
  @scala.inline
  def apply(AddSearchProvider: () => Unit, IsSearchProviderInstalled: () => Unit): External = {
    val __obj = js.Dynamic.literal(AddSearchProvider = js.Any.fromFunction0(AddSearchProvider), IsSearchProviderInstalled = js.Any.fromFunction0(IsSearchProviderInstalled))
    __obj.asInstanceOf[External]
  }
  
  @scala.inline
  implicit class ExternalMutableBuilder[Self <: External] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddSearchProvider(value: () => Unit): Self = StObject.set(x, "AddSearchProvider", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsSearchProviderInstalled(value: () => Unit): Self = StObject.set(x, "IsSearchProviderInstalled", js.Any.fromFunction0(value))
  }
}
