package typings.rxAngular

import typings.angular.mod.IRootScopeService
import typings.rxLiteAggregates.Rx.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rx {
  
  object angular {
    
    @js.native
    trait IRxScope
      extends StObject
         with IRootScopeService {
      
      @JSName("$toObservable")
      def $toObservable(property: String): Observable[Any] = js.native
    }
  }
}
