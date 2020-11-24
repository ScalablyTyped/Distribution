package typings.solrClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MoreLikeThisOptions extends js.Object {
  
  var boost: js.UndefOr[Boolean] = js.native
  
  var count: js.UndefOr[Double] = js.native
  
  var fl: js.UndefOr[String | js.Array[String]] = js.native
  
  var maxntp: js.UndefOr[Double] = js.native
  
  var maxqt: js.UndefOr[Double] = js.native
  
  var maxwl: js.UndefOr[Double] = js.native
  
  var mindf: js.UndefOr[Double] = js.native
  
  var mintf: js.UndefOr[Double] = js.native
  
  var minwl: js.UndefOr[Double] = js.native
  
  var on: Boolean = js.native
  
  var qf: js.UndefOr[String | js.Object] = js.native
}
object MoreLikeThisOptions {
  
  @scala.inline
  def apply(on: Boolean): MoreLikeThisOptions = {
    val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoreLikeThisOptions]
  }
  
  @scala.inline
  implicit class MoreLikeThisOptionsOps[Self <: MoreLikeThisOptions] (val x: Self) extends AnyVal {
    
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
    def setOn(value: Boolean): Self = this.set("on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoost(value: Boolean): Self = this.set("boost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoost: Self = this.set("boost", js.undefined)
    
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setFlVarargs(value: String*): Self = this.set("fl", js.Array(value :_*))
    
    @scala.inline
    def setFl(value: String | js.Array[String]): Self = this.set("fl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFl: Self = this.set("fl", js.undefined)
    
    @scala.inline
    def setMaxntp(value: Double): Self = this.set("maxntp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxntp: Self = this.set("maxntp", js.undefined)
    
    @scala.inline
    def setMaxqt(value: Double): Self = this.set("maxqt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxqt: Self = this.set("maxqt", js.undefined)
    
    @scala.inline
    def setMaxwl(value: Double): Self = this.set("maxwl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxwl: Self = this.set("maxwl", js.undefined)
    
    @scala.inline
    def setMindf(value: Double): Self = this.set("mindf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMindf: Self = this.set("mindf", js.undefined)
    
    @scala.inline
    def setMintf(value: Double): Self = this.set("mintf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMintf: Self = this.set("mintf", js.undefined)
    
    @scala.inline
    def setMinwl(value: Double): Self = this.set("minwl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinwl: Self = this.set("minwl", js.undefined)
    
    @scala.inline
    def setQf(value: String | js.Object): Self = this.set("qf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQf: Self = this.set("qf", js.undefined)
  }
}
