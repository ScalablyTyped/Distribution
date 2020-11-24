package typings.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Adaptor extends js.Object {
  
  /** Called when Ractive gets a new value to see if the adaptor should be applied.
  	 * @param value the value to evaluate
  	 * @param keypath the keypath of the value in the Ractive data
  	 * @param ractive the Ractive instance that is applying the value to the given keypath
  	 * @returns true if the adaptor should be applied, false otherwisej
  	 */
  def filter(value: js.Any, keypath: String, ractive: Ractive[Ractive[_]]): Boolean = js.native
  
  /** Called when Ractive is applying the adaptor to a value
  	 * @param ractive the Ractive instance that is applying the adaptor
  	 * @param value the value to which the value is being applied
  	 * @param keypath the keypath of the value to which the adaptor is being applied
  	 * @param prefixer a helper function to prefix a value map with the current keypath
  	 * @returns the adaptor
  	 */
  def wrap(ractive: Ractive[Ractive[_]], value: js.Any, keypath: String, prefixer: AdaptorPrefixer): AdaptorHandle = js.native
}
object Adaptor {
  
  @scala.inline
  def apply(
    filter: (js.Any, String, Ractive[Ractive[_]]) => Boolean,
    wrap: (Ractive[Ractive[_]], js.Any, String, AdaptorPrefixer) => AdaptorHandle
  ): Adaptor = {
    val __obj = js.Dynamic.literal(filter = js.Any.fromFunction3(filter), wrap = js.Any.fromFunction4(wrap))
    __obj.asInstanceOf[Adaptor]
  }
  
  @scala.inline
  implicit class AdaptorOps[Self <: Adaptor] (val x: Self) extends AnyVal {
    
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
    def setFilter(value: (js.Any, String, Ractive[Ractive[_]]) => Boolean): Self = this.set("filter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setWrap(value: (Ractive[Ractive[_]], js.Any, String, AdaptorPrefixer) => AdaptorHandle): Self = this.set("wrap", js.Any.fromFunction4(value))
  }
}
