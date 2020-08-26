package typings.reactRouterDom.mod

import typings.reactRouterDom.reactRouterDomStrings.hashbang
import typings.reactRouterDom.reactRouterDomStrings.noslash
import typings.reactRouterDom.reactRouterDomStrings.slash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HashRouterProps extends js.Object {
  var basename: js.UndefOr[String] = js.native
  var getUserConfirmation: js.UndefOr[
    js.Function2[/* message */ String, /* callback */ js.Function1[/* ok */ Boolean, Unit], Unit]
  ] = js.native
  var hashType: js.UndefOr[slash | noslash | hashbang] = js.native
}

object HashRouterProps {
  @scala.inline
  def apply(): HashRouterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HashRouterProps]
  }
  @scala.inline
  implicit class HashRouterPropsOps[Self <: HashRouterProps] (val x: Self) extends AnyVal {
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
    def setBasename(value: String): Self = this.set("basename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasename: Self = this.set("basename", js.undefined)
    @scala.inline
    def setGetUserConfirmation(value: (/* message */ String, /* callback */ js.Function1[/* ok */ Boolean, Unit]) => Unit): Self = this.set("getUserConfirmation", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetUserConfirmation: Self = this.set("getUserConfirmation", js.undefined)
    @scala.inline
    def setHashType(value: slash | noslash | hashbang): Self = this.set("hashType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHashType: Self = this.set("hashType", js.undefined)
  }
  
}

