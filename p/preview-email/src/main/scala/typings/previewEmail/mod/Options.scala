package typings.previewEmail.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    *  a path to a directory for saving the generated email previews (defaults to `os.tmpdir()`)
    */
  var dir: js.UndefOr[String] = js.native
  /**
    * a unique ID for the file name created for the preview in dir (defaults to `uuid.v4()` from `uuid`)
    */
  var id: js.UndefOr[String] = js.native
  /**
    * an options object that is passed to open (defaults to `{ wait: false }`).
    * If set to `false` then it will not open the email automatically in the browser using open,
    * and if set to true then it will default to `{ wait: false }`
    * @default { wait: false }
    */
  var open: js.UndefOr[OpenOptions | Boolean] = js.native
  /**
    *  file path to a pug template file (defaults to preview-email's `template.pug` by default)
    * - this is where you can pass a custom template for rendering email previews, e.g. your own stylesheet
    */
  var template: js.UndefOr[String] = js.native
  /**
    * a function to build preview url from file path
    * - this is where you can customize the opened path to handle WSL to Windows transformation or build a http url if dir is served.
    * @default (path) => 'file://[file path]'
    */
  var urlTransform: js.UndefOr[UrlTransform] = js.native
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
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setOpen(value: OpenOptions | Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setUrlTransform(value: /* path */ String => String): Self = this.set("urlTransform", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUrlTransform: Self = this.set("urlTransform", js.undefined)
  }
  
}

