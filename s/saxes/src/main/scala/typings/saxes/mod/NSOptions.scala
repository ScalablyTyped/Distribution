package typings.saxes.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NSOptions extends js.Object {
  /**
    * A plain object whose key, value pairs define namespaces known before
    * parsing the XML file. It is not legal to pass bindings for the namespaces
    * ``"xml"`` or ``"xmlns"``.
    */
  var additionalNamespaces: js.UndefOr[Record[String, String]] = js.native
  /**
    * A function that will be used if the parser cannot resolve a namespace
    * prefix on its own.
    */
  var resolvePrefix: js.UndefOr[ResolvePrefix] = js.native
  /** Whether to track namespaces. Unset means ``false``. */
  var xmlns: js.UndefOr[Boolean] = js.native
}

object NSOptions {
  @scala.inline
  def apply(): NSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NSOptions]
  }
  @scala.inline
  implicit class NSOptionsOps[Self <: NSOptions] (val x: Self) extends AnyVal {
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
    def setAdditionalNamespaces(value: Record[String, String]): Self = this.set("additionalNamespaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalNamespaces: Self = this.set("additionalNamespaces", js.undefined)
    @scala.inline
    def setResolvePrefix(value: /* prefix */ String => js.UndefOr[String]): Self = this.set("resolvePrefix", js.Any.fromFunction1(value))
    @scala.inline
    def deleteResolvePrefix: Self = this.set("resolvePrefix", js.undefined)
    @scala.inline
    def setXmlns(value: Boolean): Self = this.set("xmlns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXmlns: Self = this.set("xmlns", js.undefined)
  }
  
}

