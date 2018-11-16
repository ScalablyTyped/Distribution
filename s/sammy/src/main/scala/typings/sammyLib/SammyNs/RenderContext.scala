package typings
package sammyLib.SammyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Dropped Object */ @js.native
trait RenderContext
  extends ScalablyTyped.runtime.Instantiable1[/* event_context */ js.Any, js.Any] {
  def appendTo(selector: java.lang.String): RenderContext = js.native
  def collect(array: js.Array[_], callback: js.Function): RenderContext = js.native
  def collect(array: js.Array[_], callback: js.Function, now: scala.Boolean): RenderContext = js.native
  def interpolate(data: js.Any): RenderContext = js.native
  def interpolate(data: js.Any, engine: js.Any): RenderContext = js.native
  def interpolate(data: js.Any, engine: js.Any, retain: scala.Boolean): RenderContext = js.native
  def load(location: java.lang.String): RenderContext = js.native
  def load(location: java.lang.String, options: js.Any): RenderContext = js.native
  def load(location: java.lang.String, options: js.Any, callback: js.Function): RenderContext = js.native
  def loadPartials(): RenderContext = js.native
  def loadPartials(partials: js.Any): RenderContext = js.native
  def next(content: js.Any): scala.Unit = js.native
  def partial(location: java.lang.String, callback: js.Function, partials: js.Any): RenderContext = js.native
  def partial(location: java.lang.String, data: js.Any, callback: js.Function, partials: js.Any): RenderContext = js.native
  def prependTo(selector: java.lang.String): RenderContext = js.native
  def render(callback: js.Function): RenderContext = js.native
  def render(location: java.lang.String, callback: js.Function): RenderContext = js.native
  def render(location: java.lang.String, callback: js.Function, partials: js.Any): RenderContext = js.native
  def render(location: java.lang.String, data: js.Any): RenderContext = js.native
  def render(location: java.lang.String, data: js.Any, callback: js.Function): RenderContext = js.native
  def render(location: java.lang.String, data: js.Any, callback: js.Function, partials: js.Any): RenderContext = js.native
  def renderEach(location: java.lang.String): RenderContext = js.native
  def renderEach(location: java.lang.String, name: java.lang.String): RenderContext = js.native
  def renderEach(location: java.lang.String, name: java.lang.String, data: js.Any): RenderContext = js.native
  def renderEach(location: java.lang.String, name: java.lang.String, data: js.Any, callback: js.Function): RenderContext = js.native
  def replace(selector: java.lang.String): RenderContext = js.native
  def send(params: js.Any*): RenderContext = js.native
  def swap(): RenderContext = js.native
  def swap(callback: js.Function): RenderContext = js.native
  def `then`(callback: js.Function): RenderContext = js.native
  def trigger(name: js.Any, data: js.Any): js.Any = js.native
}

