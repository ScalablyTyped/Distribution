package typings.rxjs

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalSubscriberMod.Subscriber
import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalOperatorsMergeInternalsMod {
  
  @JSImport("rxjs/dist/types/internal/operators/mergeInternals", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mergeInternals[T, R](
    source: Observable[T],
    subscriber: Subscriber[R],
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]],
    concurrent: Double
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeInternals")(source.asInstanceOf[js.Any], subscriber.asInstanceOf[js.Any], project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def mergeInternals[T, R](
    source: Observable[T],
    subscriber: Subscriber[R],
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]],
    concurrent: Double,
    onBeforeNext: js.Function1[/* innerValue */ R, Unit]
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeInternals")(source.asInstanceOf[js.Any], subscriber.asInstanceOf[js.Any], project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], onBeforeNext.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def mergeInternals[T, R](
    source: Observable[T],
    subscriber: Subscriber[R],
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]],
    concurrent: Double,
    onBeforeNext: js.Function1[/* innerValue */ R, Unit],
    expand: Boolean
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeInternals")(source.asInstanceOf[js.Any], subscriber.asInstanceOf[js.Any], project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], onBeforeNext.asInstanceOf[js.Any], expand.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def mergeInternals[T, R](
    source: Observable[T],
    subscriber: Subscriber[R],
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]],
    concurrent: Double,
    onBeforeNext: js.Function1[/* innerValue */ R, Unit],
    expand: Boolean,
    innerSubScheduler: Unit,
    additionalFinalizer: js.Function0[Unit]
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeInternals")(source.asInstanceOf[js.Any], subscriber.asInstanceOf[js.Any], project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], onBeforeNext.asInstanceOf[js.Any], expand.asInstanceOf[js.Any], innerSubScheduler.asInstanceOf[js.Any], additionalFinalizer.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def mergeInternals[T, R](
    source: Observable[T],
    subscriber: Subscriber[R],
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]],
    concurrent: Double,
    onBeforeNext: js.Function1[/* innerValue */ R, Unit],
    expand: Boolean,
    innerSubScheduler: SchedulerLike
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeInternals")(source.asInstanceOf[js.Any], subscriber.asInstanceOf[js.Any], project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], onBeforeNext.asInstanceOf[js.Any], expand.asInstanceOf[js.Any], innerSubScheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def mergeInternals[T, R](
    source: Observable[T],
    subscriber: Subscriber[R],
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]],
    concurrent: Double,
    onBeforeNext: js.Function1[/* innerValue */ R, Unit],
    expand: Boolean,
    innerSubScheduler: SchedulerLike,
    additionalFinalizer: js.Function0[Unit]
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeInternals")(source.asInstanceOf[js.Any], subscriber.asInstanceOf[js.Any], project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], onBeforeNext.asInstanceOf[js.Any], expand.asInstanceOf[js.Any], innerSubScheduler.asInstanceOf[js.Any], additionalFinalizer.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def mergeInternals[T, R](
    source: Observable[T],
    subscriber: Subscriber[R],
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]],
    concurrent: Double,
    onBeforeNext: js.Function1[/* innerValue */ R, Unit],
    expand: Unit,
    innerSubScheduler: Unit,
    additionalFinalizer: js.Function0[Unit]
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeInternals")(source.asInstanceOf[js.Any], subscriber.asInstanceOf[js.Any], project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], onBeforeNext.asInstanceOf[js.Any], expand.asInstanceOf[js.Any], innerSubScheduler.asInstanceOf[js.Any], additionalFinalizer.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def mergeInternals[T, R](
    source: Observable[T],
    subscriber: Subscriber[R],
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]],
    concurrent: Double,
    onBeforeNext: js.Function1[/* innerValue */ R, Unit],
    expand: Unit,
    innerSubScheduler: SchedulerLike
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeInternals")(source.asInstanceOf[js.Any], subscriber.asInstanceOf[js.Any], project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], onBeforeNext.asInstanceOf[js.Any], expand.asInstanceOf[js.Any], innerSubScheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def mergeInternals[T, R](
    source: Observable[T],
    subscriber: Subscriber[R],
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]],
    concurrent: Double,
    onBeforeNext: js.Function1[/* innerValue */ R, Unit],
    expand: Unit,
    innerSubScheduler: SchedulerLike,
    additionalFinalizer: js.Function0[Unit]
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeInternals")(source.asInstanceOf[js.Any], subscriber.asInstanceOf[js.Any], project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], onBeforeNext.asInstanceOf[js.Any], expand.asInstanceOf[js.Any], innerSubScheduler.asInstanceOf[js.Any], additionalFinalizer.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def mergeInternals[T, R](
    source: Observable[T],
    subscriber: Subscriber[R],
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]],
    concurrent: Double,
    onBeforeNext: Unit,
    expand: Boolean
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeInternals")(source.asInstanceOf[js.Any], subscriber.asInstanceOf[js.Any], project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], onBeforeNext.asInstanceOf[js.Any], expand.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def mergeInternals[T, R](
    source: Observable[T],
    subscriber: Subscriber[R],
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]],
    concurrent: Double,
    onBeforeNext: Unit,
    expand: Boolean,
    innerSubScheduler: Unit,
    additionalFinalizer: js.Function0[Unit]
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeInternals")(source.asInstanceOf[js.Any], subscriber.asInstanceOf[js.Any], project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], onBeforeNext.asInstanceOf[js.Any], expand.asInstanceOf[js.Any], innerSubScheduler.asInstanceOf[js.Any], additionalFinalizer.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def mergeInternals[T, R](
    source: Observable[T],
    subscriber: Subscriber[R],
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]],
    concurrent: Double,
    onBeforeNext: Unit,
    expand: Boolean,
    innerSubScheduler: SchedulerLike
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeInternals")(source.asInstanceOf[js.Any], subscriber.asInstanceOf[js.Any], project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], onBeforeNext.asInstanceOf[js.Any], expand.asInstanceOf[js.Any], innerSubScheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def mergeInternals[T, R](
    source: Observable[T],
    subscriber: Subscriber[R],
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]],
    concurrent: Double,
    onBeforeNext: Unit,
    expand: Boolean,
    innerSubScheduler: SchedulerLike,
    additionalFinalizer: js.Function0[Unit]
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeInternals")(source.asInstanceOf[js.Any], subscriber.asInstanceOf[js.Any], project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], onBeforeNext.asInstanceOf[js.Any], expand.asInstanceOf[js.Any], innerSubScheduler.asInstanceOf[js.Any], additionalFinalizer.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def mergeInternals[T, R](
    source: Observable[T],
    subscriber: Subscriber[R],
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]],
    concurrent: Double,
    onBeforeNext: Unit,
    expand: Unit,
    innerSubScheduler: Unit,
    additionalFinalizer: js.Function0[Unit]
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeInternals")(source.asInstanceOf[js.Any], subscriber.asInstanceOf[js.Any], project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], onBeforeNext.asInstanceOf[js.Any], expand.asInstanceOf[js.Any], innerSubScheduler.asInstanceOf[js.Any], additionalFinalizer.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def mergeInternals[T, R](
    source: Observable[T],
    subscriber: Subscriber[R],
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]],
    concurrent: Double,
    onBeforeNext: Unit,
    expand: Unit,
    innerSubScheduler: SchedulerLike
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeInternals")(source.asInstanceOf[js.Any], subscriber.asInstanceOf[js.Any], project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], onBeforeNext.asInstanceOf[js.Any], expand.asInstanceOf[js.Any], innerSubScheduler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def mergeInternals[T, R](
    source: Observable[T],
    subscriber: Subscriber[R],
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]],
    concurrent: Double,
    onBeforeNext: Unit,
    expand: Unit,
    innerSubScheduler: SchedulerLike,
    additionalFinalizer: js.Function0[Unit]
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeInternals")(source.asInstanceOf[js.Any], subscriber.asInstanceOf[js.Any], project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], onBeforeNext.asInstanceOf[js.Any], expand.asInstanceOf[js.Any], innerSubScheduler.asInstanceOf[js.Any], additionalFinalizer.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
}
