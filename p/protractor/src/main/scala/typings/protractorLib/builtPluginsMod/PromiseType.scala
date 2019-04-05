package typings
package protractorLib.builtPluginsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PromiseType extends js.Object

@JSImport("protractor/built/plugins", "PromiseType")
@js.native
object PromiseType extends js.Object {
  @js.native
  sealed trait Q
    extends protractorLib.builtPluginsMod.PromiseType
  
  @js.native
  sealed trait WEBDRIVER
    extends protractorLib.builtPluginsMod.PromiseType
  
  /* 0 */ val Q: Q with scala.Double = js.native
  /* 1 */ val WEBDRIVER: WEBDRIVER with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[protractorLib.builtPluginsMod.PromiseType with scala.Double] = js.native
}

