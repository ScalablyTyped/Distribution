package typings.rabbitJs

import typings.node.Buffer
import typings.node.NodeJS.WritableStream
import typings.node.anon.End
import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import typings.node.streamMod.Duplex
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import typings.rabbitJs.anon.CorrelationId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rabbit.js", "Context")
  @js.native
  class Context () extends EventEmitter {
    def this(options: EventEmitterOptions) = this()
    
    def close(callback: js.Function): js.Any = js.native
    
    def socket[T](`type`: String): T = js.native
    def socket[T](`type`: String, options: SocketOptions): T = js.native
  }
  
  @JSImport("rabbit.js", "PubSocket")
  @js.native
  class PubSocket protected ()
    extends Writable
       with Socket {
    def this(channel: String, opts: SocketOptions) = this()
    
    def publish(topic: String, chunk: String): js.Any = js.native
    def publish(topic: String, chunk: String, encoding: String): js.Any = js.native
    def publish(topic: String, chunk: Buffer): js.Any = js.native
    def publish(topic: String, chunk: Buffer, encoding: String): js.Any = js.native
  }
  
  @JSImport("rabbit.js", "PullSocket")
  @js.native
  class PullSocket protected ()
    extends Readable
       with Socket {
    def this(channel: String, opts: SocketOptions) = this()
    
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T): T = js.native
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
  }
  
  @JSImport("rabbit.js", "PushSocket")
  @js.native
  class PushSocket protected ()
    extends Writable
       with Socket {
    def this(channel: String, opts: SocketOptions) = this()
  }
  
  @JSImport("rabbit.js", "RepSocket")
  @js.native
  class RepSocket protected ()
    extends Duplex
       with Socket {
    def this(channel: String, opts: SocketOptions) = this()
    
    def discard(): js.Any = js.native
    
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T): T = js.native
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
    
    def requeue(): js.Any = js.native
  }
  
  @JSImport("rabbit.js", "ReqSocket")
  @js.native
  class ReqSocket protected ()
    extends Duplex
       with Socket {
    def this(channel: String, opts: SocketOptions) = this()
    
    def handleReply(msg: RequestMessage): js.Any = js.native
    
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T): T = js.native
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
  }
  
  @JSImport("rabbit.js", "SubSocket")
  @js.native
  class SubSocket protected ()
    extends Readable
       with Socket {
    def this(channel: String, opts: SocketOptions) = this()
    
    def connect(source: String, topic: js.UndefOr[scala.Nothing], callback: js.Function): js.Any = js.native
    def connect(source: String, topic: String): js.Any = js.native
    def connect(source: String, topic: String, callback: js.Function): js.Any = js.native
    
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T): T = js.native
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
  }
  
  @JSImport("rabbit.js", "TaskSocket")
  @js.native
  class TaskSocket protected ()
    extends Writable
       with Socket {
    def this(channel: String, opts: SocketOptions) = this()
    
    def post(task: String, chunk: String): js.Any = js.native
    def post(task: String, chunk: String, encoding: String): js.Any = js.native
    def post(task: String, chunk: Buffer): js.Any = js.native
    def post(task: String, chunk: Buffer, encoding: String): js.Any = js.native
  }
  
  @JSImport("rabbit.js", "WorkerSocket")
  @js.native
  class WorkerSocket protected ()
    extends Readable
       with Socket {
    def this(channel: String, opts: SocketOptions) = this()
    
    def ack(): js.Any = js.native
    
    def discard(): js.Any = js.native
    
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T): T = js.native
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
    
    def requeue(): js.Any = js.native
  }
  
  @JSImport("rabbit.js", "createContext")
  @js.native
  def createContext(): Context = js.native
  @JSImport("rabbit.js", "createContext")
  @js.native
  def createContext(url: String): Context = js.native
  
  @js.native
  trait RequestMessage extends StObject {
    
    var content: js.Any = js.native
    
    var properties: CorrelationId = js.native
  }
  object RequestMessage {
    
    @scala.inline
    def apply(content: js.Any, properties: CorrelationId): RequestMessage = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestMessage]
    }
    
    @scala.inline
    implicit class RequestMessageMutableBuilder[Self <: RequestMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: js.Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperties(value: CorrelationId): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Socket extends StObject {
    
    def close(): js.Any = js.native
    
    def connect(destination: String): js.Any = js.native
    def connect(destination: String, callback: js.Function): js.Any = js.native
    
    def setsockopt(opt: String, value: String): js.Any = js.native
  }
  
  @js.native
  trait SocketOptions extends StObject {
    
    var expiration: js.UndefOr[js.Any] = js.native
    
    var persistent: js.UndefOr[js.Any] = js.native
    
    var prefetch: js.UndefOr[js.Any] = js.native
    
    var routing: js.UndefOr[js.Any] = js.native
    
    var task: js.UndefOr[js.Any] = js.native
    
    var topic: js.UndefOr[js.Any] = js.native
  }
  object SocketOptions {
    
    @scala.inline
    def apply(): SocketOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SocketOptions]
    }
    
    @scala.inline
    implicit class SocketOptionsMutableBuilder[Self <: SocketOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpiration(value: js.Any): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
      
      @scala.inline
      def setPersistent(value: js.Any): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
      
      @scala.inline
      def setPrefetch(value: js.Any): Self = StObject.set(x, "prefetch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefetchUndefined: Self = StObject.set(x, "prefetch", js.undefined)
      
      @scala.inline
      def setRouting(value: js.Any): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutingUndefined: Self = StObject.set(x, "routing", js.undefined)
      
      @scala.inline
      def setTask(value: js.Any): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaskUndefined: Self = StObject.set(x, "task", js.undefined)
      
      @scala.inline
      def setTopic(value: js.Any): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    }
  }
}
