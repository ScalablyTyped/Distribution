package typings.semanticUiTab.SemanticUI.Tab.ErrorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  /**
    * @default 'You attempted to load content without API module'
    */
  var api: String = js.native
  /**
    * @default 'The method you called is not defined'
    */
  var method: String = js.native
  /**
    * @default 'Activated tab cannot be found for this context.'
    */
  var missingTab: String = js.native
  /**
    * @default 'The tab you specified is missing a content url.'
    */
  var noContent: String = js.native
  /**
    * @default 'History enabled, but no path was specified'
    */
  var path: String = js.native
  /**
    * @default 'Max recursive depth reached'
    */
  var recursion: String = js.native
  /**
    * @default 'The state library has not been initialized'
    */
  var state: String = js.native
}

object Impl {
  @scala.inline
  def apply(
    api: String,
    method: String,
    missingTab: String,
    noContent: String,
    path: String,
    recursion: String,
    state: String
  ): Impl = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], missingTab = missingTab.asInstanceOf[js.Any], noContent = noContent.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], recursion = recursion.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
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
    def setApi(value: String): Self = this.set("api", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setMissingTab(value: String): Self = this.set("missingTab", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoContent(value: String): Self = this.set("noContent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecursion(value: String): Self = this.set("recursion", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

