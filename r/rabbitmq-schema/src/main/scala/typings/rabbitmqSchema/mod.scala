package typings.rabbitmqSchema

import typings.rabbitmqSchema.rabbitmqSchemaStrings.direct
import typings.rabbitmqSchema.rabbitmqSchemaStrings.fanout
import typings.rabbitmqSchema.rabbitmqSchemaStrings.topic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rabbitmq-schema", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with RabbitMQSchema {
    def this(schema: js.Array[Topology]) = this()
    def this(schema: Topology) = this()
    def this(schema: js.Array[Topology], parentPath: String) = this()
    def this(schema: Topology, parentPath: String) = this()
  }
  
  trait Binding extends StObject {
    
    var args: js.UndefOr[js.Object] = js.undefined
    
    var destination: Exchange | Queue
    
    var routingPattern: js.UndefOr[String] = js.undefined
    
    var source: Exchange
  }
  object Binding {
    
    @scala.inline
    def apply(destination: Exchange | Queue, source: Exchange): Binding = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Binding]
    }
    
    @scala.inline
    implicit class BindingMutableBuilder[Self <: Binding] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Object): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setDestination(value: Exchange | Queue): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutingPattern(value: String): Self = StObject.set(x, "routingPattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutingPatternUndefined: Self = StObject.set(x, "routingPattern", js.undefined)
      
      @scala.inline
      def setSource(value: Exchange): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait DirectBinding
    extends StObject
       with Binding {
    
    @JSName("routingPattern")
    var routingPattern_DirectBinding: String
  }
  object DirectBinding {
    
    @scala.inline
    def apply(destination: Exchange | Queue, routingPattern: String, source: Exchange): DirectBinding = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], routingPattern = routingPattern.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectBinding]
    }
    
    @scala.inline
    implicit class DirectBindingMutableBuilder[Self <: DirectBinding] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoutingPattern(value: String): Self = StObject.set(x, "routingPattern", value.asInstanceOf[js.Any])
    }
  }
  
  trait DirectExchange
    extends StObject
       with Exchange {
    
    @JSName("bindings")
    var bindings_DirectExchange: js.Array[DirectBinding]
    
    @JSName("type")
    var type_DirectExchange: direct
  }
  object DirectExchange {
    
    @scala.inline
    def apply(bindings: js.Array[DirectBinding], exchange: String): DirectExchange = {
      val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], exchange = exchange.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("direct")
      __obj.asInstanceOf[DirectExchange]
    }
    
    @scala.inline
    implicit class DirectExchangeMutableBuilder[Self <: DirectExchange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBindings(value: js.Array[DirectBinding]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBindingsVarargs(value: DirectBinding*): Self = StObject.set(x, "bindings", js.Array(value :_*))
      
      @scala.inline
      def setType(value: direct): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Exchange
    extends StObject
       with Topology {
    
    var bindings: js.Array[Binding]
    
    var exchange: String
    
    var `type`: String
  }
  object Exchange {
    
    @scala.inline
    def apply(bindings: js.Array[Binding], exchange: String, `type`: String): Exchange = {
      val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], exchange = exchange.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Exchange]
    }
    
    @scala.inline
    implicit class ExchangeMutableBuilder[Self <: Exchange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBindings(value: js.Array[Binding]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBindingsVarargs(value: Binding*): Self = StObject.set(x, "bindings", js.Array(value :_*))
      
      @scala.inline
      def setExchange(value: String): Self = StObject.set(x, "exchange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait FanoutExchange
    extends StObject
       with Exchange {
    
    @JSName("type")
    var type_FanoutExchange: fanout
  }
  object FanoutExchange {
    
    @scala.inline
    def apply(bindings: js.Array[Binding], exchange: String): FanoutExchange = {
      val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], exchange = exchange.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("fanout")
      __obj.asInstanceOf[FanoutExchange]
    }
    
    @scala.inline
    implicit class FanoutExchangeMutableBuilder[Self <: FanoutExchange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: fanout): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Queue
    extends StObject
       with Topology {
    
    var messageSchema: js.Object
    
    var queue: String
  }
  object Queue {
    
    @scala.inline
    def apply(messageSchema: js.Object, queue: String): Queue = {
      val __obj = js.Dynamic.literal(messageSchema = messageSchema.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any])
      __obj.asInstanceOf[Queue]
    }
    
    @scala.inline
    implicit class QueueMutableBuilder[Self <: Queue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessageSchema(value: js.Object): Self = StObject.set(x, "messageSchema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueue(value: String): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RabbitMQSchema extends StObject {
    
    def getBindings(): js.Array[Binding] = js.native
    
    def getDirectBindings(): js.Array[DirectBinding] = js.native
    
    def getExchangeByName(name: String): Exchange | Unit = js.native
    
    def getExchanges(): js.Array[Exchange] = js.native
    
    def getQueueByName(name: String): Queue | Unit = js.native
    
    def getQueues(): js.Array[Queue] = js.native
    
    def validate(schema: js.Array[Topology]): Unit = js.native
    def validate(schema: js.Array[Topology], parentPath: String): Unit = js.native
    def validate(schema: Topology): Unit = js.native
    def validate(schema: Topology, parentPath: String): Unit = js.native
    
    def validateMessage[T](exchangeName: String, routingPattern: String, message: T): T = js.native
  }
  
  trait TopicBinding
    extends StObject
       with Binding {
    
    @JSName("routingPattern")
    var routingPattern_TopicBinding: String
  }
  object TopicBinding {
    
    @scala.inline
    def apply(destination: Exchange | Queue, routingPattern: String, source: Exchange): TopicBinding = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], routingPattern = routingPattern.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[TopicBinding]
    }
    
    @scala.inline
    implicit class TopicBindingMutableBuilder[Self <: TopicBinding] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoutingPattern(value: String): Self = StObject.set(x, "routingPattern", value.asInstanceOf[js.Any])
    }
  }
  
  trait TopicExchange
    extends StObject
       with Exchange {
    
    @JSName("bindings")
    var bindings_TopicExchange: js.Array[TopicBinding]
    
    @JSName("type")
    var type_TopicExchange: topic
  }
  object TopicExchange {
    
    @scala.inline
    def apply(bindings: js.Array[TopicBinding], exchange: String): TopicExchange = {
      val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], exchange = exchange.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("topic")
      __obj.asInstanceOf[TopicExchange]
    }
    
    @scala.inline
    implicit class TopicExchangeMutableBuilder[Self <: TopicExchange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBindings(value: js.Array[TopicBinding]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBindingsVarargs(value: TopicBinding*): Self = StObject.set(x, "bindings", js.Array(value :_*))
      
      @scala.inline
      def setType(value: topic): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Topology extends StObject {
    
    var options: js.UndefOr[js.Object] = js.undefined
  }
  object Topology {
    
    @scala.inline
    def apply(): Topology = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Topology]
    }
    
    @scala.inline
    implicit class TopologyMutableBuilder[Self <: Topology] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
}
