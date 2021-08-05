package typings.sammy

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable5
import typings.jquery.JQuery
import typings.sammy.anon.Data
import typings.std.Error
import typings.std.HTMLElement
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Sammy {
  
  @js.native
  trait Application
    extends StObject
       with Object {
    
    def apply(appFn: js.Function): js.Any = js.native
    
    @JSName("$element")
    def $element(): JQuery[HTMLElement] = js.native
    @JSName("$element")
    def $element(selector: String): JQuery[HTMLElement] = js.native
    
    var APP_EVENTS: js.Array[String] = js.native
    
    var ROUTE_VERBS: js.Array[String] = js.native
    
    def after(callback: js.Function): Application = js.native
    
    def any(verb: String, path: String, callback: js.Function): Unit = js.native
    
    def around(callback: js.Function): Application = js.native
    
    def before(callback: js.Function): Application = js.native
    def before(options: js.Any, callback: js.Function): Application = js.native
    
    def bind(name: String, callback: js.Function): Application = js.native
    def bind(name: String, data: js.Any, callback: js.Function): Application = js.native
    
    def bindToAllEvents(callback: js.Function): Application = js.native
    
    def clearTemplateCache(): js.Any = js.native
    
    def contextMatchesOptions(context: js.Any, match_options: js.Any): Boolean = js.native
    def contextMatchesOptions(context: js.Any, match_options: js.Any, positive: Boolean): Boolean = js.native
    
    def del(path: String, callback: js.Function): Application = js.native
    def del(path: RegExp, callback: js.Function): Application = js.native
    
    def destroy(): Application = js.native
    
    def error(message: String, original_error: Error): Unit = js.native
    
    def eventNamespace(): String = js.native
    
    def get(path: String, callback: js.Function): Application = js.native
    def get(path: RegExp, callback: js.Function): Application = js.native
    
    def getLocation(): String = js.native
    
    def helper(name: String, method: js.Function): js.Any = js.native
    
    // Behaviour similar to _.extend
    def helpers(extensions: js.Any): js.Any = js.native
    
    // Behaviour similar to _.extend
    def isRunning(): Boolean = js.native
    
    var last_location: js.Array[String] = js.native
    
    def lookupRoute(verb: String, path: String): js.Any = js.native
    
    def mapRoutes(route_array: js.Array[js.Any]): Application = js.native
    
    def notFound(verb: String, path: String): js.Any = js.native
    
    // Features provided by oauth2 plugin
    var oauthorize: String = js.native
    
    def post(path: String, callback: js.Function): Application = js.native
    def post(path: RegExp, callback: js.Function): Application = js.native
    
    def put(path: String, callback: js.Function): Application = js.native
    def put(path: RegExp, callback: js.Function): Application = js.native
    
    def refresh(): Application = js.native
    
    def requireOAuth(): js.Any = js.native
    def requireOAuth(callback: js.Function): js.Any = js.native
    def requireOAuth(path: String): js.Any = js.native
    
    def routablePath(path: String): String = js.native
    
    def route(verb: String, path: String, callback: js.Function): Application = js.native
    def route(verb: String, path: RegExp, callback: js.Function): Application = js.native
    
    def run(): Application = js.native
    def run(start_url: String): Application = js.native
    
    def runRoute(verb: String): js.Any = js.native
    def runRoute(verb: String, path: String): js.Any = js.native
    def runRoute(verb: String, path: String, params: js.Any): js.Any = js.native
    def runRoute(verb: String, path: String, params: js.Any, target: js.Any): js.Any = js.native
    def runRoute(verb: String, path: String, params: Unit, target: js.Any): js.Any = js.native
    def runRoute(verb: String, path: Unit, params: js.Any): js.Any = js.native
    def runRoute(verb: String, path: Unit, params: js.Any, target: js.Any): js.Any = js.native
    def runRoute(verb: String, path: Unit, params: Unit, target: js.Any): js.Any = js.native
    
    def send(params: js.Any*): js.Any = js.native
    
    def setLocation(new_location: String): String = js.native
    
    def setLocationProxy(new_proxy: DataLocationProxy): Unit = js.native
    
    def swap(content: js.Any, callback: js.Function): js.Any = js.native
    
    def templateCache(key: String, value: js.Any): js.Any = js.native
    
    def trigger(name: String): Application = js.native
    def trigger(name: String, data: js.Any): Application = js.native
    
    def unload(): Application = js.native
    
    def use(params: js.Any*): Unit = js.native
  }
  
  @js.native
  trait DataLocationProxy
    extends StObject
       with Instantiable1[/* app */ js.Any, DataLocationProxy]
       with Instantiable2[/* app */ js.Any, /* run_interval_every */ js.Any, DataLocationProxy]
       with Instantiable3[
          /* app */ js.Any, 
          /* data_name */ js.Any, 
          /* href_attribute */ js.Any, 
          DataLocationProxy
        ] {
    
    def _startPolling(every: Double): Unit = js.native
    
    def bind(): Unit = js.native
    
    def fullPath(location_obj: js.Any): String = js.native
    
    def setLocation(new_location: String): String = js.native
    
    def unbind(): Unit = js.native
  }
  
  @js.native
  trait EventContext
    extends StObject
       with Object
       with Instantiable5[
          /* app */ js.Any, 
          /* verb */ js.Any, 
          /* path */ js.Any, 
          /* params */ js.Any, 
          /* target */ js.Any, 
          js.Any
        ] {
    
    @JSName("$element")
    def $element(): JQuery[HTMLElement] = js.native
    
    def engineFor(engine: js.Any): js.Any = js.native
    
    def eventNamespace(): String = js.native
    
    def interpolate(content: js.Any, data: js.Any, engine: js.Any): EventContext = js.native
    def interpolate(content: js.Any, data: js.Any, engine: js.Any, partials: js.Any): EventContext = js.native
    
    def json(str: String): js.Any = js.native
    def json(str: js.Any): js.Any = js.native
    
    def load(location: js.Any): js.Any = js.native
    def load(location: js.Any, options: js.Any): js.Any = js.native
    def load(location: js.Any, options: js.Any, callback: js.Function): js.Any = js.native
    def load(location: js.Any, options: Unit, callback: js.Function): js.Any = js.native
    
    def loadPartials(): js.Any = js.native
    def loadPartials(partials: js.Any): js.Any = js.native
    
    // Provided by common sammy modules:
    var name: js.Any = js.native
    
    def notFound(): js.Any = js.native
    
    var params: js.Any = js.native
    
    def partial(location: String): RenderContext = js.native
    def partial(location: String, data: js.Any): RenderContext = js.native
    def partial(location: String, data: js.Any, callback: js.Function): RenderContext = js.native
    def partial(location: String, data: js.Any, callback: js.Function, partials: js.Any): RenderContext = js.native
    def partial(location: String, data: js.Any, callback: Unit, partials: js.Any): RenderContext = js.native
    def partial(location: String, data: Unit, callback: js.Function): RenderContext = js.native
    def partial(location: String, data: Unit, callback: js.Function, partials: js.Any): RenderContext = js.native
    def partial(location: String, data: Unit, callback: Unit, partials: js.Any): RenderContext = js.native
    
    var partials: js.Any = js.native
    
    def redirect(params: js.Any*): Unit = js.native
    
    def render(location: String): RenderContext = js.native
    def render(location: String, data: js.Any): RenderContext = js.native
    def render(location: String, data: js.Any, callback: js.Function): RenderContext = js.native
    def render(location: String, data: js.Any, callback: js.Function, partials: js.Any): RenderContext = js.native
    def render(location: String, data: js.Any, callback: Unit, partials: js.Any): RenderContext = js.native
    def render(location: String, data: Unit, callback: js.Function): RenderContext = js.native
    def render(location: String, data: Unit, callback: js.Function, partials: js.Any): RenderContext = js.native
    def render(location: String, data: Unit, callback: Unit, partials: js.Any): RenderContext = js.native
    
    def renderEach(location: js.Any): RenderContext = js.native
    def renderEach(location: js.Any, data: js.Array[Data]): RenderContext = js.native
    def renderEach(location: js.Any, data: js.Array[Data], callback: js.Function): RenderContext = js.native
    def renderEach(location: js.Any, data: Unit, callback: js.Function): RenderContext = js.native
    
    def send(params: js.Any*): RenderContext = js.native
    
    def swap(contents: js.Any, callback: js.Function): String = js.native
    
    var title: js.Any = js.native
    
    def trigger(name: String): EventContext = js.native
    def trigger(name: String, data: js.Any): EventContext = js.native
  }
  
  trait Form extends StObject {
    
    def formFor(name: String, `object`: js.Any, content_callback: js.Function): FormBuilder
  }
  object Form {
    
    inline def apply(formFor: (String, js.Any, js.Function) => FormBuilder): Form = {
      val __obj = js.Dynamic.literal(formFor = js.Any.fromFunction3(formFor))
      __obj.asInstanceOf[Form]
    }
    
    extension [Self <: Form](x: Self) {
      
      inline def setFormFor(value: (String, js.Any, js.Function) => FormBuilder): Self = StObject.set(x, "formFor", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait FormBuilder
    extends StObject
       with Instantiable2[/* name */ js.Any, /* object */ js.Any, js.Any] {
    
    def checkbox(keypath: String, value: js.Any, attributes: js.Any*): String = js.native
    
    def close(): String = js.native
    
    def hidden(keypath: String, attributes: js.Any*): String = js.native
    
    def label(keypath: String, content: js.Any, attributes: js.Any*): String = js.native
    
    def open(attributes: js.Any*): js.Any = js.native
    
    def password(keypath: String, attributes: js.Any*): String = js.native
    
    def radio(keypath: String, value: js.Any, attributes: js.Any*): String = js.native
    
    def select(keypath: String, options: js.Any, attributes: js.Any*): String = js.native
    
    def submit(attributes: js.Any*): String = js.native
    
    def text(keypath: String, attributes: js.Any*): String = js.native
    
    def textarea(keypath: String, attributes: js.Any*): String = js.native
  }
  
  @js.native
  trait GoogleAnalytics
    extends StObject
       with Instantiable2[/* name */ js.Any, /* object */ js.Any, js.Any] {
    
    def noTrack(): js.Any = js.native
    
    def track(path: js.Any): js.Any = js.native
  }
  
  type Haml = EventContext
  
  type Handlebars = EventContext
  
  type Hogan = EventContext
  
  type JSON = EventContext
  
  type Mustache = EventContext
  
  @js.native
  trait Object extends StObject {
    
    def escapeHTML(s: String): String = js.native
    
    def h(s: String): String = js.native
    
    def has(key: String): Boolean = js.native
    
    def join(args: js.Any*): String = js.native
    
    def keys(): js.Array[String] = js.native
    def keys(attributes_only: Boolean): js.Array[String] = js.native
    
    def log(args: js.Any*): Unit = js.native
    
    def toHTML(): String = js.native
    
    def toHash(): js.Any = js.native
    
    def toString(include_functions: Boolean): String = js.native
  }
  
  @js.native
  trait RenderContext
    extends StObject
       with Object
       with Instantiable1[/* event_context */ js.Any, js.Any] {
    
    def appendTo(selector: String): RenderContext = js.native
    
    def collect(array: js.Array[js.Any], callback: js.Function): RenderContext = js.native
    def collect(array: js.Array[js.Any], callback: js.Function, now: Boolean): RenderContext = js.native
    
    def interpolate(data: js.Any): RenderContext = js.native
    def interpolate(data: js.Any, engine: js.Any): RenderContext = js.native
    def interpolate(data: js.Any, engine: js.Any, retain: Boolean): RenderContext = js.native
    def interpolate(data: js.Any, engine: Unit, retain: Boolean): RenderContext = js.native
    
    def load(location: String): RenderContext = js.native
    def load(location: String, options: js.Any): RenderContext = js.native
    def load(location: String, options: js.Any, callback: js.Function): RenderContext = js.native
    def load(location: String, options: Unit, callback: js.Function): RenderContext = js.native
    
    def loadPartials(): RenderContext = js.native
    def loadPartials(partials: js.Any): RenderContext = js.native
    
    def next(content: js.Any): Unit = js.native
    
    def partial(location: String, callback: js.Function, partials: js.Any): RenderContext = js.native
    def partial(location: String, data: js.Any, callback: js.Function, partials: js.Any): RenderContext = js.native
    
    def prependTo(selector: String): RenderContext = js.native
    
    def render(callback: js.Function): RenderContext = js.native
    def render(location: String, callback: js.Function): RenderContext = js.native
    def render(location: String, callback: js.Function, partials: js.Any): RenderContext = js.native
    def render(location: String, data: js.Any): RenderContext = js.native
    def render(location: String, data: js.Any, callback: js.Function): RenderContext = js.native
    def render(location: String, data: js.Any, callback: js.Function, partials: js.Any): RenderContext = js.native
    
    def renderEach(location: String): RenderContext = js.native
    def renderEach(location: String, name: String): RenderContext = js.native
    def renderEach(location: String, name: String, data: js.Any): RenderContext = js.native
    def renderEach(location: String, name: String, data: js.Any, callback: js.Function): RenderContext = js.native
    def renderEach(location: String, name: String, data: Unit, callback: js.Function): RenderContext = js.native
    def renderEach(location: String, name: Unit, data: js.Any): RenderContext = js.native
    def renderEach(location: String, name: Unit, data: js.Any, callback: js.Function): RenderContext = js.native
    def renderEach(location: String, name: Unit, data: Unit, callback: js.Function): RenderContext = js.native
    
    def replace(selector: String): RenderContext = js.native
    
    def send(params: js.Any*): RenderContext = js.native
    
    def swap(): RenderContext = js.native
    def swap(callback: js.Function): RenderContext = js.native
    
    def `then`(callback: js.Function): RenderContext = js.native
    
    def trigger(name: js.Any, data: js.Any): js.Any = js.native
  }
  
  @js.native
  trait SammyFunc extends StObject {
    
    def apply(): Application = js.native
    def apply(handler: js.Function): Application = js.native
    def apply(selector: String): Application = js.native
    def apply(selector: String, handler: js.Function): Application = js.native
  }
  
  @js.native
  trait Store
    extends StObject
       with Instantiable0[js.Any]
       with Instantiable1[/* options */ js.Any, js.Any] {
    
    def Cookie(name: js.Any, element: js.Any, options: js.Any): js.Any = js.native
    
    def Data(name: js.Any, element: js.Any): js.Any = js.native
    
    def LocalStorage(name: js.Any, element: js.Any): js.Any = js.native
    
    def Memory(name: js.Any, element: js.Any): js.Any = js.native
    
    def SessionStorage(name: js.Any, element: js.Any): js.Any = js.native
    
    def Template(app: js.Any, method_alias: js.Any): js.Any = js.native
    
    def clear(key: String): js.Any = js.native
    
    def clearAll(): Unit = js.native
    
    def each(callback: js.Function): Boolean = js.native
    
    def exists(key: String): Boolean = js.native
    
    def fetch(key: String, callback: js.Function): js.Any = js.native
    
    def filter(callback: js.Function): Boolean = js.native
    
    def first(callback: js.Function): Boolean = js.native
    
    def get(key: String): js.Any = js.native
    
    def isAvailable(): Boolean = js.native
    def isAvailable(`type`: js.Any): js.Any = js.native
    
    def keys(): js.Array[String] = js.native
    
    def load(key: String, path: String, callback: js.Function): Unit = js.native
    
    def set(key: String, value: js.Any): js.Any = js.native
    
    var stores: js.Any = js.native
  }
  
  trait StoreOptions extends StObject {
    
    var cookie: js.UndefOr[js.Any] = js.undefined
    
    var data: js.UndefOr[js.Any] = js.undefined
    
    var element: js.UndefOr[String] = js.undefined
    
    var local: js.UndefOr[js.Any] = js.undefined
    
    var memory: js.UndefOr[js.Any] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var session: js.UndefOr[js.Any] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object StoreOptions {
    
    inline def apply(): StoreOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StoreOptions]
    }
    
    extension [Self <: StoreOptions](x: Self) {
      
      inline def setCookie(value: js.Any): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      inline def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setLocal(value: js.Any): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      inline def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
      
      inline def setMemory(value: js.Any): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
      
      inline def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSession(value: js.Any): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
