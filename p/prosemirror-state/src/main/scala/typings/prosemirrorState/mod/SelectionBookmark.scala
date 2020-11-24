package typings.prosemirrorState.mod

import typings.prosemirrorModel.mod.Node
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorTransform.mod.Mapping
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectionBookmark[S /* <: Schema[_, _] */] extends js.Object {
  
  /**
    * Map the bookmark through a set of changes.
    */
  def map(mapping: Mapping): SelectionBookmark[S] = js.native
  
  /**
    * Resolve the bookmark to a real selection again. This may need to
    * do some error checking and may fall back to a default (usually
    * [`TextSelection.between`](#state.TextSelection^between)) if
    * mapping made the bookmark invalid.
    */
  def resolve(doc: Node[S]): Selection[S] = js.native
}
object SelectionBookmark {
  
  @scala.inline
  def apply[S /* <: Schema[_, _] */](map: Mapping => SelectionBookmark[S], resolve: Node[S] => Selection[S]): SelectionBookmark[S] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map), resolve = js.Any.fromFunction1(resolve))
    __obj.asInstanceOf[SelectionBookmark[S]]
  }
  
  @scala.inline
  implicit class SelectionBookmarkOps[Self <: SelectionBookmark[_], S /* <: Schema[_, _] */] (val x: Self with SelectionBookmark[S]) extends AnyVal {
    
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
    def setMap(value: Mapping => SelectionBookmark[S]): Self = this.set("map", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResolve(value: Node[S] => Selection[S]): Self = this.set("resolve", js.Any.fromFunction1(value))
  }
}
