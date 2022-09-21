package typings.rxAngular

import typings.rxAngular.Rx_.ScopeSchedulerStatic
import typings.rxCore.Rx.IScheduler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Rx_ {
    
    @JSGlobal("Rx")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Rx.ScopeScheduler")
    @js.native
    def ScopeScheduler: ScopeSchedulerStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Rx.ScopeScheduler")
    @js.native
    open class ScopeSchedulerCls protected ()
      extends StObject
         with IScheduler {
      def this($scope: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IScope */ Any) = this()
      
      /* CompleteClass */
      override def `catch`(handler: js.Function1[/* exception */ Any, Boolean]): IScheduler = js.native
      
      /* CompleteClass */
      override def catchException(handler: js.Function1[/* exception */ Any, Boolean]): IScheduler = js.native
    }
    
    inline def ScopeScheduler_=(x: ScopeSchedulerStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ScopeScheduler")(x.asInstanceOf[js.Any])
  }
}
