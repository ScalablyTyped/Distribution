package typings.skatejs.mod

import typings.skatejs.typesMod.Constructor
import typings.skatejs.typesMod.WithContext
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("skatejs", "withContext")
@js.native
object withContext extends js.Object {
  
  def apply[C, T /* <: Constructor[HTMLElement] */](): Constructor[WithContext[C]] with T = js.native
  def apply[C, T /* <: Constructor[HTMLElement] */](Base: T): Constructor[WithContext[C]] with T = js.native
}
