package typings.storybookUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@storybook/ui.@storybook/ui/dist/settings/release_notes.ReleaseNotesProps, 'isLoaded' | 'setLoaded' | 'didHitMaxWaitTime'> */
trait OmitReleaseNotesPropsisLo extends StObject {
  
  var version: String
}
object OmitReleaseNotesPropsisLo {
  
  inline def apply(version: String): OmitReleaseNotesPropsisLo = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitReleaseNotesPropsisLo]
  }
  
  extension [Self <: OmitReleaseNotesPropsisLo](x: Self) {
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
