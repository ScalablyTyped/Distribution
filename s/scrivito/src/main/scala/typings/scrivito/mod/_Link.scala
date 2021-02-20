package typings.scrivito.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait _Link extends StObject {
  
  def copy(attributes: ExternalLinkAttributes): ExternalLink = js.native
  def copy(attributes: InternalLinkAttributes): InternalLink = js.native
  
  def isExternal(): Boolean = js.native
  
  def isInternal(): Boolean = js.native
  
  def queryParamters(): js.Any = js.native
  
  def rel(): String | Null = js.native
  
  def target(): String | Null = js.native
  
  def title(): String | Null = js.native
}
