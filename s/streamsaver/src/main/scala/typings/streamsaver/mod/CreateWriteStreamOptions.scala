package typings.streamsaver.mod

import typings.std.QueuingStrategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateWriteStreamOptions[I, O] extends js.Object {
  
  /**
    * URL to serve the stream from. This is the URL that the browser is going to request from the service worker.
    * You might need to provide this if you're using a custom service worker.
    */
  var pathname: js.UndefOr[String] = js.native
  
  var readableStrategy: js.UndefOr[QueuingStrategy[O]] = js.native
  
  /**
    * Indicates the size of the streamed data and allows the browser to show progress while downloading.
    */
  var size: js.UndefOr[Double] = js.native
  
  var writableStrategy: js.UndefOr[QueuingStrategy[I]] = js.native
}
object CreateWriteStreamOptions {
  
  @scala.inline
  def apply[I, O](): CreateWriteStreamOptions[I, O] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWriteStreamOptions[I, O]]
  }
  
  @scala.inline
  implicit class CreateWriteStreamOptionsOps[Self <: CreateWriteStreamOptions[_, _], I, O] (val x: Self with (CreateWriteStreamOptions[I, O])) extends AnyVal {
    
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
    def setPathname(value: String): Self = this.set("pathname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathname: Self = this.set("pathname", js.undefined)
    
    @scala.inline
    def setReadableStrategy(value: QueuingStrategy[O]): Self = this.set("readableStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadableStrategy: Self = this.set("readableStrategy", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setWritableStrategy(value: QueuingStrategy[I]): Self = this.set("writableStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWritableStrategy: Self = this.set("writableStrategy", js.undefined)
  }
}
