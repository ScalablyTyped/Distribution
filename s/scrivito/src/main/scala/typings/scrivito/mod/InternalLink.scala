package typings.scrivito.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// There are just interfaces and not newable
@js.native
trait InternalLink extends _Link {
  
  def hash(): String = js.native
  
  def obj(): Obj = js.native
  
  def query(): String = js.native
}
