package typings.seen.mod

import typings.seen.anon.PartialCSSStyleDeclaratio
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "SvgStyler")
@js.native
class SvgStyler protected () extends StObject {
  def this(elementFactory: js.Function1[/* name */ String, HTMLElement]) = this()
  
  def clear(): this.type = js.native
  
  def draw(): this.type = js.native
  def draw(style: PartialCSSStyleDeclaratio): this.type = js.native
  
  def fill(): this.type = js.native
  def fill(style: PartialCSSStyleDeclaratio): this.type = js.native
}
