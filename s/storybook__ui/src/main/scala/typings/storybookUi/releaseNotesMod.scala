package typings.storybookUi

import typings.react.mod.FunctionComponent
import typings.storybookUi.anon.OmitReleaseNotesPropsisLo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object releaseNotesMod {
  
  @JSImport("@storybook/ui/dist/settings/release_notes", "PureReleaseNotesScreen")
  @js.native
  val PureReleaseNotesScreen: FunctionComponent[ReleaseNotesProps] = js.native
  
  @JSImport("@storybook/ui/dist/settings/release_notes", "ReleaseNotesScreen")
  @js.native
  val ReleaseNotesScreen: FunctionComponent[OmitReleaseNotesPropsisLo] = js.native
  
  trait ReleaseNotesProps extends StObject {
    
    var didHitMaxWaitTime: Boolean
    
    var isLoaded: Boolean
    
    def setLoaded(isLoaded: Boolean): Unit
    
    var version: String
  }
  object ReleaseNotesProps {
    
    @scala.inline
    def apply(didHitMaxWaitTime: Boolean, isLoaded: Boolean, setLoaded: Boolean => Unit, version: String): ReleaseNotesProps = {
      val __obj = js.Dynamic.literal(didHitMaxWaitTime = didHitMaxWaitTime.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], setLoaded = js.Any.fromFunction1(setLoaded), version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReleaseNotesProps]
    }
    
    @scala.inline
    implicit class ReleaseNotesPropsMutableBuilder[Self <: ReleaseNotesProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDidHitMaxWaitTime(value: Boolean): Self = StObject.set(x, "didHitMaxWaitTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLoaded(value: Boolean): Self = StObject.set(x, "isLoaded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetLoaded(value: Boolean => Unit): Self = StObject.set(x, "setLoaded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
