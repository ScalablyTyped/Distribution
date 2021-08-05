package typings.restify.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouterRegistryRadix extends StObject {
  
  /**
    * Adds a route.
    */
  def add(route: Route): Boolean
  
  /**
    * Get registry.
    */
  def get(): js.Array[Route]
  
  /**
    * Registry for route.
    */
  def lookup(method: String, pathname: String): js.UndefOr[Chain]
  
  /**
    * Removes a route.
    */
  def remove(name: String): js.UndefOr[Route]
}
object RouterRegistryRadix {
  
  inline def apply(
    add: Route => Boolean,
    get: () => js.Array[Route],
    lookup: (String, String) => js.UndefOr[Chain],
    remove: String => js.UndefOr[Route]
  ): RouterRegistryRadix = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), get = js.Any.fromFunction0(get), lookup = js.Any.fromFunction2(lookup), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[RouterRegistryRadix]
  }
  
  extension [Self <: RouterRegistryRadix](x: Self) {
    
    inline def setAdd(value: Route => Boolean): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setGet(value: () => js.Array[Route]): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    inline def setLookup(value: (String, String) => js.UndefOr[Chain]): Self = StObject.set(x, "lookup", js.Any.fromFunction2(value))
    
    inline def setRemove(value: String => js.UndefOr[Route]): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
  }
}
