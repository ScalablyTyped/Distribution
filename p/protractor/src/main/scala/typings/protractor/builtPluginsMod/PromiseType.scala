package typings.protractor.builtPluginsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PromiseType extends js.Object

@JSImport("protractor/built/plugins", "PromiseType")
@js.native
object PromiseType extends js.Object {
  @js.native
  sealed trait Q extends PromiseType
  
  @js.native
  sealed trait WEBDRIVER extends PromiseType
  
  /* 0 */ val Q: typings.protractor.builtPluginsMod.PromiseType.Q with Double = js.native
  /* 1 */ val WEBDRIVER: typings.protractor.builtPluginsMod.PromiseType.WEBDRIVER with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PromiseType with Double] = js.native
}

