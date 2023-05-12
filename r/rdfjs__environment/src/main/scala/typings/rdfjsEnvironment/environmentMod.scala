package typings.rdfjsEnvironment

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.rdfjsEnvironment.anon.Bind
import typings.rdfjsEnvironment.anon.Clone
import typings.rdfjsEnvironment.rdfjsEnvironmentStrings.init
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object environmentMod extends Shortcut {
  
  @JSImport("@rdfjs/environment/Environment", JSImport.Default)
  @js.native
  val default: EnvironmentCtor = js.native
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    U extends any ? @rdfjs/environment.@rdfjs/environment/Environment.ReturnFactory<U> : never
    }}}
    */
  @js.native
  trait Distribute[U] extends StObject
  
  type Environment[T] = Clone[T] & (Omit[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof @rdfjs/environment.@rdfjs/environment/Environment.UnionToIntersection<T> ]: @rdfjs/environment.@rdfjs/environment/Environment.UnionToIntersection<T>[K]} */ js.Any, 
    init
  ])
  
  @js.native
  trait EnvironmentCtor
    extends StObject
       with Instantiable1[
          /* factories */ js.Array[FactoryConstructor[js.Object]], 
          Environment[Distribute[FactoryConstructor[js.Object]]]
        ]
       with Instantiable2[
          /* factories */ js.Array[FactoryConstructor[js.Object]], 
          /* options */ Bind, 
          Environment[Distribute[FactoryConstructor[js.Object]]]
        ]
  
  @js.native
  trait FactoryConstructor[F]
    extends StObject
       with Instantiable1[/* args (repeated) */ Any, F] {
    
    var exports: js.UndefOr[js.Array[String]] = js.native
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    C extends @rdfjs/environment.@rdfjs/environment/Environment.FactoryConstructor<infer X> ? X : never
    }}}
    */
  @js.native
  trait ReturnFactory[C] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    U extends {} ? (k : U): void : never extends (k : infer I): void ? I : never
    }}}
    */
  @js.native
  trait UnionToIntersection[U] extends StObject
  
  type _To = EnvironmentCtor
  
  /* This means you don't have to write `default`, but can instead just say `environmentMod.foo` */
  override def _to: EnvironmentCtor = default
}
