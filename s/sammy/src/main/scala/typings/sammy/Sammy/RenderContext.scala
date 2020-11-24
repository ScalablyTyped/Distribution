package typings.sammy.Sammy

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderContext
  extends Object
     with Instantiable1[/* event_context */ js.Any, js.Any] {
  
  def appendTo(selector: String): RenderContext = js.native
  
  def collect(array: js.Array[_], callback: js.Function): RenderContext = js.native
  def collect(array: js.Array[_], callback: js.Function, now: Boolean): RenderContext = js.native
  
  def interpolate(data: js.Any): RenderContext = js.native
  def interpolate(data: js.Any, engine: js.UndefOr[scala.Nothing], retain: Boolean): RenderContext = js.native
  def interpolate(data: js.Any, engine: js.Any): RenderContext = js.native
  def interpolate(data: js.Any, engine: js.Any, retain: Boolean): RenderContext = js.native
  
  def load(location: String): RenderContext = js.native
  def load(location: String, options: js.UndefOr[scala.Nothing], callback: js.Function): RenderContext = js.native
  def load(location: String, options: js.Any): RenderContext = js.native
  def load(location: String, options: js.Any, callback: js.Function): RenderContext = js.native
  
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
  def renderEach(
    location: String,
    name: js.UndefOr[scala.Nothing],
    data: js.UndefOr[scala.Nothing],
    callback: js.Function
  ): RenderContext = js.native
  def renderEach(location: String, name: js.UndefOr[scala.Nothing], data: js.Any): RenderContext = js.native
  def renderEach(location: String, name: js.UndefOr[scala.Nothing], data: js.Any, callback: js.Function): RenderContext = js.native
  def renderEach(location: String, name: String): RenderContext = js.native
  def renderEach(location: String, name: String, data: js.UndefOr[scala.Nothing], callback: js.Function): RenderContext = js.native
  def renderEach(location: String, name: String, data: js.Any): RenderContext = js.native
  def renderEach(location: String, name: String, data: js.Any, callback: js.Function): RenderContext = js.native
  
  def replace(selector: String): RenderContext = js.native
  
  def send(params: js.Any*): RenderContext = js.native
  
  def swap(): RenderContext = js.native
  def swap(callback: js.Function): RenderContext = js.native
  
  def `then`(callback: js.Function): RenderContext = js.native
  
  def trigger(name: js.Any, data: js.Any): js.Any = js.native
}
