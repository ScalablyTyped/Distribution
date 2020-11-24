package typings.reactRequest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderProps[T] extends FetchResponse[T] {
  
  var doFetch: DoFetch[T] = js.native
  
  var fetching: Boolean = js.native
  
  var requestName: String = js.native
}
object RenderProps {
  
  @scala.inline
  def apply[T](
    didUnmount: Boolean,
    doFetch: /* options */ js.UndefOr[DoFetchOptions] => js.Promise[FetchResponse[T]],
    failed: Boolean,
    fetching: Boolean,
    init: js.Any,
    requestKey: String,
    requestName: String,
    url: String
  ): RenderProps[T] = {
    val __obj = js.Dynamic.literal(didUnmount = didUnmount.asInstanceOf[js.Any], doFetch = js.Any.fromFunction1(doFetch), failed = failed.asInstanceOf[js.Any], fetching = fetching.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], requestKey = requestKey.asInstanceOf[js.Any], requestName = requestName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderProps[T]]
  }
  
  @scala.inline
  implicit class RenderPropsOps[Self <: RenderProps[_], T] (val x: Self with RenderProps[T]) extends AnyVal {
    
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
    def setDoFetch(value: /* options */ js.UndefOr[DoFetchOptions] => js.Promise[FetchResponse[T]]): Self = this.set("doFetch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFetching(value: Boolean): Self = this.set("fetching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestName(value: String): Self = this.set("requestName", value.asInstanceOf[js.Any])
  }
}
