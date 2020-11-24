package typings.protractor.pluginsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PromiseType extends js.Object
@JSImport("protractor/built/plugins", "PromiseType")
@js.native
object PromiseType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PromiseType with Double] = js.native
  
  @js.native
  sealed trait Q extends PromiseType
  /* 0 */ @js.native
  object Q extends TopLevel[Q with Double]
  
  @js.native
  sealed trait WEBDRIVER extends PromiseType
  /* 1 */ @js.native
  object WEBDRIVER extends TopLevel[WEBDRIVER with Double]
}
