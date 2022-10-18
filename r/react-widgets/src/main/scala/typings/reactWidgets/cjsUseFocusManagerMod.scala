package typings.reactWidgets

import typings.react.mod.Dispatch
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.RefObject
import typings.react.mod.SetStateAction
import typings.reactWidgets.reactWidgetsStrings.isDisabled
import typings.reactWidgets.reactWidgetsStrings.onChange
import typings.std.Element
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsUseFocusManagerMod {
  
  @JSImport("react-widgets/cjs/useFocusManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(ref: RefObject[Element]): js.Tuple3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_useFocusManager.FocusController */ Any, 
    Boolean, 
    Dispatch[SetStateAction[Boolean]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_useFocusManager.FocusController */ Any, 
    Boolean, 
    Dispatch[SetStateAction[Boolean]]
  ]]
  inline def default(
    ref: RefObject[Element],
    props: Unit,
    opts: Omit[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FocusManagerOptions */ Any, 
      onChange | isDisabled
    ]
  ): js.Tuple3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_useFocusManager.FocusController */ Any, 
    Boolean, 
    Dispatch[SetStateAction[Boolean]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any], props.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_useFocusManager.FocusController */ Any, 
    Boolean, 
    Dispatch[SetStateAction[Boolean]]
  ]]
  inline def default(ref: RefObject[Element], props: Props): js.Tuple3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_useFocusManager.FocusController */ Any, 
    Boolean, 
    Dispatch[SetStateAction[Boolean]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_useFocusManager.FocusController */ Any, 
    Boolean, 
    Dispatch[SetStateAction[Boolean]]
  ]]
  inline def default(
    ref: RefObject[Element],
    props: Props,
    opts: Omit[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FocusManagerOptions */ Any, 
      onChange | isDisabled
    ]
  ): js.Tuple3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_useFocusManager.FocusController */ Any, 
    Boolean, 
    Dispatch[SetStateAction[Boolean]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any], props.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_useFocusManager.FocusController */ Any, 
    Boolean, 
    Dispatch[SetStateAction[Boolean]]
  ]]
  
  trait Props extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[Element]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[Element]] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnBlur(value: FocusEvent[Element, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnFocus(value: FocusEvent[Element, Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    }
  }
}
