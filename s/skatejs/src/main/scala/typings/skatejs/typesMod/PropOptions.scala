package typings.skatejs.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropOptions[T] extends js.Object {
  var attribute: js.UndefOr[PropOptionsAttribute] = js.native
  var coerce: js.UndefOr[js.Function1[/* value */ js.Any, Maybe[T]]] = js.native
  var default: js.UndefOr[T] = js.native
  var deserialize: js.UndefOr[js.Function1[/* value */ String | Null, Maybe[T]]] = js.native
  var serialize: js.UndefOr[js.Function1[/* value */ Maybe[T], String | Null]] = js.native
}

object PropOptions {
  @scala.inline
  def apply[T](): PropOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropOptions[T]]
  }
  @scala.inline
  implicit class PropOptionsOps[Self <: PropOptions[_], T] (val x: Self with PropOptions[T]) extends AnyVal {
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
    def setAttribute(value: PropOptionsAttribute): Self = this.set("attribute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttribute: Self = this.set("attribute", js.undefined)
    @scala.inline
    def setCoerce(value: /* value */ js.Any => Maybe[T]): Self = this.set("coerce", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCoerce: Self = this.set("coerce", js.undefined)
    @scala.inline
    def setDefault(value: T): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setDeserialize(value: /* value */ String | Null => Maybe[T]): Self = this.set("deserialize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDeserialize: Self = this.set("deserialize", js.undefined)
    @scala.inline
    def setSerialize(value: /* value */ Maybe[T] => String | Null): Self = this.set("serialize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSerialize: Self = this.set("serialize", js.undefined)
  }
  
}

