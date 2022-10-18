package typings.rxjsCompat

import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorTimeIntervalMod {
  
  @JSImport("rxjs-compat/operator/timeInterval", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def timeInterval[T](): Observable_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TimeInterval<T> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("timeInterval")().asInstanceOf[Observable_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TimeInterval<T> */ Any
  ]]
  inline def timeInterval[T](scheduler: SchedulerLike): Observable_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TimeInterval<T> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("timeInterval")(scheduler.asInstanceOf[js.Any]).asInstanceOf[Observable_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TimeInterval<T> */ Any
  ]]
}
