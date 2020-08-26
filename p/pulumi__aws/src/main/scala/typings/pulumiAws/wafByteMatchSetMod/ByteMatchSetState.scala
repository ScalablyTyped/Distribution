package typings.pulumiAws.wafByteMatchSetMod

import typings.pulumiAws.inputMod.waf.ByteMatchSetByteMatchTuple
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ByteMatchSetState extends js.Object {
  /**
    * Specifies the bytes (typically a string that corresponds
    * with ASCII characters) that you want to search for in web requests,
    * the location in requests that you want to search, and other settings.
    */
  val byteMatchTuples: js.UndefOr[Input[js.Array[Input[ByteMatchSetByteMatchTuple]]]] = js.native
  /**
    * The name or description of the Byte Match Set.
    */
  val name: js.UndefOr[Input[String]] = js.native
}

object ByteMatchSetState {
  @scala.inline
  def apply(): ByteMatchSetState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ByteMatchSetState]
  }
  @scala.inline
  implicit class ByteMatchSetStateOps[Self <: ByteMatchSetState] (val x: Self) extends AnyVal {
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
    def setByteMatchTuplesVarargs(value: Input[ByteMatchSetByteMatchTuple]*): Self = this.set("byteMatchTuples", js.Array(value :_*))
    @scala.inline
    def setByteMatchTuples(value: Input[js.Array[Input[ByteMatchSetByteMatchTuple]]]): Self = this.set("byteMatchTuples", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteByteMatchTuples: Self = this.set("byteMatchTuples", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

