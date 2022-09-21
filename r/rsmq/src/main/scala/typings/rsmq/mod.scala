package typings.rsmq

import typings.rsmq.rsmqNumbers.`0`
import typings.rsmq.rsmqNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /*~ Write your module's methods and properties in this class */
  @JSImport("rsmq", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with RedisSMQ {
    def this(options: ConstructorOptions) = this()
    
    /* CompleteClass */
    override def changeMessageVisibility(opts: ChangeMessageVisibilityOptions, cb: Callback[`0` | `1`]): Unit = js.native
    
    /* CompleteClass */
    override def changeMessageVisibilityAsync(opts: ChangeMessageVisibilityOptions): js.Promise[`0` | `1`] = js.native
    
    /* CompleteClass */
    override def createQueueAsync(opts: CreateQueueOptions): js.Promise[`1`] = js.native
    
    /* CompleteClass */
    @JSName("createQueue")
    override def createQueue_1(opts: CreateQueueOptions, cb: Callback[`1`]): Unit = js.native
    
    /* CompleteClass */
    override def deleteMessage(opts: DeleteMessageOptions, cb: Callback[`0` | `1`]): Unit = js.native
    
    /* CompleteClass */
    override def deleteMessageAsync(opts: DeleteMessageOptions): js.Promise[`0` | `1`] = js.native
    
    /* CompleteClass */
    override def deleteQueueAsync(opts: DeleteQueueOptions): js.Promise[`1`] = js.native
    
    /* CompleteClass */
    @JSName("deleteQueue")
    override def deleteQueue_1(opts: DeleteQueueOptions, cb: Callback[`1`]): Unit = js.native
    
    /* CompleteClass */
    override def getQueueAttributes(opts: GetQueueAttributesOptions, cb: Callback[QueueAttributes]): Unit = js.native
    
    /* CompleteClass */
    override def getQueueAttributesAsync(opts: GetQueueAttributesOptions): js.Promise[QueueAttributes] = js.native
    
    /* CompleteClass */
    override def listQueues(cb: Callback[js.Array[String]]): Unit = js.native
    
    /* CompleteClass */
    override def listQueuesAsync(): js.Promise[js.Array[String]] = js.native
    
    /* CompleteClass */
    override def popMessage(opts: PopMessageOptions, cb: Callback[QueueMessage | js.Object]): Unit = js.native
    
    /* CompleteClass */
    override def popMessageAsync(opts: PopMessageOptions): js.Promise[QueueMessage | js.Object] = js.native
    
    /* CompleteClass */
    override def quit(cb: Callback[String]): Unit = js.native
    
    /* CompleteClass */
    override def receiveMessage(opts: ReceiveMessageOptions, cb: Callback[QueueMessage | js.Object]): Unit = js.native
    
    /* CompleteClass */
    override def receiveMessageAsync(opts: ReceiveMessageOptions): js.Promise[QueueMessage | js.Object] = js.native
    
    /* CompleteClass */
    override def sendMessage(opts: SendMessageOptions, cb: Callback[String]): Unit = js.native
    
    /* CompleteClass */
    override def sendMessageAsync(opts: SendMessageOptions): js.Promise[String] = js.native
    
    /* CompleteClass */
    override def setQueueAttributes(opts: SetQueueAttributesOptions, cb: Callback[QueueAttributes]): Unit = js.native
    
    /* CompleteClass */
    override def setQueueAttributesAsync(opts: SetQueueAttributesOptions): js.Promise[QueueAttributes] = js.native
  }
  
  trait BaseOptions extends StObject {
    
    /**
    		 * The Queue name.
    		 * Maximum 160 characters; alphanumeric characters, hyphens (-), and underscores (_) are allowed.
    		 *
    		 * @type {string}
    		 * @memberof BaseQueueOptions
    		 */
    var qname: String
  }
  object BaseOptions {
    
    inline def apply(qname: String): BaseOptions = {
      val __obj = js.Dynamic.literal(qname = qname.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseOptions]
    }
    
    extension [Self <: BaseOptions](x: Self) {
      
      inline def setQname(value: String): Self = StObject.set(x, "qname", value.asInstanceOf[js.Any])
    }
  }
  
  type Callback[T] = js.Function2[/* err */ Any, /* response */ T, Unit]
  
  trait ChangeMessageVisibilityOptions
    extends StObject
       with BaseOptions {
    
    /**
    		 * message id to modify.
    		 *
    		 * @type {string}
    		 * @memberof DeleteMessageOptions
    		 */
    var id: String
    
    /**
    		 * The length of time, in seconds, that this message will not be visible.
    		 * Allowed values: 0-9999999 (around 115 days)
    		 *
    		 * @type {number}
    		 * @memberof ChangeMessageVisibilityOptions
    		 */
    var vt: Double
  }
  object ChangeMessageVisibilityOptions {
    
    inline def apply(id: String, qname: String, vt: Double): ChangeMessageVisibilityOptions = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], qname = qname.asInstanceOf[js.Any], vt = vt.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangeMessageVisibilityOptions]
    }
    
    extension [Self <: ChangeMessageVisibilityOptions](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setVt(value: Double): Self = StObject.set(x, "vt", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConstructorOptions extends StObject {
    
    var client: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RedisClient */ Any
      ] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var ns: js.UndefOr[String] = js.undefined
    
    var options: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClientOpts */ Any
      ] = js.undefined
    
    var password: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var realtime: js.UndefOr[Boolean] = js.undefined
  }
  object ConstructorOptions {
    
    inline def apply(): ConstructorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConstructorOptions]
    }
    
    extension [Self <: ConstructorOptions](x: Self) {
      
      inline def setClient(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RedisClient */ Any
      ): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setNs(value: String): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
      
      inline def setNsUndefined: Self = StObject.set(x, "ns", js.undefined)
      
      inline def setOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClientOpts */ Any
      ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setRealtime(value: Boolean): Self = StObject.set(x, "realtime", value.asInstanceOf[js.Any])
      
      inline def setRealtimeUndefined: Self = StObject.set(x, "realtime", js.undefined)
    }
  }
  
  trait CreateQueueOptions
    extends StObject
       with BaseOptions {
    
    /**
    		 * *(Default: 0)*
    		 * The time in seconds that the delivery of all new messages in the queue will be delayed.
    		 * Allowed values: 0-9999999 (around 115 days)
    		 *
    		 * @type {number}
    		 * @memberof CreateQueueOptions
    		 */
    var delay: js.UndefOr[Double] = js.undefined
    
    /**
    		 * *(Default: 65536)*
    		 * The maximum message size in bytes.
    		 * Allowed values: 1024-65536 and -1 (for unlimited size)
    		 *
    		 * @type {number}
    		 * @memberof CreateQueueOptions
    		 */
    var maxsize: js.UndefOr[Double] = js.undefined
    
    /**
    		 * *(Default: 30)*
    		 * The length of time, in seconds, that a message received from a queue will
    		 * be invisible to other receiving components when they ask to receive messages.
    		 * Allowed values: 0-9999999 (around 115 days)
    		 *
    		 * @type {number}
    		 * @memberof CreateQueueOptions
    		 */
    var vt: js.UndefOr[Double] = js.undefined
  }
  object CreateQueueOptions {
    
    inline def apply(qname: String): CreateQueueOptions = {
      val __obj = js.Dynamic.literal(qname = qname.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateQueueOptions]
    }
    
    extension [Self <: CreateQueueOptions](x: Self) {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setMaxsize(value: Double): Self = StObject.set(x, "maxsize", value.asInstanceOf[js.Any])
      
      inline def setMaxsizeUndefined: Self = StObject.set(x, "maxsize", js.undefined)
      
      inline def setVt(value: Double): Self = StObject.set(x, "vt", value.asInstanceOf[js.Any])
      
      inline def setVtUndefined: Self = StObject.set(x, "vt", js.undefined)
    }
  }
  
  trait DeleteMessageOptions
    extends StObject
       with BaseOptions {
    
    /**
    		 * message id to delete.
    		 *
    		 * @type {string}
    		 * @memberof DeleteMessageOptions
    		 */
    var id: String
  }
  object DeleteMessageOptions {
    
    inline def apply(id: String, qname: String): DeleteMessageOptions = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], qname = qname.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteMessageOptions]
    }
    
    extension [Self <: DeleteMessageOptions](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  type DeleteQueueOptions = BaseOptions
  
  type GetQueueAttributesOptions = BaseOptions
  
  type PopMessageOptions = BaseOptions
  
  trait QueueAttributes extends StObject {
    
    /**
    		 * Timestamp (epoch in seconds) when the queue was created
    		 *
    		 * @type {number}
    		 * @memberof QueueAttributes
    		 */
    var created: Double
    
    /**
    		 * The delay for new messages in seconds
    		 *
    		 * @type {number}
    		 * @memberof QueueAttributes
    		 */
    var delay: Double
    
    /**
    		 * Current number of hidden / not visible messages.
    		 * A message can be hidden while "in flight" due to a `vt` parameter or when sent with a `delay`
    		 *
    		 * @type {number}
    		 * @memberof QueueAttributes
    		 */
    var hiddenmsgs: Double
    
    /**
    		 * The maximum size of a message in bytes
    		 *
    		 * @type {number}
    		 * @memberof QueueAttributes
    		 */
    var maxsize: Double
    
    /**
    		 * Timestamp (epoch in seconds) when the queue was last modified with `setQueueAttributes`
    		 *
    		 * @type {number}
    		 * @memberof QueueAttributes
    		 */
    var modified: Double
    
    /**
    		 * Current number of messages in the queue
    		 *
    		 * @type {number}
    		 * @memberof QueueAttributes
    		 */
    var msgs: Double
    
    /**
    		 * Total number of messages received from the queue
    		 *
    		 * @type {number}
    		 * @memberof QueueAttributes
    		 */
    var totalrecv: Double
    
    /**
    		 * Total number of messages sent to the queue
    		 *
    		 * @type {number}
    		 * @memberof QueueAttributes
    		 */
    var totalsent: Double
    
    /**
    		 * The visibility timeout for the queue in seconds
    		 *
    		 * @type {number}
    		 * @memberof QueueAttributes
    		 */
    var vt: Double
  }
  object QueueAttributes {
    
    inline def apply(
      created: Double,
      delay: Double,
      hiddenmsgs: Double,
      maxsize: Double,
      modified: Double,
      msgs: Double,
      totalrecv: Double,
      totalsent: Double,
      vt: Double
    ): QueueAttributes = {
      val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], hiddenmsgs = hiddenmsgs.asInstanceOf[js.Any], maxsize = maxsize.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], msgs = msgs.asInstanceOf[js.Any], totalrecv = totalrecv.asInstanceOf[js.Any], totalsent = totalsent.asInstanceOf[js.Any], vt = vt.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueueAttributes]
    }
    
    extension [Self <: QueueAttributes](x: Self) {
      
      inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setHiddenmsgs(value: Double): Self = StObject.set(x, "hiddenmsgs", value.asInstanceOf[js.Any])
      
      inline def setMaxsize(value: Double): Self = StObject.set(x, "maxsize", value.asInstanceOf[js.Any])
      
      inline def setModified(value: Double): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
      
      inline def setMsgs(value: Double): Self = StObject.set(x, "msgs", value.asInstanceOf[js.Any])
      
      inline def setTotalrecv(value: Double): Self = StObject.set(x, "totalrecv", value.asInstanceOf[js.Any])
      
      inline def setTotalsent(value: Double): Self = StObject.set(x, "totalsent", value.asInstanceOf[js.Any])
      
      inline def setVt(value: Double): Self = StObject.set(x, "vt", value.asInstanceOf[js.Any])
    }
  }
  
  trait QueueMessage extends StObject {
    
    /**
    		 * Timestamp of when this message was first received.
    		 *
    		 * @type {number}
    		 * @memberof QueueMessage
    		 */
    var fr: Double
    
    /**
    		 * The internal message id.
    		 *
    		 * @type {string}
    		 * @memberof QueueMessage
    		 */
    var id: String
    
    /**
    		 * The message's contents.
    		 *
    		 * @type {string}
    		 * @memberof QueueMessage
    		 */
    var message: String
    
    /**
    		 * Number of times this message was received.
    		 *
    		 * @type {number}
    		 * @memberof QueueMessage
    		 */
    var rc: Double
    
    /**
    		 * Timestamp of when this message was sent / created.
    		 *
    		 * @type {number}
    		 * @memberof QueueMessage
    		 */
    var sent: Double
  }
  object QueueMessage {
    
    inline def apply(fr: Double, id: String, message: String, rc: Double, sent: Double): QueueMessage = {
      val __obj = js.Dynamic.literal(fr = fr.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], rc = rc.asInstanceOf[js.Any], sent = sent.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueueMessage]
    }
    
    extension [Self <: QueueMessage](x: Self) {
      
      inline def setFr(value: Double): Self = StObject.set(x, "fr", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setRc(value: Double): Self = StObject.set(x, "rc", value.asInstanceOf[js.Any])
      
      inline def setSent(value: Double): Self = StObject.set(x, "sent", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReceiveMessageOptions
    extends StObject
       with BaseOptions {
    
    /**
    		 * *(Default: queue settings)*
    		 * The length of time, in seconds, that the received message will be invisible to others.
    		 * Allowed values: 0-9999999 (around 115 days)
    		 *
    		 * @type {number}
    		 * @memberof ReceiveMessageOptions
    		 */
    var vt: js.UndefOr[Double] = js.undefined
  }
  object ReceiveMessageOptions {
    
    inline def apply(qname: String): ReceiveMessageOptions = {
      val __obj = js.Dynamic.literal(qname = qname.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceiveMessageOptions]
    }
    
    extension [Self <: ReceiveMessageOptions](x: Self) {
      
      inline def setVt(value: Double): Self = StObject.set(x, "vt", value.asInstanceOf[js.Any])
      
      inline def setVtUndefined: Self = StObject.set(x, "vt", js.undefined)
    }
  }
  
  /*~ Write your module's methods and properties in this class */
  trait RedisSMQ extends StObject {
    
    def changeMessageVisibility(opts: ChangeMessageVisibilityOptions, cb: Callback[`0` | `1`]): Unit
    
    def changeMessageVisibilityAsync(opts: ChangeMessageVisibilityOptions): js.Promise[`0` | `1`]
    
    def createQueueAsync(opts: CreateQueueOptions): js.Promise[`1`]
    
    @JSName("createQueue")
    def createQueue_1(opts: CreateQueueOptions, cb: Callback[`1`]): Unit
    
    def deleteMessage(opts: DeleteMessageOptions, cb: Callback[`0` | `1`]): Unit
    
    def deleteMessageAsync(opts: DeleteMessageOptions): js.Promise[`0` | `1`]
    
    def deleteQueueAsync(opts: DeleteQueueOptions): js.Promise[`1`]
    
    @JSName("deleteQueue")
    def deleteQueue_1(opts: DeleteQueueOptions, cb: Callback[`1`]): Unit
    
    def getQueueAttributes(opts: GetQueueAttributesOptions, cb: Callback[QueueAttributes]): Unit
    
    def getQueueAttributesAsync(opts: GetQueueAttributesOptions): js.Promise[QueueAttributes]
    
    def listQueues(cb: Callback[js.Array[String]]): Unit
    
    def listQueuesAsync(): js.Promise[js.Array[String]]
    
    def popMessage(opts: PopMessageOptions, cb: Callback[QueueMessage | js.Object]): Unit
    
    def popMessageAsync(opts: PopMessageOptions): js.Promise[QueueMessage | js.Object]
    
    def quit(cb: Callback[String]): Unit
    
    def receiveMessage(opts: ReceiveMessageOptions, cb: Callback[QueueMessage | js.Object]): Unit
    
    def receiveMessageAsync(opts: ReceiveMessageOptions): js.Promise[QueueMessage | js.Object]
    
    def sendMessage(opts: SendMessageOptions, cb: Callback[String]): Unit
    
    def sendMessageAsync(opts: SendMessageOptions): js.Promise[String]
    
    def setQueueAttributes(opts: SetQueueAttributesOptions, cb: Callback[QueueAttributes]): Unit
    
    def setQueueAttributesAsync(opts: SetQueueAttributesOptions): js.Promise[QueueAttributes]
  }
  object RedisSMQ {
    
    inline def apply(
      changeMessageVisibility: (ChangeMessageVisibilityOptions, Callback[`0` | `1`]) => Unit,
      changeMessageVisibilityAsync: ChangeMessageVisibilityOptions => js.Promise[`0` | `1`],
      createQueue: (CreateQueueOptions, Callback[`1`]) => Unit,
      createQueueAsync: CreateQueueOptions => js.Promise[`1`],
      deleteMessage: (DeleteMessageOptions, Callback[`0` | `1`]) => Unit,
      deleteMessageAsync: DeleteMessageOptions => js.Promise[`0` | `1`],
      deleteQueue: (DeleteQueueOptions, Callback[`1`]) => Unit,
      deleteQueueAsync: DeleteQueueOptions => js.Promise[`1`],
      getQueueAttributes: (GetQueueAttributesOptions, Callback[QueueAttributes]) => Unit,
      getQueueAttributesAsync: GetQueueAttributesOptions => js.Promise[QueueAttributes],
      listQueues: Callback[js.Array[String]] => Unit,
      listQueuesAsync: () => js.Promise[js.Array[String]],
      popMessage: (PopMessageOptions, Callback[QueueMessage | js.Object]) => Unit,
      popMessageAsync: PopMessageOptions => js.Promise[QueueMessage | js.Object],
      quit: Callback[String] => Unit,
      receiveMessage: (ReceiveMessageOptions, Callback[QueueMessage | js.Object]) => Unit,
      receiveMessageAsync: ReceiveMessageOptions => js.Promise[QueueMessage | js.Object],
      sendMessage: (SendMessageOptions, Callback[String]) => Unit,
      sendMessageAsync: SendMessageOptions => js.Promise[String],
      setQueueAttributes: (SetQueueAttributesOptions, Callback[QueueAttributes]) => Unit,
      setQueueAttributesAsync: SetQueueAttributesOptions => js.Promise[QueueAttributes]
    ): RedisSMQ = {
      val __obj = js.Dynamic.literal(changeMessageVisibility = js.Any.fromFunction2(changeMessageVisibility), changeMessageVisibilityAsync = js.Any.fromFunction1(changeMessageVisibilityAsync), createQueue = js.Any.fromFunction2(createQueue), createQueueAsync = js.Any.fromFunction1(createQueueAsync), deleteMessage = js.Any.fromFunction2(deleteMessage), deleteMessageAsync = js.Any.fromFunction1(deleteMessageAsync), deleteQueue = js.Any.fromFunction2(deleteQueue), deleteQueueAsync = js.Any.fromFunction1(deleteQueueAsync), getQueueAttributes = js.Any.fromFunction2(getQueueAttributes), getQueueAttributesAsync = js.Any.fromFunction1(getQueueAttributesAsync), listQueues = js.Any.fromFunction1(listQueues), listQueuesAsync = js.Any.fromFunction0(listQueuesAsync), popMessage = js.Any.fromFunction2(popMessage), popMessageAsync = js.Any.fromFunction1(popMessageAsync), quit = js.Any.fromFunction1(quit), receiveMessage = js.Any.fromFunction2(receiveMessage), receiveMessageAsync = js.Any.fromFunction1(receiveMessageAsync), sendMessage = js.Any.fromFunction2(sendMessage), sendMessageAsync = js.Any.fromFunction1(sendMessageAsync), setQueueAttributes = js.Any.fromFunction2(setQueueAttributes), setQueueAttributesAsync = js.Any.fromFunction1(setQueueAttributesAsync))
      __obj.asInstanceOf[RedisSMQ]
    }
    
    extension [Self <: RedisSMQ](x: Self) {
      
      inline def setChangeMessageVisibility(value: (ChangeMessageVisibilityOptions, Callback[`0` | `1`]) => Unit): Self = StObject.set(x, "changeMessageVisibility", js.Any.fromFunction2(value))
      
      inline def setChangeMessageVisibilityAsync(value: ChangeMessageVisibilityOptions => js.Promise[`0` | `1`]): Self = StObject.set(x, "changeMessageVisibilityAsync", js.Any.fromFunction1(value))
      
      inline def setCreateQueue(value: (CreateQueueOptions, Callback[`1`]) => Unit): Self = StObject.set(x, "createQueue", js.Any.fromFunction2(value))
      
      inline def setCreateQueueAsync(value: CreateQueueOptions => js.Promise[`1`]): Self = StObject.set(x, "createQueueAsync", js.Any.fromFunction1(value))
      
      inline def setDeleteMessage(value: (DeleteMessageOptions, Callback[`0` | `1`]) => Unit): Self = StObject.set(x, "deleteMessage", js.Any.fromFunction2(value))
      
      inline def setDeleteMessageAsync(value: DeleteMessageOptions => js.Promise[`0` | `1`]): Self = StObject.set(x, "deleteMessageAsync", js.Any.fromFunction1(value))
      
      inline def setDeleteQueue(value: (DeleteQueueOptions, Callback[`1`]) => Unit): Self = StObject.set(x, "deleteQueue", js.Any.fromFunction2(value))
      
      inline def setDeleteQueueAsync(value: DeleteQueueOptions => js.Promise[`1`]): Self = StObject.set(x, "deleteQueueAsync", js.Any.fromFunction1(value))
      
      inline def setGetQueueAttributes(value: (GetQueueAttributesOptions, Callback[QueueAttributes]) => Unit): Self = StObject.set(x, "getQueueAttributes", js.Any.fromFunction2(value))
      
      inline def setGetQueueAttributesAsync(value: GetQueueAttributesOptions => js.Promise[QueueAttributes]): Self = StObject.set(x, "getQueueAttributesAsync", js.Any.fromFunction1(value))
      
      inline def setListQueues(value: Callback[js.Array[String]] => Unit): Self = StObject.set(x, "listQueues", js.Any.fromFunction1(value))
      
      inline def setListQueuesAsync(value: () => js.Promise[js.Array[String]]): Self = StObject.set(x, "listQueuesAsync", js.Any.fromFunction0(value))
      
      inline def setPopMessage(value: (PopMessageOptions, Callback[QueueMessage | js.Object]) => Unit): Self = StObject.set(x, "popMessage", js.Any.fromFunction2(value))
      
      inline def setPopMessageAsync(value: PopMessageOptions => js.Promise[QueueMessage | js.Object]): Self = StObject.set(x, "popMessageAsync", js.Any.fromFunction1(value))
      
      inline def setQuit(value: Callback[String] => Unit): Self = StObject.set(x, "quit", js.Any.fromFunction1(value))
      
      inline def setReceiveMessage(value: (ReceiveMessageOptions, Callback[QueueMessage | js.Object]) => Unit): Self = StObject.set(x, "receiveMessage", js.Any.fromFunction2(value))
      
      inline def setReceiveMessageAsync(value: ReceiveMessageOptions => js.Promise[QueueMessage | js.Object]): Self = StObject.set(x, "receiveMessageAsync", js.Any.fromFunction1(value))
      
      inline def setSendMessage(value: (SendMessageOptions, Callback[String]) => Unit): Self = StObject.set(x, "sendMessage", js.Any.fromFunction2(value))
      
      inline def setSendMessageAsync(value: SendMessageOptions => js.Promise[String]): Self = StObject.set(x, "sendMessageAsync", js.Any.fromFunction1(value))
      
      inline def setSetQueueAttributes(value: (SetQueueAttributesOptions, Callback[QueueAttributes]) => Unit): Self = StObject.set(x, "setQueueAttributes", js.Any.fromFunction2(value))
      
      inline def setSetQueueAttributesAsync(value: SetQueueAttributesOptions => js.Promise[QueueAttributes]): Self = StObject.set(x, "setQueueAttributesAsync", js.Any.fromFunction1(value))
    }
  }
  
  trait SendMessageOptions
    extends StObject
       with BaseOptions {
    
    /**
    		 * *(Default: queue settings)*
    		 * The time in seconds that the delivery of the message will be delayed.
    		 * Allowed values: 0-9999999 (around 115 days)
    		 *
    		 * @type {number}
    		 * @memberof SendMessageOptions
    		 */
    var delay: js.UndefOr[Double] = js.undefined
    
    /**
    		 * Message for the queue
    		 *
    		 * @type {string}
    		 * @memberof SendMessageOptions
    		 */
    var message: String
  }
  object SendMessageOptions {
    
    inline def apply(message: String, qname: String): SendMessageOptions = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], qname = qname.asInstanceOf[js.Any])
      __obj.asInstanceOf[SendMessageOptions]
    }
    
    extension [Self <: SendMessageOptions](x: Self) {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait SetQueueAttributesOptions
    extends StObject
       with BaseOptions {
    
    /**
    		 * The time in seconds that the delivery of all new messages in the queue will be delayed.
    		 * Allowed values: 0-9999999 (around 115 days)
    		 *
    		 * @type {number}
    		 * @memberof SetQueueAttributesOptions
    		 */
    var delay: js.UndefOr[Double] = js.undefined
    
    /**
    		 * The maximum message size in bytes.
    		 * Allowed values: 1024-65536 and -1 (for unlimited size)
    		 *
    		 * @type {number}
    		 * @memberof SetQueueAttributesOptions
    		 */
    var maxsize: js.UndefOr[Double] = js.undefined
    
    /**
    		 * The length of time, in seconds,
    		 * that a message received from a queue will be invisible to other receiving components
    		 * when they ask to receive messages.
    		 * Allowed values: 0-9999999 (around 115 days)
    		 *
    		 * @type {number}
    		 * @memberof SetQueueAttributesOptions
    		 */
    var vt: js.UndefOr[Double] = js.undefined
  }
  object SetQueueAttributesOptions {
    
    inline def apply(qname: String): SetQueueAttributesOptions = {
      val __obj = js.Dynamic.literal(qname = qname.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetQueueAttributesOptions]
    }
    
    extension [Self <: SetQueueAttributesOptions](x: Self) {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setMaxsize(value: Double): Self = StObject.set(x, "maxsize", value.asInstanceOf[js.Any])
      
      inline def setMaxsizeUndefined: Self = StObject.set(x, "maxsize", js.undefined)
      
      inline def setVt(value: Double): Self = StObject.set(x, "vt", value.asInstanceOf[js.Any])
      
      inline def setVtUndefined: Self = StObject.set(x, "vt", js.undefined)
    }
  }
}
