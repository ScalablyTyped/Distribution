package typings
package reduxDashSagaLib.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-saga/utils", JSImport.Namespace)
@js.native
object utilsModMembers extends js.Object {
  val SAGA_ACTION: js.Symbol = js.native
  val TASK: java.lang.String = js.native
  val asEffect: reduxDashSagaLib.Anon_Cancel = js.native
  val is: reduxDashSagaLib.Anon_Number = js.native
  def arrayOfDeffered[T](length: scala.Double): js.Array[Deferred[T]] = js.native
  def cloneableGenerator(iterator: js.Function0[reduxDashSagaLib.reduxDashSagaMod.SagaIterator]): js.Function0[SagaIteratorClone] = js.native
  def cloneableGenerator[T1](iterator: js.Function1[/* arg1 */ T1, reduxDashSagaLib.reduxDashSagaMod.SagaIterator]): js.Function1[/* arg1 */ T1, SagaIteratorClone] = js.native
  def cloneableGenerator[T1, T2](
    iterator: js.Function2[/* arg1 */ T1, /* arg2 */ T2, reduxDashSagaLib.reduxDashSagaMod.SagaIterator]
  ): js.Function2[/* arg1 */ T1, /* arg2 */ T2, SagaIteratorClone] = js.native
  def cloneableGenerator[T1, T2, T3](
    iterator: js.Function3[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      reduxDashSagaLib.reduxDashSagaMod.SagaIterator
    ]
  ): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, SagaIteratorClone] = js.native
  def cloneableGenerator[T1, T2, T3, T4](
    iterator: js.Function4[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      reduxDashSagaLib.reduxDashSagaMod.SagaIterator
    ]
  ): js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, SagaIteratorClone] = js.native
  def cloneableGenerator[T1, T2, T3, T4, T5](
    iterator: js.Function5[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      reduxDashSagaLib.reduxDashSagaMod.SagaIterator
    ]
  ): js.Function5[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    SagaIteratorClone
  ] = js.native
  def cloneableGenerator[T1, T2, T3, T4, T5, T6](
    iterator: js.Function8[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* arg6 */ T6, 
      /* arg7 */ js.Any, 
      /* repeated */ js.Any, 
      reduxDashSagaLib.reduxDashSagaMod.SagaIterator
    ]
  ): js.Function7[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    /* repeated */ js.Any, 
    SagaIteratorClone
  ] = js.native
  def createMockTask(): MockTask = js.native
  def deferred[T, R](): T with Deferred[R] = js.native
  def deferred[T, R](props: T): T with Deferred[R] = js.native
  def noop(): scala.Unit = js.native
}

