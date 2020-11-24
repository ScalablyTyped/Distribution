package typings.sourcemappedStacktrace.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapStackTraceOptions extends js.Object {
  
  /** Whether to cache sourcemaps globally across multiple calls. */
  var cacheGlobally: js.UndefOr[Boolean] = js.native
  
  /** Filter function applied to each stackTrace line. Lines which do not pass the filter won't be processesd. */
  var filter: js.UndefOr[js.Function1[/* line */ String, Boolean]] = js.native
  
  /** Whether to use synchronous ajax to load the sourcemaps. */
  var sync: js.UndefOr[Boolean] = js.native
}
object MapStackTraceOptions {
  
  @scala.inline
  def apply(): MapStackTraceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapStackTraceOptions]
  }
  
  @scala.inline
  implicit class MapStackTraceOptionsOps[Self <: MapStackTraceOptions] (val x: Self) extends AnyVal {
    
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
    def setCacheGlobally(value: Boolean): Self = this.set("cacheGlobally", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheGlobally: Self = this.set("cacheGlobally", js.undefined)
    
    @scala.inline
    def setFilter(value: /* line */ String => Boolean): Self = this.set("filter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setSync(value: Boolean): Self = this.set("sync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSync: Self = this.set("sync", js.undefined)
  }
}
