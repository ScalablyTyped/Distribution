package typings.reduxLittleRouter.mod

import typings.reduxLittleRouter.anon.Payload
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkProps extends js.Object {
  var activeProps: js.UndefOr[ObjectLiteral[_]] = js.native
  var className: js.UndefOr[String] = js.native
  var href: Href = js.native
  var location: js.UndefOr[Location] = js.native
  var onClick: js.UndefOr[js.Function1[/* event */ Event, _]] = js.native
  var persistQuery: js.UndefOr[Boolean] = js.native
  var push: js.UndefOr[js.Function2[/* href */ Href, /* options */ LocationOptions, Payload]] = js.native
  var replace: js.UndefOr[js.Function2[/* href */ Href, /* options */ LocationOptions, Payload]] = js.native
  var replaceState: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[ObjectLiteral[_]] = js.native
  var target: js.UndefOr[String] = js.native
}

object LinkProps {
  @scala.inline
  def apply(href: Href): LinkProps = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkProps]
  }
  @scala.inline
  implicit class LinkPropsOps[Self <: LinkProps] (val x: Self) extends AnyVal {
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
    def setHref(value: Href): Self = this.set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def setActiveProps(value: ObjectLiteral[_]): Self = this.set("activeProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveProps: Self = this.set("activeProps", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setOnClick(value: /* event */ Event => _): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setPersistQuery(value: Boolean): Self = this.set("persistQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistQuery: Self = this.set("persistQuery", js.undefined)
    @scala.inline
    def setPush(value: (/* href */ Href, /* options */ LocationOptions) => Payload): Self = this.set("push", js.Any.fromFunction2(value))
    @scala.inline
    def deletePush: Self = this.set("push", js.undefined)
    @scala.inline
    def setReplace(value: (/* href */ Href, /* options */ LocationOptions) => Payload): Self = this.set("replace", js.Any.fromFunction2(value))
    @scala.inline
    def deleteReplace: Self = this.set("replace", js.undefined)
    @scala.inline
    def setReplaceState(value: Boolean): Self = this.set("replaceState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplaceState: Self = this.set("replaceState", js.undefined)
    @scala.inline
    def setStyle(value: ObjectLiteral[_]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}

