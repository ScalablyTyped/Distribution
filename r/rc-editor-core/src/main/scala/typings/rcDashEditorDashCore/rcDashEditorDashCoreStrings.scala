package typings.rcDashEditorDashCore

import typings.rcDashEditorDashCore.libEditorCoreMod.DraftHandleValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rcDashEditorDashCoreStrings {
  @js.native
  sealed trait handled
    extends DraftHandleValue
       with typings.rcDashEditorDashCore.esEditorCoreMod.DraftHandleValue
  
  @js.native
  sealed trait `not-handled`
    extends DraftHandleValue
       with typings.rcDashEditorDashCore.esEditorCoreMod.DraftHandleValue
  
  @scala.inline
  def handled: handled = "handled".asInstanceOf[handled]
  @scala.inline
  def `not-handled`: `not-handled` = "not-handled".asInstanceOf[`not-handled`]
}

