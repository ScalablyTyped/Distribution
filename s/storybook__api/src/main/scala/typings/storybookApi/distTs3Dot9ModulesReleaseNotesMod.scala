package typings.storybookApi

import typings.storybookApi.mod.ModuleFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ModulesReleaseNotesMod {
  
  @JSImport("@storybook/api/dist/ts3.9/modules/release-notes", "init")
  @js.native
  val init: ModuleFn = js.native
  
  trait ReleaseNotes extends StObject {
    
    var currentVersion: js.UndefOr[String] = js.undefined
    
    var showOnFirstLaunch: js.UndefOr[Boolean] = js.undefined
    
    var success: js.UndefOr[Boolean] = js.undefined
  }
  object ReleaseNotes {
    
    inline def apply(): ReleaseNotes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReleaseNotes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReleaseNotes] (val x: Self) extends AnyVal {
      
      inline def setCurrentVersion(value: String): Self = StObject.set(x, "currentVersion", value.asInstanceOf[js.Any])
      
      inline def setCurrentVersionUndefined: Self = StObject.set(x, "currentVersion", js.undefined)
      
      inline def setShowOnFirstLaunch(value: Boolean): Self = StObject.set(x, "showOnFirstLaunch", value.asInstanceOf[js.Any])
      
      inline def setShowOnFirstLaunchUndefined: Self = StObject.set(x, "showOnFirstLaunch", js.undefined)
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    }
  }
  
  trait SubAPI extends StObject {
    
    def releaseNotesVersion(): String
    
    def setDidViewReleaseNotes(): Unit
    
    def showReleaseNotesOnLaunch(): Boolean
  }
  object SubAPI {
    
    inline def apply(
      releaseNotesVersion: () => String,
      setDidViewReleaseNotes: () => Unit,
      showReleaseNotesOnLaunch: () => Boolean
    ): SubAPI = {
      val __obj = js.Dynamic.literal(releaseNotesVersion = js.Any.fromFunction0(releaseNotesVersion), setDidViewReleaseNotes = js.Any.fromFunction0(setDidViewReleaseNotes), showReleaseNotesOnLaunch = js.Any.fromFunction0(showReleaseNotesOnLaunch))
      __obj.asInstanceOf[SubAPI]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SubAPI] (val x: Self) extends AnyVal {
      
      inline def setReleaseNotesVersion(value: () => String): Self = StObject.set(x, "releaseNotesVersion", js.Any.fromFunction0(value))
      
      inline def setSetDidViewReleaseNotes(value: () => Unit): Self = StObject.set(x, "setDidViewReleaseNotes", js.Any.fromFunction0(value))
      
      inline def setShowReleaseNotesOnLaunch(value: () => Boolean): Self = StObject.set(x, "showReleaseNotesOnLaunch", js.Any.fromFunction0(value))
    }
  }
  
  trait SubState extends StObject {
    
    var releaseNotesViewed: js.Array[String]
  }
  object SubState {
    
    inline def apply(releaseNotesViewed: js.Array[String]): SubState = {
      val __obj = js.Dynamic.literal(releaseNotesViewed = releaseNotesViewed.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SubState] (val x: Self) extends AnyVal {
      
      inline def setReleaseNotesViewed(value: js.Array[String]): Self = StObject.set(x, "releaseNotesViewed", value.asInstanceOf[js.Any])
      
      inline def setReleaseNotesViewedVarargs(value: String*): Self = StObject.set(x, "releaseNotesViewed", js.Array(value*))
    }
  }
}
