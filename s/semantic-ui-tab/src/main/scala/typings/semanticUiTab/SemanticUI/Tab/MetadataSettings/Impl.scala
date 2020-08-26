package typings.semanticUiTab.SemanticUI.Tab.MetadataSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  /**
    * @default 'loaded'
    */
  var loaded: String = js.native
  /**
    * @default 'promise'
    */
  var promise: String = js.native
  /**
    * @default 'tab'
    */
  var tab: String = js.native
}

object Impl {
  @scala.inline
  def apply(loaded: String, promise: String, tab: String): Impl = {
    val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
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
    def setLoaded(value: String): Self = this.set("loaded", value.asInstanceOf[js.Any])
    @scala.inline
    def setPromise(value: String): Self = this.set("promise", value.asInstanceOf[js.Any])
    @scala.inline
    def setTab(value: String): Self = this.set("tab", value.asInstanceOf[js.Any])
  }
  
}

