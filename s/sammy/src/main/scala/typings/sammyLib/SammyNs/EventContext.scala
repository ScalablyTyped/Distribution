package typings
package sammyLib.SammyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventContext
  extends Object
     with ScalablyTyped.runtime.Instantiable5[
      /* app */ js.Any, 
      /* verb */ js.Any, 
      /* path */ js.Any, 
      /* params */ js.Any, 
      /* target */ js.Any, 
      js.Any
    ] {
  // Provided by common sammy modules:
  var name: js.Any = js.native
  var params: js.Any = js.native
  var partials: js.Any = js.native
  var title: js.Any = js.native
  @JSName("$element")
  def $element(): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  def engineFor(engine: js.Any): js.Any = js.native
  def eventNamespace(): java.lang.String = js.native
  def interpolate(content: js.Any, data: js.Any, engine: js.Any): EventContext = js.native
  def interpolate(content: js.Any, data: js.Any, engine: js.Any, partials: js.Any): EventContext = js.native
  def json(str: java.lang.String): js.Any = js.native
  def json(str: js.Any): js.Any = js.native
  def load(location: js.Any): js.Any = js.native
  def load(location: js.Any, options: js.Any): js.Any = js.native
  def load(location: js.Any, options: js.Any, callback: js.Function): js.Any = js.native
  def loadPartials(): js.Any = js.native
  def loadPartials(partials: js.Any): js.Any = js.native
  def notFound(): js.Any = js.native
  def partial(location: java.lang.String): RenderContext = js.native
  def partial(location: java.lang.String, data: js.Any): RenderContext = js.native
  def partial(location: java.lang.String, data: js.Any, callback: js.Function): RenderContext = js.native
  def partial(location: java.lang.String, data: js.Any, callback: js.Function, partials: js.Any): RenderContext = js.native
  def redirect(params: js.Any*): scala.Unit = js.native
  def render(location: java.lang.String): RenderContext = js.native
  def render(location: java.lang.String, data: js.Any): RenderContext = js.native
  def render(location: java.lang.String, data: js.Any, callback: js.Function): RenderContext = js.native
  def render(location: java.lang.String, data: js.Any, callback: js.Function, partials: js.Any): RenderContext = js.native
  def renderEach(location: js.Any): RenderContext = js.native
  def renderEach(location: js.Any, data: js.Array[sammyLib.Anon_Data]): RenderContext = js.native
  def renderEach(location: js.Any, data: js.Array[sammyLib.Anon_Data], callback: js.Function): RenderContext = js.native
  def send(params: js.Any*): RenderContext = js.native
  def swap(contents: js.Any, callback: js.Function): java.lang.String = js.native
  def trigger(name: java.lang.String): EventContext = js.native
  def trigger(name: java.lang.String, data: js.Any): EventContext = js.native
}

