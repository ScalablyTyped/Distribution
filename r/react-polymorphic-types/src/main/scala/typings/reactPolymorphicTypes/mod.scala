package typings.reactPolymorphicTypes

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentPropsWithRef
import typings.react.mod.ComponentPropsWithoutRef
import typings.react.mod.ComponentType
import typings.react.mod.ElementType
import typings.react.mod.ExoticComponent
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.LazyExoticComponent
import typings.react.mod.MemoExoticComponent
import typings.react.mod.PropsWithRef
import typings.react.mod.PropsWithoutRef
import typings.react.mod.ReactElement
import typings.reactPolymorphicTypes.anon.As
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type Merge[T, U] = (Omit[T, /* keyof U */ String]) & U
  
  // TODO:
  // - PolymorphicFunctionComponent
  // - PolymorphicVoidFunctionComponent (requires @types/react >=16.9.48)
  type PolymorphicExoticComponent[P, T /* <: ElementType[Any] */] = Merge[
    ExoticComponent[P & StringDictionary[Any]], 
    js.Function1[/* props */ PolymorphicPropsWithRef[P, T], ReactElement | Null]
  ]
  
  type PolymorphicForwardRefExoticComponent[P, T /* <: ElementType[Any] */] = Merge[
    ForwardRefExoticComponent[P & StringDictionary[Any]], 
    PolymorphicExoticComponent[P, T]
  ]
  
  type PolymorphicLazyExoticComponent[P, T /* <: ElementType[Any] */] = Merge[LazyExoticComponent[ComponentType[Any]], PolymorphicExoticComponent[P, T]]
  
  type PolymorphicMemoExoticComponent[P, T /* <: ElementType[Any] */] = Merge[MemoExoticComponent[ComponentType[Any]], PolymorphicExoticComponent[P, T]]
  
  type PolymorphicPropsWithRef[P, T /* <: ElementType[Any] */] = Merge[
    ComponentPropsWithRef[T] | (PropsWithRef[
      /* import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[T] */ js.Any
    ]), 
    PropsWithAs[P, T]
  ]
  
  type PolymorphicPropsWithoutRef[P, T /* <: ElementType[Any] */] = Merge[
    ComponentPropsWithoutRef[T] | (PropsWithoutRef[
      /* import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[T] */ js.Any
    ]), 
    PropsWithAs[P, T]
  ]
  
  type PropsWithAs[P, T /* <: ElementType[Any] */] = P & As[T]
}
