package typings.rcTree.treeUtilMod

import typings.rcTree.interfaceMod.DataEntity
import typings.rcTree.interfaceMod.Key
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Wrapper extends js.Object {
  var keyEntities: Record[Key, DataEntity] = js.native
  var posEntities: Record[String, DataEntity] = js.native
}

object Wrapper {
  @scala.inline
  def apply(keyEntities: Record[Key, DataEntity], posEntities: Record[String, DataEntity]): Wrapper = {
    val __obj = js.Dynamic.literal(keyEntities = keyEntities.asInstanceOf[js.Any], posEntities = posEntities.asInstanceOf[js.Any])
    __obj.asInstanceOf[Wrapper]
  }
  @scala.inline
  implicit class WrapperOps[Self <: Wrapper] (val x: Self) extends AnyVal {
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
    def setKeyEntities(value: Record[Key, DataEntity]): Self = this.set("keyEntities", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosEntities(value: Record[String, DataEntity]): Self = this.set("posEntities", value.asInstanceOf[js.Any])
  }
  
}

