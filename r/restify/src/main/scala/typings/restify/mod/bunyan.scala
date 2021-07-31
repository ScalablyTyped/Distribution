package typings.restify.mod

import typings.bunyan.mod.LogLevel
import typings.bunyan.mod.Serializer
import typings.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bunyan {
  
  @JSImport("restify", "bunyan")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A Bunyan stream to capture records in a ring buffer and only pass through
    * on a higher-level record. E.g. buffer up all records but only dump when
    * getting a WARN or above.
    */
  @JSImport("restify", "bunyan.RequestCaptureStream")
  @js.native
  class RequestCaptureStream protected () extends Stream {
    def this(opts: RequestCaptureOptions) = this()
    
    /** write to the stream */
    def write(record: js.Any): Unit = js.native
  }
  
  /** create a bunyan logger */
  @scala.inline
  def createLogger(name: String): typings.bunyan.mod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("createLogger")(name.asInstanceOf[js.Any]).asInstanceOf[typings.bunyan.mod.^]
  
  /* Inlined bunyan.bunyan.Serializers & {  err :bunyan.bunyan.Serializer,   req :bunyan.bunyan.Serializer,   res :bunyan.bunyan.Serializer,   client_req :bunyan.bunyan.Serializer,   client_res :bunyan.bunyan.Serializer} */
  object serializers {
    
    @JSImport("restify", "bunyan.serializers")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("restify", "bunyan.serializers.client_req")
    @js.native
    def clientReq: Serializer = js.native
    
    @scala.inline
    def clientReq(input: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("client_req")(input.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def clientReq_=(x: Serializer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("client_req")(x.asInstanceOf[js.Any])
    
    @JSImport("restify", "bunyan.serializers.client_res")
    @js.native
    def clientRes: Serializer = js.native
    
    @scala.inline
    def clientRes(input: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("client_res")(input.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def clientRes_=(x: Serializer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("client_res")(x.asInstanceOf[js.Any])
    
    @JSImport("restify", "bunyan.serializers.err")
    @js.native
    def err: Serializer = js.native
    @scala.inline
    def err(input: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("err")(input.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def err_=(x: Serializer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("err")(x.asInstanceOf[js.Any])
    
    @JSImport("restify", "bunyan.serializers.req")
    @js.native
    def req: Serializer = js.native
    @scala.inline
    def req(input: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("req")(input.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def req_=(x: Serializer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("req")(x.asInstanceOf[js.Any])
    
    @JSImport("restify", "bunyan.serializers.res")
    @js.native
    def res: Serializer = js.native
    @scala.inline
    def res(input: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("res")(input.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def res_=(x: Serializer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("res")(x.asInstanceOf[js.Any])
  }
  
  trait RequestCaptureOptions extends StObject {
    
    /**
      * If true, then dump captured records on the *default* request id when
      * dumping. I.e. dump records logged without "req_id" field. Default
      * false.
      */
    var dumpDefault: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The level at which to trigger dumping captured records. Defaults to
      * bunyan.WARN.
      */
    var level: js.UndefOr[LogLevel] = js.undefined
    
    /** Number of records to capture. Default 100. */
    var maxRecords: js.UndefOr[Double] = js.undefined
    
    /**
      * Number of simultaneous request id capturing buckets to maintain.
      * Default 1000.
      */
    var maxRequestIds: js.UndefOr[Double] = js.undefined
    
    /** The stream to which to write when dumping captured records. */
    var stream: js.UndefOr[typings.bunyan.mod.Stream] = js.undefined
    
    /** The streams to which to write when dumping captured records. */
    var streams: js.UndefOr[js.Array[typings.bunyan.mod.Stream]] = js.undefined
  }
  object RequestCaptureOptions {
    
    @scala.inline
    def apply(): RequestCaptureOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestCaptureOptions]
    }
    
    @scala.inline
    implicit class RequestCaptureOptionsMutableBuilder[Self <: RequestCaptureOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDumpDefault(value: Boolean): Self = StObject.set(x, "dumpDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDumpDefaultUndefined: Self = StObject.set(x, "dumpDefault", js.undefined)
      
      @scala.inline
      def setLevel(value: LogLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setMaxRecords(value: Double): Self = StObject.set(x, "maxRecords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRecordsUndefined: Self = StObject.set(x, "maxRecords", js.undefined)
      
      @scala.inline
      def setMaxRequestIds(value: Double): Self = StObject.set(x, "maxRequestIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRequestIdsUndefined: Self = StObject.set(x, "maxRequestIds", js.undefined)
      
      @scala.inline
      def setStream(value: typings.bunyan.mod.Stream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      @scala.inline
      def setStreams(value: js.Array[typings.bunyan.mod.Stream]): Self = StObject.set(x, "streams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamsUndefined: Self = StObject.set(x, "streams", js.undefined)
      
      @scala.inline
      def setStreamsVarargs(value: typings.bunyan.mod.Stream*): Self = StObject.set(x, "streams", js.Array(value :_*))
    }
  }
}
