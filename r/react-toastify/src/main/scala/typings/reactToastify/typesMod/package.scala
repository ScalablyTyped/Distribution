package typings.reactToastify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type ClassName = (js.Function1[
    /* context */ js.UndefOr[typings.reactToastify.anon.DefaultClassName], 
    java.lang.String
  ]) | java.lang.String
  
  type Id = scala.Double | java.lang.String
  
  type Nullable[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: T[P] | null}
    */ typings.reactToastify.reactToastifyStrings.Nullable with org.scalablytyped.runtime.TopLevel[T]
  
  type ToastClassName = (js.Function1[/* context */ js.UndefOr[typings.reactToastify.anon.Position], java.lang.String]) | java.lang.String
  
  type ToastContent = typings.react.mod.ReactNode | (js.Function1[
    /* props */ typings.reactToastify.typesMod.ToastContentProps, 
    typings.react.mod.ReactNode
  ])
  
  type ToastTransition = typings.react.mod.FC[typings.reactToastify.typesMod.ToastTransitionProps] | (typings.react.mod.ComponentClass[
    typings.reactToastify.typesMod.ToastTransitionProps, 
    typings.react.mod.ComponentState
  ])
}
