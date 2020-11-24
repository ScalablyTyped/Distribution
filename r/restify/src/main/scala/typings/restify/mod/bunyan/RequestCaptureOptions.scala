package typings.restify.mod.bunyan

import typings.bunyan.mod.LogLevel
import typings.bunyan.mod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestCaptureOptions extends js.Object {
  
  /**
    * If true, then dump captured records on the *default* request id when
    * dumping. I.e. dump records logged without "req_id" field. Default
    * false.
    */
  var dumpDefault: js.UndefOr[Boolean] = js.native
  
  /**
    * The level at which to trigger dumping captured records. Defaults to
    * bunyan.WARN.
    */
  var level: js.UndefOr[LogLevel] = js.native
  
  /** Number of records to capture. Default 100. */
  var maxRecords: js.UndefOr[Double] = js.native
  
  /**
    * Number of simultaneous request id capturing buckets to maintain.
    * Default 1000.
    */
  var maxRequestIds: js.UndefOr[Double] = js.native
  
  /** The stream to which to write when dumping captured records. */
  var stream: js.UndefOr[Stream] = js.native
  
  /** The streams to which to write when dumping captured records. */
  var streams: js.UndefOr[js.Array[Stream]] = js.native
}
object RequestCaptureOptions {
  
  @scala.inline
  def apply(): RequestCaptureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestCaptureOptions]
  }
  
  @scala.inline
  implicit class RequestCaptureOptionsOps[Self <: RequestCaptureOptions] (val x: Self) extends AnyVal {
    
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
    def setDumpDefault(value: Boolean): Self = this.set("dumpDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDumpDefault: Self = this.set("dumpDefault", js.undefined)
    
    @scala.inline
    def setLevel(value: LogLevel): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setMaxRecords(value: Double): Self = this.set("maxRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRecords: Self = this.set("maxRecords", js.undefined)
    
    @scala.inline
    def setMaxRequestIds(value: Double): Self = this.set("maxRequestIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRequestIds: Self = this.set("maxRequestIds", js.undefined)
    
    @scala.inline
    def setStream(value: Stream): Self = this.set("stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStream: Self = this.set("stream", js.undefined)
    
    @scala.inline
    def setStreamsVarargs(value: Stream*): Self = this.set("streams", js.Array(value :_*))
    
    @scala.inline
    def setStreams(value: js.Array[Stream]): Self = this.set("streams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreams: Self = this.set("streams", js.undefined)
  }
}
