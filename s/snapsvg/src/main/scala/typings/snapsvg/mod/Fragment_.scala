package typings.snapsvg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fragment_ extends js.Object {
  
  //TODO: The documentation says that selectAll returns a set, but the getting started guide
  // uses .attr on the returned object. That's not supported by a set
  def select(query: String): Element = js.native
  
  def selectAll(): Set_ = js.native
  def selectAll(query: String): Set_ = js.native
}
