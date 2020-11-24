package typings.retryAsPromised.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  @JSName("$current")
  var $current: js.UndefOr[Double] = js.native
  
  var backoffBase: js.UndefOr[Double] = js.native
  
  var backoffExponent: js.UndefOr[Double] = js.native
  
  var `match`: js.UndefOr[js.Array[MatchOption] | MatchOption] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var report: js.UndefOr[
    js.Function3[/* message */ String, /* obj */ this.type, /* err */ js.UndefOr[js.Any], Unit]
  ] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
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
    def set$current(value: Double): Self = this.set("$current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$current: Self = this.set("$current", js.undefined)
    
    @scala.inline
    def setBackoffBase(value: Double): Self = this.set("backoffBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackoffBase: Self = this.set("backoffBase", js.undefined)
    
    @scala.inline
    def setBackoffExponent(value: Double): Self = this.set("backoffExponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackoffExponent: Self = this.set("backoffExponent", js.undefined)
    
    @scala.inline
    def setMatchVarargs(value: MatchOption*): Self = this.set("match", js.Array(value :_*))
    
    @scala.inline
    def setMatch(value: js.Array[MatchOption] | MatchOption): Self = this.set("match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatch: Self = this.set("match", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setReport(value: (/* message */ String, Options, /* err */ js.UndefOr[js.Any]) => Unit): Self = this.set("report", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteReport: Self = this.set("report", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
