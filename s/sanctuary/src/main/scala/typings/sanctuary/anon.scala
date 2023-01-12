package typings.sanctuary

import typings.sanctuary.mod.Applicative
import typings.sanctuary.mod.Apply
import typings.sanctuary.mod.Bifunctor
import typings.sanctuary.mod.ChainRec
import typings.sanctuary.mod.Contravariant
import typings.sanctuary.mod.Either
import typings.sanctuary.mod.Fn
import typings.sanctuary.mod.Foldable
import typings.sanctuary.mod.Functor
import typings.sanctuary.mod.Maybe
import typings.sanctuary.mod.NonNegativeInteger
import typings.sanctuary.mod.Pair
import typings.sanctuary.mod.Profunctor
import typings.sanctuary.mod.StrMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CheckTypes extends StObject {
    
    var checkTypes: Boolean
    
    var env: js.Array[Any]
  }
  object CheckTypes {
    
    inline def apply(checkTypes: Boolean, env: js.Array[Any]): CheckTypes = {
      val __obj = js.Dynamic.literal(checkTypes = checkTypes.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckTypes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CheckTypes] (val x: Self) extends AnyVal {
      
      inline def setCheckTypes(value: Boolean): Self = StObject.set(x, "checkTypes", value.asInstanceOf[js.Any])
      
      inline def setEnv(value: js.Array[Any]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvVarargs(value: Any*): Self = StObject.set(x, "env", js.Array(value*))
    }
  }
  
  @js.native
  trait Fn0[A, B, C, D] extends StObject {
    
    def apply(x: Apply[A]): js.Function1[/* y */ Apply[B], js.Function1[/* z */ Apply[C], Apply[D]]] = js.native
    def apply[X](x: Fn[X, A]): js.Function1[/* y */ Fn[X, B], js.Function1[/* z */ Fn[X, C], Fn[X, D]]] = js.native
  }
  
  @js.native
  trait FnCall[A, B] extends StObject {
    
    def apply(q: js.Array[A]): js.Array[B] = js.native
    def apply(q: Functor[A]): Functor[B] = js.native
    def apply(q: StrMap[A]): StrMap[B] = js.native
    def apply[C](q: Fn[C, A]): Fn[C, B] = js.native
  }
  
  @js.native
  trait FnCallContravariant[A, B] extends StObject {
    
    def apply(contravariant: Contravariant[A]): Contravariant[B] = js.native
    def apply[X](contravariant: Fn[A, X]): Fn[B, X] = js.native
  }
  
  @js.native
  trait FnCallF extends StObject {
    
    def apply[A, B](f: Fn[A, ChainRec[Either[A, B]]]): js.Function1[/* x */ A, ChainRec[B]] = js.native
  }
  
  @js.native
  trait FnCallFoldable[A] extends StObject {
    
    def apply(foldable: js.Array[A]): js.Array[A] = js.native
    def apply(foldable: Foldable[A]): Foldable[A] = js.native
  }
  
  @js.native
  trait FnCallM[A] extends StObject {
    
    def apply(m: js.Array[A]): js.Array[A] = js.native
    def apply(m: Foldable[A]): Foldable[A] = js.native
  }
  
  @js.native
  trait FnCallQ[B] extends StObject {
    
    def apply[A, C](q: Bifunctor[A, C]): Bifunctor[B, C] = js.native
    def apply[A, C](q: Either[A, C]): Either[B, C] = js.native
    def apply[A, C](q: Pair[A, C]): Pair[B, C] = js.native
  }
  
  @js.native
  trait FnCallR[B, C, A, D] extends StObject {
    
    def apply(r: Fn[B, C]): Fn[A, D] = js.native
    def apply(r: Profunctor[B, C]): Profunctor[A, D] = js.native
  }
  
  @js.native
  trait FnCallX[A, B, C] extends StObject {
    
    def apply(x: Apply[A]): js.Function1[/* y */ Apply[B], Apply[C]] = js.native
    def apply[X](x: Fn[X, A]): js.Function1[/* y */ Fn[X, B], Fn[X, C]] = js.native
  }
  
  @js.native
  trait FnCallXs[A] extends StObject {
    
    def apply(xs: js.Array[A]): js.Array[A] = js.native
    def apply(xs: Applicative[A]): Applicative[A] = js.native
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var namespace: Maybe[String]
    
    var version: NonNegativeInteger
  }
  object Name {
    
    inline def apply(name: String, namespace: Maybe[String], version: NonNegativeInteger): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: Maybe[String]): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: NonNegativeInteger): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
