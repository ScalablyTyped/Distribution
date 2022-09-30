package typings.reactSpringKonva

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ForwardRefExoticComponent
import typings.reactSpringKonva.primitivesMod.KonvaExports
import typings.reactSpringTypes.utilMod.ComponentPropsWithRef
import typings.reactSpringTypes.utilMod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animatedMod {
  
  type AnimatedComponent[T /* <: ElementType[Any] */] = ForwardRefExoticComponent[AnimatedProps[ComponentPropsWithRef[T]]]
  
  type AnimatedLeaf[T] = Any
  
  type AnimatedPrimitives = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in @react-spring/konva.@react-spring/konva/dist/declarations/src/primitives.Primitives ]: @react-spring/konva.@react-spring/konva/dist/declarations/src/animated.AnimatedComponent<@react-spring/konva.@react-spring/konva/dist/declarations/src/primitives.KonvaExports[P]>}
    */ typings.reactSpringKonva.reactSpringKonvaStrings.AnimatedPrimitives & TopLevel[KonvaExports]
  
  type AnimatedProp[T] = js.UndefOr[Any | AnimatedLeaf[Any] | AnimatedStyle[Any] | AnimatedStyles[Any]]
  
  type AnimatedProps[Props /* <: js.Object */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof Props ]: P extends 'ref' | 'key'? Props[P] : @react-spring/konva.@react-spring/konva/dist/declarations/src/animated.AnimatedProp<Props[P]>}
    */ typings.reactSpringKonva.reactSpringKonvaStrings.AnimatedProps & TopLevel[Any]
  
  type AnimatedStyle[T] = js.UndefOr[
    Any | AnimatedLeaf[Any] | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof any ]: @react-spring/konva.@react-spring/konva/dist/declarations/src/animated.AnimatedStyle<any[P]>}
    */ typings.reactSpringKonva.reactSpringKonvaStrings.AnimatedStyle & TopLevel[Any])
  ]
  
  type AnimatedStyles[T /* <: js.Array[Any] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: [T[P]] extends [infer DT]? any extends object? [@react-spring/types.@react-spring/types/util.AssignableKeys<any, react.react.CSSProperties>] extends [never]? any extends std.ReadonlyArray<any>? @react-spring/konva.@react-spring/konva/dist/declarations/src/animated.AnimatedStyles<any> : any : {[ P in keyof any ]: @react-spring/konva.@react-spring/konva/dist/declarations/src/animated.AnimatedProp<any[P]>} : any : never}
    */ typings.reactSpringKonva.reactSpringKonvaStrings.AnimatedStyles & TopLevel[Any]
  
  type WithAnimated = (js.Function1[/* wrappedComponent */ ElementType[Any], AnimatedComponent[ElementType[Any]]]) & AnimatedPrimitives
}
