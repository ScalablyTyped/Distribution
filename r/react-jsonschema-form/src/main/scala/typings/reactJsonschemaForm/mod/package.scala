package typings.reactJsonschemaForm.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FunctionComponent
import typings.reactJsonschemaForm.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def withTheme[T](themeProps: ThemeProps[T]): (ComponentClass[FormProps[T], ComponentState]) | FunctionComponent[FormProps[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withTheme")(themeProps.asInstanceOf[js.Any]).asInstanceOf[(ComponentClass[FormProps[T], ComponentState]) | FunctionComponent[FormProps[T]]]

type Field = FunctionComponent[FieldProps[Any]] | (ComponentClass[FieldProps[Any], ComponentState])

type FieldError = String

type ISubmitEvent[T] = IChangeEvent[T]

type IdSchema[T] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof T ]: react-jsonschema-form.react-jsonschema-form.IdSchema<T[key]>} */ js.Any) & FieldId

type PathSchema[T] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof T ]: react-jsonschema-form.react-jsonschema-form.PathSchema<T[key]>} */ js.Any) & FieldPath

type Widget = FunctionComponent[WidgetProps] | (ComponentClass[WidgetProps, ComponentState])
