package typings
package sammyLib.SammyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Dropped Object */ @js.native
trait Application extends js.Object {
  var APP_EVENTS: js.Array[java.lang.String] = js.native
  var ROUTE_VERBS: js.Array[java.lang.String] = js.native
  var last_location: js.Array[java.lang.String] = js.native
  // Features provided by oauth2 plugin
  var oauthorize: java.lang.String = js.native
  @JSName("$element")
  def $element(): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  @JSName("$element")
  def $element(selector: java.lang.String): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  def apply(appFn: js.Function): js.Any = js.native
  def after(callback: js.Function): Application = js.native
  def any(verb: java.lang.String, path: java.lang.String, callback: js.Function): scala.Unit = js.native
  def around(callback: js.Function): Application = js.native
  def before(callback: js.Function): Application = js.native
  def before(options: js.Any, callback: js.Function): Application = js.native
  def bind(name: java.lang.String, callback: js.Function): Application = js.native
  def bind(name: java.lang.String, data: js.Any, callback: js.Function): Application = js.native
  def bindToAllEvents(callback: js.Function): Application = js.native
  def clearTemplateCache(): js.Any = js.native
  def contextMatchesOptions(context: js.Any, match_options: js.Any): scala.Boolean = js.native
  def contextMatchesOptions(context: js.Any, match_options: js.Any, positive: scala.Boolean): scala.Boolean = js.native
  def del(path: java.lang.String, callback: js.Function): Application = js.native
  def del(path: stdLib.RegExp, callback: js.Function): Application = js.native
  def destroy(): Application = js.native
  def error(message: java.lang.String, original_error: stdLib.Error): scala.Unit = js.native
  def eventNamespace(): java.lang.String = js.native
  def get(path: java.lang.String, callback: js.Function): Application = js.native
  def get(path: stdLib.RegExp, callback: js.Function): Application = js.native
  def getLocation(): java.lang.String = js.native
  def helper(name: java.lang.String, method: js.Function): js.Any = js.native
   // Behaviour similar to _.extend
  def helpers(extensions: js.Any): js.Any = js.native
   // Behaviour similar to _.extend
  def isRunning(): scala.Boolean = js.native
  def log(params: js.Any*): scala.Unit = js.native
  def lookupRoute(verb: java.lang.String, path: java.lang.String): js.Any = js.native
  def mapRoutes(route_array: js.Array[_]): Application = js.native
  def notFound(verb: java.lang.String, path: java.lang.String): js.Any = js.native
  def post(path: java.lang.String, callback: js.Function): Application = js.native
  def post(path: stdLib.RegExp, callback: js.Function): Application = js.native
  def put(path: java.lang.String, callback: js.Function): Application = js.native
  def put(path: stdLib.RegExp, callback: js.Function): Application = js.native
  def refresh(): Application = js.native
  def requireOAuth(): js.Any = js.native
  def requireOAuth(callback: js.Function): js.Any = js.native
  def requireOAuth(path: java.lang.String): js.Any = js.native
  def routablePath(path: java.lang.String): java.lang.String = js.native
  def route(verb: java.lang.String, path: java.lang.String, callback: js.Function): Application = js.native
  def route(verb: java.lang.String, path: stdLib.RegExp, callback: js.Function): Application = js.native
  def run(): Application = js.native
  def run(start_url: java.lang.String): Application = js.native
  def runRoute(verb: java.lang.String): js.Any = js.native
  def runRoute(verb: java.lang.String, path: java.lang.String): js.Any = js.native
  def runRoute(verb: java.lang.String, path: java.lang.String, params: js.Any): js.Any = js.native
  def runRoute(verb: java.lang.String, path: java.lang.String, params: js.Any, target: js.Any): js.Any = js.native
  def send(params: js.Any*): js.Any = js.native
  def setLocation(new_location: java.lang.String): java.lang.String = js.native
  def setLocationProxy(new_proxy: DataLocationProxy): scala.Unit = js.native
  def swap(content: js.Any, callback: js.Function): js.Any = js.native
  def templateCache(key: java.lang.String, value: js.Any): js.Any = js.native
  def trigger(name: java.lang.String): Application = js.native
  def trigger(name: java.lang.String, data: js.Any): Application = js.native
  def unload(): Application = js.native
  def use(params: js.Any*): scala.Unit = js.native
}

