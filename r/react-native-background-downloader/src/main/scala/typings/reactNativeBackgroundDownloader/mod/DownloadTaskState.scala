package typings.reactNativeBackgroundDownloader.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DownloadTaskState extends js.Object
@JSImport("react-native-background-downloader", "DownloadTaskState")
@js.native
object DownloadTaskState extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DownloadTaskState with String] = js.native
  
  @js.native
  sealed trait DONE extends DownloadTaskState
  /* "DONE" */ @js.native
  object DONE extends TopLevel[DONE with String]
  
  @js.native
  sealed trait DOWNLOADING extends DownloadTaskState
  /* "DOWNLOADING" */ @js.native
  object DOWNLOADING extends TopLevel[DOWNLOADING with String]
  
  @js.native
  sealed trait FAILED extends DownloadTaskState
  /* "FAILED" */ @js.native
  object FAILED extends TopLevel[FAILED with String]
  
  @js.native
  sealed trait PAUSED extends DownloadTaskState
  /* "PAUSED" */ @js.native
  object PAUSED extends TopLevel[PAUSED with String]
  
  @js.native
  sealed trait STOPPED extends DownloadTaskState
  /* "STOPPED" */ @js.native
  object STOPPED extends TopLevel[STOPPED with String]
}
