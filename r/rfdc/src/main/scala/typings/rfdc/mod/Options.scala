package typings.rfdc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Keeping track of circular references will slow down performance with
    * an additional 25% overhead. Even if an object doesn't have any
    * circular references, the tracking overhead is the cost. By default if
    * an object with a circular reference is passed to `rfdc`, it will
    * throw (similar to how `JSON.stringify` would throw).
    *
    * Use the `circles` option to detect and preserve circular references
    * in the object. If performance is important, try removing the circular
    * reference from the object (set to `undefined`) and then add it back
    * manually after cloning instead of using this option.
    */
  var circles: js.UndefOr[Boolean] = js.native
  
  /**
    * Copy prototype properties as well as own properties into the new
    * object.
    *
    * It's marginally faster to allow enumerable properties on the
    * prototype to be copied into the cloned object (not onto it's
    * prototype, directly onto the object).
    *
    * To explain by way of code:
    *
    * ```js
    * require('rfdc')({ proto: false })(Object.create({a: 1})) // => {}
    * require('rfdc')({ proto: true })(Object.create({a: 1})) // => {a: 1}
    * ```
    *
    * Setting `proto` to `true` will provide an additional 2% performance
    * boost.
    */
  var proto: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setCircles(value: Boolean): Self = this.set("circles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCircles: Self = this.set("circles", js.undefined)
    
    @scala.inline
    def setProto(value: Boolean): Self = this.set("proto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProto: Self = this.set("proto", js.undefined)
  }
}
