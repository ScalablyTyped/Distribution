package typings.reactNativeBackgroundDownloader.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DownloadTaskState extends js.Object

@JSImport("react-native-background-downloader", "DownloadTaskState")
@js.native
object DownloadTaskState extends js.Object {
  @js.native
  sealed trait DONE extends DownloadTaskState
  
  @js.native
  sealed trait DOWNLOADING extends DownloadTaskState
  
  @js.native
  sealed trait PAUSED extends DownloadTaskState
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DownloadTaskState with String] = js.native
  /* "DONE" */ @js.native
  object DONE extends TopLevel[DONE with String]
  
  /* "DOWNLOADING" */ @js.native
  object DOWNLOADING extends TopLevel[DOWNLOADING with String]
  
  /* "PAUSED" */ @js.native
  object PAUSED extends TopLevel[PAUSED with String]
  
}

