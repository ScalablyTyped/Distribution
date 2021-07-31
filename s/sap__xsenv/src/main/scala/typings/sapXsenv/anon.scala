package typings.sapXsenv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Label extends StObject {
    
    var label: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var plan: js.UndefOr[String] = js.undefined
    
    var tag: js.UndefOr[String] = js.undefined
  }
  object Label {
    
    @scala.inline
    def apply(): Label = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Label]
    }
    
    @scala.inline
    implicit class LabelMutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPlan(value: String): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlanUndefined: Self = StObject.set(x, "plan", js.undefined)
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
}
