package typings.stencilCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Json extends StObject {
  
  def commonjs(opts: Any): Any
  
  def json(): Any
  
  def nodeResolve(opts: Any): Any
  
  def replace(opts: Any): Any
}
object Json {
  
  inline def apply(commonjs: Any => Any, json: () => Any, nodeResolve: Any => Any, replace: Any => Any): Json = {
    val __obj = js.Dynamic.literal(commonjs = js.Any.fromFunction1(commonjs), json = js.Any.fromFunction0(json), nodeResolve = js.Any.fromFunction1(nodeResolve), replace = js.Any.fromFunction1(replace))
    __obj.asInstanceOf[Json]
  }
  
  extension [Self <: Json](x: Self) {
    
    inline def setCommonjs(value: Any => Any): Self = StObject.set(x, "commonjs", js.Any.fromFunction1(value))
    
    inline def setJson(value: () => Any): Self = StObject.set(x, "json", js.Any.fromFunction0(value))
    
    inline def setNodeResolve(value: Any => Any): Self = StObject.set(x, "nodeResolve", js.Any.fromFunction1(value))
    
    inline def setReplace(value: Any => Any): Self = StObject.set(x, "replace", js.Any.fromFunction1(value))
  }
}
