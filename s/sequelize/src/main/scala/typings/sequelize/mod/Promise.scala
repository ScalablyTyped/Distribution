package typings.sequelize.mod

import typings.bluebird.mod.Resolvable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A modified version of bluebird promises, that allows listening for sql events
  */
/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("sequelize", "Promise")
@js.native
class Promise[R] protected ()
  extends typings.bluebird.mod.^[R] {
  /**
    * Create a new promise. The passed in function will receive functions
    * `resolve` and `reject` as its arguments which can be called to seal the fate of the created promise.
    *
    * If promise cancellation is enabled, passed in function will receive
    * one more function argument `onCancel` that allows to register an optional cancellation callback.
    */
  def this(callback: js.Function3[
        /* resolve */ js.Function1[
          /* thenableOrResult */ js.UndefOr[Resolvable[/* import warning: RewrittenClass.unapply cls was tparam R */ _]], 
          Unit
        ], 
        /* reject */ js.Function1[/* error */ js.UndefOr[js.Any], Unit], 
        /* onCancel */ js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]], 
        Unit
      ]) = this()
}
