package typings.reactNativeElements.anon

import org.scalablytyped.runtime.Instantiable1
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.distIconsIconMod.IconNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerStyle extends StObject {
  
  var InputComponent: js.UndefOr[
    TypeofComponent & (Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
      Component[js.Object, js.Object, js.Object]
    ])
  ] = js.undefined
  
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var disabledInputStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var errorMessage: js.UndefOr[String] = js.undefined
  
  var errorProps: js.UndefOr[js.Object] = js.undefined
  
  var errorStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var inputContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var inputStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var label: js.UndefOr[String | ReactNode] = js.undefined
  
  var labelProps: js.UndefOr[js.Object] = js.undefined
  
  var labelStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var leftIcon: js.UndefOr[IconNode] = js.undefined
  
  var leftIconContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var renderErrorMessage: js.UndefOr[Boolean] = js.undefined
  
  var rightIcon: js.UndefOr[IconNode] = js.undefined
  
  var rightIconContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}
object ContainerStyle {
  
  inline def apply(): ContainerStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerStyle]
  }
  
  extension [Self <: ContainerStyle](x: Self) {
    
    inline def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    inline def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
    
    inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledInputStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "disabledInputStyle", value.asInstanceOf[js.Any])
    
    inline def setDisabledInputStyleNull: Self = StObject.set(x, "disabledInputStyle", null)
    
    inline def setDisabledInputStyleUndefined: Self = StObject.set(x, "disabledInputStyle", js.undefined)
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setErrorProps(value: js.Object): Self = StObject.set(x, "errorProps", value.asInstanceOf[js.Any])
    
    inline def setErrorPropsUndefined: Self = StObject.set(x, "errorProps", js.undefined)
    
    inline def setErrorStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "errorStyle", value.asInstanceOf[js.Any])
    
    inline def setErrorStyleNull: Self = StObject.set(x, "errorStyle", null)
    
    inline def setErrorStyleUndefined: Self = StObject.set(x, "errorStyle", js.undefined)
    
    inline def setInputComponent(
      value: TypeofComponent & (Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
          Component[js.Object, js.Object, js.Object]
        ])
    ): Self = StObject.set(x, "InputComponent", value.asInstanceOf[js.Any])
    
    inline def setInputComponentUndefined: Self = StObject.set(x, "InputComponent", js.undefined)
    
    inline def setInputContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "inputContainerStyle", value.asInstanceOf[js.Any])
    
    inline def setInputContainerStyleNull: Self = StObject.set(x, "inputContainerStyle", null)
    
    inline def setInputContainerStyleUndefined: Self = StObject.set(x, "inputContainerStyle", js.undefined)
    
    inline def setInputStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
    
    inline def setInputStyleNull: Self = StObject.set(x, "inputStyle", null)
    
    inline def setInputStyleUndefined: Self = StObject.set(x, "inputStyle", js.undefined)
    
    inline def setLabel(value: String | ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelProps(value: js.Object): Self = StObject.set(x, "labelProps", value.asInstanceOf[js.Any])
    
    inline def setLabelPropsUndefined: Self = StObject.set(x, "labelProps", js.undefined)
    
    inline def setLabelStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    inline def setLabelStyleNull: Self = StObject.set(x, "labelStyle", null)
    
    inline def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLeftIcon(value: IconNode): Self = StObject.set(x, "leftIcon", value.asInstanceOf[js.Any])
    
    inline def setLeftIconContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "leftIconContainerStyle", value.asInstanceOf[js.Any])
    
    inline def setLeftIconContainerStyleNull: Self = StObject.set(x, "leftIconContainerStyle", null)
    
    inline def setLeftIconContainerStyleUndefined: Self = StObject.set(x, "leftIconContainerStyle", js.undefined)
    
    inline def setLeftIconUndefined: Self = StObject.set(x, "leftIcon", js.undefined)
    
    inline def setRenderErrorMessage(value: Boolean): Self = StObject.set(x, "renderErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setRenderErrorMessageUndefined: Self = StObject.set(x, "renderErrorMessage", js.undefined)
    
    inline def setRightIcon(value: IconNode): Self = StObject.set(x, "rightIcon", value.asInstanceOf[js.Any])
    
    inline def setRightIconContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "rightIconContainerStyle", value.asInstanceOf[js.Any])
    
    inline def setRightIconContainerStyleNull: Self = StObject.set(x, "rightIconContainerStyle", null)
    
    inline def setRightIconContainerStyleUndefined: Self = StObject.set(x, "rightIconContainerStyle", js.undefined)
    
    inline def setRightIconUndefined: Self = StObject.set(x, "rightIcon", js.undefined)
  }
}
