package typings.reactBulmaComponents

import org.scalablytyped.runtime.Shortcut
import typings.reactBulmaComponents.componentsMod.BulmaComponent
import typings.reactBulmaComponents.componentsMod.Size
import typings.reactBulmaComponents.reactBulmaComponentsStrings.section
import typings.reactBulmaComponents.reactBulmaComponentsStrings.small
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sectionMod extends Shortcut {
  
  @JSImport("react-bulma-components/src/components/section", JSImport.Default)
  @js.native
  val default: BulmaComponent[SectionProps, section] = js.native
  
  trait SectionProps extends StObject {
    
    var size: js.UndefOr[Exclude[Size, small]] = js.undefined
  }
  object SectionProps {
    
    inline def apply(): SectionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SectionProps]
    }
    
    extension [Self <: SectionProps](x: Self) {
      
      inline def setSize(value: Exclude[Size, small]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = BulmaComponent[SectionProps, section]
  
  /* This means you don't have to write `default`, but can instead just say `sectionMod.foo` */
  override def _to: BulmaComponent[SectionProps, section] = default
}
