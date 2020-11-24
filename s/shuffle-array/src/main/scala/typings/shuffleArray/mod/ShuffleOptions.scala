package typings.shuffleArray.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShuffleOptions extends js.Object {
  
  var copy: js.UndefOr[Boolean] = js.native
  
  var rng: js.UndefOr[js.Function0[Double]] = js.native
}
object ShuffleOptions {
  
  @scala.inline
  def apply(): ShuffleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShuffleOptions]
  }
  
  @scala.inline
  implicit class ShuffleOptionsOps[Self <: ShuffleOptions] (val x: Self) extends AnyVal {
    
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
    def setCopy(value: Boolean): Self = this.set("copy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopy: Self = this.set("copy", js.undefined)
    
    @scala.inline
    def setRng(value: () => Double): Self = this.set("rng", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRng: Self = this.set("rng", js.undefined)
  }
}
