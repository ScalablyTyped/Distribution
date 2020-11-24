package typings.reactIntl.providerMod

import typings.formatjsIntl.srcTypesMod.IntlCache
import typings.reactIntl.typesMod.IntlShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait State extends js.Object {
  
  /**
    * Explicit intl cache to prevent memory leaks
    */
  var cache: IntlCache = js.native
  
  /**
    * Intl object we created
    */
  var intl: js.UndefOr[IntlShape] = js.native
  
  /**
    * list of memoized config we care about.
    * This is important since creating intl is
    * very expensive
    */
  var prevConfig: OptionalIntlConfig = js.native
}
object State {
  
  @scala.inline
  def apply(cache: IntlCache, prevConfig: OptionalIntlConfig): State = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], prevConfig = prevConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
    
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
    def setCache(value: IntlCache): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevConfig(value: OptionalIntlConfig): Self = this.set("prevConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntl(value: IntlShape): Self = this.set("intl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntl: Self = this.set("intl", js.undefined)
  }
}
