package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatternExisting extends js.Object {
  var source: js.Array[String] = js.native
}

object PatternExisting {
  @scala.inline
  def apply(source: js.Array[String]): PatternExisting = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatternExisting]
  }
  @scala.inline
  implicit class PatternExistingOps[Self <: PatternExisting] (val x: Self) extends AnyVal {
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
    def setSourceVarargs(value: String*): Self = this.set("source", js.Array(value :_*))
    @scala.inline
    def setSource(value: js.Array[String]): Self = this.set("source", value.asInstanceOf[js.Any])
  }
  
}

