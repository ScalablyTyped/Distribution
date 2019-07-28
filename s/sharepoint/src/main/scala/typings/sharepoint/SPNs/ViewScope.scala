package typings.sharepoint.SPNs

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
  
  /* 0 */ val defaultValue: typings.sharepoint.SPNs.ViewScope.defaultValue with Double = js.native
  /* 3 */ val filesOnly: typings.sharepoint.SPNs.ViewScope.filesOnly with Double = js.native
  /* 1 */ val recursive: typings.sharepoint.SPNs.ViewScope.recursive with Double = js.native
  /* 2 */ val recursiveAll: typings.sharepoint.SPNs.ViewScope.recursiveAll with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ViewScope with Double] = js.native
}

