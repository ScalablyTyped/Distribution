package typings.reactSelect

import typings.react.mod.CSSProperties
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.reactSelect.typesMod.CommonProps
import typings.reactSelect.typesMod.OptionTypeBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupMod {
  
  @JSImport("react-select/src/components/Group", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-select/src/components/Group", JSImport.Default)
  @js.native
  val default: ComponentType[GroupProps[js.Any]] = js.native
  
  @JSImport("react-select/src/components/Group", "Group")
  @js.native
  val Group: ComponentType[GroupProps[js.Any]] = js.native
  
  @JSImport("react-select/src/components/Group", "GroupHeading")
  @js.native
  val GroupHeading: ComponentType[js.Any] = js.native
  
  inline def groupCSS(): CSSProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("groupCSS")().asInstanceOf[CSSProperties]
  
  inline def groupHeadingCSS(): CSSProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("groupHeadingCSS")().asInstanceOf[CSSProperties]
  
  trait ComponentProps extends StObject {
    
    /** Component to wrap the label, recieves headingProps. */
    var Heading: ComponentType[js.Any]
    
    /** The children to be rendered. */
    var children: ReactNode
    
    /** Props to pass to Heading. */
    var headingProps: js.Any
    
    /** Label to be displayed in the heading component. */
    var label: ReactNode
  }
  object ComponentProps {
    
    inline def apply(Heading: ComponentType[js.Any], headingProps: js.Any): ComponentProps = {
      val __obj = js.Dynamic.literal(Heading = Heading.asInstanceOf[js.Any], headingProps = headingProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentProps]
    }
    
    extension [Self <: ComponentProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setHeading(value: ComponentType[js.Any]): Self = StObject.set(x, "Heading", value.asInstanceOf[js.Any])
      
      inline def setHeadingProps(value: js.Any): Self = StObject.set(x, "headingProps", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    }
  }
  
  @js.native
  trait GroupProps[OptionType /* <: OptionTypeBase */]
    extends StObject
       with CommonProps[OptionType]
       with ComponentProps
}
