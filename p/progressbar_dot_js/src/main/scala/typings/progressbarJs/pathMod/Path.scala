package typings.progressbarJs.pathMod

import typings.progressbarJs.mod.AnimationSupport
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line no-empty-interface adds members from animation contract
@js.native
trait Path[SElement /* <: Element */] extends AnimationSupport {
  
  val path: js.UndefOr[SElement] = js.native
}
