package typings.protractor.builtPluginsMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PromiseType with Double] = js.native
  /* 0 */ @js.native
  object Q extends TopLevel[Q with Double]
  
  /* 1 */ @js.native
  object WEBDRIVER extends TopLevel[WEBDRIVER with Double]
  
}

