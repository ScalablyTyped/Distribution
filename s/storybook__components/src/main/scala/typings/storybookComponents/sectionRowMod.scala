package typings.storybookComponents

import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sectionRowMod {
  
  @JSImport("@storybook/components/dist/blocks/ArgsTable/SectionRow", "SectionRow")
  @js.native
  val SectionRow: FC[SectionRowProps] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.storybookComponents.storybookComponentsStrings.section
    - typings.storybookComponents.storybookComponentsStrings.subsection
  */
  trait Level extends StObject
  object Level {
    
    inline def section: typings.storybookComponents.storybookComponentsStrings.section = "section".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.section]
    
    inline def subsection: typings.storybookComponents.storybookComponentsStrings.subsection = "subsection".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.subsection]
  }
  
  trait SectionRowProps extends StObject {
    
    var colSpan: Double
    
    var initialExpanded: js.UndefOr[Boolean] = js.undefined
    
    var label: String
    
    var level: Level
  }
  object SectionRowProps {
    
    inline def apply(colSpan: Double, label: String, level: Level): SectionRowProps = {
      val __obj = js.Dynamic.literal(colSpan = colSpan.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
      __obj.asInstanceOf[SectionRowProps]
    }
    
    extension [Self <: SectionRowProps](x: Self) {
      
      inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
      
      inline def setInitialExpanded(value: Boolean): Self = StObject.set(x, "initialExpanded", value.asInstanceOf[js.Any])
      
      inline def setInitialExpandedUndefined: Self = StObject.set(x, "initialExpanded", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLevel(value: Level): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    }
  }
}
