package typings.shallowEquals

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[A, B](): Boolean = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Boolean]
  inline def apply[A, B](a: A): Boolean = ^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def apply[A, B](a: A, b: B): Boolean = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply[A, B](a: A, b: B, compare: js.Function2[/* objA */ A, /* objB */ B, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply[A, B](a: A, b: Unit, compare: js.Function2[/* objA */ A, /* objB */ B, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply[A, B](a: Unit, b: B): Boolean = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply[A, B](a: Unit, b: B, compare: js.Function2[/* objA */ A, /* objB */ B, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply[A, B](a: Unit, b: Unit, compare: js.Function2[/* objA */ A, /* objB */ B, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("shallow-equals", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
