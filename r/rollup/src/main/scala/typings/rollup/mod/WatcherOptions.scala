package typings.rollup.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WatcherOptions extends js.Object {
  
  var buildDelay: js.UndefOr[Double] = js.native
  
  var chokidar: js.UndefOr[ChokidarOptions] = js.native
  
  var clearScreen: js.UndefOr[Boolean] = js.native
  
  var exclude: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.native
  
  var include: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.native
  
  var skipWrite: js.UndefOr[Boolean] = js.native
}
object WatcherOptions {
  
  @scala.inline
  def apply(): WatcherOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatcherOptions]
  }
  
  @scala.inline
  implicit class WatcherOptionsOps[Self <: WatcherOptions] (val x: Self) extends AnyVal {
    
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
    def setBuildDelay(value: Double): Self = this.set("buildDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildDelay: Self = this.set("buildDelay", js.undefined)
    
    @scala.inline
    def setChokidar(value: ChokidarOptions): Self = this.set("chokidar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChokidar: Self = this.set("chokidar", js.undefined)
    
    @scala.inline
    def setClearScreen(value: Boolean): Self = this.set("clearScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearScreen: Self = this.set("clearScreen", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: (String | RegExp)*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExclude(value: String | RegExp | (js.Array[String | RegExp])): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: (String | RegExp)*): Self = this.set("include", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: String | RegExp | (js.Array[String | RegExp])): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    
    @scala.inline
    def setSkipWrite(value: Boolean): Self = this.set("skipWrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipWrite: Self = this.set("skipWrite", js.undefined)
  }
}
