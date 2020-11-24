package typings.sortJson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VisitOptions extends js.Object {
  
  /**
    * Depth's level sorting keys on a multidimensional object
    * (default: `Infinity`)
    */
  var depth: js.UndefOr[Double] = js.native
  
  /**
    * When sorting keys, converts all keys to lowercase so that
    * capitalization doesn't interfere with sort order (default: `false`)
    */
  var ignoreCase: js.UndefOr[Boolean] = js.native
  
  /** Default: `1` */
  var level: js.UndefOr[Double] = js.native
  
  /** Reverse the ordering z -> a (default: `false`) */
  var reverse: js.UndefOr[Boolean] = js.native
}
object VisitOptions {
  
  @scala.inline
  def apply(): VisitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisitOptions]
  }
  
  @scala.inline
  implicit class VisitOptionsOps[Self <: VisitOptions] (val x: Self) extends AnyVal {
    
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
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    
    @scala.inline
    def setIgnoreCase(value: Boolean): Self = this.set("ignoreCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreCase: Self = this.set("ignoreCase", js.undefined)
    
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
  }
}
