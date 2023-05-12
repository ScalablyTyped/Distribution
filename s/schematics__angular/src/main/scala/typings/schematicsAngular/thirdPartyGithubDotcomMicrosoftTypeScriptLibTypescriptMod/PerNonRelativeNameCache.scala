package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerNonRelativeNameCache[T] extends StObject {
  
  def get(directory: java.lang.String): js.UndefOr[T]
  
  def set(directory: java.lang.String, result: T): Unit
}
object PerNonRelativeNameCache {
  
  inline def apply[T](get: java.lang.String => js.UndefOr[T], set: (java.lang.String, T) => Unit): PerNonRelativeNameCache[T] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[PerNonRelativeNameCache[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PerNonRelativeNameCache[?], T] (val x: Self & PerNonRelativeNameCache[T]) extends AnyVal {
    
    inline def setGet(value: java.lang.String => js.UndefOr[T]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setSet(value: (java.lang.String, T) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
  }
}
