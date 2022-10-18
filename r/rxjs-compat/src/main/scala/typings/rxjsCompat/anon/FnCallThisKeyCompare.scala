package typings.rxjsCompat.anon

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallThisKeyCompare extends StObject {
  
  def apply[T](key: /* keyof T */ String): Observable_[T] = js.native
  def apply[T, K /* <: /* keyof T */ String */](
    key: K,
    compare: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ /* x */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ /* y */ js.Any, 
      Boolean
    ]
  ): Observable_[T] = js.native
}
