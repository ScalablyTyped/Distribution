package typings.reactNative.mod

import typings.reactNative.anon.Changed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewabilityConfigCallbackPair extends js.Object {
  var onViewableItemsChanged: (js.Function1[/* info */ Changed, Unit]) | Null = js.native
  var viewabilityConfig: ViewabilityConfig = js.native
}

object ViewabilityConfigCallbackPair {
  @scala.inline
  def apply(viewabilityConfig: ViewabilityConfig): ViewabilityConfigCallbackPair = {
    val __obj = js.Dynamic.literal(viewabilityConfig = viewabilityConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewabilityConfigCallbackPair]
  }
  @scala.inline
  implicit class ViewabilityConfigCallbackPairOps[Self <: ViewabilityConfigCallbackPair] (val x: Self) extends AnyVal {
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
    def setViewabilityConfig(value: ViewabilityConfig): Self = this.set("viewabilityConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnViewableItemsChanged(value: /* info */ Changed => Unit): Self = this.set("onViewableItemsChanged", js.Any.fromFunction1(value))
    @scala.inline
    def setOnViewableItemsChangedNull: Self = this.set("onViewableItemsChanged", null)
  }
  
}

