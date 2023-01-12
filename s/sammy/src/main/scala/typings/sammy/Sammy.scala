package typings.sammy

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable5
import typings.jquery.JQuery
import typings.sammy.anon.Data
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Sammy {
  
  @js.native
  trait Application
    extends StObject
       with Object {
    
    def apply(appFn: js.Function): Any = js.native
    
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
    def before(options: Any, callback: js.Function): Application = js.native
    
    def bind(name: String, callback: js.Function): Application = js.native
    def bind(name: String, data: Any, callback: js.Function): Application = js.native
    
    def bindToAllEvents(callback: js.Function): Application = js.native
    
    def clearTemplateCache(): Any = js.native
    
    def contextMatchesOptions(context: Any, match_options: Any): Boolean = js.native
    def contextMatchesOptions(context: Any, match_options: Any, positive: Boolean): Boolean = js.native
    
    def del(path: String, callback: js.Function): Application = js.native
    def del(path: js.RegExp, callback: js.Function): Application = js.native
    
    def destroy(): Application = js.native
    
    def error(message: String, original_error: js.Error): Unit = js.native
    
    def eventNamespace(): String = js.native
    
    def get(path: String, callback: js.Function): Application = js.native
    def get(path: js.RegExp, callback: js.Function): Application = js.native
    
    def getLocation(): String = js.native
    
    def helper(name: String, method: js.Function): Any = js.native
    
    // Behaviour similar to _.extend
    def helpers(extensions: Any): Any = js.native
    
    // Behaviour similar to _.extend
    def isRunning(): Boolean = js.native
    
    var last_location: js.Array[String] = js.native
    
    def lookupRoute(verb: String, path: String): Any = js.native
    
    def mapRoutes(route_array: js.Array[Any]): Application = js.native
    
    def notFound(verb: String, path: String): Any = js.native
    
    // Features provided by oauth2 plugin
    var oauthorize: String = js.native
    
    def post(path: String, callback: js.Function): Application = js.native
    def post(path: js.RegExp, callback: js.Function): Application = js.native
    
    def put(path: String, callback: js.Function): Application = js.native
    def put(path: js.RegExp, callback: js.Function): Application = js.native
    
    def refresh(): Application = js.native
    
    def requireOAuth(): Any = js.native
    def requireOAuth(callback: js.Function): Any = js.native
    def requireOAuth(path: String): Any = js.native
    
    def routablePath(path: String): String = js.native
    
    def route(verb: String, path: String, callback: js.Function): Application = js.native
    def route(verb: String, path: js.RegExp, callback: js.Function): Application = js.native
    
    def run(): Application = js.native
    def run(start_url: String): Application = js.native
    
    def runRoute(verb: String): Any = js.native
    def runRoute(verb: String, path: String): Any = js.native
    def runRoute(verb: String, path: String, params: Any): Any = js.native
    def runRoute(verb: String, path: String, params: Any, target: Any): Any = js.native
    def runRoute(verb: String, path: String, params: Unit, target: Any): Any = js.native
    def runRoute(verb: String, path: Unit, params: Any): Any = js.native
    def runRoute(verb: String, path: Unit, params: Any, target: Any): Any = js.native
    def runRoute(verb: String, path: Unit, params: Unit, target: Any): Any = js.native
    
    def send(params: Any*): Any = js.native
    
    def setLocation(new_location: String): String = js.native
    
    def setLocationProxy(new_proxy: DataLocationProxy): Unit = js.native
    
    def swap(content: Any, callback: js.Function): Any = js.native
    
    def templateCache(key: String, value: Any): Any = js.native
    
    def trigger(name: String): Application = js.native
    def trigger(name: String, data: Any): Application = js.native
    
    def unload(): Application = js.native
    
    def use(params: Any*): Unit = js.native
  }
  
  @js.native
  trait DataLocationProxy
    extends StObject
       with Instantiable1[/* app */ Any, DataLocationProxy]
       with Instantiable2[/* app */ Any, /* run_interval_every */ Any, DataLocationProxy]
       with Instantiable3[/* app */ Any, /* data_name */ Any, /* href_attribute */ Any, DataLocationProxy] {
    
    def _startPolling(every: Double): Unit = js.native
    
    def bind(): Unit = js.native
    
    def fullPath(location_obj: Any): String = js.native
    
    def setLocation(new_location: String): String = js.native
    
    def unbind(): Unit = js.native
  }
  
  @js.native
  trait EventContext
    extends StObject
       with Object
       with Instantiable5[/* app */ Any, /* verb */ Any, /* path */ Any, /* params */ Any, /* target */ Any, Any] {
    
    @JSName("$element")
    def $element(): JQuery[HTMLElement] = js.native
    
    def engineFor(engine: Any): Any = js.native
    
    def eventNamespace(): String = js.native
    
    def interpolate(content: Any, data: Any, engine: Any): EventContext = js.native
    def interpolate(content: Any, data: Any, engine: Any, partials: Any): EventContext = js.native
    
    def json(str: String): Any = js.native
    def json(str: Any): Any = js.native
    
    def load(location: Any): Any = js.native
    def load(location: Any, options: Any): Any = js.native
    def load(location: Any, options: Any, callback: js.Function): Any = js.native
    def load(location: Any, options: Unit, callback: js.Function): Any = js.native
    
    def loadPartials(): Any = js.native
    def loadPartials(partials: Any): Any = js.native
    
    // Provided by common sammy modules:
    var name: Any = js.native
    
    def notFound(): Any = js.native
    
    var params: Any = js.native
    
    def partial(location: String): RenderContext = js.native
    def partial(location: String, data: Any): RenderContext = js.native
    def partial(location: String, data: Any, callback: js.Function): RenderContext = js.native
    def partial(location: String, data: Any, callback: js.Function, partials: Any): RenderContext = js.native
    def partial(location: String, data: Any, callback: Unit, partials: Any): RenderContext = js.native
    def partial(location: String, data: Unit, callback: js.Function): RenderContext = js.native
    def partial(location: String, data: Unit, callback: js.Function, partials: Any): RenderContext = js.native
    def partial(location: String, data: Unit, callback: Unit, partials: Any): RenderContext = js.native
    
    var partials: Any = js.native
    
    def redirect(params: Any*): Unit = js.native
    
    def render(location: String): RenderContext = js.native
    def render(location: String, data: Any): RenderContext = js.native
    def render(location: String, data: Any, callback: js.Function): RenderContext = js.native
    def render(location: String, data: Any, callback: js.Function, partials: Any): RenderContext = js.native
    def render(location: String, data: Any, callback: Unit, partials: Any): RenderContext = js.native
    def render(location: String, data: Unit, callback: js.Function): RenderContext = js.native
    def render(location: String, data: Unit, callback: js.Function, partials: Any): RenderContext = js.native
    def render(location: String, data: Unit, callback: Unit, partials: Any): RenderContext = js.native
    
    def renderEach(location: Any): RenderContext = js.native
    def renderEach(location: Any, data: js.Array[Data]): RenderContext = js.native
    def renderEach(location: Any, data: js.Array[Data], callback: js.Function): RenderContext = js.native
    def renderEach(location: Any, data: Unit, callback: js.Function): RenderContext = js.native
    
    def send(params: Any*): RenderContext = js.native
    
    def swap(contents: Any, callback: js.Function): String = js.native
    
    var title: Any = js.native
    
    def trigger(name: String): EventContext = js.native
    def trigger(name: String, data: Any): EventContext = js.native
  }
  
  trait Form extends StObject {
    
    def formFor(name: String, `object`: Any, content_callback: js.Function): FormBuilder
  }
  object Form {
    
    inline def apply(formFor: (String, Any, js.Function) => FormBuilder): Form = {
      val __obj = js.Dynamic.literal(formFor = js.Any.fromFunction3(formFor))
      __obj.asInstanceOf[Form]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Form] (val x: Self) extends AnyVal {
      
      inline def setFormFor(value: (String, Any, js.Function) => FormBuilder): Self = StObject.set(x, "formFor", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait FormBuilder
    extends StObject
       with Instantiable2[/* name */ Any, /* object */ Any, Any] {
    
    def checkbox(keypath: String, value: Any, attributes: Any*): String = js.native
    
    def close(): String = js.native
    
    def hidden(keypath: String, attributes: Any*): String = js.native
    
    def label(keypath: String, content: Any, attributes: Any*): String = js.native
    
    def open(attributes: Any*): Any = js.native
    
    def password(keypath: String, attributes: Any*): String = js.native
    
    def radio(keypath: String, value: Any, attributes: Any*): String = js.native
    
    def select(keypath: String, options: Any, attributes: Any*): String = js.native
    
    def submit(attributes: Any*): String = js.native
    
    def text(keypath: String, attributes: Any*): String = js.native
    
    def textarea(keypath: String, attributes: Any*): String = js.native
  }
  
  @js.native
  trait GoogleAnalytics
    extends StObject
       with Instantiable2[/* name */ Any, /* object */ Any, Any] {
    
    def noTrack(): Any = js.native
    
    def track(path: Any): Any = js.native
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
    
    def join(args: Any*): String = js.native
    
    def keys(): js.Array[String] = js.native
    def keys(attributes_only: Boolean): js.Array[String] = js.native
    
    def log(args: Any*): Unit = js.native
    
    def toHTML(): String = js.native
    
    def toHash(): Any = js.native
    
    def toString(include_functions: Boolean): String = js.native
  }
  
  @js.native
  trait RenderContext
    extends StObject
       with Object
       with Instantiable1[/* event_context */ Any, Any] {
    
    def appendTo(selector: String): RenderContext = js.native
    
    def collect(array: js.Array[Any], callback: js.Function): RenderContext = js.native
    def collect(array: js.Array[Any], callback: js.Function, now: Boolean): RenderContext = js.native
    
    def interpolate(data: Any): RenderContext = js.native
    def interpolate(data: Any, engine: Any): RenderContext = js.native
    def interpolate(data: Any, engine: Any, retain: Boolean): RenderContext = js.native
    def interpolate(data: Any, engine: Unit, retain: Boolean): RenderContext = js.native
    
    def load(location: String): RenderContext = js.native
    def load(location: String, options: Any): RenderContext = js.native
    def load(location: String, options: Any, callback: js.Function): RenderContext = js.native
    def load(location: String, options: Unit, callback: js.Function): RenderContext = js.native
    
    def loadPartials(): RenderContext = js.native
    def loadPartials(partials: Any): RenderContext = js.native
    
    def next(content: Any): Unit = js.native
    
    def partial(location: String, callback: js.Function, partials: Any): RenderContext = js.native
    def partial(location: String, data: Any, callback: js.Function, partials: Any): RenderContext = js.native
    
    def prependTo(selector: String): RenderContext = js.native
    
    def render(callback: js.Function): RenderContext = js.native
    def render(location: String, callback: js.Function): RenderContext = js.native
    def render(location: String, callback: js.Function, partials: Any): RenderContext = js.native
    def render(location: String, data: Any): RenderContext = js.native
    def render(location: String, data: Any, callback: js.Function): RenderContext = js.native
    def render(location: String, data: Any, callback: js.Function, partials: Any): RenderContext = js.native
    
    def renderEach(location: String): RenderContext = js.native
    def renderEach(location: String, name: String): RenderContext = js.native
    def renderEach(location: String, name: String, data: Any): RenderContext = js.native
    def renderEach(location: String, name: String, data: Any, callback: js.Function): RenderContext = js.native
    def renderEach(location: String, name: String, data: Unit, callback: js.Function): RenderContext = js.native
    def renderEach(location: String, name: Unit, data: Any): RenderContext = js.native
    def renderEach(location: String, name: Unit, data: Any, callback: js.Function): RenderContext = js.native
    def renderEach(location: String, name: Unit, data: Unit, callback: js.Function): RenderContext = js.native
    
    def replace(selector: String): RenderContext = js.native
    
    def send(params: Any*): RenderContext = js.native
    
    def swap(): RenderContext = js.native
    def swap(callback: js.Function): RenderContext = js.native
    
    def `then`(callback: js.Function): RenderContext = js.native
    
    def trigger(name: Any, data: Any): Any = js.native
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
       with Instantiable0[Any]
       with Instantiable1[/* options */ Any, Any] {
    
    def Cookie(name: Any, element: Any, options: Any): Any = js.native
    
    def Data(name: Any, element: Any): Any = js.native
    
    def LocalStorage(name: Any, element: Any): Any = js.native
    
    def Memory(name: Any, element: Any): Any = js.native
    
    def SessionStorage(name: Any, element: Any): Any = js.native
    
    def Template(app: Any, method_alias: Any): Any = js.native
    
    def clear(key: String): Any = js.native
    
    def clearAll(): Unit = js.native
    
    def each(callback: js.Function): Boolean = js.native
    
    def exists(key: String): Boolean = js.native
    
    def fetch(key: String, callback: js.Function): Any = js.native
    
    def filter(callback: js.Function): Boolean = js.native
    
    def first(callback: js.Function): Boolean = js.native
    
    def get(key: String): Any = js.native
    
    def isAvailable(): Boolean = js.native
    def isAvailable(`type`: Any): Any = js.native
    
    def keys(): js.Array[String] = js.native
    
    def load(key: String, path: String, callback: js.Function): Unit = js.native
    
    def set(key: String, value: Any): Any = js.native
    
    var stores: Any = js.native
  }
  
  trait StoreOptions extends StObject {
    
    var cookie: js.UndefOr[Any] = js.undefined
    
    var data: js.UndefOr[Any] = js.undefined
    
    var element: js.UndefOr[String] = js.undefined
    
    var local: js.UndefOr[Any] = js.undefined
    
    var memory: js.UndefOr[Any] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var session: js.UndefOr[Any] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object StoreOptions {
    
    inline def apply(): StoreOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StoreOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StoreOptions] (val x: Self) extends AnyVal {
      
      inline def setCookie(value: Any): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      inline def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setLocal(value: Any): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      inline def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
      
      inline def setMemory(value: Any): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
      
      inline def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSession(value: Any): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
