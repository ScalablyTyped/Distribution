package typings.rxjsCompat

import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorTimestampMod {
  
  @JSImport("rxjs-compat/operator/timestamp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def timestamp[T](): Observable_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Timestamp<T> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("timestamp")().asInstanceOf[Observable_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Timestamp<T> */ Any
  ]]
  inline def timestamp[T](scheduler: SchedulerLike): Observable_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Timestamp<T> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("timestamp")(scheduler.asInstanceOf[js.Any]).asInstanceOf[Observable_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Timestamp<T> */ Any
  ]]
}
