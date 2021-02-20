package typings.pulumiCloud

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.pulumiPulumi.resourceMod.ResourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object topicMod {
  
  @js.native
  trait Topic[T] extends Stream[T] {
    
    /**
      * Publish an item to this Topic.
      *
      * @param item The item to publish.
      */
    def publish(item: T): js.Promise[Unit] = js.native
  }
  object Topic {
    
    @JSImport("@pulumi/cloud/topic", "Topic")
    @js.native
    val ^ : TopicConstructor = js.native
    
    @scala.inline
    implicit class TopicMutableBuilder[Self <: Topic[_], T] (val x: Self with Topic[T]) extends AnyVal {
      
      @scala.inline
      def setPublish(value: T => js.Promise[Unit]): Self = StObject.set(x, "publish", js.Any.fromFunction1(value))
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/cloud/topic", "Topic")
  @js.native
  class TopicCls[T] protected () extends Topic[T] {
    /**
      * Allocate a new Topic with a given name.
      *
      * @param name The unique name of the Topic.
      * @param opts A bag of options that controls how this resource behaves.
      */
    def this(name: String) = this()
    def this(name: String, opts: ResourceOptions) = this()
  }
  
  @js.native
  trait Stream[T] extends StObject {
    
    /**
      * Subscribe to items published to this stream.
      *
      * Each subscription receives all items published to the stream. If a
      * subscription handler returns a failed promise, the subscription handler
      * may be retried some number of times.  If no retry is successful, the item
      * will be sent to the global error handler.  Note that as a result,
      * subscription handlers must ensure they can safely be retried.
      *
      * @param name The name of the subscription.
      * @param handler A callback to handle each item published to the stream.
      */
    def subscribe(name: String, handler: js.Function1[/* item */ T, js.Promise[Unit]]): Unit = js.native
  }
  object Stream {
    
    @scala.inline
    def apply[T](subscribe: (String, js.Function1[/* item */ T, js.Promise[Unit]]) => Unit): Stream[T] = {
      val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction2(subscribe))
      __obj.asInstanceOf[Stream[T]]
    }
    
    @scala.inline
    implicit class StreamMutableBuilder[Self <: Stream[_], T] (val x: Self with Stream[T]) extends AnyVal {
      
      @scala.inline
      def setSubscribe(value: (String, js.Function1[/* item */ T, js.Promise[Unit]]) => Unit): Self = StObject.set(x, "subscribe", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait TopicConstructor
    extends /**
    * Allocate a new Topic with a given name.
    *
    * @param name The unique name of the Topic.
    * @param opts A bag of options that controls how this resource behaves.
    */
  Instantiable1[/* name */ String, Topic[js.Object]]
       with Instantiable2[/* name */ String, /* opts */ ResourceOptions, Topic[js.Object]]
}
