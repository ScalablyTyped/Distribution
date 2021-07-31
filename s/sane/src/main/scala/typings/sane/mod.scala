package typings.sane

import org.scalablytyped.runtime.Instantiable2
import typings.node.eventsMod.EventEmitter
import typings.node.fsMod.Stats
import typings.sane.saneStrings.add
import typings.sane.saneStrings.all
import typings.sane.saneStrings.change
import typings.sane.saneStrings.delete
import typings.sane.saneStrings.error
import typings.sane.saneStrings.ready
import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(dir: String): Watcher = ^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any]).asInstanceOf[Watcher]
  @scala.inline
  def apply(dir: String, options: Options): Watcher = (^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Watcher]
  
  @JSImport("sane", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sane", "FSEventsWatcher")
  @js.native
  class FSEventsWatcher protected () extends SaneWatcher {
    def this(dir: String) = this()
    def this(dir: String, options: Options) = this()
  }
  @JSImport("sane", "FSEventsWatcher")
  @js.native
  val FSEventsWatcher: Instantiable2[/* dir */ String, /* options */ js.UndefOr[Options], SaneWatcher] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sane", "NodeWatcher")
  @js.native
  class NodeWatcher protected () extends SaneWatcher {
    def this(dir: String) = this()
    def this(dir: String, options: Options) = this()
  }
  @JSImport("sane", "NodeWatcher")
  @js.native
  val NodeWatcher: Instantiable2[/* dir */ String, /* options */ js.UndefOr[Options], SaneWatcher] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sane", "PollWatcher")
  @js.native
  class PollWatcher protected () extends SaneWatcher {
    def this(dir: String) = this()
    def this(dir: String, options: Options) = this()
  }
  @JSImport("sane", "PollWatcher")
  @js.native
  val PollWatcher: Instantiable2[/* dir */ String, /* options */ js.UndefOr[Options], SaneWatcher] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sane", "WatchmanWatcher")
  @js.native
  class WatchmanWatcher protected () extends SaneWatcher {
    def this(dir: String) = this()
    def this(dir: String, options: Options) = this()
  }
  @JSImport("sane", "WatchmanWatcher")
  @js.native
  val WatchmanWatcher: Instantiable2[/* dir */ String, /* options */ js.UndefOr[Options], SaneWatcher] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.sane.saneStrings.add
    - typings.sane.saneStrings.change
    - typings.sane.saneStrings.delete
  */
  trait AllEventType extends StObject
  object AllEventType {
    
    @scala.inline
    def add: typings.sane.saneStrings.add = "add".asInstanceOf[typings.sane.saneStrings.add]
    
    @scala.inline
    def change: typings.sane.saneStrings.change = "change".asInstanceOf[typings.sane.saneStrings.change]
    
    @scala.inline
    def delete: typings.sane.saneStrings.delete = "delete".asInstanceOf[typings.sane.saneStrings.delete]
  }
  
  type AnymatchMatcher = String | RegExp | (js.Function1[/* repeated */ String, Boolean])
  
  /* Rewritten from type alias, can be one of: 
    - typings.sane.saneStrings.ready
    - typings.sane.saneStrings.error
    - typings.sane.saneStrings.all
    - typings.sane.saneStrings.add
    - typings.sane.saneStrings.change
    - typings.sane.saneStrings.delete
  */
  trait EventType extends StObject
  object EventType {
    
    @scala.inline
    def add: typings.sane.saneStrings.add = "add".asInstanceOf[typings.sane.saneStrings.add]
    
    @scala.inline
    def all: typings.sane.saneStrings.all = "all".asInstanceOf[typings.sane.saneStrings.all]
    
    @scala.inline
    def change: typings.sane.saneStrings.change = "change".asInstanceOf[typings.sane.saneStrings.change]
    
    @scala.inline
    def delete: typings.sane.saneStrings.delete = "delete".asInstanceOf[typings.sane.saneStrings.delete]
    
    @scala.inline
    def error: typings.sane.saneStrings.error = "error".asInstanceOf[typings.sane.saneStrings.error]
    
    @scala.inline
    def ready: typings.sane.saneStrings.ready = "ready".asInstanceOf[typings.sane.saneStrings.ready]
  }
  
  trait Options extends StObject {
    
    var dot: js.UndefOr[Boolean] = js.undefined
    
    var fsevents: js.UndefOr[Boolean] = js.undefined
    
    var glob: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var ignored: js.UndefOr[AnymatchMatcher | js.Array[AnymatchMatcher]] = js.undefined
    
    var poll: js.UndefOr[Boolean] = js.undefined
    
    var watcher: js.UndefOr[String] = js.undefined
    
    var watchman: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      @scala.inline
      def setFsevents(value: Boolean): Self = StObject.set(x, "fsevents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFseventsUndefined: Self = StObject.set(x, "fsevents", js.undefined)
      
      @scala.inline
      def setGlob(value: String | js.Array[String]): Self = StObject.set(x, "glob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobUndefined: Self = StObject.set(x, "glob", js.undefined)
      
      @scala.inline
      def setGlobVarargs(value: String*): Self = StObject.set(x, "glob", js.Array(value :_*))
      
      @scala.inline
      def setIgnored(value: AnymatchMatcher | js.Array[AnymatchMatcher]): Self = StObject.set(x, "ignored", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoredFunction1(value: /* repeated */ String => Boolean): Self = StObject.set(x, "ignored", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIgnoredUndefined: Self = StObject.set(x, "ignored", js.undefined)
      
      @scala.inline
      def setIgnoredVarargs(value: AnymatchMatcher*): Self = StObject.set(x, "ignored", js.Array(value :_*))
      
      @scala.inline
      def setPoll(value: Boolean): Self = StObject.set(x, "poll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPollUndefined: Self = StObject.set(x, "poll", js.undefined)
      
      @scala.inline
      def setWatcher(value: String): Self = StObject.set(x, "watcher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatcherUndefined: Self = StObject.set(x, "watcher", js.undefined)
      
      @scala.inline
      def setWatchman(value: Boolean): Self = StObject.set(x, "watchman", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatchmanUndefined: Self = StObject.set(x, "watchman", js.undefined)
    }
  }
  
  @js.native
  trait SaneWatcher extends EventEmitter {
    
    @JSName("addListener")
    def addListener_add(event: add, listener: js.Function3[/* path */ String, /* root */ String, /* stat */ Stats, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_all(
      event: all,
      listener: js.Function4[
          /* eventType */ AllEventType, 
          /* path */ String, 
          /* root */ String, 
          /* stat */ js.UndefOr[Stats], 
          Unit
        ]
    ): this.type = js.native
    @JSName("addListener")
    def addListener_change(
      event: change,
      listener: js.Function3[/* path */ String, /* root */ String, /* stat */ Stats, Unit]
    ): this.type = js.native
    @JSName("addListener")
    def addListener_delete(event: delete, listener: js.Function2[/* path */ String, /* root */ String, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
    
    def close(): Unit = js.native
    def close(callback: js.Function0[Unit]): Unit = js.native
    
    val dot: Boolean = js.native
    
    @JSName("emit")
    def emit_add(event: add, path: String, root: String, stat: Stats): Boolean = js.native
    @JSName("emit")
    def emit_all(event: all, eventType: AllEventType, path: String, root: String): Boolean = js.native
    @JSName("emit")
    def emit_all(event: all, eventType: AllEventType, path: String, root: String, stat: Stats): Boolean = js.native
    @JSName("emit")
    def emit_change(event: change, path: String, root: String, stat: Stats): Boolean = js.native
    @JSName("emit")
    def emit_delete(event: delete, path: String, root: String): Boolean = js.native
    @JSName("emit")
    def emit_error(event: error, error: Error): Boolean = js.native
    @JSName("emit")
    def emit_ready(event: ready): Boolean = js.native
    
    val globs: js.Array[String] = js.native
    
    val hasIgnore: Boolean = js.native
    
    val ignored: AnymatchMatcher | js.Array[AnymatchMatcher] = js.native
    
    def listenerCount(`type`: EventType): Double = js.native
    
    // tslint:disable-next-line ban-types
    def listeners(event: EventType): js.Array[js.Function] = js.native
    
    @JSName("on")
    def on_add(event: add, listener: js.Function3[/* path */ String, /* root */ String, /* stat */ Stats, Unit]): this.type = js.native
    @JSName("on")
    def on_all(
      event: all,
      listener: js.Function4[
          /* eventType */ AllEventType, 
          /* path */ String, 
          /* root */ String, 
          /* stat */ js.UndefOr[Stats], 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_change(
      event: change,
      listener: js.Function3[/* path */ String, /* root */ String, /* stat */ Stats, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_delete(event: delete, listener: js.Function2[/* path */ String, /* root */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
    @JSName("on")
    def on_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("once")
    def once_add(event: add, listener: js.Function3[/* path */ String, /* root */ String, /* stat */ Stats, Unit]): this.type = js.native
    @JSName("once")
    def once_all(
      event: all,
      listener: js.Function4[
          /* eventType */ AllEventType, 
          /* path */ String, 
          /* root */ String, 
          /* stat */ js.UndefOr[Stats], 
          Unit
        ]
    ): this.type = js.native
    @JSName("once")
    def once_change(
      event: change,
      listener: js.Function3[/* path */ String, /* root */ String, /* stat */ Stats, Unit]
    ): this.type = js.native
    @JSName("once")
    def once_delete(event: delete, listener: js.Function2[/* path */ String, /* root */ String, Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
    @JSName("once")
    def once_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("prependListener")
    def prependListener_add(event: add, listener: js.Function3[/* path */ String, /* root */ String, /* stat */ Stats, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_all(
      event: all,
      listener: js.Function4[
          /* eventType */ AllEventType, 
          /* path */ String, 
          /* root */ String, 
          /* stat */ js.UndefOr[Stats], 
          Unit
        ]
    ): this.type = js.native
    @JSName("prependListener")
    def prependListener_change(
      event: change,
      listener: js.Function3[/* path */ String, /* root */ String, /* stat */ Stats, Unit]
    ): this.type = js.native
    @JSName("prependListener")
    def prependListener_delete(event: delete, listener: js.Function2[/* path */ String, /* root */ String, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_add(event: add, listener: js.Function3[/* path */ String, /* root */ String, /* stat */ Stats, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_all(
      event: all,
      listener: js.Function4[
          /* eventType */ AllEventType, 
          /* path */ String, 
          /* root */ String, 
          /* stat */ js.UndefOr[Stats], 
          Unit
        ]
    ): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_change(
      event: change,
      listener: js.Function3[/* path */ String, /* root */ String, /* stat */ Stats, Unit]
    ): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_delete(event: delete, listener: js.Function2[/* path */ String, /* root */ String, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
    
    def removeAllListeners(event: EventType): this.type = js.native
    
    @JSName("removeListener")
    def removeListener_add(event: add, listener: js.Function3[/* path */ String, /* root */ String, /* stat */ Stats, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_all(
      event: all,
      listener: js.Function4[
          /* eventType */ AllEventType, 
          /* path */ String, 
          /* root */ String, 
          /* stat */ js.UndefOr[Stats], 
          Unit
        ]
    ): this.type = js.native
    @JSName("removeListener")
    def removeListener_change(
      event: change,
      listener: js.Function3[/* path */ String, /* root */ String, /* stat */ Stats, Unit]
    ): this.type = js.native
    @JSName("removeListener")
    def removeListener_delete(event: delete, listener: js.Function2[/* path */ String, /* root */ String, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
    
    val root: String = js.native
  }
  
  type Watcher = SaneWatcher
}
