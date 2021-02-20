package typings.reactElemental

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Bold extends StObject {
    
    val bold: js.UndefOr[String] = js.native
    
    val regular: js.UndefOr[String] = js.native
  }
  object Bold {
    
    @scala.inline
    def apply(): Bold = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bold]
    }
    
    @scala.inline
    implicit class BoldMutableBuilder[Self <: Bold] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBold(value: String): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      @scala.inline
      def setRegular(value: String): Self = StObject.set(x, "regular", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegularUndefined: Self = StObject.set(x, "regular", js.undefined)
    }
  }
  
  @js.native
  trait Disabled extends StObject {
    
    val disabled: js.UndefOr[Boolean] = js.native
    
    val label: String | ReactNode = js.native
    
    val value: String = js.native
  }
  object Disabled {
    
    @scala.inline
    def apply(value: String): Disabled = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Disabled]
    }
    
    @scala.inline
    implicit class DisabledMutableBuilder[Self <: Disabled] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setLabel(value: String | ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Label extends StObject {
    
    val label: String = js.native
    
    val value: String = js.native
  }
  object Label {
    
    @scala.inline
    def apply(label: String, value: String): Label = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Label]
    }
    
    @scala.inline
    implicit class LabelMutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LabelValue extends StObject {
    
    val label: String | ReactNode = js.native
    
    val value: String = js.native
  }
  object LabelValue {
    
    @scala.inline
    def apply(value: String): LabelValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[LabelValue]
    }
    
    @scala.inline
    implicit class LabelValueMutableBuilder[Self <: LabelValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: String | ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Primary extends StObject {
    
    val primary: js.UndefOr[Bold] = js.native
    
    val secondary: js.UndefOr[Bold] = js.native
  }
  object Primary {
    
    @scala.inline
    def apply(): Primary = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Primary]
    }
    
    @scala.inline
    implicit class PrimaryMutableBuilder[Self <: Primary] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrimary(value: Bold): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
      
      @scala.inline
      def setSecondary(value: Bold): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
    }
  }
  
  @js.native
  trait PrimaryDark extends StObject {
    
    val primary: js.UndefOr[String] = js.native
    
    val primaryDark: js.UndefOr[String] = js.native
    
    val primaryLight: js.UndefOr[String] = js.native
  }
  object PrimaryDark {
    
    @scala.inline
    def apply(): PrimaryDark = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrimaryDark]
    }
    
    @scala.inline
    implicit class PrimaryDarkMutableBuilder[Self <: PrimaryDark] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrimary(value: String): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryDark(value: String): Self = StObject.set(x, "primaryDark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryDarkUndefined: Self = StObject.set(x, "primaryDark", js.undefined)
      
      @scala.inline
      def setPrimaryLight(value: String): Self = StObject.set(x, "primaryLight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryLightUndefined: Self = StObject.set(x, "primaryLight", js.undefined)
      
      @scala.inline
      def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    }
  }
  
  @js.native
  trait Regular extends StObject {
    
    var bold: js.UndefOr[String] = js.native
    
    var regular: js.UndefOr[String] = js.native
  }
  object Regular {
    
    @scala.inline
    def apply(): Regular = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Regular]
    }
    
    @scala.inline
    implicit class RegularMutableBuilder[Self <: Regular] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBold(value: String): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      @scala.inline
      def setRegular(value: String): Self = StObject.set(x, "regular", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegularUndefined: Self = StObject.set(x, "regular", js.undefined)
    }
  }
  
  @js.native
  trait Value extends StObject {
    
    val label: js.Any = js.native
    
    val value: String = js.native
  }
  object Value {
    
    @scala.inline
    def apply(label: js.Any, value: String): Value = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: js.Any): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
