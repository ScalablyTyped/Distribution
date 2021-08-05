package typings.reactElemental

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bold extends StObject {
    
    val bold: js.UndefOr[String] = js.undefined
    
    val regular: js.UndefOr[String] = js.undefined
  }
  object Bold {
    
    inline def apply(): Bold = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bold]
    }
    
    extension [Self <: Bold](x: Self) {
      
      inline def setBold(value: String): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      inline def setRegular(value: String): Self = StObject.set(x, "regular", value.asInstanceOf[js.Any])
      
      inline def setRegularUndefined: Self = StObject.set(x, "regular", js.undefined)
    }
  }
  
  trait Disabled extends StObject {
    
    val disabled: js.UndefOr[Boolean] = js.undefined
    
    val label: String | ReactNode
    
    val value: String
  }
  object Disabled {
    
    inline def apply(value: String): Disabled = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Disabled]
    }
    
    extension [Self <: Disabled](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setLabel(value: String | ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Label extends StObject {
    
    val label: String
    
    val value: String
  }
  object Label {
    
    inline def apply(label: String, value: String): Label = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Label]
    }
    
    extension [Self <: Label](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait LabelValue extends StObject {
    
    val label: String | ReactNode
    
    val value: String
  }
  object LabelValue {
    
    inline def apply(value: String): LabelValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[LabelValue]
    }
    
    extension [Self <: LabelValue](x: Self) {
      
      inline def setLabel(value: String | ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Primary extends StObject {
    
    val primary: js.UndefOr[Bold] = js.undefined
    
    val secondary: js.UndefOr[Bold] = js.undefined
  }
  object Primary {
    
    inline def apply(): Primary = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Primary]
    }
    
    extension [Self <: Primary](x: Self) {
      
      inline def setPrimary(value: Bold): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
      
      inline def setSecondary(value: Bold): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
      
      inline def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
    }
  }
  
  trait PrimaryDark extends StObject {
    
    val primary: js.UndefOr[String] = js.undefined
    
    val primaryDark: js.UndefOr[String] = js.undefined
    
    val primaryLight: js.UndefOr[String] = js.undefined
  }
  object PrimaryDark {
    
    inline def apply(): PrimaryDark = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryDark]
    }
    
    extension [Self <: PrimaryDark](x: Self) {
      
      inline def setPrimary(value: String): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      inline def setPrimaryDark(value: String): Self = StObject.set(x, "primaryDark", value.asInstanceOf[js.Any])
      
      inline def setPrimaryDarkUndefined: Self = StObject.set(x, "primaryDark", js.undefined)
      
      inline def setPrimaryLight(value: String): Self = StObject.set(x, "primaryLight", value.asInstanceOf[js.Any])
      
      inline def setPrimaryLightUndefined: Self = StObject.set(x, "primaryLight", js.undefined)
      
      inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    }
  }
  
  trait Regular extends StObject {
    
    var bold: js.UndefOr[String] = js.undefined
    
    var regular: js.UndefOr[String] = js.undefined
  }
  object Regular {
    
    inline def apply(): Regular = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Regular]
    }
    
    extension [Self <: Regular](x: Self) {
      
      inline def setBold(value: String): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      inline def setRegular(value: String): Self = StObject.set(x, "regular", value.asInstanceOf[js.Any])
      
      inline def setRegularUndefined: Self = StObject.set(x, "regular", js.undefined)
    }
  }
  
  trait Value extends StObject {
    
    val label: js.Any
    
    val value: String
  }
  object Value {
    
    inline def apply(label: js.Any, value: String): Value = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    extension [Self <: Value](x: Self) {
      
      inline def setLabel(value: js.Any): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
