package typings.sentryInternalTracing

import typings.sentryInternalTracing.anon.App
import typings.sentryTypes.typesEventprocessorMod.EventProcessor
import typings.sentryTypes.typesHubMod.Hub
import typings.sentryTypes.typesIntegrationMod.Integration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesNodeIntegrationsExpressMod {
  
  @JSImport("@sentry-internal/tracing/types/node/integrations/express", "Express")
  @js.native
  /**
    * @inheritDoc
    */
  open class Express ()
    extends StObject
       with Integration {
    def this(options: App) = this()
    
    /* private */ val _methods: Any = js.native
    
    /**
      * Express App instance
      */
    /* private */ val _router: Any = js.native
    
    /**
      * Returns {@link IntegrationClass.id}
      */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * @inheritDoc
      */
    def setupOnce(_underscore: Any, getCurrentHub: js.Function0[Hub]): Unit = js.native
    /**
      * Sets the integration up only once.
      * This takes no options on purpose, options should be passed in the constructor
      */
    /* CompleteClass */
    override def setupOnce(
      addGlobalEventProcessor: js.Function1[/* callback */ EventProcessor, Unit],
      getCurrentHub: js.Function0[Hub]
    ): Unit = js.native
  }
  /* static members */
  object Express {
    
    @JSImport("@sentry-internal/tracing/types/node/integrations/express", "Express")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry-internal/tracing/types/node/integrations/express", "Express.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sentryInternalTracing.sentryInternalTracingStrings.all
    - typings.sentryInternalTracing.sentryInternalTracingStrings.get
    - typings.sentryInternalTracing.sentryInternalTracingStrings.post
    - typings.sentryInternalTracing.sentryInternalTracingStrings.put
    - typings.sentryInternalTracing.sentryInternalTracingStrings.delete
    - typings.sentryInternalTracing.sentryInternalTracingStrings.patch
    - typings.sentryInternalTracing.sentryInternalTracingStrings.options
    - typings.sentryInternalTracing.sentryInternalTracingStrings.head
    - typings.sentryInternalTracing.sentryInternalTracingStrings.checkout
    - typings.sentryInternalTracing.sentryInternalTracingStrings.copy
    - typings.sentryInternalTracing.sentryInternalTracingStrings.lock
    - typings.sentryInternalTracing.sentryInternalTracingStrings.merge
    - typings.sentryInternalTracing.sentryInternalTracingStrings.mkactivity
    - typings.sentryInternalTracing.sentryInternalTracingStrings.mkcol
    - typings.sentryInternalTracing.sentryInternalTracingStrings.move
    - typings.sentryInternalTracing.sentryInternalTracingStrings.`m-search`
    - typings.sentryInternalTracing.sentryInternalTracingStrings.notify
    - typings.sentryInternalTracing.sentryInternalTracingStrings.purge
    - typings.sentryInternalTracing.sentryInternalTracingStrings.report
    - typings.sentryInternalTracing.sentryInternalTracingStrings.search
    - typings.sentryInternalTracing.sentryInternalTracingStrings.subscribe
    - typings.sentryInternalTracing.sentryInternalTracingStrings.trace
    - typings.sentryInternalTracing.sentryInternalTracingStrings.unlock
    - typings.sentryInternalTracing.sentryInternalTracingStrings.unsubscribe
    - typings.sentryInternalTracing.sentryInternalTracingStrings.use
  */
  trait Method extends StObject
  object Method {
    
    inline def all: typings.sentryInternalTracing.sentryInternalTracingStrings.all = "all".asInstanceOf[typings.sentryInternalTracing.sentryInternalTracingStrings.all]
    
    inline def checkout: typings.sentryInternalTracing.sentryInternalTracingStrings.checkout = "checkout".asInstanceOf[typings.sentryInternalTracing.sentryInternalTracingStrings.checkout]
    
    inline def copy: typings.sentryInternalTracing.sentryInternalTracingStrings.copy = "copy".asInstanceOf[typings.sentryInternalTracing.sentryInternalTracingStrings.copy]
    
    inline def delete: typings.sentryInternalTracing.sentryInternalTracingStrings.delete = "delete".asInstanceOf[typings.sentryInternalTracing.sentryInternalTracingStrings.delete]
    
    inline def get: typings.sentryInternalTracing.sentryInternalTracingStrings.get = "get".asInstanceOf[typings.sentryInternalTracing.sentryInternalTracingStrings.get]
    
    inline def head: typings.sentryInternalTracing.sentryInternalTracingStrings.head = "head".asInstanceOf[typings.sentryInternalTracing.sentryInternalTracingStrings.head]
    
    inline def lock: typings.sentryInternalTracing.sentryInternalTracingStrings.lock = "lock".asInstanceOf[typings.sentryInternalTracing.sentryInternalTracingStrings.lock]
    
    inline def `m-search`: typings.sentryInternalTracing.sentryInternalTracingStrings.`m-search` = "m-search".asInstanceOf[typings.sentryInternalTracing.sentryInternalTracingStrings.`m-search`]
    
    inline def merge: typings.sentryInternalTracing.sentryInternalTracingStrings.merge = "merge".asInstanceOf[typings.sentryInternalTracing.sentryInternalTracingStrings.merge]
    
    inline def mkactivity: typings.sentryInternalTracing.sentryInternalTracingStrings.mkactivity = "mkactivity".asInstanceOf[typings.sentryInternalTracing.sentryInternalTracingStrings.mkactivity]
    
    inline def mkcol: typings.sentryInternalTracing.sentryInternalTracingStrings.mkcol = "mkcol".asInstanceOf[typings.sentryInternalTracing.sentryInternalTracingStrings.mkcol]
    
    inline def move: typings.sentryInternalTracing.sentryInternalTracingStrings.move = "move".asInstanceOf[typings.sentryInternalTracing.sentryInternalTracingStrings.move]
    
    inline def options: typings.sentryInternalTracing.sentryInternalTracingStrings.options = "options".asInstanceOf[typings.sentryInternalTracing.sentryInternalTracingStrings.options]
    
    inline def patch: typings.sentryInternalTracing.sentryInternalTracingStrings.patch = "patch".asInstanceOf[typings.sentryInternalTracing.sentryInternalTracingStrings.patch]
    
    inline def post: typings.sentryInternalTracing.sentryInternalTracingStrings.post = "post".asInstanceOf[typings.sentryInternalTracing.sentryInternalTracingStrings.post]
    
    inline def purge: typings.sentryInternalTracing.sentryInternalTracingStrings.purge = "purge".asInstanceOf[typings.sentryInternalTracing.sentryInternalTracingStrings.purge]
    
    inline def put: typings.sentryInternalTracing.sentryInternalTracingStrings.put = "put".asInstanceOf[typings.sentryInternalTracing.sentryInternalTracingStrings.put]
    
    inline def report: typings.sentryInternalTracing.sentryInternalTracingStrings.report = "report".asInstanceOf[typings.sentryInternalTracing.sentryInternalTracingStrings.report]
    
    inline def search: typings.sentryInternalTracing.sentryInternalTracingStrings.search = "search".asInstanceOf[typings.sentryInternalTracing.sentryInternalTracingStrings.search]
    
    inline def subscribe: typings.sentryInternalTracing.sentryInternalTracingStrings.subscribe = "subscribe".asInstanceOf[typings.sentryInternalTracing.sentryInternalTracingStrings.subscribe]
    
    inline def trace: typings.sentryInternalTracing.sentryInternalTracingStrings.trace = "trace".asInstanceOf[typings.sentryInternalTracing.sentryInternalTracingStrings.trace]
    
    inline def unlock: typings.sentryInternalTracing.sentryInternalTracingStrings.unlock = "unlock".asInstanceOf[typings.sentryInternalTracing.sentryInternalTracingStrings.unlock]
    
    inline def unsubscribe: typings.sentryInternalTracing.sentryInternalTracingStrings.unsubscribe = "unsubscribe".asInstanceOf[typings.sentryInternalTracing.sentryInternalTracingStrings.unsubscribe]
    
    inline def use: typings.sentryInternalTracing.sentryInternalTracingStrings.use = "use".asInstanceOf[typings.sentryInternalTracing.sentryInternalTracingStrings.use]
  }
  
  /* Inlined {[ method in @sentry-internal/tracing.@sentry-internal/tracing/types/node/integrations/express.Method ]: (args : any): any} */
  trait Router extends StObject {
    
    def all(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): Any
    @JSName("all")
    var all_Original: js.Function1[/* args */ Any, Any]
    
    def checkout(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): Any
    @JSName("checkout")
    var checkout_Original: js.Function1[/* args */ Any, Any]
    
    def copy(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): Any
    @JSName("copy")
    var copy_Original: js.Function1[/* args */ Any, Any]
    
    def delete(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): Any
    @JSName("delete")
    var delete_Original: js.Function1[/* args */ Any, Any]
    
    def get(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): Any
    @JSName("get")
    var get_Original: js.Function1[/* args */ Any, Any]
    
    def head(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): Any
    @JSName("head")
    var head_Original: js.Function1[/* args */ Any, Any]
    
    def lock(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): Any
    @JSName("lock")
    var lock_Original: js.Function1[/* args */ Any, Any]
    
    def `m-search`(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): Any
    @JSName("m-search")
    var `m-search_Original`: js.Function1[/* args */ Any, Any]
    
    def merge(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): Any
    @JSName("merge")
    var merge_Original: js.Function1[/* args */ Any, Any]
    
    def mkactivity(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): Any
    @JSName("mkactivity")
    var mkactivity_Original: js.Function1[/* args */ Any, Any]
    
    def mkcol(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): Any
    @JSName("mkcol")
    var mkcol_Original: js.Function1[/* args */ Any, Any]
    
    def move(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): Any
    @JSName("move")
    var move_Original: js.Function1[/* args */ Any, Any]
    
    def notify(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): Any
    @JSName("notify")
    var notify_Original: js.Function1[/* args */ Any, Any]
    
    def options(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): Any
    @JSName("options")
    var options_Original: js.Function1[/* args */ Any, Any]
    
    def patch(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): Any
    @JSName("patch")
    var patch_Original: js.Function1[/* args */ Any, Any]
    
    def post(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): Any
    @JSName("post")
    var post_Original: js.Function1[/* args */ Any, Any]
    
    def purge(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): Any
    @JSName("purge")
    var purge_Original: js.Function1[/* args */ Any, Any]
    
    def put(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): Any
    @JSName("put")
    var put_Original: js.Function1[/* args */ Any, Any]
    
    def report(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): Any
    @JSName("report")
    var report_Original: js.Function1[/* args */ Any, Any]
    
    def search(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): Any
    @JSName("search")
    var search_Original: js.Function1[/* args */ Any, Any]
    
    def subscribe(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): Any
    @JSName("subscribe")
    var subscribe_Original: js.Function1[/* args */ Any, Any]
    
    def trace(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): Any
    @JSName("trace")
    var trace_Original: js.Function1[/* args */ Any, Any]
    
    def unlock(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): Any
    @JSName("unlock")
    var unlock_Original: js.Function1[/* args */ Any, Any]
    
    def unsubscribe(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): Any
    @JSName("unsubscribe")
    var unsubscribe_Original: js.Function1[/* args */ Any, Any]
    
    def use(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): Any
    @JSName("use")
    var use_Original: js.Function1[/* args */ Any, Any]
  }
  object Router {
    
    inline def apply(
      all: /* args */ Any => Any,
      checkout: /* args */ Any => Any,
      copy: /* args */ Any => Any,
      delete: /* args */ Any => Any,
      get: /* args */ Any => Any,
      head: /* args */ Any => Any,
      lock: /* args */ Any => Any,
      `m-search`: /* args */ Any => Any,
      merge: /* args */ Any => Any,
      mkactivity: /* args */ Any => Any,
      mkcol: /* args */ Any => Any,
      move: /* args */ Any => Any,
      notify_ : /* args */ Any => Any,
      options: /* args */ Any => Any,
      patch: /* args */ Any => Any,
      post: /* args */ Any => Any,
      purge: /* args */ Any => Any,
      put: /* args */ Any => Any,
      report: /* args */ Any => Any,
      search: /* args */ Any => Any,
      subscribe: /* args */ Any => Any,
      trace: /* args */ Any => Any,
      unlock: /* args */ Any => Any,
      unsubscribe: /* args */ Any => Any,
      use: /* args */ Any => Any
    ): Router = {
      val __obj = js.Dynamic.literal(all = js.Any.fromFunction1(all), checkout = js.Any.fromFunction1(checkout), copy = js.Any.fromFunction1(copy), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), head = js.Any.fromFunction1(head), lock = js.Any.fromFunction1(lock), merge = js.Any.fromFunction1(merge), mkactivity = js.Any.fromFunction1(mkactivity), mkcol = js.Any.fromFunction1(mkcol), move = js.Any.fromFunction1(move), options = js.Any.fromFunction1(options), patch = js.Any.fromFunction1(patch), post = js.Any.fromFunction1(post), purge = js.Any.fromFunction1(purge), put = js.Any.fromFunction1(put), report = js.Any.fromFunction1(report), search = js.Any.fromFunction1(search), subscribe = js.Any.fromFunction1(subscribe), trace = js.Any.fromFunction1(trace), unlock = js.Any.fromFunction1(unlock), unsubscribe = js.Any.fromFunction1(unsubscribe), use = js.Any.fromFunction1(use))
      __obj.updateDynamic("m-search")(js.Any.fromFunction1(`m-search`))
      __obj.updateDynamic("notify")(js.Any.fromFunction1(notify_))
      __obj.asInstanceOf[Router]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Router] (val x: Self) extends AnyVal {
      
      inline def setAll(value: /* args */ Any => Any): Self = StObject.set(x, "all", js.Any.fromFunction1(value))
      
      inline def setCheckout(value: /* args */ Any => Any): Self = StObject.set(x, "checkout", js.Any.fromFunction1(value))
      
      inline def setCopy(value: /* args */ Any => Any): Self = StObject.set(x, "copy", js.Any.fromFunction1(value))
      
      inline def setDelete(value: /* args */ Any => Any): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
      
      inline def setGet(value: /* args */ Any => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setHead(value: /* args */ Any => Any): Self = StObject.set(x, "head", js.Any.fromFunction1(value))
      
      inline def setLock(value: /* args */ Any => Any): Self = StObject.set(x, "lock", js.Any.fromFunction1(value))
      
      inline def `setM-search`(value: /* args */ Any => Any): Self = StObject.set(x, "m-search", js.Any.fromFunction1(value))
      
      inline def setMerge(value: /* args */ Any => Any): Self = StObject.set(x, "merge", js.Any.fromFunction1(value))
      
      inline def setMkactivity(value: /* args */ Any => Any): Self = StObject.set(x, "mkactivity", js.Any.fromFunction1(value))
      
      inline def setMkcol(value: /* args */ Any => Any): Self = StObject.set(x, "mkcol", js.Any.fromFunction1(value))
      
      inline def setMove(value: /* args */ Any => Any): Self = StObject.set(x, "move", js.Any.fromFunction1(value))
      
      inline def setNotify_(value: /* args */ Any => Any): Self = StObject.set(x, "notify", js.Any.fromFunction1(value))
      
      inline def setOptions(value: /* args */ Any => Any): Self = StObject.set(x, "options", js.Any.fromFunction1(value))
      
      inline def setPatch(value: /* args */ Any => Any): Self = StObject.set(x, "patch", js.Any.fromFunction1(value))
      
      inline def setPost(value: /* args */ Any => Any): Self = StObject.set(x, "post", js.Any.fromFunction1(value))
      
      inline def setPurge(value: /* args */ Any => Any): Self = StObject.set(x, "purge", js.Any.fromFunction1(value))
      
      inline def setPut(value: /* args */ Any => Any): Self = StObject.set(x, "put", js.Any.fromFunction1(value))
      
      inline def setReport(value: /* args */ Any => Any): Self = StObject.set(x, "report", js.Any.fromFunction1(value))
      
      inline def setSearch(value: /* args */ Any => Any): Self = StObject.set(x, "search", js.Any.fromFunction1(value))
      
      inline def setSubscribe(value: /* args */ Any => Any): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
      
      inline def setTrace(value: /* args */ Any => Any): Self = StObject.set(x, "trace", js.Any.fromFunction1(value))
      
      inline def setUnlock(value: /* args */ Any => Any): Self = StObject.set(x, "unlock", js.Any.fromFunction1(value))
      
      inline def setUnsubscribe(value: /* args */ Any => Any): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction1(value))
      
      inline def setUse(value: /* args */ Any => Any): Self = StObject.set(x, "use", js.Any.fromFunction1(value))
    }
  }
}
