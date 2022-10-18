package typings.storybookCoreServer

import typings.storybookCoreCommon.distTs3Dot9TypesMod.ReleaseNotesData
import typings.storybookCoreServer.anon.CurrentVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9UtilsReleaseNotesMod {
  
  @JSImport("@storybook/core-server/dist/ts3.9/utils/release-notes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/core-server/dist/ts3.9/utils/release-notes", "RELEASE_NOTES_CACHE_KEY")
  @js.native
  val RELEASE_NOTES_CACHE_KEY: /* "releaseNotesData" */ String = js.native
  
  inline def getReleaseNotesData(currentVersionToParse: String, fileSystemCache: Any): js.Promise[ReleaseNotesData] = (^.asInstanceOf[js.Dynamic].applyDynamic("getReleaseNotesData")(currentVersionToParse.asInstanceOf[js.Any], fileSystemCache.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReleaseNotesData]]
  
  inline def getReleaseNotesFailedState(version: String): CurrentVersion = ^.asInstanceOf[js.Dynamic].applyDynamic("getReleaseNotesFailedState")(version.asInstanceOf[js.Any]).asInstanceOf[CurrentVersion]
}
