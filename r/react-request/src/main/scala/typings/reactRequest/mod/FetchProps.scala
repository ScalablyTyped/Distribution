package typings.reactRequest.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchProps[T] extends FetchRequestProps {
  var afterFetch: js.UndefOr[js.Function1[/* args */ FetchResponse[T], Unit]] = js.native
  var children: js.UndefOr[js.Function1[/* renderProps */ RenderProps[T], ReactNode]] = js.native
  var responseType: js.UndefOr[ResponseType] = js.native
  var transformData: js.UndefOr[js.Function1[/* data */ js.Any, T]] = js.native
}

object FetchProps {
  @scala.inline
  def apply[T](url: String): FetchProps[T] = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchProps[T]]
  }
  @scala.inline
  implicit class FetchPropsOps[Self <: FetchProps[_], T] (val x: Self with FetchProps[T]) extends AnyVal {
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
    def setAfterFetch(value: /* args */ FetchResponse[T] => Unit): Self = this.set("afterFetch", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterFetch: Self = this.set("afterFetch", js.undefined)
    @scala.inline
    def setChildren(value: /* renderProps */ RenderProps[T] => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setResponseType(value: ResponseType): Self = this.set("responseType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseType: Self = this.set("responseType", js.undefined)
    @scala.inline
    def setTransformData(value: /* data */ js.Any => T): Self = this.set("transformData", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTransformData: Self = this.set("transformData", js.undefined)
  }
  
}

