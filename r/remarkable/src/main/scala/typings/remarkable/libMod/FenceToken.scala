package typings.remarkable.libMod

import typings.remarkable.remarkableBooleans.`false`
import typings.remarkable.remarkableStrings.fence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait FenceToken extends ContentToken {
  @JSName("block")
  var block_FenceToken: js.UndefOr[`false`] = js.native
  @JSName("content")
  var content_FenceToken: String = js.native
  /**
    * Fenced block params.
    */
  var params: String = js.native
  @JSName("type")
  var type_FenceToken: fence = js.native
}

object FenceToken {
  @scala.inline
  def apply(content: String, level: Double, params: String, `type`: fence): FenceToken = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FenceToken]
  }
  @scala.inline
  implicit class FenceTokenOps[Self <: FenceToken] (val x: Self) extends AnyVal {
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setParams(value: String): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: fence): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlock(value: `false`): Self = this.set("block", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlock: Self = this.set("block", js.undefined)
  }
  
}

