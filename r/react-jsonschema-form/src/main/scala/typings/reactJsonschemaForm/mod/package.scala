package typings.reactJsonschemaForm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Field = typings.react.mod.StatelessComponent[typings.reactJsonschemaForm.mod.FieldProps[js.Any]] | (typings.react.mod.ComponentClass[
    typings.reactJsonschemaForm.mod.FieldProps[js.Any], 
    typings.react.mod.ComponentState
  ])
  
  type FieldError = java.lang.String
  
  type ISubmitEvent[T] = typings.reactJsonschemaForm.mod.IChangeEvent[T]
  
  type IdSchema[T] = typings.reactJsonschemaForm.reactJsonschemaFormStrings.IdSchema with org.scalablytyped.runtime.TopLevel[js.Any] with typings.reactJsonschemaForm.mod.FieldId
  
  type PathSchema[T] = typings.reactJsonschemaForm.reactJsonschemaFormStrings.PathSchema with org.scalablytyped.runtime.TopLevel[js.Any] with typings.reactJsonschemaForm.mod.FieldPath
  
  type Widget = typings.react.mod.StatelessComponent[typings.reactJsonschemaForm.mod.WidgetProps] | (typings.react.mod.ComponentClass[typings.reactJsonschemaForm.mod.WidgetProps, typings.react.mod.ComponentState])
  
  @scala.inline
  def withTheme[T](themeProps: typings.reactJsonschemaForm.mod.ThemeProps[T]): (typings.react.mod.ComponentClass[typings.reactJsonschemaForm.mod.FormProps[T], typings.react.mod.ComponentState]) | typings.react.mod.StatelessComponent[typings.reactJsonschemaForm.mod.FormProps[T]] = typings.reactJsonschemaForm.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withTheme")(themeProps.asInstanceOf[js.Any]).asInstanceOf[(typings.react.mod.ComponentClass[typings.reactJsonschemaForm.mod.FormProps[T], typings.react.mod.ComponentState]) | typings.react.mod.StatelessComponent[typings.reactJsonschemaForm.mod.FormProps[T]]]
}
