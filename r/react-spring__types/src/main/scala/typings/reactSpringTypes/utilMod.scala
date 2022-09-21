package typings.reactSpringTypes

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentProps
import typings.react.mod.ComponentState
import typings.react.mod.MutableRefObject
import typings.react.mod.PropsWithRef
import typings.react.mod.PropsWithoutRef
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import typings.reactSpringTypes.reactSpringTypesBooleans.`false`
import typings.reactSpringTypes.reactSpringTypesStrings.prototype
import typings.std.Exclude
import typings.std.Extract
import typings.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("@react-spring/types/util", "Any")
  @js.native
  open class Any () extends StObject
  
  type AllKeys[T] = /* keyof T */ String
  
  type AnyFn[In /* <: js.Array[scala.Any] */, Out] = js.Function1[/* args */ In, Out]
  
  type Arrify[T] = js.Array[scala.Any]
  
  type AssignableKeys[T, U] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in std.Extract<keyof T, keyof U> ]: T[P] extends U[P]? P : never}[std.Extract<keyof T, keyof U>] */ js.Any
  
  type ComponentPropsWithRef[T /* <: ElementType[scala.Any] */] = PropsWithRef[ComponentProps[T]] | (PropsWithoutRef[scala.Any] & RefAttributes[InstanceType[T]])
  
  type ComponentType[P] = (ComponentClass[P, ComponentState]) | LeafFunctionComponent[P]
  
  type Constrain[T, U] = U | T
  
  trait Disposable extends StObject {
    
    def dispose(): Unit
  }
  object Disposable {
    
    inline def apply(dispose: () => Unit): Disposable = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
      __obj.asInstanceOf[Disposable]
    }
    
    extension [Self <: Disposable](x: Self) {
      
      inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    }
  }
  
  type ElementType[P] = typings.react.mod.ElementType[P] | LeafFunctionComponent[P]
  
  type Exclusive[T] = Remap[
    (LoosePick[T, scala.Any]) & typings.reactSpringTypes.reactSpringTypesStrings.Exclusive & TopLevel[scala.Any]
  ]
  
  type Falsy = js.UndefOr[`false` | Null]
  
  /** Convert a union to an intersection */
  type Intersect[U] = scala.Any
  
  // Function component without children
  @js.native
  trait LeafFunctionComponent[P] extends StObject {
    
    def apply(props: P): ReactElement | Null = js.native
    
    var displayName: js.UndefOr[String] = js.native
  }
  
  type Lookup[T] = StringDictionary[T]
  
  type LoosePick[T, K] = js.Object & (Pick[T, K & (/* keyof T */ String)])
  
  type Merge[A, B] = Remap[
    typings.reactSpringTypes.reactSpringTypesStrings.Merge & TopLevel[scala.Any] & (Omit[B, /* keyof A */ String])
  ]
  
  type MergeDefaults[T /* <: js.Object */, U /* <: Partial[T] */] = Remap[
    (Omit[T, /* keyof U */ String]) & (Partial[Pick[T, Extract[/* keyof U */ String, /* keyof T */ String]]])
  ]
  
  type MergeUnknown[T, U] = Remap[T & (Omit[U, /* keyof T */ String])]
  
  type NoInfer[T] = /* import warning: importer.ImportType#apply Failed type conversion: [T][T extends any ? 0 : never] */ js.Any
  
  type ObjectFromUnion[T /* <: js.Object */] = Remap[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof @react-spring/types.@react-spring/types/util.Intersect<T> ]: T extends infer U? P extends keyof any? any[P] : never : never}
    */ typings.reactSpringTypes.reactSpringTypesStrings.ObjectFromUnion & TopLevel[scala.Any]
  ]
  
  type ObjectType[T] = js.Object | T
  
  type Omit[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  type OneOrMore[T] = T | js.Array[T]
  
  type Overwrite[T, U] = Remap[(Omit[T, /* keyof U */ String]) & U]
  
  type Partial[T] = js.Object & typings.reactSpringTypes.reactSpringTypesStrings.Partial & TopLevel[T]
  
  type Pick[T, K /* <: /* keyof T */ String */] = js.Object & typings.reactSpringTypes.reactSpringTypesStrings.Pick & TopLevel[T]
  
  type RefProp[T] = MutableRefObject[js.UndefOr[T | Null]]
  
  type Remap[T] = js.Object & typings.reactSpringTypes.reactSpringTypesStrings.Remap & TopLevel[T]
  
  type StaticProps[T] = Omit[T, (/* keyof T */ String) & prototype]
  
  type UnknownProps = Lookup[scala.Any]
}
