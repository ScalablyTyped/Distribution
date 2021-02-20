package typings.rxCoreBinding

import typings.rxCore.Rx.IScheduler
import typings.rxCoreBinding.Rx.AsyncSubjectStatic
import typings.rxCoreBinding.Rx.BehaviorSubjectStatic
import typings.rxCoreBinding.Rx.ConnectableObservableStatic
import typings.rxCoreBinding.Rx.ISubject
import typings.rxCoreBinding.Rx.ReplaySubjectStatic
import typings.rxCoreBinding.Rx.SubjectStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rx-core-binding", "AsyncSubject")
  @js.native
  val AsyncSubject: AsyncSubjectStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rx-core-binding", "AsyncSubject")
  @js.native
  class AsyncSubjectCls[T] () extends ISubject[T]
  
  @JSImport("rx-core-binding", "BehaviorSubject")
  @js.native
  val BehaviorSubject: BehaviorSubjectStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rx-core-binding", "BehaviorSubject")
  @js.native
  class BehaviorSubjectCls[T] protected ()
    extends typings.rxCoreBinding.Rx.BehaviorSubject[T] {
    def this(initialValue: T) = this()
  }
  
  @JSImport("rx-core-binding", "ConnectableObservable")
  @js.native
  val ConnectableObservable: ConnectableObservableStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rx-core-binding", "ConnectableObservable")
  @js.native
  class ConnectableObservableCls[T] ()
    extends typings.rxCoreBinding.Rx.ConnectableObservable[T]
  
  @JSImport("rx-core-binding", "ReplaySubject")
  @js.native
  val ReplaySubject: ReplaySubjectStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rx-core-binding", "ReplaySubject")
  @js.native
  class ReplaySubjectCls[T] () extends ISubject[T] {
    def this(bufferSize: Double) = this()
    def this(bufferSize: js.UndefOr[scala.Nothing], window: Double) = this()
    def this(bufferSize: Double, window: Double) = this()
    def this(bufferSize: js.UndefOr[scala.Nothing], window: js.UndefOr[scala.Nothing], scheduler: IScheduler) = this()
    def this(bufferSize: js.UndefOr[scala.Nothing], window: Double, scheduler: IScheduler) = this()
    def this(bufferSize: Double, window: js.UndefOr[scala.Nothing], scheduler: IScheduler) = this()
    def this(bufferSize: Double, window: Double, scheduler: IScheduler) = this()
  }
  
  @JSImport("rx-core-binding", "Subject")
  @js.native
  val Subject: SubjectStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rx-core-binding", "Subject")
  @js.native
  class SubjectCls[T] () extends ISubject[T]
}
