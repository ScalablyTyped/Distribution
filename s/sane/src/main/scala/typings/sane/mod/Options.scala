package typings.sane.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var dot: js.UndefOr[Boolean] = js.native
  
  var fsevents: js.UndefOr[Boolean] = js.native
  
  var glob: js.UndefOr[String | js.Array[String]] = js.native
  
  var ignored: js.UndefOr[AnymatchMatcher | js.Array[AnymatchMatcher]] = js.native
  
  var poll: js.UndefOr[Boolean] = js.native
  
  var watcher: js.UndefOr[String] = js.native
  
  var watchman: js.UndefOr[Boolean] = js.native
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
    def setDot(value: Boolean): Self = this.set("dot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDot: Self = this.set("dot", js.undefined)
    
    @scala.inline
    def setFsevents(value: Boolean): Self = this.set("fsevents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFsevents: Self = this.set("fsevents", js.undefined)
    
    @scala.inline
    def setGlobVarargs(value: String*): Self = this.set("glob", js.Array(value :_*))
    
    @scala.inline
    def setGlob(value: String | js.Array[String]): Self = this.set("glob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlob: Self = this.set("glob", js.undefined)
    
    @scala.inline
    def setIgnoredVarargs(value: AnymatchMatcher*): Self = this.set("ignored", js.Array(value :_*))
    
    @scala.inline
    def setIgnoredFunction1(value: /* repeated */ String => Boolean): Self = this.set("ignored", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIgnored(value: AnymatchMatcher | js.Array[AnymatchMatcher]): Self = this.set("ignored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnored: Self = this.set("ignored", js.undefined)
    
    @scala.inline
    def setPoll(value: Boolean): Self = this.set("poll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoll: Self = this.set("poll", js.undefined)
    
    @scala.inline
    def setWatcher(value: String): Self = this.set("watcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatcher: Self = this.set("watcher", js.undefined)
    
    @scala.inline
    def setWatchman(value: Boolean): Self = this.set("watchman", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatchman: Self = this.set("watchman", js.undefined)
  }
}
