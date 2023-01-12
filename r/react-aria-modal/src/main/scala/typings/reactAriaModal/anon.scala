package typings.reactAriaModal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Pick<react-aria-modal.react-aria-modal.AriaModalProps, 'titleId'> */
  trait PickAriaModalPropstitleId extends StObject {
    
    var titleId: js.UndefOr[String] = js.undefined
  }
  object PickAriaModalPropstitleId {
    
    inline def apply(): PickAriaModalPropstitleId = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickAriaModalPropstitleId]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PickAriaModalPropstitleId] (val x: Self) extends AnyVal {
      
      inline def setTitleId(value: String): Self = StObject.set(x, "titleId", value.asInstanceOf[js.Any])
      
      inline def setTitleIdUndefined: Self = StObject.set(x, "titleId", js.undefined)
    }
  }
  
  /* Inlined std.Pick<react-aria-modal.react-aria-modal.AriaModalProps, 'titleText'> */
  trait PickAriaModalPropstitleTe extends StObject {
    
    var titleText: js.UndefOr[String] = js.undefined
  }
  object PickAriaModalPropstitleTe {
    
    inline def apply(): PickAriaModalPropstitleTe = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickAriaModalPropstitleTe]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PickAriaModalPropstitleTe] (val x: Self) extends AnyVal {
      
      inline def setTitleText(value: String): Self = StObject.set(x, "titleText", value.asInstanceOf[js.Any])
      
      inline def setTitleTextUndefined: Self = StObject.set(x, "titleText", js.undefined)
    }
  }
}
