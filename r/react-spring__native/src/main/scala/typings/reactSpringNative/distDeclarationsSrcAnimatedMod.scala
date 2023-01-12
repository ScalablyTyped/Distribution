package typings.reactSpringNative

import typings.react.mod.ComponentClass
import typings.react.mod.ForwardRefExoticComponent
import typings.reactNative.mod.ImageProps
import typings.reactNative.mod.MatrixTransform
import typings.reactNative.mod.PerpectiveTransform
import typings.reactNative.mod.RotateTransform
import typings.reactNative.mod.RotateXTransform
import typings.reactNative.mod.RotateYTransform
import typings.reactNative.mod.RotateZTransform
import typings.reactNative.mod.ScaleTransform
import typings.reactNative.mod.ScaleXTransform
import typings.reactNative.mod.ScaleYTransform
import typings.reactNative.mod.SkewXTransform
import typings.reactNative.mod.SkewYTransform
import typings.reactNative.mod.TranslateXTransform
import typings.reactNative.mod.TranslateYTransform
import typings.reactSpringNative.anon.Children
import typings.reactSpringNative.anon.TextPropschildrenReactNod
import typings.reactSpringNative.anon.ViewPropschildrenReactNod
import typings.reactSpringTypes.utilMod.ComponentPropsWithRef
import typings.reactSpringTypes.utilMod.ElementType
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcAnimatedMod {
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T ]: T[P] | / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FluidValue<T[P]> * / any}
    }}}
    */
  @js.native
  trait AnimatedArray[T /* <: js.Array[Double | String] */] extends StObject
  
  type AnimatedComponent[T /* <: ElementType[Any] */] = ForwardRefExoticComponent[AnimatedProps[ComponentPropsWithRef[T]] & Children]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    std.Exclude<T, object | void> | std.Extract<T, std.ReadonlyArray<number | string>> extends infer U ? [U] extends [never] ? never : / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FluidValue<U | Exclude<T, object | void>> * / any : never
    }}}
    */
  @js.native
  trait AnimatedLeaf[T] extends StObject
  
  /* Inlined {[ P in keyof @react-spring/native.@react-spring/native/dist/declarations/src/animated.Primitives ]: @react-spring/native.@react-spring/native/dist/declarations/src/animated.AnimatedComponent<@react-spring/native.@react-spring/native/dist/declarations/src/animated.Primitives[P]>} */
  trait AnimatedPrimitives extends StObject {
    
    var Image: AnimatedComponent[ComponentClass[ImageProps, Any]]
    
    var Text: AnimatedComponent[ComponentClass[TextPropschildrenReactNod, Any]]
    
    var View: AnimatedComponent[ComponentClass[ViewPropschildrenReactNod, Any]]
  }
  object AnimatedPrimitives {
    
    inline def apply(
      Image: AnimatedComponent[ComponentClass[ImageProps, Any]],
      Text: AnimatedComponent[ComponentClass[TextPropschildrenReactNod, Any]],
      View: AnimatedComponent[ComponentClass[ViewPropschildrenReactNod, Any]]
    ): AnimatedPrimitives = {
      val __obj = js.Dynamic.literal(Image = Image.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimatedPrimitives]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnimatedPrimitives] (val x: Self) extends AnyVal {
      
      inline def setImage(value: AnimatedComponent[ComponentClass[ImageProps, Any]]): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
      
      inline def setText(value: AnimatedComponent[ComponentClass[TextPropschildrenReactNod, Any]]): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
      
      inline def setView(value: AnimatedComponent[ComponentClass[ViewPropschildrenReactNod, Any]]): Self = StObject.set(x, "View", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    [T, T] extends [infer T, infer DT] ? [DT] extends [never] ? never : DT extends void ? undefined : DT extends std.ReadonlyArray<number | string> ? @react-spring/native.@react-spring/native/dist/declarations/src/animated.AnimatedArray<DT> | @react-spring/native.@react-spring/native/dist/declarations/src/animated.AnimatedLeaf<T> : DT extends std.ReadonlyArray<any> ? @react-spring/native.@react-spring/native/dist/declarations/src/animated.TransformArray extends DT ? @react-spring/native.@react-spring/native/dist/declarations/src/animated.AnimatedTransform : @react-spring/native.@react-spring/native/dist/declarations/src/animated.AnimatedStyles<DT> : [@react-spring/types.@react-spring/types/util.AssignableKeys<DT, react-native.react-native.ViewStyle>] extends [never] ? DT | @react-spring/native.@react-spring/native/dist/declarations/src/animated.AnimatedLeaf<T> : @react-spring/native.@react-spring/native/dist/declarations/src/animated.AnimatedStyle<DT> : never
    }}}
    */
  type AnimatedProp[T] = Unit
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof Props ]: P extends 'ref' | 'key'? Props[P] : @react-spring/native.@react-spring/native/dist/declarations/src/animated.AnimatedProp<Props[P]>}
    }}}
    */
  @js.native
  trait AnimatedProps[Props /* <: js.Object */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    [T, T] extends [infer T, infer DT] ? DT extends void ? undefined : [DT] extends [never] ? never : DT extends object ? {[ P in keyof T ]: P extends 'transform'? @react-spring/native.@react-spring/native/dist/declarations/src/animated.AnimatedTransform : @react-spring/native.@react-spring/native/dist/declarations/src/animated.AnimatedStyle<T[P]>} : DT | @react-spring/native.@react-spring/native/dist/declarations/src/animated.AnimatedLeaf<T> : never
    }}}
    */
  type AnimatedStyle[T] = Unit
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    unknown & T extends react-native.react-native.RecursiveArray<infer U> ? {[ P in keyof T ]: react-native.react-native.RecursiveArray<@react-spring/native.@react-spring/native/dist/declarations/src/animated.AnimatedProp<U>>}[keyof T] : {[ P in keyof T ]: [T[P]] extends [infer DT]? DT extends std.ReadonlyArray<any>? @react-spring/native.@react-spring/native/dist/declarations/src/animated.AnimatedStyles<DT> : DT extends object? [@react-spring/types.@react-spring/types/util.AssignableKeys<DT, react-native.react-native.ViewStyle>] extends [never]? @react-spring/native.@react-spring/native/dist/declarations/src/animated.AnimatedProp<DT> : {[ P in keyof DT ]: @react-spring/native.@react-spring/native/dist/declarations/src/animated.AnimatedProp<DT[P]>} : DT : never}
    }}}
    */
  @js.native
  trait AnimatedStyles[T /* <: js.Array[Any] */] extends StObject
  
  type AnimatedTransform = js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: @react-spring/native.@react-spring/native/dist/declarations/src/animated.TransformArray[number] extends infer T ? {[ P in keyof T ]: T[P] | / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FluidValue<T[P]> * / any} : never */ js.Any
  ]
  
  trait Primitives extends StObject {
    
    var Image: ComponentClass[ImageProps, Any]
    
    var Text: ComponentClass[TextPropschildrenReactNod, Any]
    
    var View: ComponentClass[ViewPropschildrenReactNod, Any]
  }
  object Primitives {
    
    inline def apply(
      Image: ComponentClass[ImageProps, Any],
      Text: ComponentClass[TextPropschildrenReactNod, Any],
      View: ComponentClass[ViewPropschildrenReactNod, Any]
    ): Primitives = {
      val __obj = js.Dynamic.literal(Image = Image.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any])
      __obj.asInstanceOf[Primitives]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Primitives] (val x: Self) extends AnyVal {
      
      inline def setImage(value: ComponentClass[ImageProps, Any]): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
      
      inline def setText(value: ComponentClass[TextPropschildrenReactNod, Any]): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
      
      inline def setView(value: ComponentClass[ViewPropschildrenReactNod, Any]): Self = StObject.set(x, "View", value.asInstanceOf[js.Any])
    }
  }
  
  type TransformArray = Exclude[
    js.UndefOr[
      js.Array[
        PerpectiveTransform | RotateTransform | RotateXTransform | RotateYTransform | RotateZTransform | ScaleTransform | ScaleXTransform | ScaleYTransform | TranslateXTransform | TranslateYTransform | SkewXTransform | SkewYTransform | MatrixTransform
      ]
    ], 
    Unit
  ]
  
  type WithAnimated = (js.Function1[/* wrappedComponent */ ElementType[Any], AnimatedComponent[ElementType[Any]]]) & AnimatedPrimitives
}
