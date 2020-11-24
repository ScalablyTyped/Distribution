package typings.stringStripHtml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallbackInput extends js.Object {
  
  /** The index in the input string to start deleting from */
  var deleteFrom: Double = js.native
  
  /** The index in the input string to stop deleting */
  var deleteTo: Double = js.native
  
  /** The string to replace the tag with */
  var insert: String = js.native
  
  /**
    * The value returned by the default strip function.
    *
    * [deleteFrom, deleteTo, insert]
    */
  var proposedReturn: js.Tuple3[Double, Double, js.UndefOr[String]] = js.native
  
  /** The range configuration */
  var rangesArr: Range = js.native
  
  /** The HTML tag found */
  var tag: Tag = js.native
}
object CallbackInput {
  
  @scala.inline
  def apply(
    deleteFrom: Double,
    deleteTo: Double,
    insert: String,
    proposedReturn: js.Tuple3[Double, Double, js.UndefOr[String]],
    rangesArr: Range,
    tag: Tag
  ): CallbackInput = {
    val __obj = js.Dynamic.literal(deleteFrom = deleteFrom.asInstanceOf[js.Any], deleteTo = deleteTo.asInstanceOf[js.Any], insert = insert.asInstanceOf[js.Any], proposedReturn = proposedReturn.asInstanceOf[js.Any], rangesArr = rangesArr.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbackInput]
  }
  
  @scala.inline
  implicit class CallbackInputOps[Self <: CallbackInput] (val x: Self) extends AnyVal {
    
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
    def setDeleteFrom(value: Double): Self = this.set("deleteFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteTo(value: Double): Self = this.set("deleteTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsert(value: String): Self = this.set("insert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProposedReturn(value: js.Tuple3[Double, Double, js.UndefOr[String]]): Self = this.set("proposedReturn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangesArr(value: Range): Self = this.set("rangesArr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: Tag): Self = this.set("tag", value.asInstanceOf[js.Any])
  }
}
