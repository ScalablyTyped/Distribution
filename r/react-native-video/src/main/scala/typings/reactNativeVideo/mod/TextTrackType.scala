package typings.reactNativeVideo.mod

import typings.reactNativeVideo.reactNativeVideoStrings.`applicationSlashx-subrip`
import typings.reactNativeVideo.reactNativeVideoStrings.applicationSlashttmlPlussignxml
import typings.reactNativeVideo.reactNativeVideoStrings.textSlashvtt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextTrackType {
  
  @JSImport("react-native-video", "TextTrackType")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-video", "TextTrackType.SRT")
  @js.native
  def SRT: `applicationSlashx-subrip` = js.native
  @scala.inline
  def SRT_=(x: `applicationSlashx-subrip`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SRT")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-video", "TextTrackType.TTML")
  @js.native
  def TTML: applicationSlashttmlPlussignxml = js.native
  @scala.inline
  def TTML_=(x: applicationSlashttmlPlussignxml): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TTML")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-video", "TextTrackType.VTT")
  @js.native
  def VTT: textSlashvtt = js.native
  @scala.inline
  def VTT_=(x: textSlashvtt): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VTT")(x.asInstanceOf[js.Any])
}
