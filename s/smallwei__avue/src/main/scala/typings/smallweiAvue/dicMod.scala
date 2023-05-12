package typings.smallweiAvue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dicMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait DicItem extends StObject {
    
    var children: js.UndefOr[js.Array[DicItem]] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var display: js.UndefOr[Boolean] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[Any] = js.undefined
  }
  object DicItem {
    
    inline def apply(): DicItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DicItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DicItem] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: js.Array[DicItem]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: DicItem*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait DicProps extends StObject {
    
    /** 选项的子选项为选项对象的某个属性值 */
    var children: js.UndefOr[String] = js.undefined
    
    /** 选项的禁用为选项对象的某个属性值 */
    var disabled: js.UndefOr[String] = js.undefined
    
    /** 选项标签为选项对象的某个属性值 */
    var label: js.UndefOr[String] = js.undefined
    
    /** 选项返回结构的层级(例如data.data) */
    var res: js.UndefOr[String] = js.undefined
    
    /** 选项的值为选项对象的某个属性值 */
    var value: js.UndefOr[String] = js.undefined
  }
  object DicProps {
    
    inline def apply(): DicProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DicProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DicProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setRes(value: String): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
      
      inline def setResUndefined: Self = StObject.set(x, "res", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
