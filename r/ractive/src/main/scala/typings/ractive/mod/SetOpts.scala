package typings.ractive.mod

import typings.ractive.ractiveNumbers.`-1`
import typings.ractive.ractiveNumbers.`0`
import typings.ractive.ractiveNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetOpts extends js.Object {
  
  /** Whether or not to merge the given value into the existing data or replace the existing data. Defaults to replacing the existing data (false). */
  var deep: js.UndefOr[Boolean] = js.native
  
  /** Whether or not to keep the template sturctures removed by this set around for future reinstatement. This can be used to avoid throwing away and recreating components when hiding them. Defaults to false. */
  var keep: js.UndefOr[Boolean] = js.native
  
  /** When applied to an array keypath, whether or not to move the existing elements and their associated template around or simply replace them. Defaults to replacement (false). */
  var shuffle: js.UndefOr[Shuffler] = js.native
}
object SetOpts {
  
  @scala.inline
  def apply(): SetOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetOpts]
  }
  
  @scala.inline
  implicit class SetOptsOps[Self <: SetOpts] (val x: Self) extends AnyVal {
    
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
    def setDeep(value: Boolean): Self = this.set("deep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeep: Self = this.set("deep", js.undefined)
    
    @scala.inline
    def setKeep(value: Boolean): Self = this.set("keep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeep: Self = this.set("keep", js.undefined)
    
    @scala.inline
    def setShuffleFunction2(value: (/* left */ js.Any, /* right */ js.Any) => `1` | `0` | `-1`): Self = this.set("shuffle", js.Any.fromFunction2(value))
    
    @scala.inline
    def setShuffle(value: Shuffler): Self = this.set("shuffle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShuffle: Self = this.set("shuffle", js.undefined)
  }
}
