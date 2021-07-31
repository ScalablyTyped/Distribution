package typings.storybookApi

import typings.storybookApi.mod.ModuleFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object releaseNotesMod {
  
  @JSImport("@storybook/api/dist/modules/release-notes", "init")
  @js.native
  val init: ModuleFn = js.native
  
  trait ReleaseNotes extends StObject {
    
    var currentVersion: js.UndefOr[String] = js.undefined
    
    var showOnFirstLaunch: js.UndefOr[Boolean] = js.undefined
    
    var success: js.UndefOr[Boolean] = js.undefined
  }
  object ReleaseNotes {
    
    @scala.inline
    def apply(): ReleaseNotes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReleaseNotes]
    }
    
    @scala.inline
    implicit class ReleaseNotesMutableBuilder[Self <: ReleaseNotes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentVersion(value: String): Self = StObject.set(x, "currentVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentVersionUndefined: Self = StObject.set(x, "currentVersion", js.undefined)
      
      @scala.inline
      def setShowOnFirstLaunch(value: Boolean): Self = StObject.set(x, "showOnFirstLaunch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowOnFirstLaunchUndefined: Self = StObject.set(x, "showOnFirstLaunch", js.undefined)
      
      @scala.inline
      def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    }
  }
  
  trait SubAPI extends StObject {
    
    def releaseNotesVersion(): String
    
    def setDidViewReleaseNotes(): Unit
    
    def showReleaseNotesOnLaunch(): Boolean
  }
  object SubAPI {
    
    @scala.inline
    def apply(
      releaseNotesVersion: () => String,
      setDidViewReleaseNotes: () => Unit,
      showReleaseNotesOnLaunch: () => Boolean
    ): SubAPI = {
      val __obj = js.Dynamic.literal(releaseNotesVersion = js.Any.fromFunction0(releaseNotesVersion), setDidViewReleaseNotes = js.Any.fromFunction0(setDidViewReleaseNotes), showReleaseNotesOnLaunch = js.Any.fromFunction0(showReleaseNotesOnLaunch))
      __obj.asInstanceOf[SubAPI]
    }
    
    @scala.inline
    implicit class SubAPIMutableBuilder[Self <: SubAPI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReleaseNotesVersion(value: () => String): Self = StObject.set(x, "releaseNotesVersion", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetDidViewReleaseNotes(value: () => Unit): Self = StObject.set(x, "setDidViewReleaseNotes", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShowReleaseNotesOnLaunch(value: () => Boolean): Self = StObject.set(x, "showReleaseNotesOnLaunch", js.Any.fromFunction0(value))
    }
  }
  
  trait SubState extends StObject {
    
    var releaseNotesViewed: js.Array[String]
  }
  object SubState {
    
    @scala.inline
    def apply(releaseNotesViewed: js.Array[String]): SubState = {
      val __obj = js.Dynamic.literal(releaseNotesViewed = releaseNotesViewed.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubState]
    }
    
    @scala.inline
    implicit class SubStateMutableBuilder[Self <: SubState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReleaseNotesViewed(value: js.Array[String]): Self = StObject.set(x, "releaseNotesViewed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReleaseNotesViewedVarargs(value: String*): Self = StObject.set(x, "releaseNotesViewed", js.Array(value :_*))
    }
  }
}
