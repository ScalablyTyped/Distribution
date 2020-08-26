package typings.simperium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketObject[T] extends js.Object {
  var data: T = js.native
  var id: EntityId = js.native
  var isIndexing: js.UndefOr[Boolean] = js.native
}

object BucketObject {
  @scala.inline
  def apply[T](data: T, id: EntityId): BucketObject[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketObject[T]]
  }
  @scala.inline
  implicit class BucketObjectOps[Self <: BucketObject[_], T] (val x: Self with BucketObject[T]) extends AnyVal {
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
    def setData(value: T): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: EntityId): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsIndexing(value: Boolean): Self = this.set("isIndexing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsIndexing: Self = this.set("isIndexing", js.undefined)
  }
  
}

