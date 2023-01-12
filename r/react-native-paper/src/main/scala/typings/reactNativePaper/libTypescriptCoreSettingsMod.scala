package typings.reactNativePaper

import typings.react.mod.ReactNode
import typings.reactNativePaper.libTypescriptComponentsMaterialCommunityIconMod.IconProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptCoreSettingsMod {
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(Consumer) */ @JSImport("react-native-paper/lib/typescript/core/settings", "Provider")
  @js.native
  val Provider: typings.react.mod.Provider[Settings] = js.native
  
  trait Settings extends StObject {
    
    def icon(param0: IconProps): ReactNode
  }
  object Settings {
    
    inline def apply(icon: IconProps => ReactNode): Settings = {
      val __obj = js.Dynamic.literal(icon = js.Any.fromFunction1(icon))
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      inline def setIcon(value: IconProps => ReactNode): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
    }
  }
}
