package typings.reactDynamicNumber

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BaseInputProps = typings.std.Partial[
    typings.reactDynamicNumber.mod.Omit[
      typings.react.mod.DetailedHTMLProps[
        typings.react.mod.InputHTMLAttributes[typings.std.HTMLInputElement], 
        typings.std.HTMLInputElement
      ], 
      typings.reactDynamicNumber.reactDynamicNumberStrings.ref | typings.reactDynamicNumber.reactDynamicNumberStrings.value | typings.reactDynamicNumber.reactDynamicNumberStrings.onChange | typings.reactDynamicNumber.reactDynamicNumberStrings.placeholder
    ]
  ]
  
  type DynamicNumber = typings.react.mod.Component[typings.reactDynamicNumber.mod.DynamicNumberProps, js.Object, js.Any]
  
  type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typings.std.Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: P} & {[ P in K ]: never} & {[x: string] : never, [x: number] : never}[keyof T] */ js.Any
  ]
}
