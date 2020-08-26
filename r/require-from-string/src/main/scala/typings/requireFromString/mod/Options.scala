package typings.requireFromString.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * List of `paths`, that will be appended to module `paths`.
    * Useful when you want to be able require modules from these paths.
    */
  var appendPaths: js.UndefOr[js.Array[String]] = js.native
  /**
    * List of `paths`, that will be preppended to module `paths`.
    * Useful when you want to be able require modules from these paths.
    */
  var prependPaths: js.UndefOr[js.Array[String]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAppendPathsVarargs(value: String*): Self = this.set("appendPaths", js.Array(value :_*))
    @scala.inline
    def setAppendPaths(value: js.Array[String]): Self = this.set("appendPaths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppendPaths: Self = this.set("appendPaths", js.undefined)
    @scala.inline
    def setPrependPathsVarargs(value: String*): Self = this.set("prependPaths", js.Array(value :_*))
    @scala.inline
    def setPrependPaths(value: js.Array[String]): Self = this.set("prependPaths", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrependPaths: Self = this.set("prependPaths", js.undefined)
  }
  
}

