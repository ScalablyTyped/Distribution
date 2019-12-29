package typings.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ViewScope extends js.Object

@JSGlobal("SP.ViewScope")
@js.native
object ViewScope extends js.Object {
  @js.native
  sealed trait defaultValue extends ViewScope
  
  @js.native
  sealed trait filesOnly extends ViewScope
  
  @js.native
  sealed trait recursive extends ViewScope
  
  @js.native
  sealed trait recursiveAll extends ViewScope
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ViewScope with Double] = js.native
  /* 0 */ @js.native
  object defaultValue extends TopLevel[defaultValue with Double]
  
  /* 3 */ @js.native
  object filesOnly extends TopLevel[filesOnly with Double]
  
  /* 1 */ @js.native
  object recursive extends TopLevel[recursive with Double]
  
  /* 2 */ @js.native
  object recursiveAll extends TopLevel[recursiveAll with Double]
  
}

