package typings.ramlTypesystem

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("raml-typesystem/dist/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def filter[T](t: js.Array[T], it: ListIterator[T, Boolean]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(t.asInstanceOf[js.Any], it.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def find[T](t: js.Array[T], it: ListIterator[T, Boolean]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(t.asInstanceOf[js.Any], it.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def unique[T](t: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("unique")(t.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  type ListIterator[T, TResult] = js.Function3[/* value */ T, /* index */ Double, /* list */ js.Array[T], TResult]
}
