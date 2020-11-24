package typings.scrivito.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("scrivito", "Link")
@js.native
class Link protected () extends _Link {
  def this(attributes: ExternalLinkAttributes) = this()
  def this(attributes: InternalLinkAttributes) = this()
  
  def hash(): String | Null = js.native
  
  def obj(): Obj | Null = js.native
  
  def query(): String | Null = js.native
  
  def url(): String | Null = js.native
}
