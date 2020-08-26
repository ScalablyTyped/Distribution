package typings.reactScroll.scrollerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scroller extends js.Object {
  var get: js.Function1[/* name */ String, _] = js.native
  var getActiveLink: js.Function0[String] = js.native
  var register: js.Function2[/* name */ String, /* element */ js.Any, Unit] = js.native
  var scrollTo: js.Function2[/* to */ String, /* props */ js.Any, Unit] = js.native
  var setActiveLink: js.Function1[/* link */ String, Unit] = js.native
  var unmount: js.Function0[Unit] = js.native
  var unregister: js.Function1[/* name */ String, Unit] = js.native
}

object Scroller {
  @scala.inline
  def apply(
    get: /* name */ String => _,
    getActiveLink: () => String,
    register: (/* name */ String, /* element */ js.Any) => Unit,
    scrollTo: (/* to */ String, /* props */ js.Any) => Unit,
    setActiveLink: /* link */ String => Unit,
    unmount: () => Unit,
    unregister: /* name */ String => Unit
  ): Scroller = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getActiveLink = js.Any.fromFunction0(getActiveLink), register = js.Any.fromFunction2(register), scrollTo = js.Any.fromFunction2(scrollTo), setActiveLink = js.Any.fromFunction1(setActiveLink), unmount = js.Any.fromFunction0(unmount), unregister = js.Any.fromFunction1(unregister))
    __obj.asInstanceOf[Scroller]
  }
  @scala.inline
  implicit class ScrollerOps[Self <: Scroller] (val x: Self) extends AnyVal {
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
    def setGet(value: /* name */ String => _): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setGetActiveLink(value: () => String): Self = this.set("getActiveLink", js.Any.fromFunction0(value))
    @scala.inline
    def setRegister(value: (/* name */ String, /* element */ js.Any) => Unit): Self = this.set("register", js.Any.fromFunction2(value))
    @scala.inline
    def setScrollTo(value: (/* to */ String, /* props */ js.Any) => Unit): Self = this.set("scrollTo", js.Any.fromFunction2(value))
    @scala.inline
    def setSetActiveLink(value: /* link */ String => Unit): Self = this.set("setActiveLink", js.Any.fromFunction1(value))
    @scala.inline
    def setUnmount(value: () => Unit): Self = this.set("unmount", js.Any.fromFunction0(value))
    @scala.inline
    def setUnregister(value: /* name */ String => Unit): Self = this.set("unregister", js.Any.fromFunction1(value))
  }
  
}

