package typings.reactColor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<reactcss.reactcss.Classes<react-color.react-color/lib/components/github/Github.GithubPickerStylesProps>> */
trait PartialClassesGithubPicke extends StObject {
  
  var default: js.UndefOr[PartialGithubPickerStyles] = js.undefined
}
object PartialClassesGithubPicke {
  
  inline def apply(): PartialClassesGithubPicke = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassesGithubPicke]
  }
  
  extension [Self <: PartialClassesGithubPicke](x: Self) {
    
    inline def setDefault(value: PartialGithubPickerStyles): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
  }
}
