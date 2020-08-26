package typings.saxes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XMLDecl extends js.Object {
  /** The encoding specified by the XML declaration. */
  var encoding: js.UndefOr[String] = js.native
  /** The value of the standalone parameter */
  var standalone: js.UndefOr[String] = js.native
  /** The version specified by the XML declaration. */
  var version: js.UndefOr[String] = js.native
}

object XMLDecl {
  @scala.inline
  def apply(): XMLDecl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XMLDecl]
  }
  @scala.inline
  implicit class XMLDeclOps[Self <: XMLDecl] (val x: Self) extends AnyVal {
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
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setStandalone(value: String): Self = this.set("standalone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStandalone: Self = this.set("standalone", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

