package typings.serveIndex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var filter: js.UndefOr[
    js.Function4[
      /* filename */ String, 
      /* index */ Double, 
      /* files */ js.Array[File], 
      /* dir */ String, 
      Boolean
    ]
  ] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var icons: js.UndefOr[Boolean] = js.native
  var stylesheet: js.UndefOr[String] = js.native
  var template: js.UndefOr[
    String | (js.Function2[/* locals */ Locals, /* callback */ templateCallback, Unit])
  ] = js.native
  var view: js.UndefOr[String] = js.native
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
    def setFilter(
      value: (/* filename */ String, /* index */ Double, /* files */ js.Array[File], /* dir */ String) => Boolean
    ): Self = this.set("filter", js.Any.fromFunction4(value))
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setIcons(value: Boolean): Self = this.set("icons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    @scala.inline
    def setStylesheet(value: String): Self = this.set("stylesheet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStylesheet: Self = this.set("stylesheet", js.undefined)
    @scala.inline
    def setTemplateFunction2(value: (/* locals */ Locals, /* callback */ templateCallback) => Unit): Self = this.set("template", js.Any.fromFunction2(value))
    @scala.inline
    def setTemplate(value: String | (js.Function2[/* locals */ Locals, /* callback */ templateCallback, Unit])): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setView(value: String): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
  
}

