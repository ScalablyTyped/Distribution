package typings.semanticUiSearch.anon

import typings.semanticUiSearch.SemanticUI.Search.MetadataSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-search.SemanticUI.SearchSettings._Impl, 'metadata'> */
@js.native
trait PickImplmetadata extends js.Object {
  var metadata: MetadataSettings = js.native
}

object PickImplmetadata {
  @scala.inline
  def apply(metadata: MetadataSettings): PickImplmetadata = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmetadata]
  }
  @scala.inline
  implicit class PickImplmetadataOps[Self <: PickImplmetadata] (val x: Self) extends AnyVal {
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
    def setMetadata(value: MetadataSettings): Self = this.set("metadata", value.asInstanceOf[js.Any])
  }
  
}

