package typings.rxjsCompat.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallThisPredicateDefaultValue extends StObject {
  
  def apply[T, D](): Any = js.native
  def apply[T, S /* <: T */](
    predicate: js.Function3[
      /* value */ T, 
      /* index */ Double, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ Any, 
      /* is S */ Boolean
    ]
  ): Any = js.native
  def apply[T, S /* <: T */](
    predicate: js.Function3[
      /* value */ T, 
      /* index */ Double, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ Any, 
      /* is S */ Boolean
    ],
    defaultValue: S
  ): Any = js.native
  def apply[T, D](predicate: Null, defaultValue: D): Any = js.native
  def apply[T, D](predicate: Unit, defaultValue: D): Any = js.native
}
