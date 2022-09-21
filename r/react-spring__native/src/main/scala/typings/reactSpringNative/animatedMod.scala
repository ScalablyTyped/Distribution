package typings.reactSpringNative

import org.scalablytyped.runtime.TopLevel
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

object animatedMod {
  
  type AnimatedArray[T /* <: js.Array[Double | String] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: T[P] | / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FluidValue<T[P]> * / any}
    */ typings.reactSpringNative.reactSpringNativeStrings.AnimatedArray & TopLevel[T]
  
  type AnimatedComponent[T /* <: ElementType[Any] */] = ForwardRefExoticComponent[AnimatedProps[ComponentPropsWithRef[T]] & Children]
  
  type AnimatedLeaf[T] = Any
  
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
    
    extension [Self <: AnimatedPrimitives](x: Self) {
      
      inline def setImage(value: AnimatedComponent[ComponentClass[ImageProps, Any]]): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
      
      inline def setText(value: AnimatedComponent[ComponentClass[TextPropschildrenReactNod, Any]]): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
      
      inline def setView(value: AnimatedComponent[ComponentClass[ViewPropschildrenReactNod, Any]]): Self = StObject.set(x, "View", value.asInstanceOf[js.Any])
    }
  }
  
  type AnimatedProp[T] = js.UndefOr[
    AnimatedStyle[Any] | Any | AnimatedLeaf[Any] | AnimatedStyles[Any] | AnimatedTransform | AnimatedArray[Any]
  ]
  
  type AnimatedProps[Props /* <: js.Object */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof Props ]: P extends 'ref' | 'key'? Props[P] : @react-spring/native.@react-spring/native/dist/declarations/src/animated.AnimatedProp<Props[P]>}
    */ typings.reactSpringNative.reactSpringNativeStrings.AnimatedProps & TopLevel[Any]
  
  type AnimatedStyle[T] = js.UndefOr[
    Any | AnimatedLeaf[Any] | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof any ]: P extends 'transform'? @react-spring/native.@react-spring/native/dist/declarations/src/animated.AnimatedTransform : @react-spring/native.@react-spring/native/dist/declarations/src/animated.AnimatedStyle<any[P]>}
    */ typings.reactSpringNative.reactSpringNativeStrings.AnimatedStyle & TopLevel[Any])
  ]
  
  type AnimatedStyles[T /* <: js.Array[Any] */] = (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: [T[P]] extends [infer DT]? any extends std.ReadonlyArray<any>? @react-spring/native.@react-spring/native/dist/declarations/src/animated.AnimatedStyles<any> : any extends object? [@react-spring/types.@react-spring/types/util.AssignableKeys<any, react-native.react-native.ViewStyle>] extends [never]? @react-spring/native.@react-spring/native/dist/declarations/src/animated.AnimatedProp<any> : {[ P in keyof any ]: @react-spring/native.@react-spring/native/dist/declarations/src/animated.AnimatedProp<any[P]>} : any : never}
    */ typings.reactSpringNative.reactSpringNativeStrings.AnimatedStyles & TopLevel[Any]) | (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: react-native.react-native.RecursiveArray<@react-spring/native.@react-spring/native/dist/declarations/src/animated.AnimatedProp<any>>}[keyof T] */ js.Any)
  
  type AnimatedTransform = js.Array[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof any ]: any[P] | / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FluidValue<T[P]> * / any}
    */ typings.reactSpringNative.reactSpringNativeStrings.AnimatedTransform & TopLevel[Any]
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
    
    extension [Self <: Primitives](x: Self) {
      
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
