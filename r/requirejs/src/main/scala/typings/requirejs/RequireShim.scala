package typings.requirejs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequireShim extends StObject {
  
  /**
    * List of dependencies.
    **/
  var deps: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Name the module will be exported as.
    **/
  var exports: js.UndefOr[String] = js.undefined
  
  /**
    * Initialize function with all dependcies passed in,
    * if the function returns a value then that value is used
    * as the module export value instead of the object
    * found via the 'exports' string.
    * @param dependencies
    * @return
    **/
  var init: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
}
object RequireShim {
  
  @scala.inline
  def apply(): RequireShim = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequireShim]
  }
  
  @scala.inline
  implicit class RequireShimMutableBuilder[Self <: RequireShim] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeps(value: js.Array[String]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepsUndefined: Self = StObject.set(x, "deps", js.undefined)
    
    @scala.inline
    def setDepsVarargs(value: String*): Self = StObject.set(x, "deps", js.Array(value :_*))
    
    @scala.inline
    def setExports(value: String): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportsUndefined: Self = StObject.set(x, "exports", js.undefined)
    
    @scala.inline
    def setInit(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
  }
}
