package typings.reactDashInspector

import typings.reactDashInspector.reactDashInspectorMod.InspectorTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashInspectorStrings {
  @js.native
  sealed trait chromeDark extends InspectorTheme
  
  @js.native
  sealed trait chromeLight extends InspectorTheme
  
  @scala.inline
  def chromeDark: chromeDark = "chromeDark".asInstanceOf[chromeDark]
  @scala.inline
  def chromeLight: chromeLight = "chromeLight".asInstanceOf[chromeLight]
}

