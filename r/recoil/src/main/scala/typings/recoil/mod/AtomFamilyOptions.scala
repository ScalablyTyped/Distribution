package typings.recoil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AtomFamilyOptions[T, P /* <: SerializableParam */] extends js.Object {
  var dangerouslyAllowMutability: js.UndefOr[Boolean] = js.native
  var default: RecoilValue[T] | js.Promise[T] | T | (js.Function1[/* param */ P, T | RecoilValue[T] | js.Promise[T]]) = js.native
  var key: NodeKey = js.native
}

object AtomFamilyOptions {
  @scala.inline
  def apply[T, /* <: typings.recoil.mod.SerializableParam */ P](
    default: RecoilValue[T] | js.Promise[T] | T | (js.Function1[/* param */ P, T | RecoilValue[T] | js.Promise[T]]),
    key: NodeKey
  ): AtomFamilyOptions[T, P] = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtomFamilyOptions[T, P]]
  }
  @scala.inline
  implicit class AtomFamilyOptionsOps[Self <: AtomFamilyOptions[_, _], T, /* <: typings.recoil.mod.SerializableParam */ P] (val x: Self with (AtomFamilyOptions[T, P])) extends AnyVal {
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
    def setDefaultFunction1(value: /* param */ P => T | RecoilValue[T] | js.Promise[T]): Self = this.set("default", js.Any.fromFunction1(value))
    @scala.inline
    def setDefault(
      value: RecoilValue[T] | js.Promise[T] | T | (js.Function1[/* param */ P, T | RecoilValue[T] | js.Promise[T]])
    ): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: NodeKey): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setDangerouslyAllowMutability(value: Boolean): Self = this.set("dangerouslyAllowMutability", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDangerouslyAllowMutability: Self = this.set("dangerouslyAllowMutability", js.undefined)
  }
  
}

