package typings.reactToastify.anon

import typings.react.mod.MutableRefObject
import typings.reactToastify.typesMod.Id
import typings.reactToastify.typesMod.Toast
import typings.reactToastify.typesMod.ToastPosition
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collection extends js.Object {
  var collection: Record[Id, Toast] = js.native
  var containerRef: MutableRefObject[Null] = js.native
  def getToastToRender[T](cb: js.Function2[/* position */ ToastPosition, /* toastList */ js.Array[Toast], T]): js.Array[T] = js.native
  def isToastActive(id: Id): Boolean = js.native
}

object Collection {
  @scala.inline
  def apply(
    collection: Record[Id, Toast],
    containerRef: MutableRefObject[Null],
    getToastToRender: js.Function2[/* position */ ToastPosition, /* toastList */ js.Array[Toast], js.Any] => js.Array[js.Any],
    isToastActive: Id => Boolean
  ): Collection = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], containerRef = containerRef.asInstanceOf[js.Any], getToastToRender = js.Any.fromFunction1(getToastToRender), isToastActive = js.Any.fromFunction1(isToastActive))
    __obj.asInstanceOf[Collection]
  }
  @scala.inline
  implicit class CollectionOps[Self <: Collection] (val x: Self) extends AnyVal {
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
    def setCollection(value: Record[Id, Toast]): Self = this.set("collection", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainerRef(value: MutableRefObject[Null]): Self = this.set("containerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetToastToRender(
      value: js.Function2[/* position */ ToastPosition, /* toastList */ js.Array[Toast], js.Any] => js.Array[js.Any]
    ): Self = this.set("getToastToRender", js.Any.fromFunction1(value))
    @scala.inline
    def setIsToastActive(value: Id => Boolean): Self = this.set("isToastActive", js.Any.fromFunction1(value))
  }
  
}

