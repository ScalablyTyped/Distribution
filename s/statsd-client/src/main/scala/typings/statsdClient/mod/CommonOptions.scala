package typings.statsdClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommonOptions extends js.Object {
  
  /**
    * Print what is being sent to stderr (default false).
    */
  var debug: js.UndefOr[Boolean] = js.native
  
  /**
    * Prefix all stats with this value (default "").
    */
  var prefix: js.UndefOr[String] = js.native
  
  /**
    * Dual-use timer. Will flush metrics every interval. For UDP,
    * it auto-closes the socket after this long without activity
    * (default 1000 ms; 0 disables this). For TCP, it auto-closes
    * the socket after socketTimeoutsToClose number of timeouts
    * have elapsed without activity.
    */
  var socketTimeout: js.UndefOr[Double] = js.native
  
  /**
    * Object of string key/value pairs which will be appended on
    * to all StatsD payloads (excluding raw payloads)
    * (default {})
    */
  var tags: js.UndefOr[Tags] = js.native
  
  /**
    * User specifically wants to use tcp (default false)
    */
  var tcp: js.UndefOr[Boolean] = js.native
}
object CommonOptions {
  
  @scala.inline
  def apply(): CommonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonOptions]
  }
  
  @scala.inline
  implicit class CommonOptionsOps[Self <: CommonOptions] (val x: Self) extends AnyVal {
    
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
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setSocketTimeout(value: Double): Self = this.set("socketTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocketTimeout: Self = this.set("socketTimeout", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTcp(value: Boolean): Self = this.set("tcp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTcp: Self = this.set("tcp", js.undefined)
  }
}
