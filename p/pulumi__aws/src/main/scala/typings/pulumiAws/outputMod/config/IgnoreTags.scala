package typings.pulumiAws.outputMod.config

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgnoreTags extends js.Object {
  var keyPrefixes: js.UndefOr[js.Array[String]] = js.native
  var keys: js.UndefOr[js.Array[String]] = js.native
}

object IgnoreTags {
  @scala.inline
  def apply(): IgnoreTags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnoreTags]
  }
  @scala.inline
  implicit class IgnoreTagsOps[Self <: IgnoreTags] (val x: Self) extends AnyVal {
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
    def setKeyPrefixesVarargs(value: String*): Self = this.set("keyPrefixes", js.Array(value :_*))
    @scala.inline
    def setKeyPrefixes(value: js.Array[String]): Self = this.set("keyPrefixes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyPrefixes: Self = this.set("keyPrefixes", js.undefined)
    @scala.inline
    def setKeysVarargs(value: String*): Self = this.set("keys", js.Array(value :_*))
    @scala.inline
    def setKeys(value: js.Array[String]): Self = this.set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
  }
  
}

