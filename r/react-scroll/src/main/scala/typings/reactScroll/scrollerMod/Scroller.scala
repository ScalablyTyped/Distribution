package typings.reactScroll.scrollerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scroller extends js.Object {
  var get: js.Function1[/* name */ String, _]
  var getActiveLink: js.Function0[String]
  var register: js.Function2[/* name */ String, /* element */ js.Any, Unit]
  var scrollTo: js.Function2[/* to */ String, /* props */ js.Any, Unit]
  var setActiveLink: js.Function1[/* link */ String, Unit]
  var unmount: js.Function0[Unit]
  var unregister: js.Function1[/* name */ String, Unit]
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
}

