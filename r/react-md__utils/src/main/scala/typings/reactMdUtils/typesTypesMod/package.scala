package typings.reactMdUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesTypesMod {
  
  type ClassNameCloneableChild[T] = typings.react.mod.ReactElement
  
  type LabelRequiredForA11y[Props /* <: typings.reactMdUtils.typesTypesMod.LabelA11y */] = typings.reactMdUtils.typesTypesMod.RequireAtLeastOne[
    Props, 
    typings.reactMdUtils.reactMdUtilsStrings.`aria-label` | typings.reactMdUtils.reactMdUtilsStrings.`aria-labelledby`
  ]
  
  type Maybe[T, NotFound] = T | NotFound
  
  type PropsWithRef[P /* <: js.Object */, E /* <: typings.std.HTMLElement */] = P with typings.reactMdUtils.anon.Ref[E]
  
  type RequireAtLeastOne[T, Keys /* <: /* keyof T */ java.lang.String */] = (typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, Keys]]) with (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in Keys ]: -? std.Required<std.Pick<T, K>> & std.Partial<std.Pick<T, std.Exclude<Keys, K>>>}[Keys] */ js.Any)
}
