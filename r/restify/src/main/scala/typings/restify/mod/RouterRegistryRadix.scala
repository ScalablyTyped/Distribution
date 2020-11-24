package typings.restify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouterRegistryRadix extends js.Object {
  
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
  implicit class RouterRegistryRadixOps[Self <: RouterRegistryRadix] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdd(value: Route => Boolean): Self = this.set("add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: () => js.Array[Route]): Self = this.set("get", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLookup(value: (String, String) => js.UndefOr[Chain]): Self = this.set("lookup", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemove(value: String => js.UndefOr[Route]): Self = this.set("remove", js.Any.fromFunction1(value))
  }
}
