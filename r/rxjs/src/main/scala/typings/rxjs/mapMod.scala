package typings.rxjs

import typings.rxjs.operatorMod.Operator
import typings.rxjs.subscriberMod.Subscriber
import typings.rxjs.typesMod.OperatorFunction
import typings.rxjs.typesMod.TeardownLogic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapMod {
  
  @JSImport("rxjs/internal/operators/map", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rxjs/internal/operators/map", "MapOperator")
  @js.native
  class MapOperator[T, R] protected ()
    extends StObject
       with Operator[T, R] {
    def this(project: js.Function2[/* value */ T, /* index */ Double, R], thisArg: js.Any) = this()
    
    /* CompleteClass */
    override def call(subscriber: Subscriber[R], source: js.Any): TeardownLogic = js.native
    
    var project: js.Any = js.native
    
    var thisArg: js.Any = js.native
  }
  
  @scala.inline
  def map[T, R](project: js.Function2[/* value */ T, /* index */ Double, R]): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
  @scala.inline
  def map[T, R](project: js.Function2[/* value */ T, /* index */ Double, R], thisArg: js.Any): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(project.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
}
