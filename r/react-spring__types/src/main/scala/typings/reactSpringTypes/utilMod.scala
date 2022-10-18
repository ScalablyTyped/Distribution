package typings.reactSpringTypes

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.MutableRefObject
import typings.react.mod.ReactElement
import typings.reactSpringTypes.reactSpringTypesBooleans.`false`
import typings.reactSpringTypes.reactSpringTypesStrings.prototype
import typings.std.Exclude
import typings.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("@react-spring/types/util", "Any")
  @js.native
  open class Any () extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends any ? keyof T : never
    }}}
    */
  @js.native
  trait AllKeys[T] extends StObject
  
  type AnyFn[In /* <: js.Array[scala.Any] */, Out] = js.Function1[/* args */ In, Out]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    [T, T] extends [infer T, infer DT] ? DT extends std.ReadonlyArray<any> ? std.Array<DT[number]> extends DT ? std.ReadonlyArray<T extends std.ReadonlyArray<infer U> ? U : T> : DT : std.ReadonlyArray<T extends std.ReadonlyArray<infer U> ? U : T> : never
    }}}
    */
  @js.native
  trait Arrify[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends object ? U extends object ? {[ P in std.Extract<keyof T, keyof U> ]: T[P] extends U[P]? P : never}[std.Extract<keyof T, keyof U>] : never : never
    }}}
    */
  @js.native
  trait AssignableKeys[T, U] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends react.react.ComponentClass<infer P, react.react.ComponentState> ? react.react.PropsWithoutRef<P> & react.react.RefAttributes<std.InstanceType<T>> : react.react.PropsWithRef<react.react.ComponentProps<T>>
    }}}
    */
  @js.native
  trait ComponentPropsWithRef[T /* <: ElementType[scala.Any] */] extends StObject
  
  type ComponentType[P] = (ComponentClass[P, ComponentState]) | LeafFunctionComponent[P]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    [T] extends [@react-spring/types.@react-spring/types/util.Any] ? U : [T] extends [U] ? T : U
    }}}
    */
  @js.native
  trait Constrain[T, U] extends StObject
  
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
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    @react-spring/types.@react-spring/types/util.AllKeys<T> extends infer K ? T extends any ? @react-spring/types.@react-spring/types/util.Remap<@react-spring/types.@react-spring/types/util.LoosePick<T, K> & {[ P in std.Exclude<K & keyof any, keyof T> ]:? undefined}> : never : never
    }}}
    */
  @js.native
  trait Exclusive[T] extends StObject
  
  type Falsy = js.UndefOr[`false` | Null]
  
  /** Convert a union to an intersection */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    U extends any ? (k : U): void : never extends (k : infer I): void ? I : never
    }}}
    */
  @js.native
  trait Intersect[U] extends StObject
  
  // Function component without children
  @js.native
  trait LeafFunctionComponent[P] extends StObject {
    
    def apply(props: P): ReactElement | Null = js.native
    
    var displayName: js.UndefOr[String] = js.native
  }
  
  type Lookup[T] = StringDictionary[T]
  
  type LoosePick[T, K] = js.Object & (Pick[T, K & (/* keyof T */ String)])
  
  type Merge[A, B] = Remap[
    (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof A ]: P extends keyof B? B[P] : A[P]} */ js.Any) & (Omit[B, /* keyof A */ String])
  ]
  
  type MergeDefaults[T /* <: js.Object */, U /* <: Partial[T] */] = Remap[
    (Omit[T, /* keyof U */ String]) & (Partial[Pick[T, Extract[/* keyof U */ String, /* keyof T */ String]]])
  ]
  
  type MergeUnknown[T, U] = Remap[T & (Omit[U, /* keyof T */ String])]
  
  type NoInfer[T] = /* import warning: importer.ImportType#apply Failed type conversion: [T][T extends any ? 0 : never] */ js.Any
  
  type ObjectFromUnion[T /* <: js.Object */] = Remap[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof @react-spring/types.@react-spring/types/util.Intersect<T> ]: T extends infer U? P extends keyof U? U[P] : never : never} */ js.Any
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends object ? T : {}
    }}}
    */
  @js.native
  trait ObjectType[T] extends StObject
  
  type Omit[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  type OneOrMore[T] = T | js.Array[T]
  
  type Overwrite[T, U] = Remap[(Omit[T, /* keyof U */ String]) & U]
  
  type Partial[T] = js.Object & (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]:? T[P] | undefined} */ js.Any)
  
  type Pick[T, K /* <: /* keyof T */ String */] = js.Object & (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in K ]: T[P]} */ js.Any)
  
  type RefProp[T] = MutableRefObject[js.UndefOr[T | Null]]
  
  type Remap[T] = js.Object & (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: T[P]} */ js.Any)
  
  type StaticProps[T] = Omit[T, (/* keyof T */ String) & prototype]
  
  type UnknownProps = Lookup[scala.Any]
}
