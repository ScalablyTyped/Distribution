package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModeAwareCache[T] extends StObject {
  
  def delete(key: java.lang.String, mode: ResolutionMode): this.type
  
  def forEach(cb: js.Function3[/* elem */ T, /* key */ java.lang.String, /* mode */ ResolutionMode, Unit]): Unit
  
  def get(key: java.lang.String, mode: ResolutionMode): js.UndefOr[T]
  
  def has(key: java.lang.String, mode: ResolutionMode): Boolean
  
  def set(key: java.lang.String, mode: ResolutionMode, value: T): this.type
  
  def size(): Double
}
object ModeAwareCache {
  
  inline def apply[T](
    delete: (java.lang.String, ResolutionMode) => ModeAwareCache[T],
    forEach: js.Function3[/* elem */ T, /* key */ java.lang.String, /* mode */ ResolutionMode, Unit] => Unit,
    get: (java.lang.String, ResolutionMode) => js.UndefOr[T],
    has: (java.lang.String, ResolutionMode) => Boolean,
    set: (java.lang.String, ResolutionMode, T) => ModeAwareCache[T],
    size: () => Double
  ): ModeAwareCache[T] = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction2(delete), forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction2(get), has = js.Any.fromFunction2(has), set = js.Any.fromFunction3(set), size = js.Any.fromFunction0(size))
    __obj.asInstanceOf[ModeAwareCache[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModeAwareCache[?], T] (val x: Self & ModeAwareCache[T]) extends AnyVal {
    
    inline def setDelete(value: (java.lang.String, ResolutionMode) => ModeAwareCache[T]): Self = StObject.set(x, "delete", js.Any.fromFunction2(value))
    
    inline def setForEach(
      value: js.Function3[/* elem */ T, /* key */ java.lang.String, /* mode */ ResolutionMode, Unit] => Unit
    ): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
    
    inline def setGet(value: (java.lang.String, ResolutionMode) => js.UndefOr[T]): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
    
    inline def setHas(value: (java.lang.String, ResolutionMode) => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction2(value))
    
    inline def setSet(value: (java.lang.String, ResolutionMode, T) => ModeAwareCache[T]): Self = StObject.set(x, "set", js.Any.fromFunction3(value))
    
    inline def setSize(value: () => Double): Self = StObject.set(x, "size", js.Any.fromFunction0(value))
  }
}
