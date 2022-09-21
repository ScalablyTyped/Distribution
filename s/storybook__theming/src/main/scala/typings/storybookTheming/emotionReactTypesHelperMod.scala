package typings.storybookTheming

import typings.react.mod.ComponentProps
import typings.react.mod.global.JSX.LibraryManagedAttributes
import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emotionReactTypesHelperMod {
  
  type DistributiveOmit[T, U] = Pick[T, Exclude[/* keyof T */ String, U]]
  
  type PropsOf[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ Any */] = LibraryManagedAttributes[C, ComponentProps[C]]
}
