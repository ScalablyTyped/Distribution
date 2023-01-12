package typings.reactDevtoolsInline.commonsMod

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParseHookNamesModule extends StObject {
  
  var parseHookNames: ParseHookNames
  
  var parseSourceAndMetadata: ParseSourceAndMetadata
  
  def purgeCachedMetadata(): Unit
}
object ParseHookNamesModule {
  
  inline def apply(
    parseHookNames: (/* hooksTree */ js.Array[HooksNode], /* fetchFileWithCaching */ FetchFileWithCaching | Null) => js.Promise[HookNames | Null],
    parseSourceAndMetadata: (/* hooksList */ js.Array[HooksNode], /* locationKeyToHookSourceAndMetadata */ Map[String, HookSourceAndMetadata]) => js.Promise[HookNames | Null],
    purgeCachedMetadata: () => Unit
  ): ParseHookNamesModule = {
    val __obj = js.Dynamic.literal(parseHookNames = js.Any.fromFunction2(parseHookNames), parseSourceAndMetadata = js.Any.fromFunction2(parseSourceAndMetadata), purgeCachedMetadata = js.Any.fromFunction0(purgeCachedMetadata))
    __obj.asInstanceOf[ParseHookNamesModule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParseHookNamesModule] (val x: Self) extends AnyVal {
    
    inline def setParseHookNames(
      value: (/* hooksTree */ js.Array[HooksNode], /* fetchFileWithCaching */ FetchFileWithCaching | Null) => js.Promise[HookNames | Null]
    ): Self = StObject.set(x, "parseHookNames", js.Any.fromFunction2(value))
    
    inline def setParseSourceAndMetadata(
      value: (/* hooksList */ js.Array[HooksNode], /* locationKeyToHookSourceAndMetadata */ Map[String, HookSourceAndMetadata]) => js.Promise[HookNames | Null]
    ): Self = StObject.set(x, "parseSourceAndMetadata", js.Any.fromFunction2(value))
    
    inline def setPurgeCachedMetadata(value: () => Unit): Self = StObject.set(x, "purgeCachedMetadata", js.Any.fromFunction0(value))
  }
}
