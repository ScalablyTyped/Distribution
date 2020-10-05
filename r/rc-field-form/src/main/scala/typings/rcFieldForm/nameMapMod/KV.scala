package typings.rcFieldForm.nameMapMod

import typings.rcFieldForm.interfaceMod.InternalNamePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KV[T] extends js.Object {
  var key: InternalNamePath = js.native
  var value: T = js.native
}

object KV {
  @scala.inline
  def apply[T](key: InternalNamePath, value: T): KV[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[KV[T]]
  }
  @scala.inline
  implicit class KVOps[Self <: KV[_], T] (val x: Self with KV[T]) extends AnyVal {
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
    def setKeyVarargs(value: (String | Double)*): Self = this.set("key", js.Array(value :_*))
    @scala.inline
    def setKey(value: InternalNamePath): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

