package typings.reactTypesShared

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLabelableMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactTypesShared.reactTypesSharedStrings.start
    - typings.reactTypesShared.reactTypesSharedStrings.end
  */
  trait Alignment extends StObject
  object Alignment {
    
    inline def end: typings.reactTypesShared.reactTypesSharedStrings.end = "end".asInstanceOf[typings.reactTypesShared.reactTypesSharedStrings.end]
    
    inline def start: typings.reactTypesShared.reactTypesSharedStrings.start = "start".asInstanceOf[typings.reactTypesShared.reactTypesSharedStrings.start]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactTypesShared.reactTypesSharedStrings.top
    - typings.reactTypesShared.reactTypesSharedStrings.side
  */
  trait LabelPosition extends StObject
  object LabelPosition {
    
    inline def side: typings.reactTypesShared.reactTypesSharedStrings.side = "side".asInstanceOf[typings.reactTypesShared.reactTypesSharedStrings.side]
    
    inline def top: typings.reactTypesShared.reactTypesSharedStrings.top = "top".asInstanceOf[typings.reactTypesShared.reactTypesSharedStrings.top]
  }
  
  trait LabelableProps extends StObject {
    
    /** The content to display as the label. */
    var label: js.UndefOr[ReactNode] = js.undefined
  }
  object LabelableProps {
    
    inline def apply(): LabelableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelableProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LabelableProps] (val x: Self) extends AnyVal {
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactTypesShared.reactTypesSharedStrings.icon
    - typings.reactTypesShared.reactTypesSharedStrings.label
  */
  trait NecessityIndicator extends StObject
  object NecessityIndicator {
    
    inline def icon: typings.reactTypesShared.reactTypesSharedStrings.icon = "icon".asInstanceOf[typings.reactTypesShared.reactTypesSharedStrings.icon]
    
    inline def label: typings.reactTypesShared.reactTypesSharedStrings.label = "label".asInstanceOf[typings.reactTypesShared.reactTypesSharedStrings.label]
  }
  
  trait SpectrumLabelableProps
    extends StObject
       with LabelableProps {
    
    /**
      * A ContextualHelp element to place next to the label.
      */
    var contextualHelp: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Whether the label is labeling a required field or group.
      */
    var isRequired: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The label's horizontal alignment relative to the element it is labeling.
      * @default 'start'
      */
    var labelAlign: js.UndefOr[Alignment] = js.undefined
    
    /**
      * The label's overall position relative to the element it is labeling.
      * @default 'top'
      */
    var labelPosition: js.UndefOr[LabelPosition] = js.undefined
    
    /**
      * Whether the required state should be shown as an icon or text.
      * @default 'icon'
      */
    var necessityIndicator: js.UndefOr[NecessityIndicator] = js.undefined
  }
  object SpectrumLabelableProps {
    
    inline def apply(): SpectrumLabelableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpectrumLabelableProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SpectrumLabelableProps] (val x: Self) extends AnyVal {
      
      inline def setContextualHelp(value: ReactNode): Self = StObject.set(x, "contextualHelp", value.asInstanceOf[js.Any])
      
      inline def setContextualHelpUndefined: Self = StObject.set(x, "contextualHelp", js.undefined)
      
      inline def setIsRequired(value: Boolean): Self = StObject.set(x, "isRequired", value.asInstanceOf[js.Any])
      
      inline def setIsRequiredUndefined: Self = StObject.set(x, "isRequired", js.undefined)
      
      inline def setLabelAlign(value: Alignment): Self = StObject.set(x, "labelAlign", value.asInstanceOf[js.Any])
      
      inline def setLabelAlignUndefined: Self = StObject.set(x, "labelAlign", js.undefined)
      
      inline def setLabelPosition(value: LabelPosition): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      inline def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
      
      inline def setNecessityIndicator(value: NecessityIndicator): Self = StObject.set(x, "necessityIndicator", value.asInstanceOf[js.Any])
      
      inline def setNecessityIndicatorUndefined: Self = StObject.set(x, "necessityIndicator", js.undefined)
    }
  }
}
