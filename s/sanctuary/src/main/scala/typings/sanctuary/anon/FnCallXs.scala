package typings.sanctuary.anon

import typings.sanctuary.mod.Applicative
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallXs[A] extends js.Object {
  
  def apply(xs: js.Array[A]): js.Array[A] = js.native
  def apply(xs: Applicative[A]): Applicative[A] = js.native
}
