package typings.rxAngular

import typings.rx.Rx.IScheduler
import typings.rxAngular.Rx_.ScopeSchedulerStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    class ScopeSchedulerCls protected () extends IScheduler {
      def this($scope: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IScope */ js.Any) = this()
    }
    
    @scala.inline
    def ScopeScheduler_=(x: ScopeSchedulerStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ScopeScheduler")(x.asInstanceOf[js.Any])
  }
}
