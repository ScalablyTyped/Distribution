package typings.reactInspector

import typings.reactInspector.mod.InspectorTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactInspectorStrings {
  @js.native
  sealed trait chromeDark extends InspectorTheme
  
  @js.native
  sealed trait chromeLight extends InspectorTheme
  
  @scala.inline
  def chromeDark: chromeDark = "chromeDark".asInstanceOf[chromeDark]
  @scala.inline
  def chromeLight: chromeLight = "chromeLight".asInstanceOf[chromeLight]
}

