package typings
package rcDashEditorDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rcDashEditorDashCoreLibStrings {
  @js.native
  sealed trait handled
    extends rcDashEditorDashCoreLib.libEditorCoreMod.DraftHandleValue
       with rcDashEditorDashCoreLib.esEditorCoreMod.DraftHandleValue
  
  @js.native
  sealed trait `not-handled`
    extends rcDashEditorDashCoreLib.libEditorCoreMod.DraftHandleValue
       with rcDashEditorDashCoreLib.esEditorCoreMod.DraftHandleValue
  
  @scala.inline
  def handled: handled = "handled".asInstanceOf[handled]
  @scala.inline
  def `not-handled`: `not-handled` = "not-handled".asInstanceOf[`not-handled`]
}

