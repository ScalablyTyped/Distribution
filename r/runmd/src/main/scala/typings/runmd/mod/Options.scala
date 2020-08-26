package typings.runmd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * name of input file
    */
  var inputName: js.UndefOr[String] = js.native
  /**
    * if true, disables RunMD footer
    */
  var lame: js.UndefOr[Boolean] = js.native
  /**
    * name of output file
    */
  var outputName: js.UndefOr[String] = js.native
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
    def setInputName(value: String): Self = this.set("inputName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputName: Self = this.set("inputName", js.undefined)
    @scala.inline
    def setLame(value: Boolean): Self = this.set("lame", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLame: Self = this.set("lame", js.undefined)
    @scala.inline
    def setOutputName(value: String): Self = this.set("outputName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputName: Self = this.set("outputName", js.undefined)
  }
  
}

