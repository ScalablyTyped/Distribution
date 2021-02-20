package typings.restify.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouterRegistryRadix extends StObject {
  
  /**
    * Adds a route.
    */
  def add(route: Route): Boolean = js.native
  
  /**
    * Get registry.
    */
  def get(): js.Array[Route] = js.native
  
  /**
    * Registry for route.
    */
  def lookup(method: String, pathname: String): js.UndefOr[Chain] = js.native
  
  /**
    * Removes a route.
    */
  def remove(name: String): js.UndefOr[Route] = js.native
}
object RouterRegistryRadix {
  
  @scala.inline
  def apply(
    add: Route => Boolean,
    get: () => js.Array[Route],
    lookup: (String, String) => js.UndefOr[Chain],
    remove: String => js.UndefOr[Route]
  ): RouterRegistryRadix = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), get = js.Any.fromFunction0(get), lookup = js.Any.fromFunction2(lookup), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[RouterRegistryRadix]
  }
  
  @scala.inline
  implicit class RouterRegistryRadixMutableBuilder[Self <: RouterRegistryRadix] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: Route => Boolean): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: () => js.Array[Route]): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLookup(value: (String, String) => js.UndefOr[Chain]): Self = StObject.set(x, "lookup", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemove(value: String => js.UndefOr[Route]): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
  }
}
